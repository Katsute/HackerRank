import re
from re import Pattern

regex: Pattern = re.compile(r"^[789]\d{9}$")

for _ in range(int(input())):
    value: str = input()

    print("YES" if re.match(regex, value) is not None else "NO")
