# Java Automation Tests

A Maven project for Java browser automation using Selenium WebDriver and TestNG.
Apache POI is included for reading Excel `.xlsx` test data.
The existing Java practice classes are in `src/main/java`; browser tests are in
`src/test/java`.

## Prerequisites

- JDK 17 or newer
- Maven 3.8 or newer
- Google Chrome installed
- Network access on the first run so Maven and Selenium Manager can download dependencies and the matching driver

## Run

Run the browser automation test:

```bash
mvn test
```

Selenium Manager resolves the Chrome driver automatically. The sample test runs
Chrome in headless mode against Selenium's public web form demo.

Build without running browser tests:

```bash
mvn -DskipTests package
```

The `HelloWorld` practice class can be run after compilation with:

```bash
mvn package
java -cp target/classes HelloWorld
```
