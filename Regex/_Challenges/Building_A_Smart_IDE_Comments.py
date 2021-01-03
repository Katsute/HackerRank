Regex_Pattern = r'(\/\/[^\r\n]+|\/(\*\*?).*?\2\/)'

import re
import sys

matches = re.findall(Regex_Pattern, sys.stdin.read(), re.DOTALL | re.MULTILINE)

for m in matches:
    print(m[0])