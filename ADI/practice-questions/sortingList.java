import java.util.*;
class SortingList{
    static class items{
        int id;
        String name;
        int marks;
        items(int id, String name, int marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        //int n = sc.nextInt();
        ArrayList<items> list = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     int id = sc.nextInt();
        //     String name = sc.next();
        //     int marks  = sc.nextInt();
        //     list.add(new items(id, name, marks));
        // }
        list.add(new items(3, "sam", 33));
        list.add(new items(5, "q", 55));
        list.add(new items(3, "s", 22));
        list.add(new items(7, "o", 77));
        list.add(new items(9, "a", 99));
        list.add(new items(9, "n", 66));

     //Collections.sort(list, (a, b)->  a.id>b.id?1:-1);
     //Collections.sort(list, (a, b)->  Integer.compare(a.id,b.id));
     Collections.sort(list, (a, b)->  {
        if(a.id==b.id) {
            return a.name.compareTo(b.name);
        }
       return Integer.compare(a.id,b.id);
    });
 
list.sort(Comparator.comparing((items a) -> a.id)
        .thenComparing(a -> a.name));

    // list.sort(Comparator.comparingInt((items a) -> a.id).reversed() // Descending by id
    //     .thenComparing(a -> a.name));                            // Ascending by name

        for(items i: list){
            System.out.println(i.id + " " +i.name + " "+i.marks);
        }
    }
}