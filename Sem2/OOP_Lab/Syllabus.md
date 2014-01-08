                                                  OOP Using C++ Laboratory 
 
1. Define a STUDENT class with USN, Name, and Marks in 3 tests of a subject. Declare an 
array of 10 STUDENT objects. Using appropriate functions, find the average of the two 
better marks for each student. Print the USN, Name and the average marks of all the students. 
 
2. Write a C++ program to create a class called COMPLEX and implement the following 
overloading functions ADD that return a complex number: 
(i) ADD (a, s2) – where ‘a’ is an integer (real part) and s2 is a complex number 
(ii) ADD (s1, s2) – where s1 and s2 are complex numbers 
 
3. Write a C++ program for scalar multiplication of two vectors using operator overloading. 
 
4. Write a C++ program to create a template function for Bubble Sort and demonstrate sorting 
of integers and doubles. 
 
 5. Write a C++ program to create a class called LIST (linked list) with member functions to 
insert an element at the front and delete an element from the front of the list. Demonstrate all the 
functions after creating a LIST object. 
 
6. Write a C++ program to create a class called STACK using an array of integers. 
Implement the following operations by overloading the operators ‘+’ and ‘--‘: 
 
(i) s1 = s1 + element; where s1 is an object of the class STACK and element is an integer to be 
pushed on the top of the stack 
 
(ii) s1 = --s1 ; where s1 is an object of the class STACK. ‘--‘operator pops the element. 
Handle the STACK empty and full conditions. Also display the contents of the stack 
after each operation, by overloading the << operator. 
 
7. Create a class called MATRIX using two-dimensional array of integers. Implement the 
following operations by overloading the operator ++ which checks the compatibility of two 
matrices to be added and subtracted. Perform the addition and subtraction by overloading the 
+ and – operators respectively. Display the results by overloading the operator <<. If 
(m1==m2) then m3 = m1+m2 and m4 = m1-m2 else display error. 

8. Write a C++ program to create a class called OCTAL which has the characteristics of an 
octal number. Implement the following operations by writing an appropriate constructor 
and an overloaded operator +. 
 
(i) OCTAL h = x; where x is an integer. 
(ii) int y = h + k; where h is an OCTAL object and k is an integer 
Display the OCTAL result by overloading the operator <<. Also display the values of h and y. 
 
9. Write a C++ program to create a class template called QUEUE with member functions to 
add an element and to delete an element from the queue. Using the member functions, 
implement a queue of integers and double. Demonstrate the operations by displaying the 
contents of the queue after every operation. 

10. Define a class SET with Data members: array of int, int variable to indicate number of 
elements in a SET object; and Member functions: to read element of a SET object, to 
print elements of a SET object, to find union of 2 objects of SET using operator 
overloading (S3=S1+S2), to find intersection of 2 objects of SET using operator overloading 
(S4= S1*S2). S1, S2, S3 and S4 are objects of SET. Use this class in a main function to 
show the above operations. 

 
11. Write a C++ program to create a class called STUDENT with data members USN, Name 
and Age. Using inheritance, create the classes UGSTUDENT and PGSTUDENT having 
fields as Semester, Fees and Stipend. Enter the data for at least 5 students. Find the
semester-wise average age for all UG and PG students separately. 

12. Write a C++ program to create a class called STRING and implement the 
following operations. Display the results after every operation by overloading the operator <<. 
(i) STRING s1 = “VTU” 
(ii) STRING s2 = “BELGAUM” 
(iii) STRING s3 = s1 + s2 (Use copy constructor) 
 

13. Define a base class STACK1 which performs only push, pop, display operations. 
Override the above operations through a derived class STACK2 which takes care of STACK 
FULL & STACK EMPTY situations. Show how the objects of these classes use the above 
functions in a main function. 

14. Create an abstract base class EMPLOYEE with data members: Name, EmpID and 
BasicSal and a pure virtual function Cal_Sal().Create two derived classes MANAGER 
(with data members: DA and HRA) and SALESMAN (with data members: DA, HRA and 
TA). Write appropriate constructors and member functions to initialize the data, read and 
write the data and to calculate the net salary. The main() function should create 
array of base class pointers/references to invoke overridden functions and 
hence to implement run-time polymorphism. 
