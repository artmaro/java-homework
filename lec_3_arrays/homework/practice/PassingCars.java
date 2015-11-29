Дан массив А целых чисел размера N.
Элементы массива - это машины на шоссе двигающиеся в разных направлениях.
A[i] может быть либо 0 либо 1. Если значение равно 0 - это предствляет машину двигающуюся на восток, 1 - на запад соот..
Задача посчитать число пар машин направленных навстречу друг другу с востока на запад.
Например,
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
Считаем пары машин таким образом: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
В результате должно получиться 5.
*Усложнение: найдите решение за линейное время О(N).

https://codility.com/programmers/task/passing_cars