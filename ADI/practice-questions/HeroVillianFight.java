class HeroVillianFight{
    public static void main(String []args){
        // hero always win problem
        int arr[] = {3, 1, 2, 2, 3};
        int N = 5, M = 3, H = 3;

        //int arr[] = {3, 2, 2, 1};
        //  M = 2 ,H =5;
        //int arr[] = {3, 1, 2};
        //int M = 1, H = 3;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==H && M > 0){
             M-=1;
           }
           else if(arr[i] > H && M > 0){
             M-=1;
             i--;
           }
           else if(M > 0 && H){
            H-= arr[i];
           }
           else{
            ans = N-i;
           }
        }
      System.out.println(ans);
      }
    }
}