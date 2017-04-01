package labs.horde_method;

import static java.lang.Math.abs;
import static labs.utils.utils.df;

/**
 * Created by germanium on 24.03.17.
 */
public class hordes {

    static void method(double a, double b, double accuracy){
        double x0 = (a + b) / 3;
        double x1 = (a + b) / 2;
        int counter = 0;
        double x2;
        while (abs(df(x1)) > accuracy) {
            x2 = x1 - ((x1 - x0) / (df(x1) - df(x0))) * df(x1);
            x0 = x1;
            x1 = x2;
            counter++;
        }
        System.out.println("Точность - " + accuracy
                + "\nТочка минимума - " + x1 + "\nКоличество иттераций - "
                + counter + "\n");
    }

    public static void main(String[] args) {
        System.out.println("метод хорд\n");
        method(0,1, 0.01);
        method(0,1, 0.0001);
        method(0,1, 0.0000001);
    }
}
