
/*

    Insertion Sort = After comparing element to the left
                     shift elements to the right to make room to insert a value

                     Suadratic time O(n²)
                     small data set = decent
                     large data set = BAD

                     less steps than Bubble sort
                     Best case is O(n) compared to Selection Sort O(n²)

 */

void main() {

    int[] array = {6, 1, 7, 4, 2, 9, 8, 5, 3};

    selectionSort(array);

    for (int value : array) {
        System.out.println(value);
    }
}

private void selectionSort(int[] array) {

    for (int i = 1; i < array.length; i++) {
        int temp = array[i];
        int j = i - 1;

        while (j >= 0 && array[j] > temp) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1 ] = temp;
    }
}
