n = input().upper()

alphabets = list(set(n))
cnt = list()

for i in alphabets:
    cnt.append(n.count(i))

maxAlphabet = max(cnt)

if cnt.count(maxAlphabet) > 1:
    print('?')
    exit()

print(alphabets[cnt.index(maxAlphabet)])