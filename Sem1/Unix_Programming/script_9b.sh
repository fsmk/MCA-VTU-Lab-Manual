#!/bin/bash
if [ $# -ne 1 ]
then
	echo "This script takes in only one filename as arguement!"
	exit 1
else
	if [ -f $1 ]
	then
		echo  "**ORIGINAL FILE**"
		cat $1
		printf "\n"
		echo "**FOLDED FILE**"
		fold -s -w 40 $1 | sed 's/$/\//'
	else
		echo "file doesn't exist"
	fi
fi
