class Queue:
    def __init__(self):
        self.q = []
        self.front = -1
        self.rear = -1

    def enqueue(self, data):
        self.rear += 1
        self.q.append(data)
        print(f"{data} added to the queue")

    def dequeue(self):
        if self.rear == self.front:
            print("Queue is empty")
        else:
            self.front += 1
            print(f"{self.q[self.front]} removed from the queue")
            if self.front == self.rear:
              
                self.q = []
                self.front = -1
                self.rear = -1

    def printQ(self):
        if self.rear == self.front:
            print("Queue is empty")
        else:
            print("Q =", self.q[self.front + 1:])

Q = Queue()
Q.enqueue(20)
Q.enqueue(10)
Q.enqueue(50)
Q.enqueue(40)
Q.printQ()
Q.dequeue()
Q.printQ()
Q.dequeue()
Q.printQ()
Q.dequeue()
Q.printQ()
Q.dequeue()
Q.printQ()



//======================================circular=================================


class CircularQueue:
    def __init__(self, size):
        self.size = size
        self.queue = [None] * size
        self.front = self.rear = -1

    def dequeue(self):
        if self.front == -1:
            print("Queue is empty")
        elif self.front == self.rear:  # Only one element left
            dequeued = self.queue[self.front]
            self.front = self.rear = -1
            print(f"Dequeued: {dequeued}")
        else:
            dequeued = self.queue[self.front]
            self.front = (self.front + 1) % self.size
            print(f"Dequeued: {dequeued}")
        return dequeued

# Example usage
cq = CircularQueue(5)
cq.enqueue(10)
cq.enqueue(20)
cq.enqueue(30)
cq.dequeue()  # Output: Dequeued: 10
cq.dequeue()  # Output: Dequeued: 20




