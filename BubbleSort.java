class BS{
    public void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,2,9,3,0,4};
        
        BS objBS = new BS();

        objBS.bubbleSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}