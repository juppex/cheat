stk = []
maxx = int(input("Enter a Stack Size: "))
top = -1

def push(stk, ele):
    global top
    if top == maxx - 1:
        print("Stack is Full")
    else:
        top += 1
        stk.append(ele)
        return f"{ele} Inserted"

def isEmpty():
    global top
    if top == -1:
        print("Stack is Empty")
    else:
        print("Stack is Not Empty")

def pop():
    global top
    if top == -1:  
        print("Stack is Empty")
    else:
        popped = stk.pop()
        top -= 1
        return f"Element {popped} Popped"

def view():
    print(f"Current Stack is {stk}")

switch = {
    '1': lambda: print(push(stk, int(input("Enter a Element to Push: ")))),
    '2': lambda: isEmpty(),
    '3': lambda: print(pop()),
    '4': lambda: view(),
    '5': lambda: print("User Exited")  
}

def main():
    while True:
        print("----------------------------")
        print("Stack Operations")
        print("1. Push an Element into the Stack")
        print("2. Check if the Stack is Empty or not")
        print("3. Pop an element from the Stack")
        print("4. Display the current stack")
        print("5. Exit")
        choice = input("Enter Your Choice: 1/2/3/4/5: ")
        
        if choice in switch:
            switch[choice]()
        else:
            print("Invalid Input")
        if choice == '5':
          break

if __name__ == "__main__":
    main()
