class mergeArray{
    public static void main(String []args){
        int arr1[] = {5,6,7,8,9,10};
        int arr2[] ={1,3,11,17,19,21};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int tlen = arr1.length + arr2.length;
        int res[] = new int[tlen];

         // int p=0;int q=0;
        // for(int i=0;i<tlen;i++){
        //     if(p>=arr1.length  || q >= arr2.length){
        //      if(p>=arr1.length){
        //         res[i]=arr2[q++];
        //      }
        //      else{
        //             res[i] = arr1[p++];
        //         }
        //     }
        //     else if(arr1[p]>arr2[q]){
        //        res[i] = arr2[q++];
        //     }
        //     else if(arr1[p] < arr2[q]){
        //        res[i] = arr1[p++];
        //     }
           
        // }

        int arr3[] = new int[tlen];
        int i=0,j=0,k=0;
         //merging two sorted array 
         while(i<l1 && j<l2){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
         }
         while(i<l1){
            arr3[k++] = arr1[i++];
         }
         while(j<l2){
            arr3[k++] = arr2[j++];
         }
         


        for(int ia=0; ia<arr3.length ;ia++){
            System.out.print(arr3[ia]+ " ");
        }
    }
   
}