package Searching_Sorting;

public class Bubble_sort {
    static  void bubbleSort(int arr[],int n){
        for(int i=0;i<n;i++){

            //it count the iterartion
            //in first iteration  one element is sort out at  the last index
            //in second  iteration does not consider the sorted part
            //  consider th lopp only for the n-i
            //compair the adjacent element and bubble out the largest elemt at the last

            for(int j =0;j<n-1-i;j++){
                //n-i decrease the count of sorted array
                if(arr[j]>arr[j+1])
                {
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a+ " ");
        }
    }

    public static void main(String[] args) {
        int arr []={7,8,3,1,2};
        int n = arr.length;

        bubbleSort(arr,n);
    }
}
