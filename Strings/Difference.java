import java.util.*;
public class Difference {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		
		int rup1 = sc.nextInt();
		int rup2 = sc.nextInt();
		int w1 = sc.nextInt();
		int w2 = sc.nextInt();
		
		double land1 = (rup1/5.0)/w1;
		double land2 = (rup2/5.0)/w2;
		
		double result = land1 - land2;
		
		if(result < 0){
		    result = result*-1;
		}
		    System.out.printf("%.2f",result);
		

	}
}