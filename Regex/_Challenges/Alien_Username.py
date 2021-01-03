Regex_Pattern = r'^[_\.]\d+[a-zA-Z]*_?$'

import re

lines = int(input())

for _ in range(lines):
    string = input()
    print("VALID" if re.search(Regex_Pattern, string) else "INVALID")