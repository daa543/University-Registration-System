# University-Registration-System

It is required to write a computerprogram (C, C++, Python, Java, ...) to performall the functions of the registration system of an educational institution(e.g. Alexandria University). The program should include a data structure  for each one of the possible  students available  in the institution.   The data structure should include at least the following:

1. Student name,which is to be defined as a structure containing the following:

a) First name

b) Middle name

c) Last name

2. Student registration number,  which  may  be  automatically  generated  for  new  students  orentered (e.g., year: 2022 -term 2-faculty: Data Sciences andComputing (25) –Department: General  (01) -student  number:13 => 2022225010013) by the  user  according  to  the user requirements.Please assume numbers for different options.Student data must be preserved in the data structure.

3. Student nationality.

4. Student ID, which is a structure containing the following:
 
a)type of ID(e.g., national ID, passport, ...)
 
b)ID number

c)Validity  of ID which is a structure  of the type date as will be explained  later on in the student age section

5. Student home address which is a structure containing the following:

a)Flat number

b)House number

c)Street name

d)Area/District  name

e)City name

f)Governorate name

g)Country

h)Postal code

6. Student mailing address which is a structure containing the same as the previousaddress field.  Please note thatthe operator should only enter this address in case it is different from the home address.  Otherwise,the program has to set the data to be the same automatically.

7. Student age (calculated automatically)  in addition to his/her date of birth, which is a structure containing the following:

a)Day of birth (restricted  between 1 and 31)

b)Month of birth (restricted  between 1 and 12)

c)Year of birth (restricted  between 1980 and present date)

8. Student gender.

9. First enrolment term and year.

10. Student department of enrolment.

11. Student tutor name and code.

12. Current term, which is calculated according to the credit hours finished.

13. Payments, which is a structure containing the following:

a)Type of funding(e.g., self-funded or grant-funded)

b)Number of paymentsdone

c)Total amount paid so far

d)An array of structure containing the details of each payment.  These include:

i.Amount paid

ii.Transaction number

iii.Bank of transaction

iv.Date/Time of transaction,  which is a structure for the date containing the day, month and year of the transaction as explained above in the date of birth.

14. Student contact, which is a structure containing the following:

a)Contact e-mailof the student

b)Student home phone number

c)Student mobile number

15. Credit hours,which is a structure  containing the following:

a)Maximum required for the degree

b)Finished

c)Current

d)Remaining (The remaining hours = Maximum -Finished –Current)The maximum credit hours required should be entered by the operator. The finished and current  hours should be computed from  the sum of finished  and current  courses' credit hours entered in the fieldrelating to the course finished and current. The remaining hours should be computed from the equation presented above.

16. Student GPA, which is a structure containing the following:
 
a)Overall GPA attained so far by the student(should be initialised  to zeros for a new student).

b)Number of semesters finished so far.

c)An array of 10 elements constituting the individual semester  GPAs (should be initialised to zeros for a new student).

17. Courses, which is a structure containing the following:

a)Finished

b)Current(number of courses bound by the student status calculated above)

Each one of the above (Finished and Current) group of courses is a structure containing the following:

a)Number of courses

b)Total number of credit hours for these courses

c)Array (of size100 for the finished courses and 8 for the current courses) of structure for the course data,which should include the following:

i.Course code

ii.Course name

iii.Course credit hours

iv.Number of times taking the course

v.Semester and year for taking the course in the case of finished courses

vi.Course tutors which is a structurecontaining the following:

•Course lecturer (first, middle and last) name

•Course GTA (first, middle and last)name

•Course lab GTA (first, middle and last)name

vii.Marks acquired during the course which is a structure containing the following:

•7thmark out of 30(nay contain fractions)

•12thmark out of 20(nay contain fractions)

•year work mark out of 10(nay contain fractions)

•final exam mark out of 40(nay contain fractions)

•sum of all the above out of 100(nay contain fractions)

viii.Grade of the student in this courseaccording to the standard grading scheme

ix.Student percentage absence during the course
