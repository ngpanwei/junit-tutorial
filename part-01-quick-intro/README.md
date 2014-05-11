TDD jUnit Quick Introduction
============================

This is a quick tutorial to introduce to TDD using Eclipse and JUnit. We assume that you have Eclipse installed.
1. [Create a Java Project with src and test folder](#create-initial-test-code)

### Create a Java Project with src and test folder
First creat a Java project for this tutorial.
Select Menu --> File --> New --> Java Project
![TDD-01-New-Java-Project.png](images/TDD-01-New-Java-Project.png)

Enter "TriangleTest" as project name
![DD-02-Create-New-Java-Project](images/TDD-02-Create-New-Java-Project.png)

Eclipse create an src folder for you to add your code
![TDD-03-TriangleTest-Project-Created.png](images/TDD-03-TriangleTest-Project-Created.png)

Create a source folder to contain test code.
Right click on project --> New --> Source Folder
![TDD-04-Create-Test-Source-Folder.png](images/TDD-04-Create-Test-Source-Folder.png)

Enter test folder name "test"
![TDD-05-Create-Test-Source-Folder.png](images/TDD-05-Create-Test-Source-Folder.png)

### Create Initial Test Code
Create a JUnit Test Case
Right click on "test" folder --> New --> JUnit Test Case
![TDD-06-Create-JUnit-Test-Case.png](images/TDD-06-Create-JUnit-Test-Case.png)

Enter Package "example" and Name "TriangleTest"
![TDD-07-Create-example-TriangleTest.png](images/TDD-07-Create-example-TriangleTest.png)

Import Junit4 (use defaults and choose OK)
![TDD-08-Import-JUnit4.png](images/TDD-08-Import-JUnit4.png)

Eclipse JUnit creates skeleton code for TriangleTest
![TDD-11-Initial-Test-Result.png]/(images/TDD-11-Initial-Test-Result.png)

Run the empty test case
Right click on TriangleTest test case --> Run As --> JUnit Test
![TDD-10-RunAs-JUnit-Test.png](images/TDD-10-RunAs-JUnit-Test.png)

View test results
![TDD-11-Initial-Test-Result.png](images/TDD-11-Initial-Test-Result.png)

### Write Some Test Code
Think of some test cases an express as method names
![TDD-12-Think-Of-Some-Test-Cases.png](images/TDD-12-Think-Of-Some-Test-Cases.png)

Run the test again 
![TDD-13-Run-TestCases-Again.png]/(images/TDD-13-Run-TestCases-Again.png)

And view the results.
![TDD-14-Test-Results.png]/(images/TDD-14-Test-Results.png)
The idea is tp run tests often and fail often and fix.

Write some test code and think of the class API
![TDD-15-Write-Some-TestCode-And-ThinkOf-API.png]/(images/TDD-15-Write-Some-TestCode-And-ThinkOf-API.png)

### Start to write target code
First create the class
Select src folder and right click --> New --> Class
![TDD-16-Create-Code.png]/(images/TDD-16-Create-Code.png)


