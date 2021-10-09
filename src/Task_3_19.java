public class Task_3_19 {
    static int random(int max){
        return (int) (Math.random() * (max + 1));
    }

    static void a() {
        int N = 1000000;
        double count = 0;
        for (int j = 0; j < N; j++) {
            int x = random(200);
            while (x == 0 || x == 200) {
                x = random(200);
            }
            int y = random(200);
            while (y == 0 || y == 200 || y == x) {
                y = random(200);
            }
            if (Math.abs(x - y) <= 10) count++;
        }

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,0975");
        System.out.println();
        System.out.println();
    }

    static void b() {
        int N = 1000000;
        double count = 0;
        for (int j = 0; j < N; j++) {
            int x = random(200);
            while (x == 0 || x == 200) {
                x = random(200);
            }
            int y = random(200);
            while (y == 0 || y == 200 || y == x) {
                y = random(200);
            }
            int z = random(200);
            while (z == 0 || z == 200 || z == x || z == y) {
                z = random(200);
            }
            if (Math.abs(x - y) <= 10 || Math.abs(x - z) <= 10 || Math.abs(y - z) <= 10) count++;
        }

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,271");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("а) Вероятность того, что хотя бы одна часть стержня между точками ");
        System.out.println("излома будет не более 10 мм, если у стержня две точки излома:");
        a();
        System.out.println("б) Вероятность того, что хотя бы одна часть стержня между точками ");
        System.out.println("излома будет не более 10 мм, если у стержня три точки излома:");
        b();
    }
}
