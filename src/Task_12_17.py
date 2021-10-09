from numpy import sin, arcsin, pi, random
import matplotlib.pyplot as plt
import numpy as np
from numpy.core.function_base import linspace

tests = 10000
points = 100

v0 = 100
g = 10
X = pow(v0, 2) / g
y1 = []
x = []
l1 = 0
l2 = X
k = l1

while k <= l2:
    p = 0
    for i in range(tests):
        alpha = random.uniform(0, pi / 2)
        # print(alpha)
        l = X * sin(2 * alpha)
        if l < k:
            p += 1
    y1.append(p / tests)
    k += (l2 - l1) / points
    # print(k)
# print(y1)

x = np.core.function_base.linspace(0, X, points + 1)
# print(x)

plt.grid()
blue, orange = plt.plot(x, y1, x, (2 / pi) * arcsin((x * g) / pow(v0, 2)))
plt.legend((blue, orange), ("моделирование (" + str(tests) + " экспериментов)", "аналитически полученная функция"))
plt.show()