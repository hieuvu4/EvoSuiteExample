# Description

This project provides an example of using the unit test generation tool EvoSuite. EvoSuite can be installed and utilized in many ways, in our case, it was through Maven and via CommandLine.

1.	Maven: Using Maven, a comprehensive test suite can be generated for all testable classes within a project.
2.	CommandLine: Through the CommandLine, a test suite can be generated for a specific class by specifying criteria such as branch coverage, line coverage, etc. Additionally, the search budget, which defines the extent of the generation process based on genetic algorithms, can be customized.

# Instruction

## Maven

### Prerequisite 

1. Java 8
2. Maven

### Procedure

1. You need to compile your project, because EvoSuite needs bytecode: `mvn compile`.

2. For generating test unit cases, you need the following command: `mvn evosuite:generate`. If you want to parallize it, you can add the attribute `-Dcores` to your command. Note, that each core need at least 500mb. For parallizing it on 4 cores it could look like this: `mvn -DmemoryInMB=2000 -Dcores=4 evosuite:generate`.

3. For getting infos about the generated tests, type `mvn evosuite:info`.

4. To get the test cases in your test folder, you need to type `mvn evosuite:export`.


## CommandLine (Using the JAR-File)

With the JAR-File you can specify for a certain class e.g. a criterion and the search budget, which represents the amount of generations

Example:

`java -jar evosuite-1.2.0.jar -class org.example.Calculator -criterion branch -projectCP target/classes/ -Dserach_budget=100`
