from typing import List

if __name__ == '__main__':

    scores: List[List] = []
    lowest: float = 100

    for _ in range(int(input())):
        name = input()
        score = float(input())

        scores.append([name, score])

        if score < lowest:
            lowest = score

    slowest: float = 100
    for score in scores:
        if score[1] < slowest and score[1] != lowest:
            slowest = score[1]

    names: List[str] = []

    for score in scores:
        if score[1] == slowest:
            names.append(score[0])

    names.sort()

    for n in names:
        print(n)