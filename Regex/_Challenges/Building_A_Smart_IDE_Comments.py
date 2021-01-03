Regex_Pattern = r'(\/\/[^\r\n]+|\/(\*\*?).*?\2\/)'

import re
import sys

string = "\n".join([i.strip() for i in sys.stdin])  # fixes defective case 4
matches = re.findall(Regex_Pattern, string, re.DOTALL | re.MULTILINE)

for m in matches:
    print(m[0])