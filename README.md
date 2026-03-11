# AP Computer Science A – 40 Day Preparation 🚀

Ref: https://cw045.k12.sd.us/AP%20Computer%20Science%20A/WebLessons%20CD%202006/summary/index.html

This repository is a structured study system for preparing for **AP Computer Science A** while also developing **real-world Java programming habits**.

The goal is to balance:

* **Concept understanding**
* **MCQ practice (55% of the exam)**
* **FRQ practice (45% of the exam)**
* **Hands-on coding**
* **Mini projects**
* **Consistent GitHub commits**

The exam is administered by the College Board.

---

# 🎯 Goal

* Master **Java fundamentals**
* Practice **FRQ-style programming problems**
* Strengthen **multiple-choice reasoning**
* Build **clean, well-structured code**
* Maintain a **daily GitHub coding habit**

---

# 📂 Repository Structure

```
APCSA/
│
├── README.md
├── progress.md
│
├── src/
│   ├── unit01_primitives/
│   │   ├── notes.md
│   │   ├── mcq.md
│   │   └── practice/
│   │
│   ├── unit02_conditionals/
│   │   ├── notes.md
│   │   ├── mcq.md
│   │   └── practice/
│   │
│   ├── unit03_loops/
│   │   ├── notes.md
│   │   ├── mcq.md
│   │   ├── practice/
│   │   └── frq/
│   │
│   ├── unit04_classes/
│   │   ├── notes.md
│   │   ├── mcq.md
│   │   ├── practice/
│   │   └── frq/
│   │
│   ├── unit05_arrays/
│   │   ├── notes.md
│   │   ├── mcq.md
│   │   ├── practice/
│   │   └── frq/
│   │
│   ├── unit06_arraylist/
│   │   ├── notes.md
│   │   ├── mcq.md
│   │   ├── practice/
│   │   └── frq/
│   │
│   └── unit07_2darrays/
│       ├── notes.md
│       ├── mcq.md
│       ├── practice/
│       └── frq/
│
├── frq_archive/
│   ├── 2019/
│   ├── 2021/
│   └── 2023/
│
└── mini-projects/
    ├── guessing-game/
    └── grade-calculator/
```

This structure mirrors the **official AP CSA units** and keeps concepts, practice problems, and exam-style questions organized.

---

# 📘 What Each File Contains

## 📝 notes.md

`notes.md` contains **concept summaries and explanations** for each unit.

Think of this file as your **personal textbook summary**.

Example:

```
# Unit 3 — Loops

## Concepts

- for loop
- while loop
- nested loops

## Syntax

for (int i = 0; i < n; i++) {
    // code
}

## Common Patterns

### Summation

int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}

### Counting

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

## Common Mistakes

- infinite loops
- off-by-one errors
- incorrect loop condition
```

### Purpose

* Conceptual understanding
* Quick review before the exam
* Debugging reference

---

# 📊 mcq.md (Very Important)

`mcq.md` tracks **multiple-choice questions you practice**.

Remember:

* **55% of the AP CSA exam is MCQ**

Example:

```
# Unit 3 — Loops MCQ Practice

## Question 1

What is the output?

for (int i = 1; i <= 3; i++) {
    System.out.print(i);
}

A. 123
B. 012
C. 13
D. 321

Answer: A

Explanation:
The loop runs from 1 to 3 inclusive.
```

### Purpose

* Simulate exam-style questions
* Track mistakes
* Reinforce conceptual understanding

---

# 💻 practice/ Folder

The `practice/` folder contains **small coding exercises**.

Example:

```java
public class CircleArea {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double area = calculateArea(5);
        System.out.println("Area: " + area);
    }
}
```

Example problems:

* Temperature converter
* Max of three numbers
* Prime number check
* Fibonacci sequence
* Array sum

### Purpose

* Build coding fluency
* Practice Java syntax
* Ensure programs compile and run

---

# 🧠 frq/ Folder

This is the **most important folder**.

FRQs make up **45% of the AP CSA exam**.

