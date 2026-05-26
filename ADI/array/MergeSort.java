class MergeSort{
    public static void main(String []args){
        int arr[] = {1,3,12,13,17,5,61,7,81,19,20,11};
    
        mergeSort(arr, 0, arr.length-1);
       for(int i: arr){
        System.out.print(i +" ");
       } 
    }
    static void mergeSort(int arr[], int l, int h){
        if(l<h){
           int mid = (l+h)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, h);
            merge(arr, l, mid, h);
        }
    }
   static void merge(int arr[] ,int l, int mid, int h){
         int arr3[] = new int[h-l+1];
       
         int i=l,j=mid+1,k=0;
         //merging two sorted array 
         while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                arr3[k++] = arr[i++];
            }
            else{
                arr3[k++] = arr[j++];
            }
         }
         while(i<=mid){
            arr3[k++] = arr[i++];
         }
         while(j<=h){
            arr3[k++] = arr[j++];
         }
         int temp = 0;
          for(int a=l; a<=h;a++){
            arr[a] = arr3[temp++];
        }
        // for (int a = 0; a < arr3.length; a++) {
        //     arr[l + a] = arr3[a];
        // }
    }
}