public class Task_6_10 {
    static int random(int max){
        return (int) (Math.random() * (max + 1));
    }

    public static void main(String[] args) {
        int N = 10000000;
        double count = 0;
        for (int j = 0; j < N; j++) {
            int c = random(100); //положение центра отверстия
            int point = random(100); //положение проводящего контакта

            if (c >= 15 && c < 25 && point >= 20 && point < c + 5) {
                count++;
            }
            if (c >= 25 && c <= 35 && Math.abs(c - point) <= 5) {
                count++;
            }
            if (c > 35 && c <= 45 && point > c - 5 && point <= 40) {
                count++;
            }

            if (c >= 60 && c < 70 && point >= 65 && point < c + 5) {
                count++;
            }
            if (c >= 70 && c <= 85 && Math.abs(c - point) <= 5) {
                count++;
            }
            if (c > 85 && c <= 95 && point > c - 5 && point <= 90) {
                count++;
            }
        }

        System.out.println("Вероятность получения электрического контакта:");

        double answer = count / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,045");
    }
}
