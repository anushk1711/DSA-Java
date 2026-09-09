public class SecondLargest {

    public static int Solution(int[] a,int n){
            int largest = a[0];
            int secLarge = -1;
        for(int i=1;i<n;i++){
            if(a[i] > largest){
                secLarge = largest;
                largest = a[i];
            }
             if(a[i] < largest && a[i] > secLarge){
                secLarge = a[i];
             }
        }
        return secLarge;
    }
    public static void main(String[] args){
        
        int[] a = {6,6,6,6,6};
        int n = a.length;

        System.out.print(Solution(a,n));
    }
}
