class Calculator:
    def __init__(self):
        self.operationlist = ["+","-","*","/"]

    def add(self, num1, num2):
        return num1 + num2
    def minus(self, num1, num2):
        return num1 - num2
    def razy(self, num1, num2):
        return num1 * num2
    def dziel(self, num1, num2):
        return num1 / num2
    def parse(self, string):
        self.string =string
        self.num1Bool = False
        self.num2Bool = False
        self.num1 = ""
        self.num2 = ""
        self.operation = " "
        self.nextoperation = " "
        
        for index, i in enumerate(self.string):
            for j in self.operationlist:
                if i == j or index == len(string) -1:
                    if self.operation == "":
                        self.nextoperation = i
                    else:
                        self.operation = self.nextoperation
                        self.nextoperation = i
                    
                    if self.num1Bool == False: 
                        self.num1Bool = True
                        
                    elif self.num2Bool == False: 
                        self.num2Bool = True
                        match self.operation:
                            case "+": 
                                self.num1 = self.add(float(self.num1), float(self.num2))
                                self.num2 = ""
                                self.num2Bool = False
                            case "-": 
                                self.num1 = self.minus(float(self.num1), float(self.num2))
                                self.num2 = ""
                                self.num2Bool = False
                            case "*": 
                                self.num1 = self.razy(float(self.num1), float(self.num2))
                                self.num2 = ""
                                self.num2Bool = False
                            case "/": 
                                self.num1 = self.dziel(float(self.num1), float(self.num2))
                                self.num2 = ""
                                self.num2Bool = False                
                    
            if self.num1Bool == False:
                    self.num1 += i
                
            elif self.num2Bool == False:
                if i in self.operationlist:
                    pass
                else: self.num2 += i
        print(self.num1)

c1 = Calculator()
while True:
    c1.parse(f'{input("Napisz operację ")} ')