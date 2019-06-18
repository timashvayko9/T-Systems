Java_School_Tasks
Calculator
General description: Write a calculator for evaluating arithmetic expressions. An expression can consist of:

Digits (0-9)
Dots as decimal marks (valid example: 100.02, not valid example : 100..02)
Parentheses
Mathematical symbols (allowed are : "+", "-", "*", "/")
Rounding is to be performed to 4 significant digits, only the final result is to be rounded. Example: 102.12356 -> 102.1236
Input and expected output:

Input : String containing arithmetic expression
Output : evaluation result or null if the expression cannot be evaluated
Subsequence
General description:

Given two sequences {X} and {Y} of arbitrary elements (java.lang.Object).
Determine whether {X} can be built by removing some elements from {Y} without changing the order.
Input and expected output:

Input : List X and List Y
Output : boolean, true if {X} can be built from {Y}, false otherwise
Examples

{X} : "A", "B", "C", "D"

{Y} : "BD", "A", "ABC", "B", "M", "D", "M","C", "DC", "D"

Pyramid builder
General description Your solution should build a pyramid from given input list of integer values.

Numbers are to be sorted ascending from top to bottom, from left to right.

Empty spaces are to be filled with zeros. In order to make the pyramid symmetric input numbers should alternate with zeros.

For example, for input A={2, 4, 3, 5, 6, 1} the pyramid will look like:

[0,0,1,0,0]
[0,2,0,3,0]
[4,0,5,0,6]
Refer to unit-tests for more examples.

Input and expected output

Input : List with integer values
Output : 2D array with the pyramid or CannotBuildPyramidException if it's not possible to build one
