#!/bin/bash

if [ $# -lt 2 ]
then
	echo "This script takes in two filenames as arguements"
	exit
else
	string1=`cat $1 | tr '\n' ' '`
	for (( i=2; i<=$#; i++ ))
	do
		echo "Filename: ${!i}"
		for a in $string1
		do
			echo "$a: `grep -c "$a" "${!i}"`"
		done
	done
fi

