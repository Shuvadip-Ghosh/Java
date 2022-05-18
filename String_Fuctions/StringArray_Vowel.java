 // wap to input 10 word in an array. Display all those words starting with a vowel
import java.util.*;
class StringArray_Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wrd[] = new String[10];
        System.out.println("Enter 10 word in the array");
        for(int i =0; i<10; i++){
            wrd[i]=sc.next();
        }
        System.out.println("The words stsrting vowel are-");
        for(int i=0;i<10;i++){
            String w = wrd[i];
            w=w.trim();
            w=w.toLowerCase();
            char ch = w.charAt(0);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='0')||(ch=='u')){
                System.out.print(wrd[i]+"\t");
            }
        }
        sc.close();
    }
}
