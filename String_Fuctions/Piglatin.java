import java.util.Scanner;
class Piglatin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter a word");
        String s = in.nextLine();      
        //to find the position of first vowel
        int i;
        for(i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            ch = Character.toUppercase(ch);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                c++;
                break; //means vowel is found at i
            }
        }
        if (c>0){
            String f = s.substring(i) + s.substring(0,i) + "ay";
            System.out.println(f);
        }
        else{
            System.out.println("As there is no vowel piglatin of this word is not possible.");
        }
    }
}

