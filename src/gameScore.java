public class gameScore {
    public static void main(String[] args) {
        int arr[] = {10,15,30,20,5,98};
        int low = arr[0];
        for(int i =0 ; i < arr.length;i++){
            if(low > arr[i] ){
                low = arr[i];
            }
        }
        System.out.println(low);
    }
}
