import java.util.Arrays;

public class ArrayBilangan27 {
    public static void main(String[] args) {
        int[] bil = {5, 3, -7, 17};

        for (int i = 4; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]+ ", double = " + (bil[i] * 2));
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}