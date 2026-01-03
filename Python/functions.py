# Simple function
def greet(name):
    print("Hello", name)

greet("Rashi")

# Return value
def add(a, b):
    return a + b

print(add(5, 3))

# Args
def total(*args):
    return sum(args)

print(total(1, 2, 3, 4))

# Kwargs
def student_info(**kwargs):
    for key, value in kwargs.items():
        print(key, ":", value)

student_info(name="Rashi", age=20, city="Mumbai")
