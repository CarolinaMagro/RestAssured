# Rest Assured Automation Project


### Table of contents
* [Project structure](#project-structure)
* [Properties](#properties)
* [Suites](#suites)
* [Run tests](#run-tests)
* [Reports](#reports)

## About
This project are implemented using
* [TestNG](https://testng.org/)
* [Maven](https://maven.apache.org/).

## Project structure
* `/tests` folder contains test scripts.
* `/data` folder contains data for post method.

## Suites
* test classes that will be included in the test run
```xml
<test verbose="2" preserve-order="true" name="RestAssured">
    <classes>
        <class name="tests.Get"/>
        <class name="tests.Post"/>
        <class name="tests.Put"/>
    </classes>
</test>
```

## Run tests:
To run tests:
* Execute the testng.xml file.

