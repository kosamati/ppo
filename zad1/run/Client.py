# Client.py
from Person import Person
class Client(Person):
    def __init__(self, name, age, account):
        super().__init__(name, age)
        self.account = account

    def deposit(self, amount):
        self.account.deposit(amount)

    def withdraw(self, amount):
        self.account.withdraw(amount)
