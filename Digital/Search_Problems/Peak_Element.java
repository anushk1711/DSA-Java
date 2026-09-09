
public class Peak_Element{
    public static int peakElement(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = low+(high-low)/2;

            if(arr[mid] < arr[mid+1]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;// returning low because loop ends when low == high
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int result = peakElement(arr);

        System.out.print(result);
    }
}