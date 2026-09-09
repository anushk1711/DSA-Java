import java.util.Scanner;
public class HeadCountOfBird_Animal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int head = sc.nextInt();
        int legs = sc.nextInt();

        int animals = (legs - (2*head))/2;

        int birds = head - animals;

        System.out.print(birds + " " + animals);


    }
}