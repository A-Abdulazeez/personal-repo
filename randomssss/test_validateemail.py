from unittest import TestCase

import validateemail

class TestValidateEmail (TestCase):

	def test_that_validate_email_exists(self): 
		validateemail.validate_email("adebex@gmail.com")
'''		
	def test_that_validate_email_is_more_than_8_characters_return_True(self):  
		is_valid validateemail.validate_email("adebex@gmail.com")
		self.assertTrue(is_valid)
'''
	def test_that_validate_email_is_less_than_8_characters_return_False(self):  
		is_valid validateemail.validate_email("ade@.c") 
		self.assertFalse(is_valid)

'''	def test that_valid_email_contains_special_character(self): 
		is_valid = validateemail.validate_email("seun@funmi.com") 
		self.assertTrue(is_valid)

	def test_that_valid_email_does_not_start_with_special_character(self): 
		message = validateemail.validate_email("@seunfunmi.com") 
		self.assertEqual(message, "invalid email")

	def test_that_valid_email_does_not_end_with_special_character(self): 
		message = validateemail.validate_email("@seunfunmi.com@") 
		self.assertEqual(message, "invalid email")

class TestCalculateBalance (TestCase):
'''
