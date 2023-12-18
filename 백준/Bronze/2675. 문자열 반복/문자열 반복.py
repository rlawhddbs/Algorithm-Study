n = int(input())

numList = list()
strList = list()

for i in range(0, n):
    temp = input()
    numList.append(int(temp.split(" ")[0]))
    strList.append([*temp.split(" ")[1]])

for idx, i in enumerate(numList):
    for j in strList[idx]:
        for k in range(0, i):
            print(j, end="")
    print()