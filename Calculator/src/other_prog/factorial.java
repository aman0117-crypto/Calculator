package other_prog;

import java.util.Scanner;

public class factorial {
    public void factorial1(int a) {
        int f=1;
        for (int i = a; i >= 1; i--) {
            f= i * f;
        }
        System.out.println(f);
    }



    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n =s.nextInt();
        factorial fb=new factorial();
        fb.factorial1(n);




    }
}
