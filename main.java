import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a , b ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a+b);

        float x , y , z ;
        System.out.println("Enter 3 numbers:");
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        z = scanner.nextFloat();
        float result = (x + y + z)/3 ;
        System.out.println("Avrage is:");
        System.out.printf("%.2f" , result);
    }
}
