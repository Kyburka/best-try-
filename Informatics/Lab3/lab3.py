# Author = Fedorov Vadim Sergeevich
# Group = P3114
# Date = 21.11.2026
from re import *
reg = r"id=[\"”](\S+)[\"”]"
s = input()
match = findall(reg, s)
for a in match:
    print(a)