# XYZBank Credit Registration System

## 🏦 Project Overview

This project is a prototype **credit registration system** developed for XYZBank. Its purpose is to provide a reliable and structured method for capturing new credit records for customers.

The system ensures that all essential information for a loan application—including customer identification, loan type, and financial details—is recorded accurately and in a consistent format. This command-line application serves as a foundational module for a larger banking information system, demonstrating core principles of data validation and secure data handling.

---

## ✨ Key Features

* **Structured Data Entry:** Guides the user to enter specific information for each credit record in a predefined order.
* **Robust Data Validation:** Implements strict validation rules for critical fields to ensure data integrity:
    * **Record ID:** Validated against a `XXXXXX` digit-only format.
    * **Customer ID:** Validated against an `AAAXXX` format (3 capital letters followed by 3 digits).
    * **Loan Type:** Constrained to a predefined list of valid options (`Auto`, `Builder`, `Mortgage`, `Personal`, `Other`).
* **User-Friendly Interface:** Provides clear prompts and feedback for the user, ensuring a smooth data entry process.

---

## 🧠 Technical Skills Demonstrated

This project showcases proficiency in the following areas:

* **Input/Output Handling:** Managing user input and displaying formatted output.
* **Data Validation:** Using **regular expressions** (regex) and conditional logic to enforce strict data formatting rules.
* **Data Structures:** Utilising appropriate data structures (like dictionaries or custom objects) to hold and manage credit record information.
* **Modular Code:** Structuring the code logically for readability and future maintenance.
* **Error Handling:** Implementing checks to gracefully handle invalid user input.

---

## 💻 Technologies Used

* **Language:** Java

---

### Installation & Setup

1.  **Clone the repository:**
```bash
git clone https://github.com/sushant1203/bankloans-management-system.git
cd bankloans-management-system
```

2.  **Open the project in IntelliJ IDEA:**
    * Launch IntelliJ IDEA.
    * Select `File > Open...` from the main menu.
    * Navigate to and select the root folder of the cloned project.
  
3.  **Follow the on-screen prompts** to enter the details for the new credit record. The system will validate your input at each step.

---

## 📄 Copyright and Licensing
Copyright (c) 2025 [Sushant Jasra Kumar]

The code for all projects in this portfolio is licensed under the **[MIT License](https://github.com/sushant1203/sushant1203/blob/main/LICENSE)**.

All non-code assets, including PDF documents, images, and visual designs, are dedicated to the public domain under the **[Creative Commons Zero v1.0 Universal (CC0 1.0)](https://github.com/sushant1203/sushant1203/blob/main/LICENSE2)**.

---
