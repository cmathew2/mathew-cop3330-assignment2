package ex31;

import static ex31.App.a;
import static ex31.App.r;

public class Karonven {
    static void output_table() {
        System.out.printf("%10s %2s %10s %2s\n\n", "Resting Pulse: ", r, "Age: ", a);
        System.out.printf("%8s %5s %5s\n", "Intensity", "|", "Rate");
        System.out.printf("__________________________\n");

        for (int i = 55; i <= 95; i += 5) {
            System.out.printf("%8s %6s %5s\n", i + "%", "|", TargetRate(r, i, a) + " bpm");
        }
    }
    public static double TargetRate(double RHR, double intensity, double age) {
        return Math.round((((220.0 - age) - RHR) * (intensity/100.0)) + RHR);
    }
}
