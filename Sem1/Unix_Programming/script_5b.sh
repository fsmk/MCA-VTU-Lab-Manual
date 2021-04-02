#!/bin/bash

echo "Current Date: $(date +"%d/%m/%Y")\n"
currDate=$(date +"%d")
if [ $currDate -le 9 ]
then
	currDate=$(echo $currDate | cut -f 2)
	echo "$(ncal | sed 's/\b'"$currDate"'\b/'*'/')"
else
	echo "$(ncal | sed 's/\b'"$currDate"'\b/'**'/')"
fi

