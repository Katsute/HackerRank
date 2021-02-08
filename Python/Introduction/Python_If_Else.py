#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    even: bool = n % 2 == 0

    if not even or (even and n >= 6 and n <= 20):
        print("Weird")
    elif even:
        if n >= 2 and n <= 5 or n > 20:
            print("Not Weird")