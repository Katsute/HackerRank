Regex_Pattern = r'^[Hh][Ii]\s[^Dd]'

import re

lines = int(input())

for _ in range(lines):
    string = input()
    if bool(re.search(Regex_Pattern, string)):
        print(string)