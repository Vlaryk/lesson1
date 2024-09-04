import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().mapToDouble(el -> el).average().orElse(Double.NaN));
    }
}