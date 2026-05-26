import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        System.out.println("reversed stack :---- ");
        
        reverse( s);
        System.out.println(s);

    }
    
    static  void reverse(Stack<Integer> s){
        
           if(s.isEmpty()) {
            return;
        }
        int temp = s.pop();  
           reverse(s);
           insert_at_bottom(s,temp);
            // s.push(temp);
        
    }
    
       static  void insert_at_bottom(Stack<Integer> s, int x){
        if(s.isEmpty()) {
            s.push(x);
            return;
        }
        else{
            int temp = s.pop();
             insert_bottom(s,x);
             s.push(temp);
        }
    }
}