from typing import List

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

    perm: List[List[int]] = [[a, b, c] for a in range(x + 1) for b in range(y + 1) for c in range(z + 1)]

    valid: List[List[int]] = [arr for arr in perm if sum(arr) != n]

    print(valid)

