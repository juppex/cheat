def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

# Example usage
n = 5
result = factorial(n)
print(f"Factorial of {n} is: {result}")


def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

# Example usage
n = 6
result = fibonacci(n)
print(f"Fibonacci of {n} is: {result}")


def tower_of_hanoi(n, source, target, auxiliary):
    if n == 1:
        print(f"Move disk 1 from {source} to {target}")
        return
    tower_of_hanoi(n - 1, source, auxiliary, target)
    print(f"Move disk {n} from {source} to {target}")
    tower_of_hanoi(n - 1, auxiliary, target, source)

# Example usage
n = 3  # Number of disks
tower_of_hanoi(n, 'A', 'C', 'B')  # A, B, and C are the rods
