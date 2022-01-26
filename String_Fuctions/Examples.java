public class Examples {
    public static void main(String[] args) {
        String st = "This is a sample Text.";
        System.out.println(st);
        
        // length
        int len = st.length();
        System.out.println("The length of the string is :"+ len+ " characters");
        System.out.println("--------------------------------------------------");
        
        // char at
        for(int i=0;i<len;i++){
            char ch = st.charAt(i);
            System.out.println("The character at index "+i+" is: "+ch);
        }
        System.out.println("--------------------------------------------------");
        
        // index of 
        int in = st.indexOf("T");
        System.out.println("The Index of T in this sentence is "+in);
        System.out.println("--------------------------------------------------");
        
        // substring (start to end)
        String s = st.substring(4);
        System.out.println("The String from Index 4 till the end is \n"+s);
        System.out.println("--------------------------------------------------");
        
        // substring (start index to stop index.)
        String s1 = st.substring(4,9);
        System.out.println("The String from Index 4 till the index 9 is \n"+s1);
        System.out.println("--------------------------------------------------");

        // toLowerCase
        String s2 = st.toLowerCase();
        System.out.println("String in Lower Case");
        System.out.println(s2);
        System.out.println("--------------------------------------------------");

        // toUpperCase
        String s3 = st.toUpperCase();
        System.out.println("String in Lower Case");
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
        System.out.println("--------------------------------------------------");

        // equalsIgnoreCase
        System.out.println("--------------------------------------------------");

        // trim 
        System.out.println("--------------------------------------------------");

        // endsWith 
        System.out.println("--------------------------------------------------");

        // startsWith
        System.out.println("--------------------------------------------------");
    }
}
