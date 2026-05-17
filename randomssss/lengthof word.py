def length_of_word(word):
	count = 0
	for range in word:
		count +=1
	return count

print(length_of_word("cat"))


def reverse_of_words(word):
	reverse = ""
	for words in word:
		reverse = words + reverse
	return reverse

print(reverse_of_words("eggroll"))
	
	
	
def minutes_to_hour_and_second(minutes):
	hour = minutes / 60
	seconds = minutes *  60
	return f"{minutes}minutes in hour is {hour} and in seconds is {seconds}"
	
print(minutes_to_hour_and_second(30))


def vowels_of_word(word):
	count = 0
	vowels = "a,e,i,o,u"
	for range in word:
		for vowel in vowels:
			if range == vowel :
				count +=1
	return count

print(vowels_of_word("pineapple"))



'''def 

