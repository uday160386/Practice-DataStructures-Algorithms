
def catch_error(num1):
    try:
        return num1/0
    except ZeroDivisionError as err:
        print(err)

catch_error(10)
