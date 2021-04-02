#!/bin/bash

if [ $# -eq 0 ]
then
	echo "This script requires atleast one filename as arguement"
else
	for i in $*
	do
		if [ -f $i ]
		then
			tr '[a-z]' '[A-Z]' < $i>tempFile
			mv tempFile $i
			echo "File $i has been translated."
		else
			echo "$i does not exist in the current directory"
			exit 1
		fi
	done
fi
