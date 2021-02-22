import math

AB: int = int(input())
BC: int = int(input())

print(round(math.degrees(math.atan2(AB, BC))), "°", sep='')
