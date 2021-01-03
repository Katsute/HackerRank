starts = r"^hackerrank"
ends = r"hackerrank$"

import re

lines = int(input())

for _ in range(lines):
    string = input()
    ms = bool(re.search(starts, string))
    me = bool(re.search(ends, string))
    if not ms and not me:
        print("-1")
    elif ms and me:
        print("0")
    else:
        print("1" if ms else "2")