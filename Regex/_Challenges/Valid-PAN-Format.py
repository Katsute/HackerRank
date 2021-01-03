Regex_Pattern = r'^[A-Z]{5}[0-9]{4}[A-Z]$'

import re

lines = int(input())

for _ in range(lines):
    string = input()
    print("YES" if re.search(Regex_Pattern, string) else "NO")