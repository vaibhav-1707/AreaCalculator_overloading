# AreaCalculator_overloading

## 🚀 How to Run the Program

### 1. Clone the Repository

```sh
git clone https://github.com/vaibhav-1707/AreaCalculator_overloading.git
cd AreaCalculator_overloading/Area_Overloading
```

### 2. Compile the Java File

```sh
javac AreaCalculator.java
```

### 3. Run the Program

```sh
java AreaCalculator
```

### 4. Follow the Prompts

- Enter the shape name (square, rectangle, triangle, or circle).
- Enter the required dimensions when prompted.
- The program will display the calculated area.

If you enter an invalid shape or a non-numeric value, the program will prompt you again until you provide valid input.

---

## 🏗️ Code Walkthrough

### Main Components

- **Class:** `AreaCalculator`
- **Overloaded Methods:**
  - `area(double side)` – Calculates area of a square.
  - `area(double length, double width)` – Calculates area of a rectangle.
  - `area(double base, double height, boolean isTriangle)` – Calculates area of a triangle if `isTriangle` is `true`, otherwise calls the rectangle method.
  - `area(int radius)` – Calculates area of a circle.
- **Input Helper:** `getDoubleInput(Scanner sc, String message)` – Repeatedly prompts the user until a valid number is entered.

### Input Handling

- The program uses a loop to ensure the user enters a valid shape name.
- For each shape, it uses the `getDoubleInput` method to ensure only valid numbers are accepted.
- If the user enters an invalid value, a clear error message is shown and the user is prompted again.

### Example Code Snippet

```java
// Example of method overloading in AreaCalculator.java
double area(double side) {
    return side * side;
}

double area(double length, double width) {
    return length * width;
}

double area(double base, double height, boolean isTriangle) {
    return isTriangle ? (base * height) / 2 : area(base, height);
}

double area(int radius) {
    return Math.PI * radius * radius;
}
```

---

## 🛡️ Error Handling

- **Invalid Shape:** If the user enters a shape not in the list, the program displays an error and exits.
- **Invalid Number:** If the user enters a non-numeric value for a dimension, the program displays an error and asks again.

---

## 🤔 Why Use Method Overloading?

- **Cleaner Code:** You don't need separate method names for each shape.
- **Easier to Read:** The same method name (`area`) is used for all shapes, making the code intuitive.
- **Demonstrates OOP Concepts:** Shows how Java can distinguish between methods based on their parameters.

---

## 👤 Author

- [vaibhav-1707](https://github.com/vaibhav-1707)

---

## 🙌 Contributing

Contributions are welcome!  
If you have suggestions for improvements or want to add more shapes, feel free to fork the repo and submit a pull request.

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 💡 Further Learning

- [Java Method Overloading (Oracle Docs)](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Scanner Class for Input](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [Beginner Java Programming](https://www.w3schools.com/java/)

---

**Happy Coding!**