Example:

```java
public class ArrayStats {

    public static int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }
}
```

You should practice **real FRQs from past exams** published by the College Board.

---

# 📚 frq_archive/

This folder stores **actual FRQ questions organized by year**.

Example:

```
frq_archive/
   2019/
      Question1.java
      Question2.java
   2021/
      Question1.java
```

### Purpose

* Practice full exam sets
* Simulate real exam conditions
* Track progress across years

---

# 🛠 mini-projects/

Mini projects simulate **real development work**.

Examples:

* guessing-game
* grade-calculator
* student-manager
* tic-tac-toe
* array-statistics-tool

Example project:

```java
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int guess = 0;

        while (guess != number) {

            System.out.print("Guess: ");
            guess = scanner.nextInt();

            if (guess < number)
                System.out.println("Too low");
            else if (guess > number)
                System.out.println("Too high");
            else
                System.out.println("Correct");

        }

        scanner.close();
    }
}
```

### Purpose

* Build programming intuition
* Apply concepts to real programs
* Create small portfolio projects

---

# ⚙️ Tools & Setup

Recommended editor:
Visual Studio Code

Install these extensions:

* Java Extension Pack
* Checkstyle
* GitLens (optional)

These provide warnings such as:

* bad naming
* unused variables
* formatting issues

This encourages **clean, professional code**.

---

# 🧹 Coding Style Guidelines

Follow standard Java conventions:

✔ Class names → **PascalCase**
✔ Method names → **camelCase**
✔ Constants → **ALL_CAPS**
✔ Descriptive variable names

Example:

```java
public class GradeCalculator {

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        double avg = calculateAverage(85, 90, 95);
        System.out.println("Average: " + avg);
    }
}
```

---

# ▶️ Compiling Java

Always **compile and run your program before pushing**.

```
javac GuessingGame.java
java GuessingGame
```

---

# 📅 Daily Workflow

Every day:

1️⃣ Study a concept
2️⃣ Write notes in `notes.md`
3️⃣ Solve practice coding problems
4️⃣ Solve one FRQ
5️⃣ Commit to GitHub

Example commit:

```
git add .
git commit -m "Day 4: loops practice + FRQ 2021 #1"
git push
```

---

# ⏱ Recommended Daily Routine (90 minutes)

### Step 1 — Concepts (15 min)

Study the topic and update `notes.md`.

### Step 2 — Coding Practice (30–45 min)

Solve **3–5 coding problems**.

### Step 3 — FRQ Practice (30–40 min)

Write **one FRQ solution from scratch**.

---

# 🧠 FRQ Practice Strategy

Practice FRQs from:

* 2019
* 2021
* 2022
* 2023
* 2024

All official questions are provided by the College Board.

---

# 📊 Progress Dashboard

## Concept Progress

Primitives     ██████████ 100%
Conditionals   ███████░░░ 70%
Loops          ███░░░░░░░ 30%
Methods        ░░░░░░░░░░ 0%
Classes        ░░░░░░░░░░ 0%
Arrays         ░░░░░░░░░░ 0%
ArrayList      ░░░░░░░░░░ 0%
2D Arrays      ░░░░░░░░░░ 0%

---

## FRQ Practice

2019 FRQ1 ⬜
2019 FRQ2 ⬜
2021 FRQ1 ⬜
2021 FRQ2 ⬜

---

## Mini Projects

⬜ Guessing Game
⬜ Grade Calculator

---

## Daily Progress

Day 1 ✅
Day 2 ⬜
Day 3 ⬜
Day 4 ⬜
Day 5 ⬜
...
Day 40 ⬜

---

# 🔬 Advanced Configuration (Optional)

You can enable better static analysis in VSCode.

Create:

```
.vscode/settings.json
```

Example:

```json
{
 "java.compile.nullAnalysis.mode": "automatic"
}
```

This enables **stronger static analysis and warnings**.

# 🛠️ VSCode Tweaks

A set of tips to **disable updates, telemetry, and unnecessary extensions** in VSCode for a cleaner, faster setup.

