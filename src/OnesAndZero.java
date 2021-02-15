public class OnesAndZero {
    public static void main(String[] args) {
        int c_0 = 0 , c_1= 0;
        int arr[] = {0,1,1,0,2,3,4,1};
        for (int i=0;i< arr.length;i++){
            if(arr[i] == 0)
                c_0++;
            else if (arr[i] == 1)
                c_1++;
        }
        System.out.println("Total 0's are "+ c_0);
        System.out.println("Total 1's are "+ c_1);
    }
}
