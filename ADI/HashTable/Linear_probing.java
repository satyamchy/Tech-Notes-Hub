import java.util.*;
class Open{

void insert(){

}
 search(n){
      int index = n%size;
        while(table[index]!=-1){
            if(table[index]==n){
                return true;
            }
        }
        return false;
    }
void delete(int n){
   index = n%size;
   while(table[index]!=-1){
    if(table[index]==n){
        table[index]=-2;
        break;
    }
   }
   index  = (index+1)%size;
}

}

class quadratic_probing{

    public static void main(String []args){



int table[] = new int[10];
for(int i=0;i<size(); i++){

    insert(n);
    table[i] =-1;
 
    while(table[index]=-1){
            index = (index+1)%size();
            table[index] =n;
        } m
    }
}
}