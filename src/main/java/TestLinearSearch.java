/*
Linear search = Iterate through a collection one element at a time

    untime complexity : O(N)

    disadvantages : Slow for large data sets

    Avantages :
1. Fast for searches of small to medium data sets
2. Does not need to sorted
3. Useful for data structures that do not have random acces ( LinkedList)

*/

void main() {

    int[] array = {9, 1, 2, 8, 3, 7, 5, 6, 4};
    linearSearch(array, 10);
}

private static void linearSearch(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            System.out.println("Element found at index : " + i);
            return;
        }
    }
    System.out.println("Element not found");
}