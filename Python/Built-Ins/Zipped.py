raw = input().split()
l = int(raw[0])
a = int(raw[1])

rows = list()

for i in range(a):
    cols = list()
    r = input().split()
    for c in range(l):
        cols.append(float(r[c]))
    rows.append(cols)

for c in range(l):
    s = 0
    for r in range(a):
        s += rows[r][c]
    print(s / a)