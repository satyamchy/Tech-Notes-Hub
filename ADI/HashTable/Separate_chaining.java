import java.util.*;
// class Table{

//     void insert(){
//         int n = sc.nextInt();
//         int key = n%size();
//         arr[key].add(n);
//     }

//     void search(){
//         int key = n%size;
//         arr[key].contains(n);
//     }
// }


public class World { 
    public static void main(String[] args){
                System.out.println("Hello World");

    //     int arr[9][] = new int[][];
    //    int arr[] = new int[10];
        LinkedList<Integer> arr[] = new LinkedList[10];
       for(int i=0;i<10;i++) arr[i]=new LinkedList<>();

       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();

       while(t-- > 0){
        int n = sc.nextInt();
        int  k = n%10;
        arr[k].add(n);
       }

       for (int i = 0; i < 10; i++) {
            System.out.println("List at index " + i + ": " + arr[i]);
        }
   sc.close();
    }
}