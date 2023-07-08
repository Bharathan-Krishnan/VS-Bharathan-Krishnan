import java.util.Scanner;

class Average {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array values :  ");
        for (int i=0; i<n; i++) {
            int e = s.nextInt();
            array[i] = e;
        }
        int a = avg(array);
        System.out.print("Average is : "+a);
    }
    static int avg(int nlist[]){
        int length = nlist.length;
        int sum=0;
        for(int i=0; i<length; i++){
            sum+=nlist[i];
        }
        int a=sum/length;
        return a;
    }
}
