class SLL{
    Node head;
    int size;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;

            size++;
        }
    }

    public void pushElement(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void popElement(){
        if(head==null){
            System.out.print("Stack is Already Empty");
            return;
        }

        size--;

        if(head.next==null){
            head=null;
        }

        head=head.next;
    }

    public void peekElement(){
        if(head==null){
            System.out.print("Stack is Empty");
            return;
        }
        
        System.out.print(head.data);
    }

    public void sizeOfStack(){
        System.out.print(size);
    }

    public static void main(String[] args) {
        SLL s = new SLL();

        s.pushElement("you");
        s.pushElement("are");
        s.pushElement("who");
        s.peekElement();

        System.out.println();
        s.popElement();
        s.peekElement();

        System.out.println();
        s.sizeOfStack();
    }
}