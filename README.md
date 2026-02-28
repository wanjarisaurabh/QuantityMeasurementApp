# Quantity-Measurement

A scalable, generic measurement system built using Java Generics and interfaces.  
Supports Length, Weight, Volume, and Temperature with unit conversion, equality comparison, and selective arithmetic operations.  
Designed using SOLID principles, DRY architecture, functional interfaces, and type-safe generics for extensibility and maintainability.

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
│   │                       ├── IMeasurable.java
│   │                       └── LengthUnit.java
│   │                       └── SupportsArithmetic.java
│   │                       └── TemperatureUnit.java
│   │                       └── VolumeUnit.java
│   │                       └── WeightUnit.java
│   │                       └── Quantity.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── apps/
│                   └── quantitymeasurement/
│                       └── domain/
│                           └── QuantityTest.java
│
├── .gitignore
├── pom.xml
└── README.md

```



---

## 🚀 Use Cases

### UC1 – Feet Equality
- Immutable `Feet` class  
- Factory method `fromString()`  
- Custom exception handling  
- Proper `equals()` and `hashCode()`  

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC1-FeetEquality

---

### UC2 – Equality Comparison (Feet & Inches)

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC2-InchEquality

---

### UC3 – Generic Quantity (DRY)

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC3-GenericLength/src

---

### UC4 – Multiple Length Units

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC4-YardEquality/src

---

### UC5 – Unit Conversion

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC5-UnitConversion/src

---

### UC6 – Addition of Length Units

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC6-UnitAddition/src

---

### UC7 – Target Unit Output

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC7-TargetUnitAddition/src

---

### UC8 – Refactored LengthUnit

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC8-StandaloneUnit/src

---

### UC9 – Weight Measurement

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC9-Weight-Measurement/src

---

### UC10 – Generic Quantity System

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC10-GenericQuantity/src

---

### UC11 – Volume Measurement

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC11-VolumeMeasurement/src

---

### UC12 – Subtraction & Division

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC12-Subtraction-Division/src

---

### UC13 – Centralized Arithmetic

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC13-Arithmetic-DRY/src

---

### UC14 – Temperature Support

🔗 https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC14-TemperaturE-Measurement/src

---

## 🛠️ Technologies Used

- Java  
- JUnit 5  
- Maven  

---

## ✨ Key Highlights

- Generic & scalable design  
- SOLID principles applied  
- DRY architecture  
- Type-safe implementation  
- Immutable objects  
- Cross-unit operations  
- Selective arithmetic support  

---

