import java.util.*;
class LinearSearch{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n; i++)
arr[i] = sc.nextInt();
int key = sc.nextInt();
boolean found = false;
for(int num : arr){
if(num == key){
found = true;
break;
}
}
System.out.println(found ? "Found" : "Not Found");
}
}