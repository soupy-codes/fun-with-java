# fun-with-java

This project is designed to solve various Java problems through a structured approach. It includes a main application class and corresponding unit tests to ensure the functionality of the implemented solutions.

## Project Structure

```
fun-with-java
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── soupy
│   │   │           └── problems
│   │   │               └── Main.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com
│       │       └── soupy
│       │           └── problems
│       │               └── MainTest.java
│       └── resources
├── .gitignore
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```
   cd fun-with-java
   ```

3. **Build the project**:
   Use Maven to build the project:
   ```
   mvn clean install
   ```

4. **Run the application**:
   You can run the application using:
   ```
   mvn exec:java -Dexec.mainClass="com.example.problems.Main"
   ```

5. **Run the tests**:
   To execute the unit tests, use:
   ```
   mvn test
   ```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.