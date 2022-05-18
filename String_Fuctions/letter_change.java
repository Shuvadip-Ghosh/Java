// wap to input a sentence then change each consonant with previous letter and if the previous letter is a
// vowel then change it with the next letter
// Sample Input = THE CAPITAL OF INDIA IS NEW DELHI
// Sample Output = SGE BAQISAK OG IMCIA IR MEV CEKGI
import java.util.Scanner;
public class letter_change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen, newsen="";
        System.out.print("Enter a Sentence: ");
        sen = sc.nextLine();
        sen = sen.toUpperCase();
        for(int i=0;i<sen.length();i++){
            char ch = sen.charAt(i);
            char c = ch;
            if((Character.isLetter(ch))&&(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')){
                    char chr = (char)((int)ch - 1);
                    if(chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U')
                        chr = (char)((int)ch + 1);
                    newsen = newsen+chr;
            }
            else
                newsen = newsen+ch;
        }
        System.out.println("The new sentence is: "+newsen);
    }
}
