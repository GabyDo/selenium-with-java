# selenium-with-java
Selenium WebDriver is not a verification tool. It is only used to automate the actions on the browser
Page Object Model design pattern: create a class in your framework section of the project that represents a page in your application — and for every page in your application you'd create a new class in the framework section of your project.


UI Functional Tests:

Selenium WebDriver and Cypress are two popular tools that aid in creating UI-driven functional automated tests.

Java–Selenium WebDriver framework: need install
The integrated development environment (IDE) of your choice— IntelliJ is a commonly used IDE for Java

1. Maven
   Apache Maven is a build automation tool.
   Build automation tools essentially help in standardizing dependency management processes and project build steps.


Build automation tools help achieve these goals. Maven and Gradle are two popular choices for building Java applications.

It is crucial for all team members to use the same versions of the libraries and plug-ins, and to follow the same sequence of steps to create application artifacts (i.e., build the project, run the tests, etc.).
->Build automation tools help achieve these goals.


Project Object Model (POM) XML file, pom.xml:


The properties section declares the Java version to be used for compilation. You can also include project-specific variables here that you want to reuse in other sections of the pom.xml file or application code


The dependencies section is where you list the dependent libraries and their versions. Note that the file refers to Selenium 4.0 as a dependency. Maven maintains a central repository of all the libraries and their different versions, from which it pulls them to your machine based on the configuration in this section of the pom.xml file

Runs the tests written using testing frameworks (we’ll set up one of these next)


TestNG
TestNG is a testing framework, also referred to as a test runner in Java.
Testing frameworks, in general, provide the ability to create tests, add assertions, add setup and teardown tasks, organize tests into groups, execute tests, and present a test run summary.

TestNG can be used for all types of tests: unit, integration, and end-to-end.
A few prominent features in TestNG that you might use regularly are as follows:
@Test: An annotation to indicate the method in a class as a test method for TestNG to run them. So every test should be preceded with this annotation.
@BeforeClass, @AfterClass, @BeforeMethod, @AfterMethod, @BeforeSuite, @AfterSuite: As their names suggest, these run before or after test classes, test methods, or the entire suite. Your test’s setup and teardown methods can be annotated with these tags.
assertEquals(), assertTrue(), and other assertion methods to perform validations within the testsIntelliJ guides you in the syntax of these methods while you’re creating tests.



	BEHAVIOR-DRIVEN DEVELOPMENT
BDD is a software development practice that intends to bring the business and the technical team members closer. For example, BDD frameworks like Cucumber provide facilities to write tests in natural language, resembling a typical user story with the Given, When, Then structure. This enables the business folks to pass on requirements as failing tests and the technical folks to start building features by fixing the failing tests


Service Tests
Now let’s move on to service tests. In this section we will set up a test automation framework using the REST Assured Java library to validate a sample REST API.
Java–REST Assured Framework
REST Assured is the go-to Java library for performing automated testing of REST APIs. It offers a domain-specific language (DSL) with Gherkin syntax (Given, When, Then) to create readable and maintainable API tests, and uses hamcrest matchers for assertions. REST Assured can work with any testing framework


Pact
Pact is a popular tool for creating contract tests in Java.. Pact specifically is used for consumer-driven contract testing.


antipattern : page 155
Key Takeaways
Here are the key takeaways from this chapter:
Automated testing is the practice of using tools to verify the expected behavior of the application in order to receive fast feedback during software development.
A wise way to balance the testing capacity in a project is to perform manual exploratory testing to find new test cases and automate them to aid in regression testing.
When it comes to automated functional testing, its scope expands beyond just the commonly adopted UI-driven functional tests. Unit, integration, contract, service, UI functional, and end- to-end tests are the different micro- and macro-level test types that, when woven together appropriately, provide swift feedback.
The test pyramid is the ideal goal while crafting your automated functional testing strategy. Adding a broad base of micro-level tests and gradually decreasing the number of macro-level tests as their scope widens is the best way to reduce test creation and running time.
Several tools, including AI/ML tools, have evolved to ease automated functional test authoring, maintenance, and analysis efforts.
Although you may have put a lot of effort into creating your automation frameworks in different layers, the work doesn’t stop there. You need to keep watching for signs of antipatterns, like the ice cream cone and the cupcake.
It is vital to track automation coverage to ensure the automation efforts are not sidelined amidst the delivery buzz. Also, be aware that a high automation coverage percentage can lead your team into a false sense of security; it’s important to look beyond the number to ensure you have coverage in all areas of the application.



Chapter 5. Data Testing


First Principles in Testing
Micro- and Macro-Level Testing
In summary, unit, integration, and contract tests focus on micro-level testing,
while API tests, UI functional tests, visual tests, and so on focus on macro-level testing.


