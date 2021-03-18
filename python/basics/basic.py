from math import *

fName = "uday"
lName = "Kumar"
age = "22"
is_TajMahal_in_India = True

print("Printing: "+fName+" " + lName + "is " + age + " old.")

# verifying boolean
print("Boolean Test: " + str(is_TajMahal_in_India))

# declaring string fullname
fullName = "UdayKumar"

# converting string to lower
print("Name in Lower case"+fullName.lower())

# converting string to capitalize
print("Capitalize the first letter of a string"+fullName.capitalize())

# converting string to upper
print("Printing fullname in upper case: " + fullName.upper())

# check if string is in upper case
print("Testing if the fullname is in uppercase: " + str(fullName.isupper()))

# length of a string
print("Printing length of characters in fullname: " + str(len(fullName)))

# first char of the string
print("Printing the first character of a string" + fullName[0])

# find index of char in string
print("Printing the index based on character:" + str(fullName.index('K')))

# replace word in a string
print("Replacing the wor Kumar with BKV: " + fullName.replace("Kumar", "BKV"))

num1 = 5
num2 = 0
# verify the / operator
print("Testing the division operator" + str(num1 / 2))

# verify the // operator
print("Testing // operator:" + str(num1 // 2))

# verify the / operator
print("Testing with negative value with / operator" + str(-num1 / 2))

# verify the // operator
print("Testing // with negative value" + str(-num1 // 2))

# verify / operator on 0, should return Zero Division error.
# print(2 / num2)

# convert number to string
print(str(num1) + " is my favourite number")

# absolute value of number
print("Printing the absolute value of a given number: " + str(abs(-num1)))

# power of number
print("Printing the power of given number: " + str(pow(num1, 2)))

# max of numbers
print("Printing the maximum value of given number: " + str(max(4, 5, 56)))

# min of numbers
print("Printing the minimum of given number: " + str(min(4, 5, 56)))

# round of the float numbers
print("Printing the round of value 7.3: " + str(round(7.3)))
print("Printing the round of value 7.8: " + str(round(7.8)))

# floor and ceil of number
print("Printing the floor value of 3.7: " + str(floor(3.7)))
print("Printing the ceiling value of 3.7: " + str(ceil(3.7)))

# sqrt of number
print("Printing the square root value of number 2" + str(sqrt(2)))