# Loyola COMP 271 Lab 5: stack-based maze solver

## Group activity

Collaborate with your teammates but submit individually.
Clearly list the members of your team.

# Objectives

An understanding of the following concepts and techniques:

- two-dimensional arrays
- using stacks for depth-first search
- parametric thinking
- object-oriented design

# Description

In this lab, you will have the opportunity to develop a maze solver using stack-based backtracking.
The maze solver behaves as follows:

1. It first reads from the standard input the row and column of the starting point within the maze.
   - \* represents a wall
   - \. represents an empty space we can visit
1. It then reads from the standard input the maze data in the form of same-length strings representing rows in the maze.
1. It then attempts to find a way out of the maze from the starting point.
1. Finally, it prints the maze showing 
   - the starting point as a 0 (zero)
   - unvisited cells as \. (dot)
   - visited cells leading to a dead end as - (minus)
   - visited cells leading out as + (plus)
   
## Example 1

Input followed by output: 
```
4 4
**********
*.....****
*.***...**
*.***.****
*.**....**
*.**.**.**
*....**...
***.******
*........*
**********

**********
*+++++****
*+***+++**
*+***+****
*+**0+++**
*+**+**+**
*++++**+++
***+******
*++++++++*
**********

We're so out of here!
```

## Example 2

Input followed by output:
```
4 4
**********
*.....****
*.***...**
*.***.****
*.**....**
*.**.**.**
*....**..*
***.******
*........*
**********

**********
*+++++****
*+***+++**
*+***+****
*+**0+++**
*+**+**+**
*++++**++*
***+******
*++++++++*
**********

Bummer, we're stuck...
```

## Instructions

1. Start by importing or downloading this project: https://github.com/LoyolaChicagoCode/cs2-lab6-mazesolver-java
1. Complete the TODO items in the various sources until the program behaves as required. Recommended order:
    - constructor
    - print
    - read (in Main)
    - solve
    - tests

   You may also want to add the distinction between the way out and dead-end attempts at the end. 
   *This is a short but complex project. You are encouraged to get started early and use the available supports.*   
1. Create at least one additional maze of size 10x10 or larger and with at least two exits.
1. As in the past, run the program as follows:
    - Run > Run... > Edit Configuration 
    - check "Redirect input from" and enter the exact file name including the .txt extension
      (do not browse to the file because that would create an absolute path)
    - press Run
    
   Alternatively, if you have a working installation of the [Maven build tool](https://maven.apache.org/), you can perform this task in the terminal:

       cd <your project's root directory>
       mvn compile
       mvn exec:java < maze1.txt
       ...

1. Answer the following questions in Answers.md:

    1. Why are the methods in the `Maze` class instance methods as opposed to static methods?
    1. Why is it generally advantageous to parameterize the `Maze.print` method with the output destination?
    1. What is the purpose of the `Maze.get` method, given that it is not used in `Main` or `Maze`?

# Submission

-    Make sure you have created a separate project for this activity.
-    Include a project-specific Answers.md file including your reflection and any other thoughts or design decisions.
-    In IDEA, export your project as a zip file and submit as an attachment.

# Grading (total 5)

- 3 completion of items marked TODO in `src/main` and correct behavior
- 0.2 additional maze
- 0.8 tests for maze1 and your additional maze
- 1 written part
  - 0.8 responses to the questions above
  - 0.2 grammar, style, formatting
