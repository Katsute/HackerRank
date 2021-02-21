from typing import List

if __name__ == '__main__':
    N = int(input())

    arr: List[int] = []

    for _ in range(N):
        command: str = input()
        sl: List[str] = command.split(' ')[1:]
        args: List[int] = [int(x) for x in sl]
        command = command.split(' ')[0]

        if command == "insert":
            arr.insert(args[0], args[1])
        elif command == "print":
            print(arr)
        elif command == "remove":
            arr.remove(args[0])
        elif command == "append":
            arr.append(args[0])
        elif command == "sort":
            arr.sort()
        elif command == "pop":
            arr.pop(len(arr)-1)
        elif command == "reverse":
            arr.reverse()
