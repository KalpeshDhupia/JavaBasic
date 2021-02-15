public class MiddliElement {
    int arr[] = {10,2,2,3,6,9};
    public static void main(String[] args) {
        MiddliElement middliElement = new MiddliElement();
        int mv = middliElement.middleValve(middliElement.arr);
        System.out.println(mv);
    }

    private  int middleValve(int[] arr) {
        if(arr.length % 2 == 0 ){
        return arr[arr.length/2 - 1];
    }
        System.out.println("Odd number of elements");
        return -1;
    }}
