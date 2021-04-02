#!/bin/bash

if [ $# -ne 3 ]
then
	echo "This script requires three arguemnts! FileName,Starting Line Number and Ending Line Number"
	exit
else
	if [ -f $1 ]
	then
		eval "sed -n $2,$3\p $1"
		exit
	else
		echo "No Such File!"
		exit
	fi
fi

