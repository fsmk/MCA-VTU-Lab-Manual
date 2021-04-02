#!/bin/bash

if [ $# -eq 2 ]
then
	
	PERM1=$(stat --printf=”%a”  $1)
	PERM2=$(stat --printf=”%a”  $2)

	if [ "$PERM1" = "$PERM2" ]
	then
		echo Both the files have same permissions: $(stat --printf="%A" $1)
	else
		echo The given files have different permissions
		echo "$1 : $(stat --printf="%A" $1)"
		echo "$2 : $(stat --printf="%A" $2)"
	fi
else
	echo "This script is programmed to use two files in order 
		to compare their permissions"

fi

