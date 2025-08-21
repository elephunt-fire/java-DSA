package Array;
public class array {
    public static void main(String[] args) {
        // Declare an Array
        int[] array;
        // Initialize an Array
        array = new int[5];


        // Declare +  initialize an array
        int[] arr = new int[5];
        System.out.println("print an array:"+arr); // [I@6acbcfc0 => '[': array, 'I': int, '@': position, '6acbcfc0': 0x6acbcfc0]

        String [] arrS = new String[5];
        System.out.println("print string array: " + arrS);  // [Ljava.lang.String;@5b480cf9

        double [] arrD = new double[5];
        System.out.println("print double array: "+ arrD);  // [D@6f496d9f

        int[] Array = {1,2,3,4};
        System.out.println("before change at Array[2]: "+Array[2]);
        Array[2] = 30;
        System.out.println("changed the index at Array[2]: "+Array[2]);
        System.out.println(Array);
    }
}

