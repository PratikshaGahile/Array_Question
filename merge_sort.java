package Searching_Sorting;

public class merge_sort {
    static void divide(int arr[],int si , int ei) {

        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }

    static void conqure(int arr[],int si , int mid , int ei ){

        //it contain th ethree while loop
        //1 for compairing the left and rigth part and place element at teh merged array
        //2 for checking the idx < mid and put all element at the
        //3 for paced the idx2 which start from th emid + 1 put it into th emerged array
        int merged []=new int [ei-si+1];
        int idx1 = si ;
        int idx2 = mid+1 ;
        int x =0 ;
        while (idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
               merged[x]=arr[idx1];
               x++;
               idx1++;
            }
        }
        while (idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }

        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        // copy all element from the aerged to array of size n
        for(int i = 0,j=si; i<merged.length;i++,j++){
            arr[j]=merged[i];

        }

    }
    public static void main(String[] args) {
        int arr []={6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
