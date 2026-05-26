

Node insert(Node root, key){
    if(root== null) {
        return new Node(rooot);
    }
    if(key < root.data ) {
        root.left = insert(root.left, key);
    }
    if(key > root.data ) {
        root.right = insert(root.right, key);
    }
    return root;
}

void search(Node root, int key){
    if(root == null) return;
    if(root.data == key) return true;
    if(root.data > key ) search(root.left , key);
    if(root.data < key) search(root.right, key);
    
}

Node delete(Node root, int key){
    if(root== null) return null; 
    if(key < root.data) root.left = delete(root.left, key);
    else if(key > root.data) root.right = delete(root.right, key);
    else{
     if(root.left == null && root.right==null) return null;
     if(root.left == null && root.right!=null) return root.right;
     if(root.right == null && root.left!=null) return root.left;
     else{
        Node temp = root.right;
        while(temp.left!=null){
            temp = temp.left;
        }
        root.data = temp.data;
        root.right = delete(root.right, temp.data);
     }
    }
}