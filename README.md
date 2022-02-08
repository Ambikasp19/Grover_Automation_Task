That Automation Testing is Hybrid framework which Uses
1.Selenium
2.Maven
3.Cucumber BDD (Gherkin language) via Junit ,
4.using Cucumber 6 Extent report for generating PDF & Spark reports
5.Using junit for assertions
6.Reading from Properties files for storing environment variables

Structure of Project:
1- src/main/java
com.qa.factory : Package includes a class of methods to initialize the browser
com.util : Package includes a class of methods to read the config properties

2- src/test/java
Apphooks: Package includes the class of the common components that need to run before and every feature file
com.pages : Package includes the designated pages of Grover
stepDefinitions : Package includes steps class that has the implementations of the feature files
Runner Package include the test runner that run the step definitionns along with the designated feature file

3- src/test/resources
AppFeature : Package includes the feature file
config.properties that contains the environment variables (name of the browser, URL to run against)
cucumber.properties file includes the properties of the display of the cucumber report over the browser
extent-config xml file includes the properties of the display of the extent report over the browser
extent.properties includes the location of the generated reports and some system info to be displayed in the report

Running the project
Download the project on your local machine
Import the project to your editor(Eg: Eclipse)
Right Click on the project , choose Maven and Click on Update Project
After the Update Project is completed go to the MyTestRunner under testRunner Package
Right click on the MyTestRunner and Run As Juint Test

Generating The Test Reports :
(open test output folder) and you will get a generated pdf report contains all the details of the execution (pass/fail)
(open test-output/SparkReport), then open (index.html) file on any browser and you will get detailed info of the status of every step in every scenario per every feature file