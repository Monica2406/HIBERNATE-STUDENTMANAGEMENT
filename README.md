# Hibernate Student Management System

## Overview
The **Hibernate Student Management System** is a Java-based application that uses Hibernate ORM for managing student records in a database. It demonstrates CRUD (Create, Read, Update, Delete) operations using Hibernate.

## Features
- Add new students to the database
- Retrieve and display student details
- Update student information
- Delete student records

## Technologies Used
- Java
- Hibernate ORM
- MySQL (or any relational database)
- Maven
- Eclipse IDE (or any Java-supported IDE)

## Project Structure
```
Hibernate_StudentManagement/
│── src/
│   ├── main/java/com/learning/Hibernate_StudentManagement/
│   │   ├── App.java  # Main application class
│   │   ├── Student.java  # Entity class
│   │   ├── StudentDAO.java  # Data Access Object class
│   ├── main/resources/hibernate.cfg.xml  # Hibernate configuration file
│── pom.xml  # Maven dependencies
```

## Prerequisites
- Install Java (JDK 8 or later)
- Install MySQL and set up a database
- Install Maven
- Configure Hibernate (update database credentials in `hibernate.cfg.xml`)

## Setup & Installation
1. Clone the repository or extract the ZIP folder.
2. Open the project in Eclipse or any Java IDE.
3. Configure MySQL database and update `hibernate.cfg.xml`.
4. Build the project using Maven:
   ```sh
   mvn clean install
   ```
5. Run the application by executing `App.java`.

## Database Configuration (hibernate.cfg.xml)
Update the following properties in `hibernate.cfg.xml` to match your database settings:
```xml
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/studentdb</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">password</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    </session-factory>
</hibernate-configuration>
```

## Running the Application
1. Run `App.java` to perform CRUD operations.
2. Check the database to verify student records.

## Contributing
Feel free to fork this repository and contribute by submitting pull requests.

## License
This project is licensed under the MIT License.


