import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= s.nextInt();
        if(isPrime(num)) {
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
    static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return false;
       }
       return true;
    }
}