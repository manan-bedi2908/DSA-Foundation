import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        while (low <= high) {
            boolean flag = false;
            
            for (int i = 2; i*i <= low; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(low);
            }
            ++low;
        }
    }
}