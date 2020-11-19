import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        
        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        
        k = k % nod;
        if (k < 0) {
            k += nod;
        }
        int div = 1;
        int mult = 1;
        int r, q;
        
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div *= 10;    
            } else {
                mult *= 10;
            }
        }
        r = n % div;
        q = n / div;
        
        int rot_num = mult * r + q;
        System.out.println(rot_num);
    }
}