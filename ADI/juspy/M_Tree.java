class Pair{
    int id;
    String name;
    int uid;
    Pair(int id, int name, int uid){
        this.id = id;
        this.name = name;
        this.uid = uid;
    }
}
class TreeNode{
    String node;
    TreeNode parent = null;
    boolean isLocked = false;
    Integer lockedBy = null;
    // int lockedBy;
    List<Integer> list;
    int lockedChildren = 0;
    TreeNode(String name, String parent){
        this.node = name;
        this.parent = parent;
        this.isLocked = false;
        this.lockedBy = null;
        this.list = new ArrayList<>();
        this.lockedChildren = 0;
    }
}
class M_Tree_Nodes{
    int m;
    Map<String, TreeNode> mp;
    M_Tree_Nodes(int m){
        m = this.m;
        mp =  new HashMap<>();
    }
    public void addNode(String name, String parent){
       TreeNode parent = mp.get(parent);
       //if(parent!null || parent.)
        mp.add(name, new TreeNode(name , parent));
    }
    boolean lock(String name, int uid){
        TreeNode node = mp.get(name);
        if(node==null || node.isLocked  ){
              return false;
        }
        node.isLocked = true;
        node.lockedBy = uid;

        return true;
    }
}
class M_Tree{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int N = 7; //scan.nextInt();
        int M = 2; // scan.nextInt(); // childs of a node
        int Q = 3; //scan.nextInt();
        //ArrayList<Integer> items = new ArrayList<>();
        // for(int i=0;i<N;i++){
        // items.add(scan.nextLine());
        // }
        M_Tree_Nodes tree = new M_Tree_Nodes(M);
        int arr[] = {"World", "Asia", "China", "India", "Africa","Egypt","SouthAfrica"};
        //TreeNode parent = null;
        for(int i=0;i<N;i++){
             //tree.addNode(items.get(i));
             tree.addNode(arr[i], tree[(i-1)/2]);
        }
        ArrayList<Pair> queries = new ArrayList<>();
        // for(int i=0;i<N;i++){
        //     list.add(new Pair(sc.nextInt(), sc.next(), sc.nextInt()));
        // }
        queries.add(new Pair(1, China, 9));
        queries.add(new Pair(1, India, 9));
        queries.add(new Pair(3, Asia, 9));
        queries.add(new Pair(2, China, 9));
        queries.add(new Pair(2, India, 9));
        for(Pair p: list){
            int id = p.id;
            String name = p.name;
            int uid = p.uid;
            boolean answer = false;
            if(id==1){
                answer = tree.lock(name, uid);
            }
            else if(id==2){
                answer = tree.unlock(name, uid);
            }
            else if(id==3){
                answer = tree.upgrade(name, uid);
            }
            System.out.println(answer);
        }
    }
}