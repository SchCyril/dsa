package DynamicArray;

public class TestDynamicArray {
    static void main() {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");



        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        System.out.println("------------------------------------");
        dynamicArray.delete("E");
        dynamicArray.delete("F");
        dynamicArray.delete("C");


        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
/*
        System.out.println("------------------------------------");
        dynamicArray.delete("Z");


        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        System.out.println("-----------------------------------");

        System.out.println(dynamicArray.search("C"));
*/


    }
}
