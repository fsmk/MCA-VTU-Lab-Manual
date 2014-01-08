                                                    Database Laboratory 

Instructions for the Exercises: 
 
1. Draw ER diagram based on given scenario with various Constraints. 
2. Create Relational Database Schema based on the above scenario using Mapping Rules. 
3. Perform the given queries using any RDBMS Environment. 
4. Suitable tuples have to be entered so that queries are executed correctly 
5. The results of the queries may be displayed directly 
 
Exercise: 1 
 
 Notown Records has decided to store information about musicians who perform on its 
albums. Each musician that records at Notown has an SSN, a name, an address, and a phone 
number. No musician has more than one phone. Each instrument used in songs recorded at 
Notown has a unique identification number, a name (e.g., guitar, synthesizer, flute) and a 
musical key (e.g., C, B-flat, E-flat). Each album recorded on the Notown label has a unique 
identification number, a title, a copyright date and a format (e.g., CD or MC). Each song 
recorded at Notown has a title and an author. Each musician may play several instruments, and 
a given instrument may be played by several musicians. Each album has a number of songs on 
it, but no song may appear on more than one album. Each song is performed by one or more 
musicians, and a musician may perform a number of songs. Each album has exactly one 
musician who acts as its producer. A musician may produce several albums. 
 
Queries 
 
a) List musician name, title of the song which he has played, the album in which song has 
occulted. 
b) List the details of songs which are performed by more than 3 musicians. 
c) List the different instruments played by the musicians and the average number of musicians 
who play the instrument. 
d) Retrieve album title produced by the producer who plays guitar as well as flute and has 
produced no of songs greater than the average songs produced by all producers. 
e) List the details of musicians who can play all the instruments present. 
 
Exercise: 2 
Professors have a PROFID, a name, an age, a rank, and a research specialty. Projects have a 
project number, a sponsor name (e.g. UGC/AICTE/...), a starting date, an ending date, and a 
budget. Graduate students have an USN, a name, an age, and a degree program (e.g. MCA/ 
MPhil/BE/ME ..). Each project is managed exactly by one professor (known as the project's 
principal investigator). Each project is worked on by one or more professors (known as the 
project's co-investigators). Professors can manage/work on multiple projects. Each project is 
worked on by one or more graduate students (known as the project's research assistants). 
Graduate students can work on multiple projects. Each professor can supervise many students. 
A student who is working on a project can be supervised by only one professor.
 
Queries 
 
a) Retrieve the names of all professors who do not have an ongoing project of more than 1 
lakh. 
b) Retrieve the names of all graduate students along with their professors under whom they 
work and project sponsor. 
c) List the professors and sum of the budget of their projects started after 2005 but ended in 
2010. 
d) List the names of professors who has a total worth of project greater than the average budget 
of projects sanctioned 
e) List the professors who work on all the projects. 
 
Exercise: 3 
 
A bank has many branches and a large number of customers. Bank is identified by its code. 
Other details like name, address and phone for each bank are also stored. Each branch is 
identified by its bank. Branch has name, address and phone. A customer can open different 
kinds of accounts with the branches. An account can belong to more than one customer. 
Customers are identified by their SSN, name, address and phone number. Age is used as a 
factor to check whether customer is a major. There are different types of loans, each identified 
by a loan number. A customer can take more than one type of loan and a loan can be given to 
more than one customer. Loans have a duration and interest rate. Make suitable assumptions 
and use them in showing maximum and minimum cardinality ratios. 
 
Queries: 
 
a) List the details of customers who have joint account and also have at least one loan. 
b) List the details of the branch which has given maximum loan. 
c) List the details of saving accounts opened in the SBI branches located at Bangalore. 
d) List the name of branch along with its bank name and total amount of loan given by it. 
e) Retrieve the names of customers who have accounts in all the branches located in a specific 
city.' 
 
Exercise: 4 
 
Patients are identified by an SSN, and their names, addresses, and ages must be recorded. 
Doctors are identified by an SSN. For each doctor, the name, specialty, and years of experience 
must be recorded. Each pharmaceutical company is identified by name; it has an address and 
one phone number. For each drug, the trade name and formula must be recorded. Each drug is 
sold by a given pharmaceutical company, and the trade name identifies a drug uniquely from 
among the products of that company. Each pharmacy has a name, address, and phone number. 
Each patient is checked up by some doctor. Every doctor has at least one patient. Each 
pharmacy sells several drugs and has a price for each. A drug could be sold at several 
pharmacies, and the price could vary from one pharmacy to another. Doctors prescribe drugs for 
patients. A doctor could prescribe one or more drugs for several patients, and a patient could 
obtain prescriptions from several doctors. Each prescription has a date and a quantity associated 
with it. Pharmaceutical companies have long-term contracts with pharmacies. A pharmaceutical 
company can contract with several pharmacies, and a pharmacy can contract with several 
pharmaceutical companies. For each contract, you have to store a start date, an end date, 
supervisor and the text of the contract. 
 
 
Queries: 
 
a) List the details of patients who are 20 years old and have been checked by eye-specialist. 
b) List the details of doctors who have given the prescription to more than 20 patients in year 
2013. 
c) List the details of pharmaceutical companies who supply drug to more than 10 pharmacies in 
the same city where company is located. 
d) List the details of drug supplied by only one pharmaceutical company. 
e) List the details of drug supplied by all pharmaceutical companies. 
 
Exercise: 5 
 
 Data requirements of movie industry are captured. Each movie is identified by title and 
year of release. Each movie has length in minutes and classified under one genres (like action, 
horror etc.). Each movie has a plot outline. Production companies are identified by name and 
each has an address. A production company produces one or more movies. Actors are identified 
by id. Other details like name and date of birth of actors are also stored. Each actor acts in one 
or more movies. Each actor has a role in movie. Directors are identified by id. Other details like 
name and date of birth of directors are also stored. Each director directs one or more movies. 
Each movie has one or more actors and one or more directors and is produced by a production 
company. 
 
Queries: 
 
a) List the details of horror movies released in 2012 and directed by more than 2 directors. 
b) List the details of actors who acted in movies having same titles but released before 2000 
and after 2010. 
c) List the details of production companies producing maximum movies. 
d) List the details of movies where director and actor have same date of birth. 
e) Retrieve the names of directors directed all the movies produced by any one production 
company. 
