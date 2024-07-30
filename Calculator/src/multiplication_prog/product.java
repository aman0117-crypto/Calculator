package multiplication_prog;

public class product {

    public static float pro(float a,float b){
        return a*b;
    }
    public float add(float a,float b,float c){
        return a*b*c;
    }
    public static void main(String [] args){
        System.out.println(pro(2.2f,4.0f));
        product p=new product();
        System.out.println(p.add(2.0f,3.0f,4.2f));
    }
}
