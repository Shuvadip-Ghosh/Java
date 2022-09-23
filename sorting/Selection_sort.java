
public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = {7,8,1,3,2};
        for(int i=0;i<arr.length-1;i++){
            int s=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[s]>arr[j]){
                    s=j;
                }
            }
            int temp = arr[s];
            arr[s] =arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
