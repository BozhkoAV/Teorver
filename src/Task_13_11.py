from scipy.stats import beta
import math

tests = 100000
print('Количество экспериментов = ' + str(tests))
print()


def fun(a, b):
    print('a = ' + str(a) + ', b = ' + str(b))
    y = list()
    y2 = list()
    for i in range(tests):
        y.append(beta.rvs(a, b))
    m_exp = sum(y) / tests
    print()
    print('Моделирование:')
    print('Математическое ожидание = ' + str(m_exp))
    for i in range(tests):
        y2.append(pow((y[i] - m_exp), 2))
    d_exp = sum(y2) / tests
    print('Дисперсия = ' + str(d_exp))

    c = math.gamma(a + b) / (math.gamma(a) * math.gamma(b))
    m_theor = a / (a + b)
    print()
    print('Аналитически:')
    print('Математическое ожидание = ' + str(m_theor))
    d_theor = (a * b) / (pow((a + b), 2) * (a + b + 1))
    print('Дисперсия = ' + str(d_theor))
    print()


fun(2, 2)
fun(3, 5)
