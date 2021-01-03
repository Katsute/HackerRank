Regex_Pattern = r'^(\d{1,3})(?: |-)(\d{1,3})(?: |-)(\d{4,10})$'

import re

lines = int(input())

for _ in range(lines):
    string = input()

    match = re.match(Regex_Pattern, string)
    print(f"CountryCode={match.group(1)},LocalAreaCode={match.group(2)},Number={match.group(3)}")