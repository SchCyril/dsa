/*
    Interpolation Search = Improvement over Binary Search best used for 'uniformly" distributed data
    "guesses" where a value might be based on calculated probe result
     if probe is incorrect we narrow the search and try again

     average case : O(log(log(n)))
     worst case : O(n) [values increase exponentially]
*/

void main() {

    // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

    int index = interpolationSearch(array, 256);

    if (index != -1) System.out.println("Element found at index : " + index);
    else System.out.println("Element not found");

}

private int interpolationSearch(int[] array, int value) {
    int high = array.length - 1;
    int low = 0;

    while (value >= array[low] && value <= array[high] && low <= high) {

        int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

        System.out.println("Probe : " + probe);

        if (array[probe] == value) return probe;
        else if (array[probe] < value) low = probe + 1;
        else if (array[probe] > value) high = probe - 1;

    }
    return -1;
}
