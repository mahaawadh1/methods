
import java.util.ArrayList;
import java.util.List;

public class SummationPractice {

    public static void main(String[] args) {

        ArrayList<Integer> NUM = new ArrayList<>();
        NUM.add(1);
        NUM.add(2);
        NUM.add(30);
        NUM.add(4);
        NUM.add(10);
        NUM.add(30);

        System.out.println(sum(NUM));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
            



