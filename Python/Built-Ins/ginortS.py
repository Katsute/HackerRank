lcase = list()
ucase = list()
odig = list()
edig = list()
for i in input():
    if i.islower():
        lcase.append(i)
    elif i.isupper() :
        ucase.append(i)
    elif i.isdigit():
        if int(i) % 2 == 0:
            edig.append(i)
        else:
            odig.append(i)

for i in sorted(lcase):
    print(i, sep='', end='')
for i in sorted(ucase):
    print(i, sep='', end='')
for i in sorted(odig):
    print(i, sep='', end='')
for i in sorted(edig):
    print(i, sep='', end='')