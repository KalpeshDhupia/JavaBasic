public class PrimeNo {
    public static void main(String[] args) {
        for (int no =1; no<= 50;no++){
            int t = 0;
            for (int i =2; i <= no-1;i++){
                if(no % i == 0){
                    t = t+ 1;
                }
            }
            if (t == 0){
                System.out.println(no);
            }
        }
    }
}
