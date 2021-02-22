import re
from re import Pattern

regex: Pattern = re.compile("^[-+]?[0-9]*\.[0-9]+$")

for _ in range(int(input())):
    value: str = input()

    print(re.match(regex, value) is not None)

