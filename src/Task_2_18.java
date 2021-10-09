public class Task_2_18 {
    static int random(int max){
        return (int) (Math.random() * (max + 1));
    }

    public static void main(String[] args) {
        task_2_18(15,12,2);
        task_2_18(14,9,5);
        task_2_18(4,3,1);
    }

    static void task_2_18(int n_plus_k, int n, int m){
        System.out.println("n + k = " + n_plus_k);
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int[] seats = new int[n_plus_k];
        double count = 0;
        int N = 100000; // общее число исходов

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < n_plus_k; i++) {
                seats[i] = 0;
            }

            int n_count = n;
            while (n_count > 0) {
                int i = random(n_plus_k - 1);
                if (seats[i] == 0) {
                    seats[i] = 1;
                    n_count--;
                }
            }

            boolean flag = true;
            for (int i = 0; i < m; i++) {
                if (seats[i] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++; //считаем количество благоприятных исходов
        }

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        float analiz = 1; // находим вероятность аналитически
        for (int i = n; i > n - m; i--) {
            analiz = analiz * i;
        }
        for (int i = n_plus_k; i > n_plus_k - m; i--) {
            analiz = analiz / i;
        }

        System.out.println("Аналитически:");
        System.out.print("p = ");
        System.out.printf("%.5f", analiz);
        System.out.println();
        System.out.println();
    }
}