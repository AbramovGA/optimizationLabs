package labs.middle_dot_method;
import static java.lang.Math.abs;
import static labs.utils.utils.df;

/**
 * Created by germanium on 24.03.17.
 */
public class MiddleDot {

    static void method(double a, double b, double accuracy){
        int counter = 0;
        double middleX=0;
        double dy;
        while (abs(a - b) > accuracy) {
            counter++;
            middleX = (a + b) / 2;
            dy = df(middleX);
            if (dy > 0)
                b = middleX;
            else a = middleX;
        }
        System.out.println("Точность - " + accuracy
                + "\nТочка минимума - " + middleX + "\nКоличество иттераций - "
                + counter + "\n");    }
    public static void main(String[] args) {
        System.out.println("метод средней точки\n");
        method(0,1, 0.01);
        method(0,1, 0.0001);
        method(0,1, 0.0000001);
    }
}
