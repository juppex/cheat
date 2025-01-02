//---------------------------------------dfs--------------------------------------

def dfs(u,matrix,visited):
  if not visited[u]:
    print(u,end=", ")
    visited[u] =1 
    for v in range(len(matrix[u])):
      if matrix[u][v] == 1 and not visited[v]:
        dfs(v,matrix,visited)
matrix = [[0,0,0,0,0,0,0,0],
          [0,0,1,1,1,0,0,0],
          [0,1,0,1,0,0,0,0],
          [0,1,1,0,1,1,0,0],
          [0,1,0,1,0,1,0,0],
          [0,0,0,1,1,0,1,1],
          [0,0,0,0,0,1,0,0],
          [0,0,0,0,0,1,0,0]]

visited = [0]*(len(matrix))
dfs(5,matrix,visited)

//---------------------------------------bfs--------------------------------------

from collections import deque

def bfs(start, matrix, visited):
    queue = deque([start])
    visited[start] = 1
    result = []  # To store the nodes in BFS order

    while queue:
        u = queue.popleft()
        result.append(u)

        for v in range(len(matrix[u])):
            if matrix[u][v] == 1 and not visited[v]:
                queue.append(v)
                visited[v] = 1

    # Print the result as a comma-separated string
    print(", ".join(map(str, result)))

matrix = [[0,0,0,0,0,0,0,0],
          [0,0,1,1,1,0,0,0],
          [0,1,0,1,0,0,0,0],
          [0,1,1,0,1,1,0,0],
          [0,1,0,1,0,1,0,0],
          [0,0,0,1,1,0,1,1],
          [0,0,0,0,0,1,0,0],
          [0,0,0,0,0,1,0,0]]

visited = [0]*len(matrix)
bfs(4, matrix, visited)
