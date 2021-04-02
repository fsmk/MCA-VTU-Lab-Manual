#!/bin/bash

if [ $# -ne 1 ]
then
	echo "Run this cript with only one filename as arguement!"
else
	if [ -f "$1" ]
	then
		echo "Name : $1"
		echo "Permissions : $(stat --format="%A" $1)"
		echo "Type: $(stat --format="%F" $1)"
		echo "Owner: $(stat --format="%U" $1)"
		echo "Group: $(stat --format="%G" $1)"
		echo "Size: $(stat --format="%s" $1)"
	else
		echo "File does not exsist"
	fi
fi
