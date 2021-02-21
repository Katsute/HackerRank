def swap_case(s: str) -> str:
    out: str = ""

    for char in s:
        out += char.upper() if char.islower() else char.lower()

    return out


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
