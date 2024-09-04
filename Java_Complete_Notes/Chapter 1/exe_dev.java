/// my Question si///
// Write a Program to Calculate percentage
//  of a given Student in CBSE board exam.
//   His marks from 5 Subjects must be taken
// as input from the keyboard. (Marks are 
// out of 100).


import java.util.Scanner;
public class exe_dev {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.print("enter your name -: ");
        String name = sc.nextLine();
        System.out.print(name);
        System.out.println(" is your name");

        System.out.print("enter gk marks -: ");
        int a=sc.nextInt();

        System.out.print("enter english marks -: ");
        int b=sc.nextInt();

        System.out.print("enter maths marks -: ");
        int c=sc.nextInt();

        System.out.print("enter science marks -: ");
        int d=sc.nextInt();

        System.out.print("enter sst marks -: ");
        int e=sc.nextInt();
        System.out.println();

        int sum=a+b+c+d+e;

 
        System.out.print("the total marks of ");
        System.out.print(name);
        System.out.print(" in 5 sub out of 500 marks is-: ");  
        System.out.println(sum );


        System.out.print("and the persent is -: ");
        int per = (sum*100/500);
        
        System.out.println(per);
    }
}
