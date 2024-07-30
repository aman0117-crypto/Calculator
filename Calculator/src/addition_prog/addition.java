package addition_prog;

public class addition {

    public static int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String [] args){
        System.out.println(add(5,5));
        addition p=new addition();
        System.out.println(p.add(2,3,4));
    }
}
