package character_prog;

public class capital {

    public static void uppercase(char c){
        if(c>=65 && c<=90){
            System.out.println(c+" is uppercase character");
        }
        else{
            System.out.println(c+"  is not uppercase character");
        }
    }

    public void isUpperCaseVowel(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println(c+" is uppercase vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
    public static void main(String [] args){

        uppercase('B');
        capital cl=new capital();
        cl.isUpperCaseVowel('O');
    }
}
