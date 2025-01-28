class IS{
    public void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,2,9,3,0,4};
        
        IS objIS = new IS();

        objIS.insertionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}