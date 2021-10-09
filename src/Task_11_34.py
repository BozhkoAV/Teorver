from numpy import random

tests = 100000
lamb_30_sec = 0.5
count = 0

p_array = random.poisson(lam=lamb_30_sec, size=tests)
for p in p_array:
    if p == 0:
        count += 1

answer = count / tests

print("Количество экспериментов = " + str(tests))
print()
print("Моделирование:")
print("p = " + str(answer))
print()
print("Аналитически:")
print("p = 0.6065")