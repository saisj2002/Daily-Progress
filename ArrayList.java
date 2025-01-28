import java.util.ArrayList;

class AL{
    ArrayList<Integer> list = new ArrayList<>();

    public void operationsOnArrayList(){
        //insert
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        //update
        list.set(1,30);
        list.set(2,20);
        list.set(0, 10);

        //print
        System.out.println(list.get(1));
        System.out.println(list.get(0));

        //delete
        list.remove(3);

        //size
        System.out.println(list.size());
    }
    
    public static void main(String[] args) {
        AL a=new AL();
        a.operationsOnArrayList();
    }
}
