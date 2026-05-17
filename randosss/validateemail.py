def validate_email(user_email):
    if "@" not in user_email:
        return False
    if len(user_email) <= 8:
        return False
    if user_email.startswith("@") or user_email.endswith("@"):
        return False
    return True
    
    
print(validate_email("adebex@gmail.com"))   
