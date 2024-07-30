package character_prog;

public class small {
    public static void lowercase(char c){
        if(c>=97 && c<=122){
            System.out.println(c+" is lowercase character");
        }
        else{
            System.out.println(c+"  is  not lowercase character");
        }
    }

    public void isLowerCaseVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c+" is lowercase vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
    public static void main(String [] args){


            lowercase('b');
            small sl=new small();
            sl.isLowerCaseVowel('o');
        }
    }

