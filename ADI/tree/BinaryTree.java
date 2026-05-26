
class Node{
    Node left;
    int data;
    Node right;
    Node(int d){  
        data=d;
        left=right=null;
    }

    //  Node build(){
    //     System.out.print("Enter next");
    //     Scanner sc=new Scanner(System.in);
    //     int d=sc.nextInt();
    //     if(d==-1)return null;
    //     Node n=new Node(d);
    //     n.left=build();
    //     n.right=build();
    //     return n;
        
    // }
    void print(Node n1){
        if(n1==null) return;
        System.out.println(n1.data);
        print(n1.left);
        print(n1.right);
    }


}

// Class BinaryTree{
//    Node root;
//    BinaryTree(){
//     root = null;
//    }

//    Node createNode(int data){
//     return new Node(data);
//    }
//    void insert(Node node, int data){
//     if(node==null){
//          this.node = createNode(data);
//          return;
//     } 
//    }    
// }
class BinaryTree{
    public static void main(String[] args){

    Node n1 =new Node(1);
    n1.left = new Node(2);
    n1.right = new Node(3);
    //     BinaryTree tree = new BinaryTree();
    //    tree.insert( tree.root , 10);
    //    tree.insert( tree.root  , 20);
    //    tree.insert( tree.root , 30);
    //    tree.insert(  tree.root , 40);
    //    tree.insert(  tree.root , 50);
    
       n1.print(n1);

    }
}