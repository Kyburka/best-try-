# Author = Fedorov Vadim Sergeevich
# Group = P3114
# Date = 21.11.2026
from re import *
def sorty(word):
    return (len(word),word)
glas = "аеёиоуыэюя"
s=input()
s=s.lower()
reg = r"[а-яё]+"
match = findall(reg, s)
coolwords = []
for word in match:
    uniq = set()
    for letter in word:
        if letter in glas:
            uniq.add(letter)
    if len(uniq) == 1:
        coolwords.append(word)
coolwords.sort(key=sorty)
for word in coolwords:
    print(word)