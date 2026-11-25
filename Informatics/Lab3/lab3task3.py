# Author = Fedorov Vadim Sergeevich
# Group = P3114
# Date = 21.11.2026
from re import *
minutes = r"(\*|\*\/[0-5]?[0-9]|[0-5]?[0-9](-[0-5]?[0-9])?)"
hours = r"(\*|\*\/([0-1]?[0-9]|2[0-3])|([0-1]?[0-9]|2[0-3])(-([0-1]?[0-9]|2[0-3]))?)"
days = r"(\*|\*\/([1-9]|[1-2][0-9]|3[0-1])|([1-9]|[1-2][0-9]|3[0-1])(-([1-9]|[1-2][0-9]|3[0-1]))?)"
month = r"(\*|\*\/([1-9]|1[0-2])|([1-9]|1[0-2])(-([1-9]|1[0-2]))?)"
days_of_week = r"(\*|\*\/[0-6]|[0-6](-[0-6])?)"
s = input()
splitted = s.split(" ")
if splitted[0] != '-':
    print("not cron")
else:
    if len(splitted) != 6:
        print("a lot/not enough args")
    else:
        splitted_minutes = splitted[1].split(',')
        for thing in splitted_minutes:
            if not fullmatch(minutes, thing):
                print("error in minutes:" + thing)
        splitted_hours = splitted[2].split(',')
        for thing in splitted_hours:
            if not fullmatch(hours, thing):
                print("error in hours:" + thing)
        splitted_days = splitted[3].split(',')
        for thing in splitted_days:
            if not fullmatch(days, thing):
                print("error in days:" + thing)
        splitted_months = splitted[4].split(',')
        for thing in splitted_months:
            if not fullmatch(month, thing):
                print("error in months:" + thing)
        splitted_days_of_week = splitted[5].split(',')
        for thing in splitted_days_of_week:
            if not fullmatch(days_of_week, thing):
                print("error in days of week:" + thing)

#- 0 9 1,2,3,4,5 * 1-5
#- 0-59 */2 1-31 9-12 0-6
#- 15 24 * * * (err)
#- */1-5 * * * * (err)
#- 1,2,3 */25 */15 * 1,2,3,4,5,6,7,8 (err)