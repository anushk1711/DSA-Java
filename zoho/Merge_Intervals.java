import java.util.*;

public class Merge_Intervals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
            intervals[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); //sorts the array which compares two intervals at a time 
        //if result < 0 --> a comes before b || result > 0 --> b comes before a || result == 0 then both are considered equal in sort order

        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
        int[] current = intervals[i];
        int[] last = result.get(result.size()-1);
        
        if(current[0] <= last[1]){
            last[1] = Math.max(last[1],current[1]);
        }else{
            result.add(current);
        }

        }

        int[][] ans = new int[result.size()][2];

        for(int i=0;i<result.size();i++){
            ans[i] = result.get(i);
        }

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }

         
    }
}