package Searching_Sorting;

public class Quick_Sort {
    static  void quicksort(int arr[],int low ,int high ){
        if(low<high){
            int pivotIndx= partition(arr,low,high);
            quicksort(arr,low,pivotIndx-1);
            quicksort(arr,pivotIndx+1,high);
        }

    }

    static int partition(int arr[],int low ,int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j =0;j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //actual placement of the pivot element
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        System.out.println(i+1);

        return i+1;
    }
    public static void main(String[] args) {
        int arr []={6,3,9,5,2,8};
        int low = 0;
        int high=arr.length-1;
        quicksort(arr,low,high);
        for(int a : arr){
            System.out.print(a+" ");
        }

    }
}
