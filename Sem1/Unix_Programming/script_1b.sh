#! /bin/bash

if [ $# -eq 1 ]
then
	mkdir -pv $1
else
	echo "This Script is only programmed to take one arguement as an input!"
fi

