import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        //Sum of two
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int num1 = scanner.nextInt();
        // System.out.print("Enter second number: ");
        // int num2 = scanner.nextInt();
        // int sum = num1 + num2;
        // System.out.println("Sum: " + sum);

        //Even or Odd
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num=scanner.nextInt();
        // if(num % 2 == 0){
        //     System.out.print("Even");
        // }else{
        //     System.out.print("Odd");
        // }

        //Factorial
        // Scanner scanner=new Scanner(System.in);
        // System.out.print("Enter the Number for Factorial : ");
        // int num = scanner.nextInt();
        // int factorial = 1;
        // for (int i = 2; i <= num; i++) {
        //     factorial *= i;
        // }
        // System.out.print("Factorial is "+factorial);

        //Fabonacci Series
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the Number of terms : ");
        // int num = scanner.nextInt();

        // int a = 0, b = 1;
        // System.out.print("Fibonacci Series: " + a + " " + b);

        // for (int i = 2; i < num; i++) {
        //     int next = a + b;
        //     System.out.print(" " + next);
        //     a = b;
        //     b = next;
        // }


        //Prime Number
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int num = scanner.nextInt();
    //     boolean isPrime = true;

    //     if (num <= 1) {
    //         isPrime = false;
    //     } else {
    //         for (int i = 2; i <= num/2; i++) {
    //             if (num % i == 0) {
    //                 isPrime = false;
    //                 break;
    //             }
    //         }
    //     }

    //     if (isPrime) {
    //         System.out.println(num + " is a prime number.");
    //     } else {
    //         System.out.println(num + " is not a prime number.");
    //     }
    // }
    


    // Reverse A number
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter the Number : ");
    // int num = scanner.nextInt();
    //     int reversed = 0;
    // while (num != 0){
    //     int digit = num % 10;
    //     reversed = reversed * 10 + digit;
    //     num /= 10;
    // }
    // System.out.println("Reverse Number is : "+ reversed );

    //ArmStrong Number
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter the Number : ");
    // int num = scanner.nextInt();
    // int x = 0;
    // int y= num;
    // while(num!=0){
    //     int d = num % 10;
    //     x = x +(d*d*d);
    //     num /= 10;
    // }
    // if (x == y){
    //     System.out.print("true");
    // }else{
    //     System.out.print("false");
    // }
        

    // Sum Of Digits
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int num = scanner.nextInt();
    // int sum = 0;
    // while(num != 0){
    //     int digit = num % 10;
    //     sum = sum + digit;
    //     num /= 10;
    // }
    // System.out.print("Sum is : " + sum);



    // //GCD
    // Scanner scanner= new Scanner(System.in);
    // System.out.print("Enter the first number : ");
    // int num1= scanner.nextInt();
    // System.out.print("Enter second Number : ");
    // int num2 = scanner.nextInt();
    // while (num2 != 0) {
    //     int temp = num2;
    //     num2 = num1 % num2;
    //     num1 = temp;
    // }
    // System.out.println("GCD : "+ num1);
    }
}