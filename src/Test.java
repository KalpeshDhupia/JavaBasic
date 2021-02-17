import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Kalpesh");
        stringList.add("Sai");
        stringList.add("mintu");
        for(int i=0; i < stringList.size();i++){
            System.out.println(stringList.get(i));
        }
    }
}
