class QA{
    public static class Q{
        int arr[];
        int size;
        int rear=-1;

        Q(int n){
            arr = new int[n];
            this.size=n;
        }

        public boolean isEmpty(){
            return rear==-1;
        }
    
        public void addToQueue(int data){
            if(rear==size-1){
                System.out.print("Queue is full");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        public void removeFromQueue(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return;
            }

            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
        }

        public void peekInQueue(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return;
            }

            System.out.print(arr[0]);
        }

        public void sizeOfQueue(){
            System.out.print(rear+1);
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
        objQ.sizeOfQueue();
    }
}