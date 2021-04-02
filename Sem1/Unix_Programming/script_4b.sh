clear

if [ $# -eq 0 ]
then
	printf "Invalid arguments"
else
	if [ $# -eq 1 ]
	then 
		dir=`pwd`
	elif [ $# -eq 2 ] 
	then
		dir=$2 
	fi

if [ -f $1 ] 
then
	inode=`ls -i $1 | cut -d " " -f 1`
	printf "hard link of $1 are:\n" 
	find $dir -inum $inode
	find $dir -type l -ls |tr -s " " |grep $1 |cut -d " " -f 12 > soft 
	s=`wc -l < soft`
	if [ $s -eq 0 ] 
	then
		echo "There is no soft links"
	else
		echo "Soft links of $1 are"
		cat soft
	fi
else
	printf "file doesn't exist"
fi
fi
