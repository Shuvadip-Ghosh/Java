public class Perfect{
    public static void main(String[]args){
        int s=0,n=6;
        for(int i =1;i<n;i++){
            if(n%i == 0)
                s=s+i;
        }
        if(s==n)
            System.out.println(n+" is a perfect number");
    }
}
