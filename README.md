# Aesthetic Planner

Aesthetic Planner is a small Java console application that creates a daily plan in different styles. The user enters a main goal and chooses a planning style.

## Planning styles

- **Minimalist** - focuses on a short list of priorities and a simple routine.
- **Cozy** - includes a calmer schedule, hobbies, and time to relax.
- **Studycore** - focuses on reviewing notes, practice, and study sessions.

## Design pattern

The project demonstrates the **Strategy Pattern**.

- `PlannerStrategy` is the strategy interface.
- `MinimalistStrategy`, `CozyStrategy`, and `StudycoreStrategy` are concrete strategies.
- `Planner` is the context. It stores the current strategy and delegates plan generation to it.
- `Main` is the client. It reads the user's choice and sets the selected strategy.

The strategy can be changed while the program is running. The `Planner` class does not use `if` or `switch` to decide which algorithm to execute; it calls the common interface method instead.

## Clean Code principles

1. **Single Responsibility** - each concrete strategy creates one type of plan.
2. **Meaningful Names** - class and method names explain their purpose.
3. **Polymorphism** - the context calls the interface instead of checking concrete strategy types.
4. **Separation of Responsibilities** - user interaction, strategy management, and plan generation are separated.
5. **Open/Closed Principle** - new strategies can be added without changing the existing strategy classes or the `Planner` class.

## Requirements

- Java JDK 17 or newer.

## Run the project

Open a terminal in the project folder and run:

```bash
cd src
javac *.java
java Main
```

Enter your main goal, then choose a planning style from the menu.
