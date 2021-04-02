#!/bin/bash

if [ $# -ne 1 ]
then
	echo "This script takes one username as arguement!"
	exit
else
	if [ $(grep -c $1 /etc/passwd) -ne 0 ]
	then
		if [ $(last -Fw|grep -c $1) -ne 0 ]
		then
			loginDate=$(last -Fw |grep $1 | head -1 | tr -s " " | awk '{printf("%s %s %s %s\n",$5,$6,$7,$8)}')
			loginDate=$(date -d "$loginDate" "+%s")
			currDate=$(date "+%s")
			sessionTime=$((currDate-loginDate))
			sday=$(( sessionTime/86400 ))
			shour=$(( (sessionTime-(sday*86400))/3600 ))
			smin=$(( (sessionTime-(sday*86400)-(shour*3600))/60 ))
			ssec=$(( (sessionTime-(sday*86400)-(shour*3600)-(smin*60)) ))
			printf "Active Session Time: %02d days %02d hours %02d mins %02d secs\n" "$sday" "$shour" "$smin" "$ssec"

		else
			echo "The user has no recent logins"
			exit
		fi
	else
		echo "Invalid Username!"
		exit
	fi
fi
