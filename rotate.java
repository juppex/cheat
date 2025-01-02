def rotate_array(arr, k):
    n = len(arr)
    k = k % n  # In case the rotation is greater than array size
    return arr[-k:] + arr[:-k]

# Example usage
arr = [1, 2, 3, 4, 5, 6, 7]
k = 2
rotated_arr = rotate_array(arr, k)
print("Array after", k, "rotations:", rotated_arr)
