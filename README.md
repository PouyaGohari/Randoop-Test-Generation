# Randoop-Test-Generation
This repository contains the solutions to the fourth computer assignment for the Software Testing course at the University of Tehran. The assignment involves cloning an existing project and using the Randoop tool to automatically generate test cases for a target class.

## Table of Contents

- [Introduction](#introduction)
- [Assignment Overview](#assignment-overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Results and Analysis](#results-and-analysis)
- [Report](#report)
- [License](#license)

## Introduction

This project focuses on using the Randoop tool for automated test generation and then refining the generated tests by modifying the test oracle to behave correctly according to the provided specification. Randoop is a widely used tool for automatically generating unit tests for Java programs, and this assignment extends its functionality by ensuring the generated tests meet specific requirements.

## Assignment Overview

### Part 1: Cloning the Project

- **Task:** Clone the [ST03_HW2 project](https://github.com/Szpilman2/ST03_HW2) repository to set up the environment for test generation.
- **Objective:** Prepare the project to be used with the Randoop tool for automated test case generation.

### Part 2: Using Randoop for Test Generation

- **Task:** Use the Randoop tool to generate test cases for the specified target class within the cloned project.
- **Objective:** Automatically generate a comprehensive set of test cases.

### Part 3: Modifying the Test Oracle

- **Task:** After generating the tests, modify the test oracle to ensure that the tests behave correctly according to the given specification.
- **Objective:** Refine the generated tests to align with the specific functional requirements and ensure accurate results.

## Prerequisites

Before generating and modifying tests, ensure you have the following installed:

- Java Development Kit (JDK) version 11
- Maven
- Randoop tool

## Installation

To set up the project locally, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/PouyaGohari/Randoop-Test-Generation.git
    cd Randoop-Test-Generation
    ```

2. Ensure that Maven and JDK 11 are installed and configured on your system.

3. Download the Randoop JAR file and place it in a directory named `libs` within the project directory.

4. Compile the project to generate the necessary `target/classes` directory:
    ```sh
    mvn compile
    ```

## Usage

### Generating Tests with Randoop

1. Open the terminal in your IDE (e.g., IntelliJ IDEA).

2. Use the following command to generate tests with Randoop:

    ```sh
    java -classpath target/classes:libs/randoop-all-4.3.3.jar:~/.m2/repository/org/junit/platform/junit-platform-console-standalone/1.8.2/junit-platform-console-standalone-1.8.2.jar randoop.main.Main gentests --testclass=ir.ramtung.impl1.Library --junit-output-dir=src/test/java/tests_impl1 --output-limit=30 --regression-test-basename=RegressionTestImpl1
    ```

3. Review the generated test cases in the specified output directory.

### Modifying the Test Oracle

1. Open the generated test cases in your IDE.

2. Modify the test oracle to ensure that the tests behave correctly according to the given specification.

3. Rerun the tests to confirm that they now produce the expected results:
    ```sh
    ./gradlew test
    ```

## Results and Analysis

- **Test Generation:** Successfully generated test cases using Randoop for the target class in the project.
- **Oracle Modification:** Modified the generated test oracles to align with the specified requirements, ensuring correct test behavior.
- **Test Coverage:** Analyzed the effectiveness and coverage of the generated and modified test cases.

## Report

A detailed report documenting the instructions, methodology, implementation, and analysis for each part of the assignment is available [here](HW4_REPORT.pdf). The report includes specific instructions on using Randoop.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

