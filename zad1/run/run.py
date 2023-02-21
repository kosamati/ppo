from Bank import Bank
from Account import Account
from Client import Client
from Person import Person
# run.py
def main():
    bank = Bank("Sample Bank")

    account = Account("123456", 0)
    client = Client("John Doe", 30, account)

    bank.add_client(client)

    print(bank.clients[0].name)


main()