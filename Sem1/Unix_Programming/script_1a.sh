#!/bin/bash

if [ $# -eq 1 ]
then
	if [ -e $1 ]
	then
		echo "Larget File in the directory: $(find $1 -printf '%k %p\n' | sort -nr | head -n 1 | cut -d " " -f 2)"

	else
		echo "Path does not exist! Please check the path."
		exit 0
	fi
else
	echo "This script takes only one valid directory name as an arguement!"
fi
