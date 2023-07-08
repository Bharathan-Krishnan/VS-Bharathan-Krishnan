import java.util.*;
public class Location {
	public static int findIndex(int array[], int t)
	{
		if (array == null) {
			return -1;
		}
		int length = array.length;
		int i = 0;
		while (i < length) {
			if (array[i] == t) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array values :  ");
        for (int i=0; i<n; i++) {
            int e = s.nextInt();
            array[i] = e;
        }
        System.out.print("Enter the element you want to search for : ");
        int k=s.nextInt();
        int res=findIndex(array, k);
        if (res==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index "+res);
        }
	}
}
