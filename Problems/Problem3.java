import java.util.*;

class Problem3 {
    public static void main(String[] args) {

        int countr;
        
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Value : ");
        int a = sc.nextInt();

        if (a%2 !=0) {
            countr = 1;
        } else {
            countr = 0;
        }

        int x = 2*a;
        
        System.out.print(" Series of Numbers : ");
        if (countr != 1) {
            x -= 1;
            for (int i = 1; i < x; i++){
                if (i % 2 != 0){
                    System.out.print(" " + i + " ");
                }
            }
        }
        else{
            for (int i = 1; i <= x; i++){
                if (i % 2 != 0){
                    System.out.print(" " + i + " ");
                }
            }
        }
        sc.close();
    }
}
