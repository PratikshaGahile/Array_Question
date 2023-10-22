package Searching_Sorting;

public class InsertionSort {

    static void insertion_Sort(int arr[],int n ){
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //actual placement of the element
            arr[j+1]=current;


        }
        for(int a :arr){
            System.out.print(a+" ");
        }


    }
    public static void main(String[] args) {

        int arr[]={7,8,3,2,1};
        int n = arr.length;
        insertion_Sort(arr,n);

    }
}
