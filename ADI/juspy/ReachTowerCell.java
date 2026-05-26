
import java.util.*;
class ReachTowerCell{
    static int findTowerPath(int n, int []A1, int [][]A2, int M){
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        for(int i=0;i<=n;i++){
           list.add(new ArrayList<>());
        }
        for(int i=0;i<A2.length;i++){
         list.get(A2[i][0]).add(A2[i][1]);
         list.get(A2[i][1]).add(A2[i][0]);
        } 
        for(int i=0;i<=n;i++){
            System.out.println(i + "  " +list.get(i));
        } 
        int ans =  dfs(list, 1 , -1, A1, 0, M);
          return ans;
    }
    static int dfs(ArrayList<ArrayList<Integer>> list, int node, int parent, int[] A1,int obstacle, int M){
          
          if(A1[node-1] ==1){
            obstacle++;
          }
          else {
            obstacle = 0;
          }
           if(obstacle >M){
            return 0;
          }
          
          int safeLeaves = 0;
          boolean isLeaf = true;
          for(Integer i:list.get(node)){
            if(i!=parent){
                isLeaf = false;
               safeLeaves+=dfs(list, i, node, A1, obstacle, M);    
            }
              
          }
          return isLeaf?1:safeLeaves;
    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int N = 7;// sc.nextInt();
    int M = 1;// sc.nextInt();
    int K =6;// sc.nextInt();
    //int A1[] = new int[N];
       int A1[] = {1,0,1,1,0,0,0};
       //int A1[] = {0,0,0,1,0,0,0};
    // for(int i=0;i<N;i++){
    //     A1[i] = sc.nextInt();
    // }
   // int A2[][] = new int[][];
       int A2[][]  ={{1,2},{1,3},{2,4},{2,5},{3,6},{3,7}};
    // for(int i=0;i<K;i++){
    //     A2[i][0] = sc.nextInt();
    //     A2[i][1] = sc.nextInt();
    // }
    int result = findTowerPath(N, A1, A2, M);
    System.out.println(result);
        }
}