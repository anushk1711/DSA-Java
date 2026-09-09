import java.util.*;
class Anagram{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.nextLine();
char[] a = s1.toCharArray();
char[] b = s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
System.out.println(Arrays.equals(a,b) ? "Anagram" : "Not Anagram");}
}