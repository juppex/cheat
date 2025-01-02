class Node:
    def __init__(self, data):
        self.data = data
        self.Next = None

class SLL:
    def __init__(self):
        self.head = Node(8)
        second = Node(9)
        third = Node(10)
        fourth = Node(11)
        self.head.Next = second
        second.Next = third
        third.Next = fourth

    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end="-->")
            temp = temp.Next
        print("None")

    def arrange(self):
        print("-" * 50)

    def calculate_total(self):
        temp = self.head
        total = 0
        while temp:
            total += temp.data
            temp = temp.Next
        print("Sum of all the elements is", total)

    def node_count(self):
        temp = self.head
        count = 0
        while temp:
            count += 1
            temp = temp.Next
        print("Total number of nodes in this list are", count)

    def Max(self):
        temp = self.head
        max_value = self.head.data
        while temp:
            if temp.data > max_value:
                max_value = temp.data
            temp = temp.Next
        print("Max value in this list is", max_value)

    def search(self):
        temp = self.head
        key = 15
        while temp:
            if temp.data == key:
                print(temp.data, "found")
                return
            temp = temp.Next
        print("Not Found")

    def is_empty(self):
        if self.head is None:
            print("List is Empty")
        else:
            print("List is not Empty")

    def insert_first_ele(self, data):
        new_node = Node(data)
        new_node.Next = self.head
        self.head = new_node
        print(data, "Inserted at beginning Successfully")

    def insert_last_ele(self, data):
        new_node = Node(data)
        temp = self.head
        while temp.Next:
            temp = temp.Next
        temp.Next = new_node
        print(data, "Inserted at end Successfully")

    def insert_after(self, pos, data):
        p = self.head
        i = 1
        while i < pos:
            p = p.Next
            i += 1
        new_node = Node(data)
        new_node.Next = p.Next
        p.Next = new_node
        print(data, "Inserted at", pos, "th position Successfully")

    def insert_in_sorted_list(self, data):
        new_node = Node(data)
        if self.head is None or self.head.data >= new_node.data:
            new_node.Next = self.head
            self.head = new_node
            print(data, "Inserted Successfully at the sorted position")
            return

        temp = self.head
        while temp.Next and temp.Next.data < new_node.data:
            temp = temp.Next
        new_node.Next = temp.Next
        temp.Next = new_node
        print(data, "Inserted Successfully at the sorted position")

    def merge_sorted(self, other):
        dummy = Node(0)  # Temporary dummy node
        tail = dummy     # Tail pointer to construct the new list

        p1 = self.head
        p2 = other.head

        while p1 and p2:
            if p1.data <= p2.data:
                tail.Next = p1
                p1 = p1.Next
            else:
                tail.Next = p2
                p2 = p2.Next
            tail = tail.Next

        # Append the remaining nodes of the non-empty list
        tail.Next = p1 if p1 else p2

        # Update the head of the merged list
        self.head = dummy.Next
        print("Merged successfully!")

    def concatenate(self, other):
        if not self.head:
            self.head = other.head
            print("Lists concatenated successfully!")
            return

        temp = self.head
        while temp.Next:
            temp = temp.Next
        temp.Next = other.head
        print("Lists concatenated successfully!")

# Example Usage
LL1 = SLL()
LL2 = SLL()

LL1.display()
LL2.display()

LL2.insert_first_ele(1)
LL2.insert_last_ele(56)

print("List 1:")
LL1.display()
LL1.arrange()

print("List 2:")
LL2.display()
LL2.arrange()

# Merge sorted lists
print("Merged Sorted Lists:")
LL1.merge_sorted(LL2)
LL1.display()
LL1.arrange()

# Concatenate lists
LL3 = SLL()
LL3.insert_first_ele(100)
LL3.insert_last_ele(200)

print("List 3:")
LL3.display()
LL3.arrange()

print("Concatenating List 1 and List 3:")
LL1.concatenate(LL3)
LL1.display()
LL1.arrange()




//==============================================



class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CircularLinkedList:
    def __init__(self):
        self.head = None

    def display(self):
        if not self.head:
            print("List is empty")
            return
        temp = self.head
        while True:
            print(temp.data, end=" --> ")
            temp = temp.next
            if temp == self.head:
                break
        print("... (Back to head)")

    def arrange(self):
        print("-" * 50)

    def calculate_total(self):
        if not self.head:
            print("List is empty")
            return
        temp = self.head
        total = 0
        while True:
            total += temp.data
            temp = temp.next
            if temp == self.head:
                break
        print("Sum of all elements is", total)

    def node_count(self):
        if not self.head:
            print("List is empty")
            return
        temp = self.head
        count = 1
        while temp.next != self.head:
            count += 1
            temp = temp.next
        print("Total number of nodes:", count)

    def max(self):
        if not self.head:
            print("List is empty")
            return
        temp = self.head
        max_value = self.head.data
        while temp.next != self.head:
            if temp.data > max_value:
                max_value = temp.data
            temp = temp.next
        print("Max value in this list is", max_value)

    def search(self, key):
        if not self.head:
            print("List is empty")
            return
        temp = self.head
        while True:
            if temp.data == key:
                print(key, "found")
                return
            temp = temp.next
            if temp == self.head:
                break
        print("Not Found")

    def is_empty(self):
        if not self.head:
            print("List is empty")
        else:
            print("List is not empty")

    def insert_first_ele(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            new_node.next = self.head
        else:
            temp = self.head
            while temp.next != self.head:
                temp = temp.next
            temp.next = new_node
            new_node.next = self.head
            self.head = new_node
        print(data, "inserted at the beginning successfully")

    def insert_last_ele(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            new_node.next = self.head
        else:
            temp = self.head
            while temp.next != self.head:
                temp = temp.next
            temp.next = new_node
            new_node.next = self.head
        print(data, "inserted at the end successfully")

    def insert_after(self, pos, data):
        new_node = Node(data)
        temp = self.head
        i = 1
        while i < pos:
            temp = temp.next
            i += 1
        new_node.next = temp.next
        temp.next = new_node
        print(data, "inserted at position", pos, "successfully")

    def insert_in_sorted_list(self, data):
        new_node = Node(data)
        if not self.head or self.head.data >= new_node.data:
            new_node.next = self.head
            self.head = new_node
            if not self.head.next:
                self.head.next = self.head
            print(data, "inserted at the sorted position")
            return

        temp = self.head
        while temp.next != self.head and temp.next.data < new_node.data:
            temp = temp.next
        new_node.next = temp.next
        temp.next = new_node
        print(data, "inserted at the sorted position")

    # Add elements from another list without merging
    def append_from(self, other):
        if not self.head:
            self.head = other.head
            print("List appended successfully!")
            return
        temp = self.head
        while temp.next != self.head:
            temp = temp.next
        # Now temp is the last node in the first list
        temp.next = other.head

        # Make the merged list circular again
        last = other.head
        while last.next != other.head:
            last = last.next
        last.next = self.head

        print("Second list appended to first list successfully!")

# Example Usage
LL1 = CircularLinkedList()
LL2 = CircularLinkedList()

LL1.insert_first_ele(8)
LL1.insert_last_ele(11)
LL2.insert_first_ele(2)
LL2.insert_last_ele(56)

print("List 1:")
LL1.display()
LL1.arrange()

print("List 2:")
LL2.display()
LL2.arrange()

print("Appending List 2 to List 1:")
LL1.append_from(LL2)
LL1.display()
LL1.arrange()
