import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int first = 0;
        int second = 1;
        System.out.println(first);
        
        for (int i = 2; i <= num; i++){
            System.out.println(second);
            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}