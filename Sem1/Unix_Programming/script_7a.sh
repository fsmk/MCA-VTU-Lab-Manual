#!/bin/bash

currentTime=$(date +"%H")
if [ $currentTime -ge 00 ] && [ $currentTime -le 11 ]
then
	echo "Good Morning!"
elif [ $currentTime -ge 12 ] && [ $currentTime -le 14 ]
then
	echo "Good Afternoon!"
elif [ $currentTime -ge 15 ] && [ $currentTime -le 18 ]
then
	echo "Good Evening!"
else
	echo "Good Night!"
fi
