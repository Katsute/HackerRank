Regex_Pattern = r'[a-zA-Z_.]+@[a-zA-Z_.]+\.[a-zA-Z]+'

import re

matches = []
for _ in range(int(input())):
    matches += re.findall(Regex_Pattern, input())
matches.sort()

string = ""
processed = []
for m in matches:
    if m not in processed:
        string += m + ';'
        processed.append(m)

print(string[:-1])