# Using while
num = 1
while num <= 10:
    print(num)
    num += 1

for letter in "Python World":
    print(letter)

calender = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]

for month in calender:
    print(month)

for i in range(3, 10):
    print(i)

for month in range(len(calender)):
    print(calender[month])


def power_of_number(number, pow):
    res = 1
    for index in range(pow):
        res = res * number
    return res

print(power_of_number(2, 3))

two_dim_matrix = [[0, 1, 2], [3, 4, 5], [6, 7, 8], [9]]

for i_row in two_dim_matrix:
    for j_row_col in i_row:
        print(j_row_col)
