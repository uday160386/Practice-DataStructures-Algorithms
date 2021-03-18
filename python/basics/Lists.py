# Declaring a list
numbers = [20, 30, 40, 50, 60]
animals = ["Lions", "Tigers", "Horses", "Cheetah", "Cows"]

# printing list
print(numbers)
print(animals)

# printing list by index
print(numbers[1])
print(animals[2])

# printing list by range
print(numbers[1:3])
print(animals[2:4])

# Sorting the animals
animals.sort()
print(animals)

# reverse sorting
animals.sort(reverse=True)
print(animals)


# Using extend function to merge two lists
animals.extend(animals)
print(animals)
animals.extend(numbers)
print(animals)

# Using append function to add values to existing list
animals.append("Snakes")
print(animals)

# Using insert function to add value to specific position
animals.insert(1, "Monkeys")
print(animals)
animals.insert(4, "Cheetah")
print(animals)

# Using Remove function to remove value from list
animals.remove("Cheetah")
animals.remove("Cheetah")
print(animals)

# remove last element using pop function
animals.pop()
print(animals)

# count number of elements in the list
print(str(animals.count("Cheetah")))
print(str(len(animals)))

# reverse elements in the list
animals.reverse()
print(animals)

# Copying of list to other list
animals_extension = animals.copy()
print(animals_extension)

# Clear List
animals.clear()
print(animals)
