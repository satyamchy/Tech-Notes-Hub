class QuickSort{
    public static void main(String []args){
        int arr[] = {1,3,12,13,17,5,61,7,81,19,20, 11};
        int n = arr.length;
        //int pivot =arr[arr.length-1];
        //int left =0, right = arr.length-1;
        quickSort(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void  quickSort(int arr[], int left, int right){
        if(left<right){
        int pivot =partition(arr, left, right);
          quickSort(arr, left, pivot-1);
          quickSort(arr, pivot+1, right);
        }
    }

    static int partition(int arr[], int left, int right){
      int pivot = arr[left];
        int i = left, j = right;

          while(i<j){
            while(arr[i] <= pivot && i<=right-1){
              i++;
            }
            while(arr[j] > pivot && j>=left+1){
              j--;
            }
           if(i < j){
            swap(arr, i, j);
           }
          }
          swap(arr, left, j);
     return j;

    //     int l = left-1;
    //   int k = arr[left];
    //    for(int i=left;i<=right;i++){
    //     if(arr[i]<=k){
    //     swap(arr, i, l+1 );         //arr[i], arr[l+1]);
    //     //System.out.println(arr[i]+" "+arr[l+1]);
    //     l++;
    // }
    //   swap(arr, right,  l+1 ); //arr[n-1], arr[l+1]);
    //   }
    //   return l+1;
    }

    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}