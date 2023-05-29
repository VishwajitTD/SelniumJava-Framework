package basicPrograms;

public class ArraySortCheck {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // Sorted array
        int[] array2 = {5, 3, 2, 1, 4}; // Unsorted array

        boolean isSorted1 = true;
        boolean isSorted2 = true;

        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                isSorted1 = false;
                break;
            }
        }

        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] > array2[i + 1]) {
                isSorted2 = false;
                break;
            }
        }

        System.out.println("Array1 is sorted: " + isSorted1);
        System.out.println("Array2 is sorted: " + isSorted2);
    }
}

