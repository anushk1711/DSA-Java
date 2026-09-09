import java.util.*;

public class Union_Intersectn_Except{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : a){
            set.add(num);
        }

        for(int num : b){
            set.add(num);
        }

        System.out.println( "Union " +  set);

        System.out.print("Intersection ");


        for(int num : b){
            if(set.contains(num)){
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.print("Except ");

        for(int num :  a){
            if(num%2 != 0){
                System.out.print(num + " ");
            }
        }

        for(int num : b){
            if(num%2 == 0){
                System.out.print(num + " ");

            }
        }
    }
}