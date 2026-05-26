class fabonacci{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
    int n = 5;
         System.out.println(fab(n));

      
    }
     static int fab(int n){

         if(n==1 || n==0) return n;
            return fab(n-1)+fab(n-2);
        }
}