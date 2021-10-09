public class Task_4_16 {
    public static void main(String[] args) {
        int N = 1000000;
        double count1 = 0;
        double count2 = 0;
        for (int j = 0; j < N; j++) {
            boolean first_technology = true;
            double f_t_1st_op = Math.random();
            if (f_t_1st_op <= 0.1) first_technology = false;
            double f_t_2nd_op = Math.random();
            if (f_t_2nd_op <= 0.2) first_technology = false;
            double f_t_3rd_op = Math.random();
            if (f_t_3rd_op <= 0.3) first_technology = false;
            double f_t_best_quality = Math.random();
            if (f_t_best_quality <= 1 - 0.9) first_technology = false;
            if (first_technology) count1++;

            boolean second_technology = true;
            double s_t_1st_op = Math.random();
            if (s_t_1st_op <= 0.3) second_technology = false;
            double s_t_2nd_op = Math.random();
            if (s_t_2nd_op <= 0.3) second_technology = false;
            double s_t_best_quality = Math.random();
            if (s_t_best_quality <= 1 - 0.8) second_technology = false;
            if (second_technology) count2++;
        }

        System.out.println("Вероятность получения первосортной продукции при изготовлении ");
        System.out.println("с применением первой технологии:");

        double answer1 = count1 / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer1);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,4536");
        System.out.println();
        System.out.println();

        System.out.println("Вероятность получения первосортной продукции при изготовлении ");
        System.out.println("с применением второй технологии:");

        double answer2 = count2 / N;
        System.out.println("Моделирование:");
        System.out.print("p = ");
        System.out.printf("%.5f", answer2);
        System.out.println();

        System.out.println("Аналитически:");
        System.out.print("p = 0,392");
        System.out.println();
        System.out.println();
    }
}
