public class Task_9_7 {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        task_9_7(3, 5);
        task_9_7(10, 2);
    }

    static void task_9_7(int m, int n) {
        double[] pk = new double[m];
        double pk_summ = 0.0;
        for (int i = 0; i < m; i++) {
            pk[i] = Math.random();
            while (pk_summ + pk[i] >= 1.0) {
                pk[i] = Math.random();
            }
            pk_summ += pk[i];
        }
        double p0 = 1.0 - pk_summ;

        int N = 100000;
        double count = 0;

        for (int j = 0; j < N; j++) {
            int[] shots = new int[n];
            for (int i = 0; i < n; i++) {
                double shot = Math.random();
                double prob = 0.0;
                for (int k = 0; k < m; k++) {
                    if (shot <= prob + pk[k]) {
                        shots[i] = k + 1;
                        break;
                    }
                    prob += pk[k];
                }
            }

            int first = 0;
            for (int i = 0; i < n; i++) {
                if (shots[i] != 0) {
                  first = shots[i];
                  break;
                }
            }
            int second = 0;
            if (first != 0) {
                for (int i = 0; i < n; i++) {
                    if (shots[i] != 0 && shots[i] != first) {
                        second = shots[i];
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println("Вероятность поражения цели, если для этого необходимого ");
        System.out.println("поразить не менее двух элементарных целей:");

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        double analiz = 0.0; // находим вероятность аналитически
        for (int k = 1; k <= m; k++) {
            for (int i = 1; i <= n; i++) {
                analiz += (getFactorial(n) * Math.pow(pk[k - 1], i) * Math.pow(p0, n - i)) /
                        (getFactorial(i) * getFactorial(n - i));
            }
        }
        analiz = analiz * (-1);
        analiz = analiz + 1 - Math.pow(p0, n);

        System.out.println("Аналитически:");
        System.out.print("p = ");
        System.out.printf("%.5f", analiz);
        System.out.println();
        System.out.println();
    }
}
