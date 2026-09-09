
import java.util.Scanner;


class TowerLineSightIssue{
        static boolean onSegment(int x1, int y1, int x2, int y2, int x, int y){
            if((x2-x1)*(y-y1) != (y2-y1)*(x-x1)){
                return false;
            }

            if(x>=Math.min(x1,x2) && x<=Math.max(x1,x2) && y>=Math.min(y1,y2) && y<=Math.max(y1,y2)){
                return true;
            }

            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();

        if(onSegment(ax,ay,cx,cy,bx,by)){
            System.out.println("yes");
        }
        else if(onSegment(ax,ay,cx,cy,dx,dy)){
            System.out.println("yes");
        }
        else if(onSegment(bx,by,dx,dy,ax,ay)){
            System.out.println("yes");
        }
        else if(onSegment(bx,by,dx,dy,cx,cy)){
            System.out.println("yes");
        }else
            System.out.println("no");
        

    }
}