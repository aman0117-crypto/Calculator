package other_prog;
import java.util.Scanner;

public class factors {
    public static void getFactors(int a){
        //System.out.println("factors are:");
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        getFactors(n);

    }
}
