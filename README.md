# Debugging Lab

## Learning Goals

- Practice using the debugger to find bugs in a Java program.

## Introduction

In this lab, practice using the IntelliJ debugger by debugging a buggy program.

Fork and clone this repository. When you do, you will see a `BuggyLab.java` file
that already has some code in it:

```java
import java.util.Scanner;

public class BuggyLab {
    public static void main(String[] args) {

        // Create a Scanner to take in user input
        Scanner scanner = new Scanner(System.in);

        // Bug One
        // Prompt the user for a number - this number can be a decimal number
        System.out.println("Please enter a number");
        int userNumber = scanner.nextInt();

        // Bug Two
        // Compare if 10.5 is greater than or equal to the user input number
        System.out.println("Let's compare your number against the number 10.5!");
        boolean isGreater = userNumber > 10.5;
        System.out.println("Is your number, " + userNumber + " greater than or equal to 10.5?");
        System.out.println("The answer is: " + isGreater);
    }
}
```

This program has two bugs that need to be fixed. Make your edits in this file.
Note the comments in the file to help you as well.

## Instructions

There are two bugs in the program that need to be fixed. Within `BuggyLab`, you
should see some comments offering hints into what the bug may be. Use the
IntelliJ debugger to find the bugs, modify the code, and then step through the
program again.

### Bug One

In this section, we are expecting the user to enter a decimal number. This could
be `23`, `-5.3`, or `10.5`. Run the debugger with each of these inputs to test.

- Set a breakpoint at line 11: `System.out.println("Please enter a number");`
- Utilize the "step-over" action.
- If the program highlights the next line to be line 16 at any point in time,
  stop the execution and run the program in debug again.
  - Line 16:
    `System.out.println("Let's compare your number against the number 10.5!");`
  - Reminder, the stop button can be found either at the top of IntelliJ or on
    the left-hand sidebar of the debug console:

  ![resume-pause-stop-execution-buttons](https://curriculum-content.s3.amazonaws.com/java-mod-1/debugger/resume-pause-stop-program.PNG)

- Once you have isolated the bug, look at the code and determine the correct
  fix.
  - Hint: Try using a `try-catch` block as well.
- Remember, we want all three inputs above to pass.
- Feel free to test with more inputs if desired.
  - Maybe try the input "bug".
- Once you have fixed the bug, move onto "Bug Two".

### Bug Two

We want to see if the user entered a decimal number that is greater than or
equal to a hardcoded value of 10.5. Run the debugger with each of these inputs
to test: `23`, `-5.3`, `10.5`.

- Set a breakpoint on the following line:
  `System.out.println("Let's compare your number against the number 10.5!");`
- Utilize the "step-over" action.
- A runtime error will not be thrown here. Instead, look at the output that is
  printed to the console. Ensure that each test input matches the expected
  output can that be seen below.
- If the output does _not_ match the expected output, look at the code to
  determine the code fix.
- Remember, we want all three inputs above to pass.
- Feel free to test with more inputs if desired.

## Expected Output

Test input: 23

```text
Please enter a number
23
Let's compare your number against the number 10.5!
Is your number, 23.0 greater than or equal to 10.5?
The answer is: true
```

Test input: -5.3

```text
Please enter a number
-5.3
Let's compare your number against the number 10.5!
Is your number, -5.3 greater than or equal to 10.5?
The answer is: false
```

Test input: 10.5

```text
Please enter a number
10.5
Let's compare your number against the number 10.5!
Is your number, 10.5 greater than or equal to 10.5?
The answer is: true
```
