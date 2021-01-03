IPv4 = r'^(?:(?:2[0-5][0-5]|1\d\d|\d\d|\d)(?:\.|\s*$)){4}$'
IPv6 = r'^(?:(?:0*[a-fA-F0-9]+)(?:\:|\s*$)){8}$'

import re

for _ in range(int(input())):
    ip = input()

    if re.search(IPv4, ip):
        print("IPv4")
    elif re.search(IPv6, ip):
        print("IPv6")
    else:
        print("Neither")