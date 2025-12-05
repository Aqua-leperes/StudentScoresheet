Student Score Sheet Management System (Java Project)
PROJECT OVERVIEW

The Student Score Sheet Management System is a Java console-based application designed to collect, process, and display student academic performance in a well-formatted report.
The project simulates a real-world school results processing system and tests your understanding of:

.Java input handling using Scanner
.Arrays for storing student records
.Loops and conditional statements
.Data formatting using printf
.Generating class statistics
.Applying grading logic
.Structured report generation

This system is capable of storing 12 students, calculating their totals, assigning ranks, and generating class-wide subject statistics.

Project Objectives
-> 1. Collect School Information
    - The program prompts the user to enter:
       1.School name
       2.Teacher's name
       3.Grade/form
       4.Year

These appear centered at the top of the final printed report.

-> 2. Capture Student Details

  -For a minimum of 12 students, the system collects:
     1.Student name
      2.English marks
        3.Mathematics marks
          4.History marks
            5.Geography marks
               6.Science marks
                 7.Programming marks
All records are stored using parallel arrays, ensuring organized data management.

-> 3. Process Results
For each student, the system automatically calculates:
     1.Total marks across all subjects
       2.Rank/Grade based on the defined grading scale
         3.Grading Criteria
Total Marks	Grade
≥ 540.0	A
≥ 480.0 and < 540.0	B
≥ 420.0 and < 480.0	C
≥ 360.0 and < 420.0	D
< 360.0	F

->4. Compute Class Statistics
The system computes and displays:
     1.Total marks per subject
      2.Average marks per subject
       3.Count of A, B, C, D, and F grades
These statistics help evaluate the overall class performance.

 ->5. Generate a Formatted Report
The program prints a well-structured score sheet containing:
       1.Centered school details
         2.A neatly aligned table of student performance
           3.Columns for full subject names
Totals and averages aligned under the correct subjects
A summary of grade counts
The report closely resembles an actual school academic printout.

-> Project Structure
The project contains one main file:
      1.Student_Scoresheet.java

This file includes all logic for:
      1.Input handling
      2.Data processing
      3.Calculations
      4.Output formatting

=> How to Run the Program

1.Install Java JDK (version 8+)
2.Compile the program:
3.javac Student_Scoresheet.java
4.Run the program:
5.java Student_Scoresheet

->Follow on-screen prompts to enter:
      .School details
      .12 student records
The system will generate a complete score report immediately.

 =>Key Java Concepts Used
   1.Scanner input handling
   2.1D arrays
   3.Mathematical operations
   4.Loops (for)
   5.Conditional logic (if-else, switch)
   6.printf formatting
   7.Clean console output

=> Why This Project Matters
This assignment helps you build real-world programming skills such as:
   1.Managing structured data
   2.Generating formatted reports
   3.Implementing grading systems
   4.Understanding arrays deeply
   5.Producing readable and maintainable code
It forms a strong foundation for future Java and OOP projects.

Author
Leperes Christine Aquallah
BSc Computer Science,
Dedan Kimathi University of Technology
