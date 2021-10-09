public class Task_7_16 {
    static int random(int max){
        return (int) (Math.random() * (max + 1));
    }

    public static void main(String[] args) {
        task_7_16(1, 2, 3);
        task_7_16(6, 5, 4);
    }

    static void task_7_16(int n1, int n2, int n3) {
        int n = n1 + n2 + n3;
        System.out.println("n = " + n);
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

        int N = 100000;
        double count = 0;

        int[] students = new int[n];
        for (int i = 0; i < n1; i++) students[i] = 1;
        for (int i = n1; i < n1 + n2; i++) students[i] = 2;
        for (int i = n1 + n2; i < n; i++) students[i] = 3;

        for (int j = 0; j < N; j++) {
            int first_student = random(n - 1);
            int second_student = random(n - 1);
            while (students[second_student] == students[first_student]) {
                second_student = random(n - 1);
            }
            if (students[first_student] == 3 || students[second_student] == 3) count++;
        }

        System.out.println("Вероятность того, что среди двух выбранных студентов ");
        System.out.println("(один из которых учится дольше другого) один учится третий год:");

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        double analiz = (double) ((n1 + n2) * n3) / (n1 * n2 + (n1 + n2) * n3); // находим вероятность аналитически

        System.out.println("Аналитически:");
        System.out.print("p = ");
        System.out.printf("%.5f", analiz);
        System.out.println();
        System.out.println();
    }
}
