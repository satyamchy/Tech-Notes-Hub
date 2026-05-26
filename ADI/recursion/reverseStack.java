 
 import java.util.*;
class reverseStack {

    
    static void insert_at_bottom(Stack<Integer> s,  int t){
        if(s.isEmpty()){
             s.push(t);
        }
        else{
            int x = s.peek();
            s.pop();
            insert_at_bottom(s, t);
            s.push(x);
        }
    }

      static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverse(s);
        insert_at_bottom(s, temp);
        //s.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        System.out.println("reverse stack :---- ");
        
        reverse(s);
        System.out.println(s);
    }
}