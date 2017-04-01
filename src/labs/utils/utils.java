package labs.utils;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 * Created by germanium on 24.03.17.
 */
public class utils {
    public static double f(double x){
        return x*x*x-3*sin(x);
    }
    public static double df(double x){
        return 3*x*x-3*cos(x);
    }
    public static double ddf(double x){
        return 6*x+3*sin(x);
    }
}
