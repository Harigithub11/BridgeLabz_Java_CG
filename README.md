# Bridgelabz Java Core Programming

## Project Overview

This repository contains Java programming exercises covering fundamental concepts from basic programming elements to advanced topics like methods and strings.

---

## Table of Contents

1. [Installation](#installation)
2. [Java Fundamentals](#java-fundamentals)
3. [Programming Elements](#programming-elements)
4. [Control Flows](#control-flows)
5. [Arrays](#arrays)
6. [Methods](#methods)
7. [Strings](#strings)
8. [Practice Problems](#practice-problems)
9. [What I've Done](#what-ive-done)
10. [What I'll Do Next](#what-ill-do-next)
11. [Issues Faced](#issues-faced)

---

## Installation

### Prerequisite Installation Guide for Git Bash, a Text Editor (Notepad++), Java, and GitHub Setup

#### **1. Install Git Bash (For Windows System only)**

Git Bash is a command-line tool for Git that allows you to use Git commands on Windows in a Unix-like environment.

**Steps to Install Git Bash:**

1. Visit the official Git website: [https://git-scm.com](https://git-scm.com)
2. Download the latest version of Git Bash for Windows by clicking on the **Download for Windows** button.
3. Open the downloaded `.exe` file to start the installation process.
4. Follow the installation steps:
   - Click **Next** on the introduction page.
   - Choose the default components unless you have specific preferences.
   - For the text editor setting, you can choose **Notepad++** if you have installed it (or the default).
   - Continue with the default options and click **Install** to complete the process.
5. Once installed, launch **Git Bash** by searching for it in the Windows Start menu.

---

#### **2. Install Notepad++ (OR Any Other Text Editor)**

Notepad++ is a free, user-friendly text editor with rich features for coding.

**Steps to Install Notepad++:**

1. Go to the official Notepad++ website: [https://notepad-plus-plus.org/downloads/](https://notepad-plus-plus.org/downloads/)
2. Download the latest version of Notepad++.
3. Open the downloaded `.exe` file to start the installation.
4. Follow the installation instructions:
   - Choose the installation language.
   - Accept the license agreement and click **Next**.
   - Choose the installation folder and click **Next**.
   - Click **Install** to complete the installation with the default components.
5. After installation, launch **Notepad++** by searching for it in the Start menu or right-clicking on any file and selecting **Edit with Notepad++**.

---

#### **3. Install Java Development Kit (JDK)**

The Java Development Kit (JDK) enables you to compile and run Java programs.

**Steps to Install JDK:**

1. Go to the official Oracle website: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Under **Java SE**, click on **JDK Download**.
3. Select the appropriate version for your operating system (Windows, macOS, Linux).
4. Download the installer:
   - For Windows: Choose the `.exe` file.
   - For macOS: Choose the `.dmg` file.
   - For Linux: Choose the appropriate package for your distribution.
5. Run the downloaded installer:
   - Follow the installation steps (use default settings).
   - Accept the license agreement and proceed with the installation.
6. Set up the **JAVA_HOME** environment variable:
   - **Windows**:
     - Open **Control Panel** → **System and Security** → **System** → **Advanced system settings**.
     - Click on **Environment Variables** in the **System Properties** window.
     - Under **System variables**, click **New** and add:
       - **Variable Name**: `JAVA_HOME`
       - **Variable Value**: The path to your JDK installation (e.g., `C:\Program Files\Java\jdk-<version>`).
     - Add the `bin` folder of the JDK to your **Path** variable (e.g., `C:\Program Files\Java\jdk-<version>\bin`).
7. Verify the installation:
   - Open **Git Bash** or **Command Prompt**.
   - Type:
     ```bash
     java -version
     ```
     This will display the installed Java version if correctly set up.

---

#### **4. Set Up GitHub**

GitHub is a web-based platform for version control and collaboration. It hosts your Git repositories and allows you to collaborate on projects.

**Steps to Set Up GitHub:**

1. Go to the official GitHub website: [https://github.com](https://github.com)
2. Create a GitHub account:
   - Click on **Sign up** and enter your details (email, username, password).
   - Verify your email address after signing up.
3. Configure GitHub in Git Bash:
   - Open **Git Bash**.
   - Set your GitHub username using the command:
     ```bash
     git config --global user.name "YourGitHubUsername"
     ```
   - Set your email address using the command:
     ```bash
     git config --global user.email "youremail@example.com"
     ```
4. **Generate SSH Key** (Optional but recommended for secure authentication):
   - In Git Bash, generate an SSH key with the following command:
     ```bash
     ssh-keygen -t rsa -b 4096 -C "youremail@example.com"
     ```
     Press **Enter** to accept the default file location.
   - After generating the key, add it to the SSH agent by running:
     ```bash
     eval "$(ssh-agent -s)"
     ssh-add ~/.ssh/id_rsa
     ```
   - Copy the SSH key to your clipboard:
     ```bash
     clip < ~/.ssh/id_rsa.pub
     ```
5. **Add the SSH Key to GitHub**:
   - Go to GitHub, click on your profile icon, and go to **Settings**.
   - Navigate to **SSH and GPG keys** and click **New SSH Key**.
   - Paste the SSH key and give it a recognizable title, then click **Add SSH key**.
6. **Clone a Repository**:
   - You can now clone a repository from GitHub using Git Bash. Go to a repository on GitHub and copy the SSH clone URL.
   - Run the following command to clone it:
     ```bash
     git clone git@github.com:username/repository-name.git
     ```

---

### Conclusion

- **Git Bash** provides the necessary command-line tools for working with Git repositories.
- **Notepad++** serves as a simple, efficient text editor for coding.
- **Java JDK** allows you to write, compile, and run Java applications.
- **GitHub** is your platform for storing and managing Git repositories, collaborating on projects, and contributing to open-source development.

With all these tools set up, you're ready to start coding, managing version control, and collaborating with others!

---

## Java Fundamentals

- **History**: Understanding the evolution and background of Java programming language.
- **Naming Conventions**: Standard practices for naming variables, classes, and methods in Java.
- **Operators**: Overview of arithmetic, relational, and logical operators.
- **Static Keyword**: Understanding static variables, methods, and their usage.

---

## Programming Elements

1. Java Comments
2. Java Basic Data Types
3. Java Variables
4. Arithmetic Operators
5. Operator Precedence
6. Type Conversion
7. Taking User Input in Programs

---

## Control Flows

1. Java Control Flows
2. Java boolean Data Type
3. Boolean Expressions
4. Logical Operators
5. if Conditional Statement along with else if and final else statement
6. Java loops

---

## Arrays

1. Java Arrays
2. Create an Array
3. Access an Array
4. Accessing using for loop
5. Modifying an Array
6. Using length property of array
7. Java Multi-dimensional Array
8. Java 2 Dimensional Array (Matrix)
9. Accessing, finding size, etc of Multi-Dimensional Array
10. Using Java System error() message and exit() method

---

## Methods

1. User Defined Methods
2. Using Methods Multiple Times
3. Making Methods more Dynamic
4. Recursive Methods
5. Java Static Methods
6. Java Standard Library Methods
7. java.lang.Math class

---

## Strings

String manipulation and operations in Java.

---

## Practice Problems

Refer to **"Few Problems to start with.pdf"** for additional practice exercises and problem sets.

---

## What I've Done

Completed Java core programming exercises covering Programming Elements, Control Flows, Arrays, and Methods with multiple levels of difficulty.

---

## What I'll Do Next

Will continue with String manipulation exercises and advance to Object-Oriented Programming concepts.

---

## Issues Faced

Encountered challenges with multi-dimensional array manipulation and recursive method implementation that were resolved through practice.

---

## Repository Structure

```
Bridgelabz_Java_CG/
├── src/
│   └── CoreProgramming/
│       ├── ProgrammingElements/
│       │   ├── level1/
│       │   └── level2/
│       ├── ControlFlows/
│       │   ├── level1/
│       │   ├── level2/
│       │   └── level3/
│       ├── Arrays/
│       │   ├── level1/
│       │   └── level2/
│       └── Methods/
│           ├── level1/
│           ├── level2/
│           └── level3/
└── README.md
```

---

## License

This project is part of the Bridgelabz training program.