---

## 1. Disable All Auto Updates

Open **Settings JSON**:

1. Press `Ctrl + Shift + P`
2. Search for **Preferences: Open Settings (JSON)**

Add the following configuration:

```json
{
  "update.mode": "none",
  "extensions.autoUpdate": false,
  "extensions.autoCheckUpdates": false,
  "extensions.ignoreRecommendations": true
}
```

This disables:

- VSCode updates
- Extension updates
- Extension recommendations

---

## 2. Disable Built-in Extensions You Don't Want

VSCode comes with many built-in extensions (GitHub, TypeScript, etc.).

Open:

**Extensions Panel → Filter:** `@builtin`

Disable anything you don’t need.

### Common extensions people disable

- GitHub Pull Requests
- Microsoft Authentication
- Live Share
- Docker
- Remote Development

---

## 3. Disable Telemetry and Background Services

Add the following to your **settings JSON**:

```json
{
    "telemetry.enableTelemetry": false,
    "telemetry.enableCrashReporter": false,
    "telemetry.telemetryLevel": "off",
    "extensions.autoCheckUpdates": false,
    "extensions.autoUpdate": false,
    "extensions.ignoreRecommendations": true,
    "extensions.showRecommendationsOnlyOnDemand": false,
    "workbench.enableExperiments": false,
    "editor.quickSuggestions": {
        "comments": "off",
        "strings": "off",
        "other": "off"
    },
    "editor.suggestOnTriggerCharacters": false,
    "workbench.startupEditor": "none",
    "workbench.statusBar.visible": false,
    "claudeCode.environmentVariables": [

    ],
    "claudeCode.useTerminal": true,
    "claudeCode.useCtrlEnterToSend": true
}
```

---

## 4. Prevent Extension Installs Completely (Optional)

If you want **zero plugins**, add:

```json
{
  "extensions.supportUntrustedWorkspaces": false
}
```

Then simply **avoid installing extensions**.
---

# 🚀 Final Objective

After completing this repository you will have:

* Strong **Java fundamentals**
* Experience solving **AP FRQs**
* A **well-structured GitHub repository**
* Consistent **daily coding practice**
* Better preparation for the **AP Computer Science A exam**

Happy coding! 💻


Here’s how the WebLessons content (A‑lessons) maps into a APCSA repo structure that supports notes, MCQs, practice, and FRQ tracking.

📌 Lesson Mapping — WebLessons to Repo Structure

The WebLessons CD lists lessons like A1, A2, ..., A16 etc.

We’ll map them into your study units.

📁 unit01_primitives
WebLesson	Topic (Approx)	What to Put in Repo
A3 - Primitive Data Types	Basic primitives (int, double, boolean)	notes.md, mcq.md, practice/
A7 - Simple I/O	Scanner input/output	practice/, notes.md

Focus: Variables, types, input/output.

📁 unit02_conditionals
WebLesson	Topic
A8 - Control Structures	If, if‑else, logical operators

Focus: Branching logic and boolean logic.

📁 unit03_loops
WebLesson	Topic
A12 - Iterations	while loops, for loops, do‑while

Focus: Loop structure and patterns.

📁 unit04_classes
WebLesson	Topic
A1 - Introduction to OOP	Basic objects and classes
A2 - Object‑Oriented Programming	deeper class structure
A4 - Object Behavior	methods, return values, scope
A5 - Designing and Using Classes	constructors, design

Focus: Classes, methods, constructors, scope.

📁 unit05_strings

We can create an extra unit for Strings since WebLessons includes this:

WebLesson	Topic
A10 - Strings	String methods, usage

Note: Strings don’t separate into practice like arrays, but deserve dedicated practice files.

📁 unit06_arraylist
WebLesson	Topic
A15 - ArrayList	Dynamic lists, wrapper classes

Note: Some arraylist topics include iterators and generics.

📁 unit07_arrays
WebLesson	Topic
A16 - Single Dimension Arrays	Core array topics

