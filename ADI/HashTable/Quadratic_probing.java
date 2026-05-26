// import java.io;
// import java.lang;
import java.util.*;
class QP{
    int size = 10;
    int table[] = new int[10];
  QP(){
      for(int i=0;i<10;i++) table[i]=-1;
  }

void insert(int n){
   int key = n%10;
   int i=1;
   while(table[(key+(int)Math.pow(i,2))%10]!=-1){
               i++;
   }
    System.out.println(Math.pow(i,2));
   table[(key+(int)Math.pow(i,2))%10] = n;
}
//  search(n){
//       int index = n%size;
//         while(table[index]!=-1){
//             if(table[index]==n){
//                 return true;
//             }
//         }
//         return false;
//     }
// void delete(int n){
//    index = n%size;
//    while(table[index]!=-1){
//     if(table[index]==n){
//         table[index]=-2;
//         break;
//     }
//    }
//    index  = (index+1)%size;
// }
 void print(){
  for(int i=0;i<10 ; i++) System.out.println("At "+ i + ":---" + table[i]);
 }
}

class Quadratic_probing{

public static void main(String []args){

  QP e = new QP();
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();

 while(t-- > 0){
     int n = sc.nextInt();
     e.insert(n);
 }

   e.print();
    int s = sc.nextInt();
    System.out.println(e.search(s));

    int d = sc.nextInt();
    e.delete();
 }
}