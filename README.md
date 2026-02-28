# QuantityMeasurement

# UC2 - Equality Comparison

This use case implements equality comparison for:

- Feet
- Inches

Objects are created using:
Feet.fromString("1.0");
Inches.fromString("1.0");

Invalid numeric input throws a custom exception.

---

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
│   │                       └── Inches.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── apps/
│                   └── quantitymeasurement/
│                       └── domain/
│                           └── FeetTest.java
│                           └── InchesTest.java
│
├── .gitignore
├── pom.xml
└── README.md

```


## Equality Rules
- Same value → true
- Different value → false
- Null → false
- Same reference → true
- Different class → false

## Tech
Java, JUnit 5


🔗 *Code Link:*  
👉 [UC-2](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC2-InchEquality)
