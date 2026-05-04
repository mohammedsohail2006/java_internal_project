# 🍔 Food Delivery System (Java OOP Project)

## 📌 Project Description
This project is a console-based Food Delivery System developed using Java. It demonstrates how real-world applications like Swiggy or Zomato can be designed using Object-Oriented Programming (OOP) concepts.

The system allows users to select restaurants, choose food items, place orders, make payments, and track the status of their orders from creation to delivery.

---

## 🚀 Features
- Multiple restaurants with different menus
- User can select and order multiple food items
- Dynamic order creation and bill calculation
- Payment options using UPI or Card
- Order status tracking (Created → Placed → Paid → Delivered)
- Modular code structure using packages

---

## 🧠 OOP Concepts Used
- **Encapsulation**: Used private variables and getter methods in classes like MenuItem and User to protect data
- **Inheritance**: Customer and DeliveryAgent inherit from the User class
- **Polymorphism**: Payment interface is implemented by UpiPayment and CardPayment classes
- **Abstraction**: Payment interface hides implementation details of payment methods
- **Factory Design Pattern**: PaymentFactory class is used to create payment objects dynamically

---

## 📁 Project Structure
src/
 ├── model/
 │     User.java
 │     Customer.java
 │     DeliveryAgent.java
 │     MenuItem.java
 │     Restaurant.java
 │     Order.java
 │
 ├── service/
 │     Payment.java
 │     UpiPayment.java
 │     CardPayment.java
 │     PaymentFactory.java
 │     OrderService.java
 │
 └── main/
       Main.java

---

## 🛠️ Technologies Used
- Java
- IntelliJ IDEA
- GitHub

---

## ▶️ How to Run
1. Clone the repository:
   git clone https://github.com/mohammedsohail2006/java_internal_project.git

2. Open the project in IntelliJ IDEA

3. Navigate to:
   src/main/Main.java

4. Run the Main class

---

## 💡 Future Enhancements
- Add graphical user interface (GUI) using JavaFX or Swing
- Integrate database (MySQL) for storing user and order data
- Implement real-time order tracking
- Add login and authentication system

---

## 👨‍💻 Author
Mohammed Sohail

---

## ⭐ Conclusion
This project clearly demonstrates how object-oriented principles can be used to design scalable and maintainable real-world applications. It provides a strong foundation for building advanced systems with UI and database integration.
