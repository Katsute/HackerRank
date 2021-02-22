for _ in range(int(input())):
    try:
        IN: str = input()
        a, b = [int(x) for x in IN.split(' ')]
        print(int(a)//int(b))
    except Exception as e:
        print("Error Code:", e)
