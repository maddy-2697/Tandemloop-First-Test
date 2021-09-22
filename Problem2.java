import java.util.*;

class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Value : ");
        int a = sc.nextInt();
        int x = 2*a;

        System.out.print(" Series of Numbers : ");
        for (int i = 1; i <= x; i++){

            if (i % 2 != 0){
                System.out.print(" " + i + " ");
            }
        }

        sc.close();
    }
}
