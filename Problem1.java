import java.util.*;

class Problem1{
    public static void main(String[] agrs) {

        double a, b;
        String d = "ADD", e = "SUB", f = "MUL", g = "DIV";

        Scanner sc = new Scanner(System.in);

       /* double add(a, b);{
            return a + b;
        }*/
        System.out.println(" Operations : ADD, SUB, MUL, DIV ");
        System.out.print(" Enter Operation :  ");
        String c = sc.nextLine();

        if (c.equalsIgnoreCase(d) || c.equalsIgnoreCase(e) || c.equalsIgnoreCase(f) || c.equalsIgnoreCase(g)){

            System.out.print(" Enter First Value : ");
            a = sc.nextDouble();
            
            System.out.print(" Enter Second Value : ");
            b = sc.nextDouble();
            
            if (c.equalsIgnoreCase(d)) {
                System.out.println(" Answer : " + (a+b));
            }

            else if(c.equalsIgnoreCase(e)) {
                System.out.println(" Answer :" + (a-b));
            }

            else if (c.equalsIgnoreCase(f)) {
                System.out.println(" Answer : " + a*b);
            }

            else {
                System.out.println(" Answer : " + a/b);
            }
        }
        else{
            System.out.println(" !!! Please Enter Proper Operation !!! ");
        }

        sc.close();
    }
}