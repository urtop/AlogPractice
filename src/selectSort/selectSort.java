package selectSort;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int a[] = {5, 3, 2, 111, 67,9, 0, 5, 11,33,21,67,29, 78, 43, 2, 90, 56};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}

