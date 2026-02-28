# QuantityMeasurement - Feet

A simple Java application to measure and compare quantities in **Feet** using clean design and unit testing.


```
## 📂 Folder Structure

Quantity-Measurement
│
├── .mvn/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── apps/
│   │               └── quantitymeasurement/
│   │                   ├── app/
│   │                   │   └── QuantityMeasurementApp.java
│   │                   │
│   │                   └── domain/
│   │                       ├── Feet.java
│   │                       └── InvalidFeetException.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── apps/
│                   └── quantitymeasurement/
│                       └── domain/
│                           └── FeetTest.java
│
├── .gitignore
├── pom.xml
└── README.md

```
---

## Features

- Immutable `Feet` class  
- Factory method `fromString()`  
- Custom exception `InvalidFeetException`  
- Proper `equals()` and `hashCode()` implementation  
- Unit testing using JUnit 5   
---

## Test Cases Covered

- Same value comparison  
- Different value comparison  
- Null comparison  
- Different type comparison  
- Valid string input  
- Invalid string input (Exception case)  

---

## Example Output

---

## Technologies Used

- Java  
- JUnit 5  

---

🔗 *Code Link:*  
👉 [UC-1](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC1-FeetEquality) 
