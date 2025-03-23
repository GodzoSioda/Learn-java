import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] ar1 = new int[] {-18, 21, 3, 6, 7, 65};
        int[] result = LocalMaximaRemove.removeLocalMaxima(ar1);
        Arrays.stream(result).forEach((System.out::println));
    }

    public static int[] removeLocalMaxima(int[] array) {
        List<Integer> list = new ArrayList<>();
        if(array[0] <= array[1]) {
            list.add(array[0]);
        }
        for(int i = 1; i <= array.length -2; i++) {
            if(array[i] <= array[i -1] || array[i] <= array[i +1]) {
                list.add(array[i]);
            }
        }
        if(array[array.length -1] <= array[array.length -2]) {
            list.add(array[array.length -1]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
