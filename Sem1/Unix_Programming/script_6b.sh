#!/bin/bash

currentDir=$(pwd)
listOfFiles=$(ls -l "$currentDir" | awk '{print $9}')
echo "Current Directory: $currentDir"
echo "All files whose filename is at least 10 characters: "
for f in $listOfFiles
do
	if [ $(expr length "$f") -gt 10 ]
	then
		echo $f
	fi
done
