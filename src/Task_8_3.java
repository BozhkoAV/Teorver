public class Task_8_3 {
    static int random(int max){
        return (int) (Math.random() * (max + 1));
    }

    static void a() {
        int N = 1000000;
        double count = 0;
        for (int j = 0; j < N; j++) {
            int k = 0;
            int[] numbers = new int[200];
            for (int i = 0; i < 200; i++) {
                numbers[i] = random(99);
                if (numbers[i] == 33) k++;
            }
            if (k == 3) count++;
        }

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,1812");
        System.out.println();
        System.out.println();
    }

    static void b() {
        int N = 1000000;
        double count = 0;
        for (int j = 0; j < N; j++) {
            int k = 0;
            int[] numbers = new int[200];
            for (int i = 0; i < 200; i++) {
                numbers[i] = random(99);
                if (numbers[i] == 33) k++;
            }
            if (k == 4) count++;
        }

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,0902");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("а) Вероятность появления числа 33 среди 200 чисел (от 0 до 99) ровно 3 раза:");
        a();
        System.out.println("б) Вероятность появления числа 33 среди 200 чисел (от 0 до 99) ровно 4 раза:");
        b();
    }
}
