import java.util.Scanner;

class Sorting {
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
        ascending(array);
        System.out.println("Elements in ascending order : ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        descending(array);
        System.out.println("Elements in descending order : ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    static int ascending(int nlist[]){
        int length = nlist.length;
        for (int i = 0; i < length; i++) {     
            for (int j = i+1; j < length; j++) {     
               if(nlist[i] > nlist[j]) {    
                   int temp = nlist[i];    
                   nlist[i] = nlist[j];    
                   nlist[j] = temp;    
               }     
            }     
        }
        return 0;   
    }
    static int descending(int nlist[]){
        int length = nlist.length;
        for (int i = 0; i < length; i++) {     
            for (int j = i+1; j < length; j++) {     
               if(nlist[i] < nlist[j]) {    
                   int temp = nlist[i];    
                   nlist[i] = nlist[j];    
                   nlist[j] = temp;    
               }     
            }     
        }
        return 0;   
    }
}

