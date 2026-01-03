# Try-except
try:
    a = int(input("Enter a number: "))
    print(10 / a)
except ValueError:
    print("Invalid input")
except ZeroDivisionError:
    print("Cannot divide by zero")

# Else-finally
try:
    x = int(input("Enter number: "))
except ValueError:
    print("Error")
else:
    print("You entered:", x)
finally:
    print("Execution completed")

# Raise
age = -1
if age < 0:
    raise ValueError("Age cannot be negative")
