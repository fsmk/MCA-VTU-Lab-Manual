{
	split( $0, inpt, "-")
	if ((inpt[1] < 1) || (inpt[1] > 31) || (inpt[2] < 1) || (inpt[2] > 12))
	{
		print "Invalid Date!"
		exit 0
	}
	else
	{
		switch (inpt[2])
		{
			case 1: print "Jan"
				break
			case 2: print "Feb"
				break
			case 3: print "Mar"
				break
			case 4: print "Apr"
				break
			case 5: print "May"
				break
			case 6: print "Jun"
				break
			case 7: print "Jul"
				break
			case 8: print "Aug"
				break
			case 9: print "Sep"
				break
			case 10: print "Oct"
				break
			case 11: print "Nov"
				break
			case 12: print "Dec"
				break
		}
		print inpt[1]
		print inpt[3]
		exit 0
	}
}
