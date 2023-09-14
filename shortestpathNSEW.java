import java.util.*;

public class shortestpathNSEW {
    public static void distance(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);s
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            } else {
                System.out.print("Unknown element");
            }
        }
        System.out.println("X direction is: " + x);
        System.out.println("Y direction is: " + y);
        int xx = x * x;
        int yy = y * y;
        int xy = xx + yy;
        double final_value = Math.sqrt(xy);
        System.out.println("Shortest distance is : " + final_value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();
        distance(dir);
    }
}
