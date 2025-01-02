//-------------------------------------------BINARY-----------------------------------------------

def bin(arr, target):
    arr.sort()  
    l = 0
    r = len(arr) - 1
    while l <= r:
        mid = (l + r) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            r = mid - 1
        else: 
            l = mid + 1
    return -1

arr = [10, 20, 30, 40, 1, 45, 23]
target = int(input("Enter a target: "))
res = bin(arr, target)
if res != -1:
    print(f"{target} Found at index {res + 1}") 
else:
    print("Not found")


//----------------------------------Linear-------------------------------------------------------


      
def lin(arr,target):

  for i,value in enumerate(arr):
    if value == target:
      return i

  return -1
arr = [20,10,2,4,53,2,11]
target = int(input("Enter a Target: "))
res = lin(arr,target)
if res !=-1:
  print(f"{target} found at Index {res+1}")
else:
  print("Not Found")

