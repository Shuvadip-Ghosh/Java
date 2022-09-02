// Wap a program to print this pattern
// 70 71 72 73 74
//    78 77 76 75
//       79 80 81
//          82 83
//             84

public class Pattern1 {
    public static void main(String[] args) {
        int l=9,s=l-2,n = 70,r=9,num=0;
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("   ");
            }
            for (int j = l; j >=1; j--) {
                if (i % 2 != 0) {
                    System.out.print(n+" ");
                    n++;
                }
                else{
                    System.out.print(n+" ");
                    n--;
                }
            }
            if (i%2 !=0){
                n = n+s;
                num = n;
                s-=2;
            } 
            else
                n = num +1;
            l--;
            System.out.println();
        }
    }
}