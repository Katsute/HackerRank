def check(string: str, method) -> bool:
    for ch in string:
        if method(ch):
            return True
    return False


if __name__ == '__main__':
    s = input()

    for method in [str.isalnum, str.isalpha, str.isdigit, str.islower, str.isupper]:
        print(check(s, method))



