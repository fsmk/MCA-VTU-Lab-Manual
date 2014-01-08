                                                UNIX Programming Laboratory 

A. Explore the unix environment. 
 
B. Explore vi editor with vim tutor. Perform the following operations using vi editor, but 
not limited to: 
 
 1 insert character, delete character, replace
character 
 2. Save the file and continue working 
 3. save the file a exit the editor 
 4. quit the editor 
 5. quit without saving the file 
 6. rename a file 
 7. insert lines, delete lines, 
 8. set line numbers 
 9. search for a pattern 
 10. move forward and backward 
 
1a. Write a shell script that takes a valid directory name as an argument and recursively 
descend all the sub-directories, finds the maximum length of any file in that hierarchy and 
writes this maximum value to the standard output. 
b. Write a shell script that accepts a path name and creates all the components in that path 
name as directories. For example, if the script is named mpc, then the command 
mpc a/b/c/d should create directories a, a/b, a/b/c, a/b/c/d. 
 
2a. Write a shell script that accepts two file names as arguments, checks if the permissions 
for these files are identical and if the permissions are identical, output common permissions 
and otherwise output each file name followed by its permissions. 
b. Write a shell script which accepts valid log-in names as arguments and prints their 
corresponding home directories, if no arguments are specified, print a suitable error message. 
 
3a. Create a script file called file-properties that reads a file name entered and outputs it 
properties. 
b. Write shell script to implement terminal locking (similar to the lock command). It should 
prompt the user for a password. After accepting the password entered by the user, it must 
prompt again for the matching password as confirmation and if match occurs, it must lock 
the keyword until a matching password is entered again by the user, Note that the script 
must be written to disregard BREAK, control-D. No time limit need be implemented for 
the lock duration. 
 
4a. Write a shell script that accept one or more filenames as argument and convert all of 
them to uppercase, provided they exist in current directory. 
b. Write a shell script that displays all the links to a file specified as the first argument 
to the script. The second argument, which is optional, can be used to specify in which the 
search is to begin. If this second argument is not present, the search is to begin in current 
working directory. In either case, the starting directory as well as all its subdirectories at 
all levels must be searched. The script need not include any error checking. 
 
5a. Write a shell script that accepts as filename as argument and display its creation time if 
file exist and if it does not send output error message. 
b. Write a shell script to display the calendar for current month with current date replaced by 
* or ** depending on whether the date has one digit or two digits. 
 
6a. Write a shell script to find a file/s that matches a pattern given as command line argument 
in the home directory, display the contents of the file and copy the file into the directory 
~/mydir 
b. Write a shell script to list all the files in a directory whose filename is at least 10 
characters. (use expr command to check the lenght) 
 
7a. Write a shell script that gets executed displays the message either “Good Morning” or 
“Good Afternoon” or “Good Evening” depending upon time at which the user logs in. 
b Write a shell script that accept a list of filenames as its argument, count and report 
occurrence of each word that is present in the first argument file on other argument files. 
 
8a. Write a shell script that determine the period for which a specified user is working on 
system and display appropriate message. 
b Write a shell script that reports the logging in of a specified user within one minute after 
he/she log in. The script automatically terminate if specified user does not log in during a 
specified period of time. 
 
9a. Write a shell script that accept the file name, starting and ending line number as an 
argument and display all the lines between the given line number. 
b. Write a shell script that folds long lines into 40 columns. Thus any line that exceeds 
40 characters must be broken after 40th, a “\” is to be appended as the indication of folding 
and the processing is to be continued with the residue. The input is to be supplied through a 
text file created by the user. 
 
10a. Write an awk script that accepts date argument in the form of dd-mm-yy and displays it 
in the form if month, day and year. The script should check the validity of the argument and 
in the case of error, display a suitable message. 
b. Write an awk script to delete duplicated line from a text file. The order of the 
original lines must remain unchanged. 
 
11a. Write an awk script to find out total number of books sold in each discipline as well 
as total book sold using associate array down table as given below. 
 Electrical 34 
Mechanical 67 
Electrical 80 
Computer Science 43 
Mechanical 65 
Civil 98 
Computer Science 64 
b. Write an awk script to compute gross salary of an employee accordingly to rule given 
below. 
If basic salary is < 10000 then HRA=15% of basic & DA=45% of basic 
If basic salary is >=10000 then HRA=20% of basic & DA=50% of basic.
