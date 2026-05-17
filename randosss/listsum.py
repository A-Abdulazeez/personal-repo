number = [1,2,3,4,5,6]
sum_of_number = 0
count = 0
average = 0
largest = number[0]
smallest = number[-1]
rangebtw = 0
for element in number:
    count += 1
    sum_of_number+=element
    average = sum_of_number/count

    if (element > largest) :
        largest = element
    if (element < smallest) :
        smallest = element
    rangebtw = largest - smallest
print(sum_of_number, count, average, largest, smallest, rangebtw)