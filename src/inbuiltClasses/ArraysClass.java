package inbuiltClasses;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    public static void main(String[] args) {

        // All the methods in Arrays class are static

        // There are 4 ways to print elements of an array
            // for loop
            // for each loop
            // Arrays.stream(arr1).forEach(x -> System.out.print(x + " "))
            // System.out.println(Arrays.toString(arr1))

        // This method acts as bridge between array-based and collection-based APIs, in combination with Collection.toArray()
        // static <T> List<T> -->   asList(T... a)
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.forEach(x -> System.out.print(x + " "));
        System.out.println();

        Object[] arr1 = list1.toArray();
        Arrays.stream(arr1).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Search for a key in array using binary search algorithm
        // static int -->	binarySearch(<T>[] a, <T> key)
        // static int -->	binarySearch((<T>[] a, int fromIndex, int toIndex, (<T> key)
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(Arrays.binarySearch(arr2, 3));
        System.out.println(Arrays.binarySearch(arr2, 9));

        // Create a copy of the array with new length
        // static <T>[]	-->     copyOf(<T>[] original, int newLength)
        // static <T>[]	-->     copyOfRange(<T>[] original, int from, int to)
        int[] arr3 = Arrays.copyOf(arr2, 7);
        Arrays.stream(arr3).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int[] arr4 = Arrays.copyOf(arr2, 4);
        Arrays.stream(arr4).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int[] arr5 = Arrays.copyOfRange(arr2, 2, 5);
        Arrays.stream(arr5).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // checks if 2 arrays are equal
        // static boolean -->	equals(<T>[] a, <T>[] a2)
        System.out.println(Arrays.equals(arr4, arr5));
        System.out.println(arr4 == arr5);
        System.out.println(Arrays.equals(arr4, arr4));

        // fills the array with corresponding default values of type of element
        // static void -->	fill(<T>[] a, <T> val)
        // static void -->	fill(<T>[] a, int fromIndex, int toIndex, <T> val)
        Arrays.fill(arr3, 1);
        Arrays.stream(arr3).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Generates a hashcode for the array based on it's contents
        // static int -->	hashCode(<T>[] a)
        System.out.println(Arrays.hashCode(arr1));
        System.out.println(Arrays.hashCode(arr2));

        // Sorts the array
        // static void -->	sort(<T>[] a)
        // static void -->	sort(<T>[] a, int fromIndex, int toIndex)
        int[] arr6 = {1,5,6,7,1,5};
        Arrays.sort(arr6);
        Arrays.stream(arr6).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Returns a stream of type of objects in array
        // static <T> Stream<T> --> 	stream(T[] array)
        Arrays.stream(arr6).forEach(x -> System.out.print(x + " "));

        // Returns a string representation of the contents of the specified array.
        // static String -->	toString(<T>[] a)
        System.out.println(Arrays.toString(arr1));

        String arr2String = Arrays.toString(arr2);
        System.out.println(arr2String);

    }
}
