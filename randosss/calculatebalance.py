def calculate_balance(transactions):
    balance = 0
    for transaction in transactions:
        balance += transaction
    return balance
    
print(calculate_balance([3000, -560, 653, -876]))
