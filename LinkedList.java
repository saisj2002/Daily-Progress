class LL{
    Node head;
    int size=0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;

            size++;
        }
    }

    public void insertAtStart(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void insertAtLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }

        currentNode.next=newNode;
        newNode.next=null;
    }

    public void printLinkedList(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }

    public void deleteAtStart(){
        if(head==null){
            System.out.print("Linked List is Already Empty");
            return;
        }

        size--;

        head=head.next;
    }

    public void deleteAtEnd(){
        if(head==null){
            System.out.print("Linked List is Already Empty");
            return;
        }

        size--;

        if(head.next==null){
            head=null;
            return;
        }

        Node lastNode=head.next;
        Node secondLastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }

        secondLastNode.next=null;
    }

    public void findSizeOfLinkedList(){
        System.out.print(size);
    }

    public static void main(String[] args) {
        LL s = new LL();

        s.insertAtStart("are");
        s.insertAtStart("who");
        
        s.insertAtLast("you");
        s.printLinkedList();

        System.out.println();
        s.deleteAtStart();
        s.printLinkedList();

        System.out.println();
        s.deleteAtEnd();
        s.printLinkedList();

        System.out.println();
        s.findSizeOfLinkedList();
    }
}