Note: You can organize this with subtopics for traversal and algorithms (min, max, sum). Specific algorithms can be practice problems.

📁 unit08_algorithms

Although your current structure has no dedicated algorithms unit, the CD includes:

WebLesson	Topic
A17 - Quadratic Sorting	bubble, insertion, selection
A18 - Merge/MergeSort	more advanced
A19 - Sequential/Binary Searches	search

You can add a unit08_algorithms/ to hold:

src/unit08_algorithms/
├── notes.md
├── mcq.md
├── practice/

Use this for sorting/searching algorithms.

📁 unit09_exceptions_io

Some WebLessons cover:

WebLesson	Topic
A13 - Exceptions and File I/O	Try/catch, file input

Create unit09_exceptions_io/ with examples like file reading, exception practice.

📁 Recursion
WebLesson	Topic
A9 - Recursion	Basic recursive patterns

Create unit10_recursion/.

🗂 Summary of Mapped Repo Units

Your updated units could be:

src/
├── unit01_primitives/
├── unit02_conditionals/
├── unit03_loops/
├── unit04_classes/
├── unit05_strings/
├── unit06_arraylist/
├── unit07_arrays/
├── unit08_algorithms/
├── unit09_exceptions_io/
├── unit10_recursion/

Each unit contains:

notes.md       – explanations of key concepts
mcq.md         – MCQ practice you create
practice/      – coding problems you solve
frq/           – real FRQs where applicable
🔗 How to Use WebLessons Material
In notes.md:

Summarize the WebLesson content:

Example: convert A12 – Iterations into section notes

## Iteration Concepts
while loops
for loops
do‑while loops
nested loops
iteration pitfalls
In mcq.md:

Add practice MCQs (you can craft them from the lesson content). For example, from A8 – Control Structures:

## Conditional MCQ
Q: Which executes only when a condition is true?
A) for
B) if
C) switch
D) while
Answer: B
🧠 Why This Mapping Is Good
Aligns With Exam Structure

CollegeBoard’s current AP CSA includes units very similar to this list: primitives, objects & methods, conditionals, loops, classes, data structures (arrays/ArrayList), recursion, etc.

📌 Extras You Can Add
Algorithms

AP CSA doesn’t require deep sorting/searching beyond basics, but having them improves your coding fluency.

Example contents:

unit08_algorithms/notes.md
unit08_algorithms/practice/BubbleSort.java


