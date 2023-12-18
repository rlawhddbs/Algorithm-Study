n = input()

arr = n.split(" ")

try:
    while True:
        arr.remove("")
except:
    pass

print(len(arr))