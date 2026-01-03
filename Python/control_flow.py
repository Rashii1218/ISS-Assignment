# If-else
age = 18
if age >= 18:
    print("Eligible to vote")
else:
    print("Not eligible")

# For loop
for i in range(5):
    print(i)

# While loop
count = 1
while count <= 3:
    print(count)
    count += 1

# Break and continue
for i in range(5):
    if i == 3:
        break
    print(i)

for i in range(5):
    if i == 2:
        continue
    print(i)

# Pass
for i in range(3):
    pass

# Loop else
for i in range(3):
    print(i)
else:
    print("Loop completed successfully")
