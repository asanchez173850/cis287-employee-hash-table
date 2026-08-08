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
Public link 
https://onlinegdb.com/7_W2qXDEy
classroom link
https://www.onlinegdb.com/s/as/390021

## GitHub Repository

https://github.com/asanchez173850/cis287-employee-hash-table
## Gemini Use and Reflection

### Prompt 1
Explain how a generic linked list can be used to implement separate chaining in a Java hash table.

### Prompt 2
How can I find two employee names that hash to the same bucket?

### What Gemini Helped With
Gemini helped me better understand how separate chaining works in a hash table and how a generic linked list could be used to store Employee objects. It also explained how to implement the get method to search the correct bucket and suggested ways to test the program by finding employee names that would hash to the same bucket. This guidance helped me better understand the concepts and verify that my implementation was working correctly.

### One Suggestion I Changed or Rejected
One suggestion Gemini made was to organize the project with additional helper methods and more complex testing. I decided to simplify the code and focus on the requirements outlined in the assignment. I also made sure the program used the required class names and file structure so it matched my assingment's specifications.

### How I Verified My Program
I compiled and ran the program in OnlineGDB to verify that it worked correctly. I confirmed that six employees were added successfully, two employee names hashed to the same bucket, three existing employees were retrieved correctly, and searching for a non-existent employee returned null. The program output also demonstrated that collisions were handled correctly using separate chaining.
