import java.util.ArrayList;

class LL{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //insert at first
        arrayList.addFirst("is");
        arrayList.addFirst("name");
        arrayList.addFirst("My");

        //insert at last
        arrayList.addLast("Sai");
        arrayList.add("Jawake");

        //insert at given position
        arrayList.add(5,".");

        //print Linked List
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" -> ");
        }
        System.out.println("null");

        //print size of Linked List
        System.out.println(arrayList.size());

        //delete at first
        arrayList.removeFirst();

        //delete at Last
        arrayList.removeLast();

        //delete at given position
        arrayList.remove(1);

        //print Linked List
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" -> ");
        }
        System.out.println("null");


    }
}