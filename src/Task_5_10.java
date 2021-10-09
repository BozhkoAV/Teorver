public class Task_5_10 {
    static int random(int max){
        return (int) (Math.random() * (max + 1));
    }

    public static void main(String[] args) {
        int N = 1000000;
        double count = 0;
        for (int j = 0; j < N; j++) {
            int[] box1 = new int[24];
            for (int i = 0; i < 5; i++) box1[i] = 1;
            for (int i = 5; i < 16; i++) box1[i] = 2;
            for (int i = 16; i < 24; i++) box1[i] = 3;

            int[] box2 = new int[24];
            for (int i = 0; i < 10; i++) box2[i] = 1;
            for (int i = 10; i < 18; i++) box2[i] = 2;
            for (int i = 18; i < 24; i++) box2[i] = 3;

            if (box1[random(23)] == box2[random(23)]) count++;
        }

        System.out.println("Вероятность того, что оба шара одного цвета:");

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,3229");
    }
}
