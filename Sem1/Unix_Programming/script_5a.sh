#!/bin/bash

if [ ! -f "$1" ] || [ $# -ne 1  ]
then
	echo "This script only accepts one valid filename as arguement!"
else
	statLAT=$(stat --printf "%x" $1)
	lat=$(date --date="$statLAT" +"%d/%m/%Y  %I:%M %p")
	echo "FileName: $1"
	echo "Last Access Time: $lat"
fi
