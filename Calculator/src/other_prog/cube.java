package other_prog;
import java.util.Scanner;

public class cube {

    public float cube1(float a){
        return a*a*a;
    }

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        float a=s.nextFloat();
        cube c=new cube();
        float f=c.cube1(a);
        System.out.println(f);

    }
}
