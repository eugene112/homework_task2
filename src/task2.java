import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;
import java.util.Scanner;
/**
 * Created by жека on 19.10.2014.
 */
public class task2 {
    public static void main(String[] args) throws IOException {
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double D;
       Scanner sc = new Scanner(System.in);
        System.out.print("Введите а: ");
        a = sc.nextDouble();
        System.out.print("Введите b: ");
        b = sc.nextDouble();
        System.out.print("Введите c: ");
        c = sc.nextDouble();
        D = pow(b, 2) - (4 * a * c);

        if (D > 0) {
            x1 = (-b + sqrt(D)) / (2 * a);
            x2 = (-b - sqrt(D)) / (2 * a);
            System.out.println("Два корня");
            System.out.println(x1);
            System.out.println(x2);
        } else if (D == 0) {
            System.out.println("Один корень");
            x1 = (-b) / (2 * a);
            x2 = (-b) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (D < 0) {
            System.out.println("Нет корней");
            {


            }
        }
    }
}