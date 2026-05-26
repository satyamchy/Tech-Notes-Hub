 
 import java.util.*;
class sort_using_recursion {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        System.out.println("sort stack :---- ");
        
        sort_stack( s);
        System.out.println(s);

    }

    static void sort_stack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int temp = s.pop();
        sort_stack(s);
    }


}