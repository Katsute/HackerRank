Regex_Pattern = r'(\b|[@#])hackerrank\b'

import re

lines = int(input())
total = 0
for _ in range(lines):
    if re.search(Regex_Pattern, input(), re.IGNORECASE):
        total += 1
print(total)