import java.util.Scanner;

public class pr_dev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("if you want the sum enter the number");
        System.out.print("type 1 number -: ");
        int a1= sc.nextInt();
        System.out.print("type 2 number -: ");
        int a2= sc.nextInt();
        System.out.println("your ans is");
        int a=a1+a2;
        System.out.println(a); 
             
    }
}