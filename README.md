# 🚀 Quantity Measurement System

A scalable, generic measurement system built using **Java Generics and Interfaces**.  
Supports **Length, Weight, Volume, and Temperature** with unit conversion, equality comparison, and selective arithmetic operations.

Designed using:
- SOLID Principles  
- DRY Architecture  
- Functional Interfaces  
- Type-safe Generics  


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

## ✨ Features

✔ Generic `Quantity<U extends IMeasurable>` design  
✔ Supports multiple measurement categories  
✔ Cross-unit comparison (e.g., Feet vs Inches)  
✔ Unit-to-unit conversion  
✔ Arithmetic operations (Add, Subtract, Divide)  
✔ Selective arithmetic support (Temperature restricted)  
✔ Immutable design  
✔ Type-safe (prevents cross-category operations)  
✔ Fully scalable architecture  

---

## 🧪 Supported Measurements

### 📏 Length
- Feet, Inches, Yards, Centimeters  

### ⚖️ Weight
- Kilogram, Gram, Pound  

### 🧴 Volume
- Litre, Millilitre, Gallon  

### 🌡️ Temperature
- Celsius, Fahrenheit, Kelvin  
*(No arithmetic allowed)*

---

## ⚙️ Core Formula

---

## 🧠 Key Concepts Used

- Java Generics  
- Enums for Unit Handling  
- Functional Interfaces  
- Immutability  
- Epsilon Comparison (floating precision)  
- SRP, DRY, OCP principles  

---

## 🔗 Use Cases Implementation

| UC  | Description | Link |
|-----|------------|------|
| UC1 | Feet Equality | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC1-FeetEquality) |
| UC2 | Feet & Inch Equality | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC2-InchEquality) |
| UC3 | Generic Length (DRY) | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC3-GenericLength/src) |
| UC4 | Multi Length Units | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC4-YardEquality/src) |
| UC5 | Unit Conversion | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC5-UnitConversion/src) |
| UC6 | Addition | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC6-UnitAddition/src) |
| UC7 | Target Unit Addition | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC7-TargetUnitAddition/src) |
| UC8 | SRP Refactor | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC8-StandaloneUnit/src) |
| UC9 | Weight Support | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC9-Weight-Measurement/src) |
| UC10 | Generic Quantity | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC10-GenericQuantity/src) |
| UC11 | Volume Support | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC11-VolumeMeasurement/src) |
| UC12 | Subtraction & Division | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC12-Subtraction-Division/src) |
| UC13 | Centralized Arithmetic | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC13-Arithmetic-DRY/src) |
| UC14 | Temperature Support | [View](https://github.com/wanjarisaurabh/Quantity-Measurement/tree/feature/UC14-TemperaturE-Measurement/src) |

---

## 🧩 Example Usage

```java
Quantity<LengthUnit> length1 = new Quantity<>(1, LengthUnit.FEET);
Quantity<LengthUnit> length2 = new Quantity<>(12, LengthUnit.INCHES);

Quantity<LengthUnit> result = length1.add(length2);

System.out.println(result); // 2.0 FEET
