import java.util.Scanner;
public class Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "This is a sample Text.";
        System.out.println(st);

        // length
        int len = st.length();
        System.out.println("The length of the string is :" + len + " characters");
        System.out.println("--------------------------------------------------");

        // charAt
        for (int i = 0; i < len; i++) {
            char ch = st.charAt(i);
            System.out.println("The character at index " + i + " is: " + ch);
        }
        System.out.println("--------------------------------------------------");

        // indexOf
        int in = st.indexOf("T");
        System.out.println("The Index of T in this sentence is " + in);
        System.out.println("--------------------------------------------------");

        // substring (start to end)
        String s = st.substring(4);
        System.out.println("The String from Index 4 till the end is :-" + s);
        System.out.println("--------------------------------------------------");

        // substring (start index to stop index.)
        String s1 = st.substring(4, 9);
        System.out.println("The String from Index 4 till the index 9 is :-" + s1);
        System.out.println("--------------------------------------------------");

        // toLowerCase
        String s2 = st.toLowerCase();
        System.out.println("String in Lower Case");
        System.out.println(s2);
        System.out.println("--------------------------------------------------");

        // toUpperCase
        String s3 = st.toUpperCase();
        System.out.println("String in Upper Case");
        System.out.println(s3);
        System.out.println("--------------------------------------------------");

        // replace
        String s4 = st.replace("sample", "not sample");
        System.out.println(s4);
        System.out.println("--------------------------------------------------");

        // concat
        String s5 = st.concat(" But Very Useful.");
        System.out.println(s5);
        System.out.println("--------------------------------------------------");

        // equals
        System.out.print("Enter a sentence to be checked with "+st+" : ");
        String inn = sc.nextLine();
        boolean b = st.equals(inn);
        if (b == false)
            System.out.println(inn + " is not equal to the above sentence.");
        else
            System.out.println(inn + " is equal to the above sentence.");
        System.out.println("--------------------------------------------------");

        // equalsIgnoreCase
        System.out.print("Enter a sentence to be checked(ignoring case) with "+st+" : ");
        String inp = sc.nextLine();
        boolean b1 = st.equalsIgnoreCase(inp);
        if(b1 == true)
            System.out.println(inp + " is equal to this is not a sample text after ignoring case.");
        else
            System.out.println(inp + " is not equal to this is not a sample text after ignoring the case.");
        System.out.println("--------------------------------------------------");

        // endsWith
        boolean b2 = st.endsWith(".");
        if(b2==true)
            System.out.println("This sentence has a fullstop at the end.");
        else
            System.out.println("This sentence does not have a fullstop in the end.");
        System.out.println("--------------------------------------------------");

        // startsWith
        boolean b3 = st.startsWith(" ");
        if(b3==true)
            System.out.println("This sentence starts with a space.");
        else
            System.out.println("This sentence does not starts with a space.");
        System.out.println("--------------------------------------------------");
        sc.close();
    }
}
