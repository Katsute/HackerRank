if __name__ == '__main__':
    n = int(input())
    # arr = map(int, input().split()) # excuse me but this is a dict not an array
    strarr = input().split()
    arr = []
    for i in range(len(strarr)):
        arr.append(int(strarr[i]))

    cap: int = max(arr)

    arr2 = []

    for i in arr:
        if i < cap:
            arr2.append(i)

    print(max(arr2))