import java.util.*;

public class Merge_Sorted_Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[m];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        
        int k = 0;
        int[] result = new int[n+m];

        int i=0;
        int j=0;

        while(i<arr.length && j<arr2.length){
            if(arr[i] < arr2[j]){
                result[k] = arr[i];
                i++;
                k++;
            }else if(arr2[j] < arr[i]){
                result[k] = arr2[j];
                j++;
                k++;
            }else {
                result[k] = arr[i];
                k++;
                result[k] = arr2[j];
                k++;
            }
        }

        while(i < arr.length){
    result[k] = arr[i];
    i++;
    k++;
}

while(j < arr2.length){
    result[k] = arr2[j];
    j++;
    k++;
}

       int  h = n+m;
        for(int e=0;e<h;e++){
            System.out.print(result[e] + " ");
        }
    }
}