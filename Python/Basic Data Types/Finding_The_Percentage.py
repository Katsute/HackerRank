from typing import List

if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()

    scores: List[float] = student_marks[query_name]
    print(f"{sum(scores)/len(scores):.2f}")
