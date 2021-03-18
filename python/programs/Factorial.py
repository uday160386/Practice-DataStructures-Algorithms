def validate_factorial(num):
    i = num
    k = 1
    c = 1
    if num == 0:
        return num
    if num < 0:
        return 'INVALID NUMBER'
    while c <= num:
        k *= i
        i = i-1
        c += 1
    return k
