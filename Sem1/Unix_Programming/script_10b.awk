BEGIN{
	printf("\nOriginal FIle\n")
	i=1
}
{
	print $0
	line[i++]=$0
}
END{
	for(j=1; j<i; j++)
	{
		for(k=j+1; k<i; k++)
		{
			if (line[j]==line[k])
			{
				line[k]=""
			}
		}
	}
	printf("\n The file after deleting duplicate lines\n")
	for(k=1; k<i; k++)
	{
		if(line[k]!="")
			printf("\n"line[k])
	}
	printf("\n")
}
