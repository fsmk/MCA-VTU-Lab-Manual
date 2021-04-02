#!/bin/bash

if [ $# -ne 1 ]
then
	echo "This script requires only one username as arguement"
	exit
else
	startTime=$(date -d "now" "+%s")
	until who|grep -sw "$1"
	do
		curTime=$(date -d "now" "+%s")
		if [ $(( $curTime-$startTime )) -ge 90 ]
		then
			echo "Timed Out!"
			exit
		fi
	done
	echo "User $1 logged in !"
	exit
fi

