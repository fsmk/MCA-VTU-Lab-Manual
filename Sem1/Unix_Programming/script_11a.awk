BEGIN{
	print "Total number of books sold in each category"
}
{
	books[$1]+=$2
}
END{
	for(item in books)
	{
		printf("\t%-17s %1s %-5d \n", item, "=", books[item])
		total+=books[item]
	}
	printf("%-17s %1s %-5d \n","Total Books Sold ", "=", total)
}

