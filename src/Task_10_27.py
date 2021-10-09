from numpy import cos, exp, pi, random
import matplotlib.pyplot as plt
import numpy as np
from numpy.core.function_base import linspace

tests = 10000
points = 100

v = 100
u = 1000
gamma = pi / 4
nu = 10
R = 0.1
y = []

lamb = (1 + (v / u) * cos(gamma)) * nu * pi * pow(R, 2)
t_array = np.core.function_base.linspace(0, 10, points)

for t in t_array:
    count = 0
    lamb_func = lamb * t
    p_array = random.poisson(lam=lamb_func, size=tests)
    for p in p_array:
        if p == 0:
            count += 1
    y.append(count / tests)

plt.grid()
blue, orange = plt.plot(t_array, y, t_array, exp(-lamb * t_array))
plt.legend((blue, orange), ("моделирование (" + str(tests) + " экспериментов)", "аналитически полученная функция"))
plt.show()