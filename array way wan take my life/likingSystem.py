def likingSystem(people):
	if len(people) == 0:
		return "no one likes this"

	elif len(people) == 1:
		return f"{people[0]}, likes this"
	elif len(people) == 2:
		return f"{people[0]}, likes this"
	elif len(people) == 3:
		return f"{people[0]} and {people[2]} and {people[2]}, likes this"
	else :
		remaining = len(people) - 2
		return f"{people[0]}, {people[1]} and {remaining} others likes this"
		
		
		
		
		
people = ["kayode","bola","kay"]	
print(likingSystem(people))
