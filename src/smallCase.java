public class smallCase {
    public static void main(String[] args) {
        String s = "MasAI SchooL";
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)>96){
                System.out.print(s.charAt(i));
            }
        }
    }
}
