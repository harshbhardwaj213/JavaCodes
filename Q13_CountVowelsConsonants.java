
import java.util.Scanner;

public class Q13_CountVowelsConsonants {
    public static void count(String str){
        char[] strArray = str.toCharArray();
        int vowels=0, consonants=0;
        for(int i=0; i<strArray.length; i++){
            char ch = Character.toLowerCase(strArray[i]);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();
        count(s);
    }
}
