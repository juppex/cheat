def find_max_min(arr):
    max_val = arr[0]
    min_val = arr[0]
    
    for num in arr:
        if num > max_val:
            max_val = num
        if num < min_val:
            min_val = num
            
    return max_val, min_val

# Example usage
arr = [12, 35, 1, 10, 34, 1]
max_val, min_val = find_max_min(arr)
print("Maximum:", max_val)
print("Minimum:", min_val)
