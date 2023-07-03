
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // integer
        int a,b,c;
        Scanner bob = new Scanner(System.in);

        System.out.print("edge1:");
        a = bob.nextInt();
        System.out.print("edge 2");
        b=bob.nextInt();
        System.out.print("edge 3");
        c=bob.nextInt();
        
        double 𝑢 = (a+b+c)/2;
        double area = 𝑢*(𝑢-a)*(𝑢-b)*(𝑢-c);
        System.out.println(area);

    } }