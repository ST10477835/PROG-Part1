# PROG-Part1
# User Registration and Login System

A simple Java console application for registering and logging in users, created as part of an educational project.

## 📋 Description

This application allows a user to:

- Register with a first name, last name, username, password, and cellphone number.
- Validate each input according to specific rules.
- Log in using the registered username and password.
- View messages indicating the success or failure of registration and login attempts.

## 🚀 Features

- ✅ **Username Validation**: Must contain an underscore (`_`) and be no longer than 5 characters.
- 🔐 **Password Validation**: Must be at least 8 characters, with a capital letter, number, and special character.
- 📱 **Phone Number Validation**: Must begin with `+27` or `0` and be 10 digits long.
- 📥 **Registration Feedback**: Displays messages for successful or failed registration attempts.
- 🔁 **Login Logic**: Verifies input credentials and displays personalized welcome messages.

## 🛠️ Technologies Used

- Java
- Scanner for input
- Regular expressions for validation

## 🧪 How to Run

1. Clone the repository or copy the code into your IDE (e.g., NetBeans or IntelliJ).
2. Compile and run the `ProgPart1ST10477835` class.
3. Follow the on-screen prompts to register a user.
4. You can modify the `main` method to also test login functionality.

```bash
javac ProgPart1ST10477835.java
java progpart1st10477835.ProgPart1ST10477835
├── ProgPart1ST10477835.java
└── README.md
Please enter a first name: John
Please enter a last name: Doe
Please enter a username: j_d
Username successfully captured.
Welcome John, Doe it is great to see you.
Please enter a password: Pass@123
Password successfully captured.
Please enter your cellphone number: +27831234567
Cell phone number successfully added.
