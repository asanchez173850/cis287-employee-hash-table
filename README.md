# cis287-employee-hash-table


## Student Name
Andrew Sanchez

## Description
This program implements a hash table that stores Employee objects using separate chaining with a generic linked list. The employee's name is used as the hash key. The program demonstrates adding employees, retrieving employees by name, handling collisions, and searching for an employee who does not exist.

## Java Files
- Employee.java
- LinkedList3.java
- EmployeeHashTable.java
- EmployeeHashTableApp.java

## How to Run

Run the program in
java EmployeeHashTableApp

## OnlineGDB Link

https://www.onlinegdb.com/s/as/390021

## GitHub Repository

https://github.com/asanchez173850/cis287-employee-hash-table

## Gemini Use and Reflection

### Prompt 1
Explain how a generic linked list can be used to implement separate chaining in a Java hash table.

### Prompt 2
How can I test that two employee names hash to the same bucket in my hash table?

### What Gemini Helped With
Gemini helped explain how separate chaining works, how to implement a generic linked list in a hash table, and how to test for collisions.

### One Suggestion I Changed or Rejected
I reviewed Gemini's suggestions and adjusted the implementation to match my instructor's assignment requirements and class structure.

### How I Verified My Program
I compiled and ran the program in OnlineGDB to verify that it worked correctly. I confirmed that six employees were added successfully, two employee names hashed to the same bucket, three existing employees were retrieved correctly, and searching for a non-existent employee returned null. The program output also demonstrated that collisions were handled correctly using separate chaining.
