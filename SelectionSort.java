class SS{
    public void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,2,9,3,0,4};
        
        SS objSS = new SS();

        objSS.selectionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
