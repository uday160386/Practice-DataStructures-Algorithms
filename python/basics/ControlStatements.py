num = 4

if num > 5:
    print("number is greater than 5")
elif num < 5:
    print("number is less than 5")
else:
    print("Number is less than five")

is_state_in_us = True
is_city_in_us = False

if is_city_in_us:
        print("True")

if is_city_in_us or is_state_in_us:
        print(False)

if is_state_in_us and is_city_in_us:
        print(False)

if is_state_in_us or not is_city_in_us:
    print(True)

if is_state_in_us and not is_city_in_us:
    print(True)


def max_number(num1, num2):
    if num1 >= num2 and num1 >=0:
        return num1
    else:
        return num2


print(max_number(10, 20))

# Simple Calculator
ops = input("Enter an operator. Example +, -, *, / : ")
n1 = input("Enter number1 :")
n2 = input("Enter number2: ")


def calculator(operator, num1, num2):
    if operator is '+':
        return num1 + num2
    elif operator is '-':
        return num1 - num2
    elif operator is '*':
        return num1 * num2
    elif operator is '/':
        return num1 / num2

print(calculator(ops, int(n1), int(n2)))

