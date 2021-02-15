public class SmallestElement {
    public static void main(String[] args) {
        int []arr = {10,2,5,8,6};
        int smallest = findSmallest(arr);
        System.out.println(smallest);
    }

    private static int findSmallest(int arr[]) {
        int s = arr[0];
for(int i =1; i< arr.length;i++){
    if(s > arr[i]){
        s = arr[i];
    }
}
        return s;
    }
}
