#!/bin/bash

while true
do
	clear
	echo "**Password entered will not visible for security reasons**"
	echo "Enter Password: "
	read -s passFirst
	echo "Re-enter Password: "
	read -s passConfirm

	if [ "$passFirst" = "$passConfirm" ]
	then
		clear
		echo "Terminal Locked !"
		stty intr ''
		stty eof ''
		stty kill ''
		stty stop ''
		stty susp ''
		echo "To unlock, Enter Password: "
		passFirst=""
		until [ "$passFirst" = "$passConfirm" ]
		do
			read -s passFirst
		done
		stty intr '^C'
		stty eof '^D'
		stty kill '^U'
		stty stop '^S'
		stty susp '^Z'
		echo "Terminal Unlocked !"
		exit
	else
		echo "Password Mismatch !"
		sleep 3
	fi
done	
