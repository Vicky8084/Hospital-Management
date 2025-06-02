🏥 Hospital Management System (Spring Boot)

This is a simple Hospital Management backend application built with Java Spring Boot. It simulates basic hospital operations using in-memory storage (HashMap) and provides REST APIs to manage doctors, patients, and wards.

🚀 Features
Add, retrieve, and remove:

👨‍⚕️ Doctors

🧑‍🤝‍🧑 Patients

🏨 Wards

RESTful API using @PostMapping, @GetMapping, and @DeleteMapping

Temporary in-memory storage using HashMap

Testable using Postman

🧑‍💻 Technologies Used
Java 17+

Spring Boot

Spring Web

Postman (for testing)

HashMap (for temporary data storage)


📦 Project Structure
hospital-management/
├── src/main/java/com/example/hospital/
│   ├── controller/
│   │   └── HospitalController.java
│   ├── model/
│   │   ├── Doctor.java
│   │   ├── Patient.java
│   │   └── Ward.java
│   └── HospitalManagementApplication.java
└── README.md


📚 Model Classes
Doctor.java
id: Integer
name: String
specialization: String
address: String
mobileNumber: String

Patient.java
Doctor.java
id: Integer
name: String
disease: String
address: String
mobileNumber: String

Ward.java
id: Integer
name: String
wardNumber: Integer
