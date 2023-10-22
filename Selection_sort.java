package Searching_Sorting;

public class Selection_sort {
    static  void selectionsort(int arr[],int n ){
        //find the smallest element and put it at the first

        for(int i=0 ; i<n;i++){
            int smallest= i ;
            for(int j=i+1; j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        for(int a: arr){
            System.out.print(a+" ");
        }

    }
    public static void main(String[] args) {
     int arr []={7,8,3,1,12,3,1,8,4,10,2};
     selectionsort(arr,arr.length);
    }
}
