class MaxHeap{    
int maxSize;
int curr;
int heap[];
MaxHeap(int n){
    maxSize = n;
    curr = -1;
    heap = new int[n];
}
void insert(int val){
    if(curr >= maxSize-1 ) return;
    curr++;
    heap[curr] = val;
    int i = curr; 
    while(i>0  && heap[i] > heap[(i-1)/2] ){
        int t = heap[i];
        heap[i] = heap[(i-1)/2];
        heap[(i-1)/2] = t;
        i = (i-1)/2;
    }
}
void delete(){
    int t = heap[0];
      heap[0]  = heap[curr];
      heap[curr] = t;
      curr--;
      heapify(0);
}  
void heapify(int i){
    int l = 2*i+1;
    int r = 2*i+2;
    int mx = i;
    if(l<mx && heap[mx] < heap[i]) mx = l;
    if(r< mx && heap[mx] < heap[r]) mx = r;
    if(i!=mx){
        int t = heap[mx];
        heap[mx] = heap[i];
        heap[i] = t;
        heapify(mx);
    }

}
void print(){
    for(int i=0;i<heap.length;i++ ){
        System.out.print(heap[i]+" ");
    }
}
}
class MaxHeapTree{
    public static void main(String []args){
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(5);
        maxHeap.insert(18);
        maxHeap.insert(19);
        maxHeap.insert(20);
        maxHeap.insert(8);
        maxHeap.insert(6);
        maxHeap.insert(11);
            // maxHeap.delete();

     maxHeap.print();
     
     System.out.print(maxHeap.delete())
        }
}
