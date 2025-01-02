def insert_heap(A, n, value):
    n = n + 1
    A.append(value)
    i = n - 1

    while i > 0:
        parent = (i - 1) // 2
        if A[parent] < A[i]:
            A[parent], A[i] = A[i], A[parent]
            i = parent
        else:
            break

H1 = [50, 30, 23, 22, 23, 45]
N1 = len(H1)

print("Before Insertion:", H1)
value = 45
insert_heap(H1, N1, value)
print("After Insertion:", H1)

//=======================================heapify===============================

def heapify(arr, n, i):
    largest = i
    left = 2 * i + 1
    right = 2 * i + 2

    if left < n and arr[left] > arr[largest]:
        largest = left
    if right < n and arr[right] > arr[largest]:
        largest = right

    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)

def heap_sort(arr):
    n = len(arr)

    # Build a max heap
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)

    # Extract elements from the heap
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)

# Example usage
arr = [12, 11, 13, 5, 6, 7]
heap_sort(arr)
print("Sorted Array:", arr)



