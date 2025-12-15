# Student Record Mangment System SRMS

## overview 
the Student record mangment system is java based console application developed as a group coursework project for Qassim Uni (IT Dep).
the system manages records and demonstrates core and advanced java concepts such as OOP , exception handling, and multithreading.


## key features 
- CRUD operations for students records(Add, update,remove,view)
- Data persistence using Java serialization
- Automatic background auto-save every 5 sec.
- GPA and Major-based reports
- Custome data validation with user defined exceptions.
- simple and user frinendly console menu.

  ## Technologies used
  - java SE 8+
  - java collections (ArrayList).
  - java Seraialization (File I/O)
  - Multithreading
  - Custom Exception
  - Git & GitHub for collaboration

   #Project structure:
  
 src/srms/
├── Main.java
├── Person.java
├── Student.java
├── SRMS.java
├── FileHandler.java
├── ReportGenerator.java
├── AutoSaver.java
└── InvalidStudentDataException.java

## How to run
1. Comlile the project
javac -d bin src/srms/*.java
2. Run the application
java -cp bin srms.Main

    ## Data Validation Rules
   - Name & Major: cannot be empty
   - ID : positive integer
   - Age : non negative
   - GPA : between 0.0 and 5.0
  
     ## Auto-save & storage
     - Student data is stored in 'students.ser'
     - Auto-save every 5 sec using a background thread
     - Mabual save option available from the menu
    
       ## learning outcomes
       - Parctial implementation of OOP principles
       - Handling files and persistent data
       - Working with multithreading
       - Team collaboration using GitHub
      
 ## license
Educational use only – developed for coursework at Qassim University, College of Computer, IT Department.

## Team members
- Raghad Alghidani 441204025
- Almas Alfawzan 451203492
- Renad Almuatiri 451203468
- Rehab Alshammari 451203456
