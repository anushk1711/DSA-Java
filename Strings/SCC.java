import java.util.*;
public class SCC {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		
		int i=0;
		
		int sign = 1;
		if(i<str.length() && str.charAt(i) == '-'){
		    sign = -1;
		    i++;
		}
		
		int result = 0;
		while(i < str.length() && Character.isDigit(str.charAt(i))){
		    result = result*10+(str.charAt(i) - '0');
		    i++;
		}
		
		result = result*sign;
		
		while(i < str.length()){
		    char op = str.charAt(i);
		    i++;
            
		sign = 1;
		if(i<str.length() && str.charAt(i) == '-'){
		    sign = -1;
		    i++;
		}
		
		int num = 0;
		while(i < str.length() && Character.isDigit(str.charAt(i))){
		    num = num*10+(str.charAt(i) - '0');
		    i++;
		}
		
		num = num*sign;
		    
		    if(op == 'A' || op == 'a'){
		        result = result + num;
		    }else if(op == 'S' || op == 's'){
		        result = result - num;
		    }
		    else if(op == 'M' || op == 'm'){
		        result = result*num;
		    }else if(op == 'D' || op == 'd'){
		        result = result/num;
		    }
		}
		System.out.print(result);

	}
}