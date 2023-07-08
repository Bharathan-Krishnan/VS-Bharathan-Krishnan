import java.util.*;
class ReverseArray {  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array values :  ");
        for (int i=0; i<n; i++) {
            int e = s.nextInt();
            array[i] = e;
        }
        System.out.println("Original array: ");  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: "); 
        for (int i = array.length-1; i >= 0; i--) {  
            System.out.print(array[i] + " ");  
        }  
    }  
}  
