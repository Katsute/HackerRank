Regex_Pattern = r'^\D[^aeiou][^cDF]\S[^AEIOU][^.,]$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())