import java.io.*;
public class Pattern{
	public static void pattern(int num){
		int i, j, n=1;
		for(i=0; i<num; i++){
			for(j=0; j<=i; j++){
				System.out.print(n+ " ");
				n = n + 1;
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		int n = 4;
		pattern(n);
	}
}