| WebLesson | Topic                                       | Suggested Repo Folder                       | AP CSA College Board Unit|
|-----------|---------------------------------------------|---------------------------------------------|--------------------------|
| A1        | Introduction to OOP                         | unit04_classes                              | Classes & Objects        |
| A2        | Object-Oriented Programming                 | unit04_classes                              | Classes & Objects        |
| A3        | Primitive Data Types                        | unit01_primitives                           | Primitive Types          |
| A4        | Object Behavior                             | unit04_classes                              | Classes & Objects        |
| A5        | Designing and Using Classes                 | unit04_classes                              | Classes & Objects        |
| A6        | Libraries and APIs                          | unit04_classes/practice                     | Classes & Objects        |
| A7        | Simple I/O                                  | unit01_primitives/practice                  | Primitive Types          |
| A8        | Control Structures                          | unit02_conditionals                         | Control Structures       |
| A9        | Recursion                                   | unit10_recursion                            | Methods & Recursion      |
| A10       | Strings                                     | unit05_strings                              | Strings                  |
| A11       | Inheritance                                 | unit04_classes                              | Classes & Objects        |
| A12       | Iterations                                  | unit03_loops                                | Loops                    |
| A13       | Exceptions and File I/O                     | unit09_exceptions_io                        | Exceptions & I/O         |
| A14       | Boolean Algebra & Loop Boundaries           | unit03_loops                                | Loops                    |
| A15       | ArrayList                                   | unit06_arraylist                            | ArrayList                |
| A16       | Single Dimension Arrays                     | unit07_arrays                               | Arrays                   |
| A17       | Quadratic Sorting Algorithms                | unit08_algorithms                           | Algorithms & Searching   |
| A18       | Merge and MergeSort                         | unit08_algorithms                           | Algorithms & Searching   |
| A19       | Sequential and Binary Searches              | unit08_algorithms                           | Algorithms & Searching   |
| A20       | Inheritance, Polymorphism, Abstract Classes | unit04_classes                             | Classes & Objects         |
| A21       | Number Systems                              | unit01_primitives/notes.md or separate unit | Primitive Types / Misc   |
| A22       | General Computer Knowledge                  | misc_notes.md                               | Miscellaneous Concepts   |
| AB23      | Two-Dimensional Arrays                      | unit07_2darrays                             | 2D Arrays                |
| AB24      | Recursive Array Programming                 | unit10_recursion                            | Methods & Recursion      |
| AB25      | Order of Algorithms / Big O                 | unit08_algorithms                           | Algorithms & Searching   |
| AB26      | QuickSort                                   | unit08_algorithms                           | Algorithms & Searching   |
| AB27      | Java Lists and Iterators                    | unit06_arraylist                            | ArrayList / Collections  |
| AB28      | Sets and Maps                               | advanced_data_structures/sets_maps          | Advanced DS              |
| AB29      | Linked List                                 | advanced_data_structures/linked_list        | Advanced DS              |
| AB30      | Binary Search Trees                         | advanced_data_structures/bst                | Advanced DS              |
| AB31      | Stacks and Queues                           | advanced_data_structures/stacks_queues      | Advanced DS              |
| AB32      | Hash-Coded Data Storage                     | advanced_data_structures/hash               | Advanced DS              |
| AB33      | Priority Queues                             | advanced_data_structures/priority_queue     | Advanced DS              |
|-----------|---------------------------------------------|---------------------------------------------|--------------------------|

✅ How to Use This Mapping in Your Repo

Each Unit Folder:

notes.md → summarize the lesson content

mcq.md → craft multiple-choice questions based on the lesson

practice/ → small coding problems

frq/ → any FRQs related to that topic

Advanced Data Structures (AB28–AB33):
Optional, not required for AP CSA exam but useful if you want a portfolio-level repo.

Daily Study:
Follow the 40-day plan and tackle each WebLesson as a “mini-unit” inside the mapped folder.


Daily Plan
Daily Routine (~90–120 min)

1️⃣ Concept Study & Notes (15–20 min)

Read lesson (WebLesson mapped to unit)

Write notes.md

2️⃣ Coding Practice (30–45 min)

Solve 3–5 small problems from practice/ folder

Compile Java, follow coding standards

3️⃣ FRQ Practice (30–40 min)

Solve one FRQ problem per day from frq_archive/

Track in progress.md

4️⃣ MCQ Practice (15–20 min)

Write and solve multiple-choice questions in mcq.md

5️⃣ Commit & Push (5–10 min)

git add .

git commit -m "Day X: notes + practice + FRQ"

git push

| Week   | Days          | Activities / Units                                                            |
| ------ | ------------- | ----------------------------------------------------------------------------- |
| Week 1 | Mar 10–Mar 16 | **Unit01–Unit03**: Primitives, Conditionals, Loops; practice + FRQs 2019–2024 |
| Week 2 | Mar 17–Mar 23 | **Unit04–Unit05**: Classes, Strings; practice + FRQs 2019–2024                |
| Week 3 | Mar 24–Mar 30 | **Unit06–Unit07**: ArrayList, Arrays, 2D Arrays; practice + FRQs 2021–2024    |
| Week 4 | Mar 31–Apr 6  | **Unit08–Unit09**: Algorithms, Exceptions & I/O; practice + FRQs 2021–2024    |
| Week 5 | Apr 7–Apr 13  | **Unit10 + Review Advanced Data Structures**; practice FRQs 2019–2024         |
| Week 6 | Apr 14–Apr 19 | **Full Review & Mock Exams**; focus on FRQs + timed MCQ practice              |


