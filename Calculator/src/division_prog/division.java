package division_prog;

public class division {

    public float div(float a,float b){
        return b/a;
    }
    public static void main(String [] args){
        division d=new division();
        System.out.println(d.div(2.0f,4.0f));
    }
}
