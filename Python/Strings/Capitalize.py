#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s: str) -> str:
    before: str = ' '
    out: str = ""

    for ch in s:
        out += ch.upper() if before == ' ' else ch
        before = ch

    return out

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
