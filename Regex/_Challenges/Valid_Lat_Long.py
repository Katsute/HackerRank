Regex_Pattern = r'^\([+-]?(?:90(?:\.0+)?|(?:[1-8]\d|\d)(?:\.\d+)?), [+-]?(?:180(?:\.0+)?|(?:1[0-7]\d|\d\d|\d)(?:\.\d+)?)\)$'

import re

for _ in range(int(input())):
    print("Valid" if re.search(Regex_Pattern, input()) else "Invalid")