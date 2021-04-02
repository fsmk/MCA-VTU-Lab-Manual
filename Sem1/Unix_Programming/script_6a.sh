#!/bin/bash
if [ $# -eq 0 ]
then
	echo “No arguments”
	exit
else
	list=$(grep -rwlc "$1" *)
	if [ $? -eq 0 ] 
	then
		for x in $list
		do
			echo "Filename: $x"
			cat $x
			cp -v $x ~/mydir
		done
	fi
fi
