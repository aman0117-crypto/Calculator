import addition_prog.addition;
import character_prog.capital;
import character_prog.small;
import other_prog.*;
import subtraction_prog.subtraction;
import  multiplication_prog.product;
import division_prog.division;
import java.util.Scanner;
public class user_calculator {
    public static void main(String [] args){
        System.out.println("                           ----WELCOME TO CALCULATOR----");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 to find Power of a number");
        System.out.println("Enter 6 to find square of a number");
        System.out.println("Enter 7 to find cube of a number");
        System.out.println("Enter 8 to find factorial of a number");
        System.out.println("Enter 9 to find factors of a number");
        System.out.println("Enter 10 to find the character is uppercase or not");
        System.out.println("Enter 11 to find the character is lowercase or not");
        System.out.println();

        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number:");
        int a=s.nextInt();
        System.out.println();

        switch(a){
            case 1:
                System.out.println("Thank you for choosing the Addition option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 for adding two numbers:");
                System.out.println("Enter 2 for adding three numbers:");
                Scanner sc=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i1=sc.nextInt();
                switch(i1)
                {
                    case 1:
                        Scanner sc2=new Scanner(System.in);
                        System.out.println("Enter the first Number:");
                        int n1=sc2.nextInt();
                        System.out.println("Enter the second Number:");
                        int n2=sc2.nextInt();
                        int n3=addition.add(n1,n2);
                        System.out.println("The addition of two numbers are: "+n3);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;

                    case 2:
                        Scanner sc3=new Scanner(System.in);
                        System.out.println("Enter the first Number:");
                        int n4=sc3.nextInt();
                        System.out.println("Enter the second Number:");
                        int n5=sc3.nextInt();
                        System.out.println("Enter the third Number:");
                        int n6= sc3.nextInt();
                        addition  ad=new addition();
                        int n7=ad.add(n4,n5,n6);
                        System.out.println("The addition of three numbers are: "+n7);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
            break;

            case 2:
                System.out.println("Thank you for choosing the Subtraction option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 for subtracting two numbers:");
                Scanner sc4=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i2=sc4.nextInt();
                switch(i2)
                {
                    case 1:
                        Scanner sc5=new Scanner(System.in);
                        System.out.println("Enter the first Number:");
                        float n8=sc5.nextFloat();
                        System.out.println("Enter the second Number:");
                        float n9=sc5.nextFloat();
                        float n10=subtraction.sub(n8,n9);
                        System.out.println("The subtraction of two numbers are: "+n10);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;

            case 3:
                System.out.println("Thank you for choosing the multiplication option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 for product of two numbers:");
                System.out.println("Enter 2 for product of three numbers:");
                Scanner sc5=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i3=sc5.nextInt();
                switch(i3)
                {
                    case 1:
                        Scanner sc6=new Scanner(System.in);
                        System.out.println("Enter the first Number:");
                        float n11=sc6.nextFloat();
                        System.out.println("Enter the second Number:");
                        float n12=sc6.nextFloat();
                        float n13=product.pro(n11,n12);
                        System.out.println("The product of two numbers are: "+n13);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;

                    case 2:
                        Scanner sc7=new Scanner(System.in);
                        System.out.println("Enter the first Number:");
                        float n14=sc7.nextFloat();
                        System.out.println("Enter the second Number:");
                        float n15=sc7.nextFloat();
                        System.out.println("Enter the third Number:");
                        float n16=sc7.nextFloat();
                        product p =new product();
                        float n17=p.add(n14,n15,n16);
                        System.out.println("The product of three numbers are: "+n17);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
            break;

            case 4:
                System.out.println("Thank you for choosing the division option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 for division of two numbers:");
                Scanner sc8=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i4=sc8.nextInt();
                switch(i4)
                {
                    case 1:
                        Scanner sc9 = new Scanner(System.in);
                        System.out.println("Enter the first Number:");
                        float n18 = sc9.nextFloat();
                        System.out.println("Enter the second Number:");
                        float n19 = sc9.nextFloat();
                        division d = new division();
                        float n20 = d.div(n18, n19);
                        System.out.println("The division of two numbers are: " + n20);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
            break;

            case 5:
                System.out.println("Thank you for choosing the power option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find power of a number:");
                Scanner sc10=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i5=sc10.nextInt();
                switch(i5)
                {
                    case 1:
                        Scanner sc11 = new Scanner(System.in);
                        System.out.println("Enter the Base Number:");
                        float n21 = sc11.nextFloat();
                        System.out.println("Enter the exponent Number:");
                        float n22 = sc11.nextFloat();
                        double n23 = power.power(n21,n22);
                        System.out.println("The power of a number: " + n23);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
            break;
            case 6:
                System.out.println("Thank you for choosing the square option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find square of a number:");
                Scanner sc11=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i6=sc11.nextInt();
                switch(i6)
                {
                    case 1:
                        Scanner sc12 = new Scanner(System.in);
                        System.out.println("Enter the Number:");
                        float n24 = sc12.nextFloat();
                        square sq=new square();
                        double n25 = sq.square(n24);
                        System.out.println("The square of a number: " + n25);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;
            case 7:
                System.out.println("Thank you for choosing the cube option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find cube of a number:");
                Scanner sc13=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i7=sc13.nextInt();
                switch(i7)
                {
                    case 1:
                        Scanner sc14 = new Scanner(System.in);
                        System.out.println("Enter the Number:");
                        float n26 = sc14.nextFloat();
                        cube cu=new cube();
                        double n27 = cu.cube1(n26);
                        System.out.println("The cube of a number: " + n27);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;
            case 8:
                System.out.println("Thank you for choosing the factorial option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find factorial of a number:");
                Scanner sc15=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i8=sc15.nextInt();
                switch(i8)
                {
                    case 1:
                        Scanner sc16 = new Scanner(System.in);
                        System.out.println("Enter the Number:");
                        int n28 = sc16.nextInt();
                        factorial  fac=new factorial();
                        System.out.println("The factorial of a number:");
                        fac.factorial1(n28);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;
            case 9:
                System.out.println("Thank you for choosing the factor option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find factor of a number:");
                Scanner sc17=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i9=sc17.nextInt();
                switch(i9)
                {
                    case 1:
                        Scanner sc18 = new Scanner(System.in);
                        System.out.println("Enter the Number:");
                        int n30 = sc18.nextInt();
                        System.out.println("The factors of "+n30 +" are:");
                        factors.getFactors(n30);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;
            case 10:
                System.out.println("Thank you for choosing the uppercase option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find the character is uppercase or not:");
                Scanner sc20=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i10=sc20.nextInt();
                switch(i10)
                {
                    case 1:
                        Scanner sc21 = new Scanner(System.in);
                        System.out.println("Enter the character:");
                        char n31 = sc21.nextLine().charAt(0);
                        capital.uppercase(n31);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;
            case 11:
                System.out.println("Thank you for choosing the lowercase option---");
                System.out.println();
                System.out.println("Now, ");
                System.out.println("Enter 1 to find the character is lowercase or not:");
                Scanner sc23=new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the number:");
                int i11=sc23.nextInt();
                switch(i11)
                {
                    case 1:
                        Scanner sc24 = new Scanner(System.in);
                        System.out.println("Enter the character:");
                        char n32 = sc24.nextLine().charAt(0);
                        small.lowercase(n32);
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.out.println();
                        System.out.println("  ----Thank you for using the calculator----");
                        break;
                }
                break;
            default:
                System.out.println("Invalid option,try again.");
                break;

        }

    }
}
