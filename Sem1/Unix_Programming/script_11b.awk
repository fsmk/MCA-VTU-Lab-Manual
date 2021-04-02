BEGIN { 
	FS=":"
	printf("\n\t\tsalary statement of employees for the month\n")
	printf("sl.no\tname\t\tdesignation\tBASIC\tDA\tHRA\tGROSS\n")
	print
}
{
	slno++; basic_tot+=$5;
	if ( $5 >= 10000 )
	{
		da=0.45*$5; da_tot+=da;
		hra=0.15*$5;hra_tot+=hra;
	}
	else
       	{ 
		da=0.50*$5;da_tot+=da;
		hra=0.20*$5;hra_tot+=hra;
	}
		sal_tot+=$5 + da + hra
		printf("%2d\t%-15s %12-s %8d %8.2f %8.2f %8.2f\n",slno,$2,$3,$5,da,hra,$5+da+hra)
}
END{
	printf( "\n\ttotal basic paid is : rs " basic_tot)
	printf( "\n\ttotal da paid is : rs " da_tot)
	printf( "\n\ttotal hra paid is : rs " hra_tot)
	printf( "\ntotal salary paid is : rs " sal_tot)
	printf("\n")
}
