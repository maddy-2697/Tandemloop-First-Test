import java.util.*;

class Problem4 {
    public static void main(String[] args) {
        int countr = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(" List of Multiples : [1,2,3,4,5,6,7,8,9] ");

        System.out.print(" Enter Size of List : ");
        int a = sc.nextInt();

        int[] arr1 = new int[a];

        System.out.print(" Enter List Elements : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print(" Your List Elements : [ ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("]");

        System.out.print(" Output of List : [ ");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ":");
            
            for (int j = 0; j < arr1.length; j++) {
                int b = arr1[j];
                
                if (b % i == 0) {
                    //System.out.println("Yes");
                    countr += 1;
                }
            }
            System.out.print(countr + " ");
            countr = 0;
        }
        System.out.print("]");
        sc.close();
    }
}
