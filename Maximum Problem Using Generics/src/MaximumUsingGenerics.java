public class MaximumUsingGenerics <T extends Comparable> {
    //instance Vairiables
     T x;
     T y;
     T z;
    //Constructor
    public MaximumUsingGenerics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Method to get the Maximum of Integers
   T maxTest() {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        {
            if (z.compareTo(max) > 0) {
                max = z;//z is largest now
            }
            System.out.println("Maximum  is: "+max);
            return max; //returns the largest object
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to find the Maximum ...");
        //Created an Object
        MaximumUsingGenerics integer = new MaximumUsingGenerics(343,567,124);
        MaximumUsingGenerics flt = new MaximumUsingGenerics(23.45,78.45,97.12);
        MaximumUsingGenerics str = new MaximumUsingGenerics("Apple","Peach","Banana");
        integer.maxTest();
        flt.maxTest();
        str.maxTest();


    }
}