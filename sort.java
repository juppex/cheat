//=================================Bubble=====================

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]  # Swap if elements are in wrong order

# Example usage
arr = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(arr)
print("Sorted Array:", arr)

//=================================Insert=====================
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

# Example usage
arr = [12, 11, 13, 5, 6]
insertion_sort(arr)
print("Sorted Array:", arr)

//================================Radix=====================
def counting_sort(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10  # Since we are dealing with digits 0-9

    for i in range(n):
        index = arr[i] // exp
        count[index % 10] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = n - 1
    while i >= 0:
        index = arr[i] // exp
        output[count[index % 10] - 1] = arr[i]
        count[index % 10] -= 1
        i -= 1

    for i in range(n):
        arr[i] = output[i]

def radix_sort(arr):
    max_num = max(arr)
    exp = 1
    while max_num // exp > 0:
        counting_sort(arr, exp)
        exp *= 10

arr = [170, 45, 75, 90, 802, 24, 2, 66]
print("Original array:", arr)
radix_sort(arr)
print("Sorted array:", arr)

//===============================Quick=======================================

  def partition(a, l, h):
    piv = a[l]
    i = l + 1
    j = h
    while True:
        while i <= h and a[i] <= piv:
            i += 1
        while a[j] > piv:
            j -= 1
        if i < j:
            a[i], a[j] = a[j], a[i]
        else:
            break
    a[l], a[j] = a[j], a[l]
    return j

def quicks(a, l, h):
    if l < h:
        j = partition(a, l, h)
        quicks(a, l, j - 1)
        quicks(a, j + 1, h)

a = [64, 10, 63, 43, 12, 5, 152, 6, 3, 9, 16, 54, 53, 53, 0]
n = len(a) - 1
quicks(a, 0, n)
print("Sorted array:", a)




