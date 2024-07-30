package other_prog;
import java.lang.Math;
import java.util.Scanner;

public class power {
    public static double power(float a,float b){
        Scanner s=new Scanner(System.in);
        double f=Math.pow(a,b);
        return f;
    }
    public static void main(String [] args){
        System.out.println(power(2.0f,2.0f));

    }
}
