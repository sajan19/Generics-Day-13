public class MaximumUsingGenerics <T extends Comparable> {

    //instance array
        private T[] inputArray;
    //Constructor
    public MaximumUsingGenerics(T[] inputArray) {
        this.inputArray = inputArray;
    }
    //Method to find maximum element of Array
     T maxTestArr() {
        T max = inputArray[0];
        for (T element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        System.out.println("Maximum  is: "+max);
        return max;
    }

      public static void main(String[] args) {
        System.out.println("Welcome to find the Maximum ...");
        //Declaring 3 Arrays with 5 Parameters
        Integer[] intArray ={134, 278, 312, 456, 159};
        Double[] doubleArray={56.67, 123.45, 89.56, 234.89, 90.12};
        String[] stringArray={"Apple", "Peach", "Banana", "Gauva", "Chikku"};
        //Creating Object and Calling the Maxximum Function
       MaximumUsingGenerics intt = new MaximumUsingGenerics(intArray);
       intt.maxTestArr();
       MaximumUsingGenerics flt = new MaximumUsingGenerics(doubleArray);
       flt.maxTestArr();
       MaximumUsingGenerics str = new MaximumUsingGenerics(stringArray);
       str.maxTestArr();
    }
}
