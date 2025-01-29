class CQA{
    public static class Q{
        int arr[];
        int size;
        int front=-1;
        int rear=-1;

        Q(int n){
            arr = new int[n];
            this.size=n;
        }

        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
    
        public void addToQueue(int data){
            if((rear+1)%size==front){
                System.out.print("Queue is full");
                return;
            }

            if(front==-1){
                front=0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public void removeFromQueue(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return;
            }

            if(front==rear){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
        }

        public void peekInQueue(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return;
            }

            System.out.print(arr[front]);
        }
    }

    public static void main(String[] args) {
        Q objQ = new Q(4); 
        objQ.addToQueue(2);
        objQ.addToQueue(4);
        objQ.addToQueue(6);
        objQ.addToQueue(8);
        objQ.peekInQueue();

        System.out.println();
        objQ.removeFromQueue();
        objQ.peekInQueue();
        
        System.out.println();
        objQ.addToQueue(9);
        objQ.peekInQueue();

        System.out.println();
        objQ.removeFromQueue();
        objQ.peekInQueue();
    }
}