#!/bin/bash

if [ $# -eq 0 ]
then
	echo "Run this script with one or more  username(s) as arguement!"
else
	for i in $*
	do
		if [ $(grep $i /etc/passwd) ]
		then
			echo "Home directory for $i: "
			eval "echo ~$i"
		else
			echo "user does not exsist"
		fi
	done
fi
