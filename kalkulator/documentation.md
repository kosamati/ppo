Calculator Class Documentation

This class is a simple calculator that can perform basic arithmetic operations like addition, subtraction, multiplication, and division.
Class Attributes

    operationlist: A list of arithmetic operations supported by the calculator, including +, -, *, and /.

Class Methods
add(num1, num2)

This method takes two numbers as input and returns their sum.
Parameters

    num1: A number that will be added to num2.
    num2: A number that will be added to num1.

Returns

    The sum of num1 and num2.

minus(num1, num2)

This method takes two numbers as input and returns their difference.
Parameters

    num1: A number that will be subtracted from num2.
    num2: A number from which num1 will be subtracted.

Returns

    The difference between num1 and num2.

razy(num1, num2)

This method takes two numbers as input and returns their product.
Parameters

    num1: A number that will be multiplied by num2.
    num2: A number that will be multiplied by num1.

Returns

    The product of num1 and num2.

dziel(num1, num2)

This method takes two numbers as input and returns their quotient.
Parameters

    num1: A number that will be divided by num2.
    num2: A number by which num1 will be divided.

Returns

    The quotient of num1 and num2.

parse(string)

This method takes a string containing an arithmetic expression and evaluates it.
Parameters

    string: A string that contains an arithmetic expression.

Returns

    None.

Example Usage

python

c1 = Calculator()
while True:
    c1.parse(f'{input("Enter an arithmetic expression ")} ')

This code creates an instance of the Calculator class and enters a loop that prompts the user to enter an arithmetic expression. The expression is passed to the parse method of the Calculator class, which evaluates it and prints the result. The loop continues until the program is terminated.