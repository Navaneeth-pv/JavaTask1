import java.util.Scanner;

public class TemparatureConverter {
    public static void main(String arg[])
    {
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter Fahrenheit temparature");
        a=sc.nextDouble();
        System.out.println( "Celsius temparature is ="+celsius(a));
    }
    static double celsius(double f)
    {
        return (f-32)*5/9;
    }
}
