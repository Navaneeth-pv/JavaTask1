import java.util.Scanner;

public class CreateTriangle {

    public static void main(String[] args){

        int a,b,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();

        for (a = 1; a <=n; a++)
        {
            for (b = 1; b <=a; b++)
                System.out.println(a);
            System.out.println("");
        }
    }
}