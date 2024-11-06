import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    problem1();
  }

  public static void problem1()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an int");
    int num1= scan.nextInt();
    System.out.println("Enter another int");
    int num2= scan.nextInt();
    while (num1<=num2)
    {
      if (num1%2==1)
      {
        System.out.println(num1);
        
      }
      num1++;
    }
  }

  public static void problem2()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive int");
    int num= scan.nextInt();
    int multiply=1;
    while(num>0)
    {
      System.out.println(num%10)
      num/=10

    }
  }
}
