package labs.neuthon_method;

import static java.lang.Math.abs;
import static labs.utils.utils.ddf;
import static labs.utils.utils.df;

/**
 * Created by germanium on 24.03.17.
 */
public class Newton {
    static void method(double a, double b, double accuracy){
        double x0 = (a + b) / 2;
        int counter = 0;
        while (abs(df(x0)) > accuracy) {
            x0 = x0 - (df(x0) / ddf(x0));
            counter++;
        }
        System.out.println("Точность - " + accuracy
                + "\nТочка минимума - " + x0 + "\nКоличество иттераций - "
                + counter + "\n");
    }
    public static void main(String[] args) {
        System.out.println("метод ньютона\n");
        method(0,1, 0.01);
        method(0,1, 0.0001);
        method(0,1, 0.0000001);
    }
}
