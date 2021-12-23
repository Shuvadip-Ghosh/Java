public class Perfect{
    public static void main(String[]args){
        int s=0,n=6,i=1;
        for(i=1;i<n;i++){
            if(n%i == 0)
                s=s+i;
        }
        if(s==n)
            System.out.println(n+" is a perfect number");
        int s1=0,n1=6,i1=1;
        while(i1<n1){
            if (n1%i1==0){
                s1+=i1;
            }
            i1++;
        }
        if (s1==n1){
            System.out.println(n+" is a perfect number");
        }

    }
}
