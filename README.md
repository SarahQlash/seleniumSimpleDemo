# Selenium Framework
     Simple Project using java ,Maven ,TestNG , allure , POM and  Data Driven framework in the project.

# Tech Stach :

  ``` Java ```
  ``` Maven ```
  ``` TestNG ```
  ``` Allure ```
  

## Getting Started
   These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

	- Eclipse
	- JDK to run the Eclipse
	- Git bash

### Installing and how it work
1- Get your git bash where you want to clone the project on your local machine.
	then type:
	
```
git clone https://github.com/SarahQlash/seleniumFramework.git
```
2- Inside Eclipse
```	
File -> Import -> Maven -> Existing Maven project
```
* You can run the project directly through the Eclipse by running Test cases by TestNG or Run the project by maven
* You can get the report directly through allure framework
* Type in git bash after you select the project destination `allure -serve` then
```
allure.bat serve allure-results
```
allure-results this where the output of test

###Make sure that you have allure framwork on your local machine
You should install allure framwork on your local machine from here `https://github.com/allure-framework/allure2/releases`,
then make sure that you add bin into System Variables 
You are ready now to run the allure commands above and get your report.

### Component of pages
	1- Page Base contain all the common methods that will be used by home, register , login pages
	2- Register page 
	3- Login page
	4- Home page

### Component of tests
	1- Test base that will be as a base for all test classes 
	2- The user registration with Faker lib 
  3- login page and this test case I intend to fail it in order to see how the report will generate.

### Component of utilities
	1- It's a helper to take the screenshot of the failures that will happens in Login test 
  

This is a simple project to automate registration ، login and logout  using selenium framework , you can run the project on different browsers as  chrome ,firefox and internet explorer by changing value in testing.xml file.
