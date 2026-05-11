// this is for DSA segment
// Array->
// Stores the elemnts of same data type in it
// syntax for array

public class arr{

    public static void main(String[] args) {
       
        int arr[] = {10,20,30};//declaration+allocation+initialization
        //two loops can be used to print values,for each and for
        int size = arr.length;
        for(int val  :arr){//for each
            System.out.println(val);
        }
        for (int i = 0; i<=size-1;i++){//with for loop
            System.out.println("Elements are :"+arr[i]);
        }
}
    }
