import java.util.Scanner;

 public class MethodCal {
     private static MethodCal r;
     private static MethodCal m;
     private static MethodCal s;
     private static MethodCal d;
     int c,mul,div,sub;
      int addition(int x, int y) {
         return c =x + y;
     }

      int mul(int x, int y) {
       return mul=x * y;
     }
     int sub(int x, int y) {
       return   sub=x * y;
     }

      int div(int x, int y) {
         return div=x / y;
     }

     public static void main(String[] arg) {
         int a, b,c;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number");
         a = sc.nextInt();
         System.out.println("Enter second number");

         b = sc.nextInt();
         System.out.println("Enter choice");
         int choice = sc.nextInt();
         MethodCal.r = new MethodCal();
         MethodCal.m = new MethodCal();
         MethodCal.s = new MethodCal();
         MethodCal.d = new MethodCal();


         switch (choice) {
             case 1:
                 r.addition(a, b);
                 System.out.println(" Addition of two numbers is : " +r.c);
                 break;
             case 2:
                 m.mul(a, b);
                 System.out.println(" multiplication of two numbers is : " + m.mul);
                 break;
             case 3:
                 s.sub(a, b);
                 System.out.println(" subtraction of two numbers is : " + s.sub);
                 break;
             case 4:
                 d.div(a, b);
                 System.out.println(" division of two numbers is : " + d.div);
                 break;
             default:
                 System.out.println("select from option");

         }
     }
 }