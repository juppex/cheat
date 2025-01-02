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










class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.top = None

    def is_empty(self):
        return self.top is None

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top  # Point the new node's next to the current top
        self.top = new_node  # Update the top to the new node
        print(f"Pushed {data} onto the stack")

    def pop(self):
        if self.is_empty():
            print("Stack is empty, cannot pop")
            return None
        popped_data = self.top.data
        self.top = self.top.next  # Move the top pointer to the next node
        print(f"Popped {popped_data} from the stack")
        return popped_data

    def peek(self):
        if self.is_empty():
            print("Stack is empty")
            return None
        return self.top.data  # Return the data at the top of the stack

    def display(self):
        if self.is_empty():
            print("Stack is empty")
            return
        temp = self.top
        while temp:
            print(temp.data, end=" --> ")
            temp = temp.next
        print("None")

# Example Usage
stack = Stack()

stack.push(10)
stack.push(20)
stack.push(30)

print("Current Stack:")
stack.display()

print(f"Top element is {stack.peek()}")

stack.pop()


print("Current Stack after popping:")
stack.display()

