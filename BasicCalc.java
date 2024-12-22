import java.util.Scanner;

public class BasicCalc {

    public static void add(int a  , int b){
        System.out.println("\n" + a+ " + " + b + " = " +(a+b) +"\n" );
    }
    public static void sub(int a  , int b){
        System.out.println("\n" + a+ " - " + b + " = " +(a-b) +"\n" );


    }
    public static void div(int a  , int b){

        try {
            int result = a/b;
        System.out.println("\n" + a+ " / " + b + " = " + result +"\n" );
        } catch (Exception e) {
           System.out.println("\n Cannot " + e.getMessage()+"\n");
        }


    }
    public static void mul(int a  , int b){
        System.out.println("\n" + a+ " * " + b + " = " +(a*b) +"\n" );


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option ,a , b;

        do{
            System.out.println("------------------------------------------------");
            System.out.print("Select Option : ");
            System.out.print("\n Option 1 : addition ");
            System.out.print("\n Option 2 : subtraction ");
            System.out.print("\n Option 3 : multiplication ");
            System.out.println("\n Option 4: divition");
            System.out.println("------------------------------------------------");
            System.out.print("Enter Option : ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                System.out.print("Enter number 'a' : ");
                 a = sc.nextInt();
                System.out.print("\n Enter number 'b' : ");
                 b = sc.nextInt();
                    add(a, b);
                    break;
                case 2:
                System.out.print("Enter number 'a' : ");
                 a = sc.nextInt();
                System.out.print("\n Enter number 'b' : ");
                 b = sc.nextInt();
                    sub(a, b);
                    break;
                case 3:
                System.out.print("Enter number 'a' : ");
                 a = sc.nextInt();
                System.out.print("\n Enter number 'b' : ");
                 b = sc.nextInt();
                    mul(a, b);
                    break;
                case 4:
                System.out.print("Enter number 'a' : ");
                 a = sc.nextInt();
                System.out.print("\n Enter number 'b' : ");
                 b = sc.nextInt();
                    div(a, b);
                    break;
              
                default:
                    System.out.println("Invalid Option");
                    break;
              }
        }while(option < 5);
        sc.close();
    }
}
