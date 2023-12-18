n = int(input())

list = list()

for i in range(n):
    list.append(int(input()))

list.sort()

for i in range(n):
    print(list[i])