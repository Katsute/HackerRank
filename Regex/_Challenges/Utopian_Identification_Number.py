Regex_Pattern = r'^[a-z]{0,3}\d{2,8}[A-Z]{3,}'

import re

lines = int(input())

for _ in range(lines):
    string = input()
    print("VALID" if re.search(Regex_Pattern, string) else "INVALID")