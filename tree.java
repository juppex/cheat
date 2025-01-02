class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def pre_order(root):
    if root:
        print(root.data, end=" ")
        pre_order(root.left)
        pre_order(root.right)
def in_order(root):
    if root:
        in_order(root.left)
        print(root.data, end=" ")
        in_order(root.right)


def post_order(root):
    if root:
        post_order(root.left)
        post_order(root.right)
        print(root.data, end=" ")


root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

pre_order(root)  # Output: 1 2 4 5 3


in_order(root)  # Output: 4 2 5 1 3

post_order(root)



//=========================bst===================================


def bst_pre_order(root):
    if root:
        print(root.data, end=" ")
        bst_pre_order(root.left)
        bst_pre_order(root.right)
def bst_in_order(root):
    if root:
        bst_in_order(root.left)
        print(root.data, end=" ")
        bst_in_order(root.right)
def bst_post_order(root):
    if root:
        bst_post_order(root.left)
        bst_post_order(root.right)
        print(root.data, end=" ")

# Example usage
bst_post_order(root)
print("--")

# Example usage
bst_in_order(root) 
print("--")
# Example usage
bst_pre_order(root)  
print("--")



//===========iterative====

  def iterative_search(root, key):
    while root:
        if root.data == key:
            return True
        elif root.data < key:
            root = root.right
        else:
            root = root.left
    return False

# Example usage
print(iterative_search(root, 5))  # Output: True
print(iterative_search(root, 10))  # Output: False

  //'''''''''''''insert''''''''''''''''''''''

  def insert_bst(root, data):
    if root is None:
        return Node(data)
    if data < root.data:
        root.left = insert_bst(root.left, data)
    else:
        root.right = insert_bst(root.right, data)
    return root

# Example usage
root = insert_bst(root, 6)
bst_in_order(root)  # Output: 4 2 5 1 3 6


  //================================delete


  def delete_bst(root, key):
    if root is None:
        return root
    if key < root.data:
        root.left = delete_bst(root.left, key)
    elif key > root.data:
        root.right = delete_bst(root.right, key)
    else:
        if root.left is None:
            temp = root.right
            root = None
            return temp
        elif root.right is None:
            temp = root.left
            root = None
            return temp
        temp = min_node(root.right)
        root.data = temp.data
        root.right = delete_bst(root.right, temp.data)
    return root

def min_node(root):
    current = root
    while current.left:
        current = current.left
    return current

# Example usage
root = delete_bst(root, 3)
bst_in_order(root)  # Output: 4 2 5 1

