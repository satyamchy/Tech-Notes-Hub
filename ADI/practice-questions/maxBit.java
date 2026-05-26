class maxBit{
    public static void main(String []args){
        //8  -- 2 pow 3 = ans 9
         int n = 8;
         int cnt = 0;
         while(n!=0){
            cnt++;
            n = n>>1;
         }
         System.out.println(Math.pow(2, cnt));

        
    }
}