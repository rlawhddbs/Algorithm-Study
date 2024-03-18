import itertools

def solution(dots):

    per = itertools.permutations([0, 1, 2, 3])

    for i in per:
        x1 = dots[i[0]][0]
        x2 = dots[i[1]][0]
        x3 = dots[i[2]][0]
        x4 = dots[i[3]][0]

        y1 = dots[i[0]][1]
        y2 = dots[i[1]][1]
        y3 = dots[i[2]][1]
        y4 = dots[i[3]][1]

        if (y1 - y2) / (x1 - x2) == (y3 - y4) / (x3 - x4):
            return 1

    return 0