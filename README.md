# Debugging Lab

## Learning Goals

- Practice using the debugger to find bugs in a Java program.

## Introduction

In this lab, practice using the IntelliJ debugger by debugging a buggy program.

Fork and clone this repository. When you do, you will see a `BuggyLab.java` file
that already has some code in it:

```java
public class BuggyLab {
  public static void main(String[] args) {

    // We're having another pizza party!
    int pizzaSlices = 10;
    int people = 10;

    // Bug One
    // Do we have enough pizza to feed everyone?
    boolean enoughPizza = pizzaSlices > people;
    System.out.println("Do we have enough pizza to feed everyone? Answer: " + enoughPizza);

    // Bug Two
    // We're in luck! Bob ordered another pizza pie! The other pizza has 10 slices
    // How many slices of pizza do we have now?
    pizzaSlices =+ 10;
    System.out.println("With another pizza, we now have " + pizzaSlices + " pizza slices.");

    // Bug Three
    // Oh no! Alyssa has to leave the party early and can't have any pizza.
    // Will we have any slices of pizza left over?
    people--;
    int leftovers = pizzaSlices / people;
    System.out.println("We will have " + leftovers + " slices of pizza left over if we only have "
            + people + " people at the party.");

  }
}
```

This program has three bugs that need to be fixed. Make your edits in this file.
Note the comments in the file to help you as well.

## Instructions

There are three bugs in the program that need to be fixed. Within `BuggyLab`,
you should see some comments offering hints into what the bug may be. Use the
IntelliJ debugger to find the bugs, modify the code, and then step through the
program again.

HINT: Comment out the other bug sections to focus on the bug at hand. For
example, if working on "Bug One", comment out the other two bugs. Once that bug
has been resolved, uncomment the next bug section.

### Expected Output

Use the expected output here to check your console output as you resolve
each bug:

```text
Do we have enough pizza to feed everyone? Answer: true
With another pizza, we now have 20 pizza slices.
We will have 2 slices of pizza left over if we only have 9 people at the party.
```

### Bug One

In this section, we want to see if we have enough pizza to feed everyone at the
pizza party. Notice that the variables `pizzaSlices` and `pizza` have already
been declared and initialized:

```java
        // We're having another pizza party!
        int pizzaSlices = 10;
        int people = 10;
```

- Set a breakpoint on line 10: `boolean enoughPizza = pizzaSlices > people;`
- Utilize the step-over action.
- Consider what the value of the variable `enoughPizza`.
  - If it looks right, resume the program and continue on.
  - If it doesn't, stop the program and make the appropriate changes. Then
    restart the debugger to see if it is corrected.
- Once you have fixed the bug, move onto "Bug Two".

As a reminder, the "resume program" and "stop" buttons can be found on the
left-hand sidebar of the debug console:

![resume-pause-stop-execution-buttons](https://curriculum-content.s3.amazonaws.com/java-mod-1/debugger/resume-pause-stop-program.PNG)

The expected output of this section should be:

```text
Do we have enough pizza to feed everyone? Answer: true
```

### Bug Two

In this section, we want to determine how many pizza slices we have now that Bob
ordered an extra pizza! The extra pizza has another 10 slices.

- Remove the breakpoint on line 10 from the "Bug One" section. By this point in
  the lab, it is assumed you have already addressed that bug. You can remove a
  breakpoint by clicking on the red dot next to the line number.
- Set a breakpoint on line 16: `pizzaSlices =+ 10;`
- Utilize the step-over action.
- Consider the value being stored in `pizzaSlices`.
  - If it looks right, resume the program and continue on.
  - If it doesn't, stop the program and make the appropriate changes. Then
    restart the debugger to see if it is corrected.
- Once you have fixed the bug, move onto "Bug Three".

The expected output of this section should be:

```text
With another pizza, we now have 20 pizza slices.
```

### Bug Three

In this section, we want to determine if we will have any leftover pizza given
one person leaves the party early. Assume this person does not eat any pizza and
that each person has an equal amount of slices.

- Remove the breakpoint on line 16 from the "Bug Two" section. By this point in
  the lab, it is assumed that you have already addressed that bug.
  - Note: It is very important to fix "Bug Two" before moving onto this section.
    If you have not completed "Bug Two", go back and try again.
- Set a breakpoint on line 22: `people--;`
- Utilize the step-over action.
- Consider the value being stored in `people`.
  - If it looks right, **consider the statement**:
    `int leftovers = pizzaSlices / people;` **and then step-over to the next
    statement.**
  - If it doesn't, stop the program and make the appropriate changes. Then
    restart the debugger to see if it is corrected.
- Consider the value being stored in `leftovers`.
  - If it looks right, resume the program and continue on.
  - If it doesn't, stop the program and make the appropriate changes. Then
    restart the debugger to see if it is corrected.

The expected output of this section should be:

```text
We will have 2 slices of pizza left over if we only have 9 people at the party.
```
