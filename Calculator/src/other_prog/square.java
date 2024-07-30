package other_prog;

public class square {
    public float square(float a){
        return a*a;
    }

    public static void main(String [] args){
        square s=new square();
        System.out.println(s.square(1080.0f));

    }
}
