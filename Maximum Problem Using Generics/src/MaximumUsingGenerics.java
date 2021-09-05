public class MaximumUsingGenerics {
    //instance Vairiables
    Double x;
    Double y;
    Double z;
    //Constructor
    public MaximumUsingGenerics(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Method to get the Maximum of Integers
    Double maxTest() {
        Double max = x;
        if (y.compareTo(max) > 0)
            max = y;
        {
            if (z.compareTo(max) > 0) {
                max = z;//z is largest now
            }
            System.out.println("Maximum of the Floats is: "+max);
            return max; //returns the largest object
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to find the Maximum Float...");
        //Created an Object
        MaximumUsingGenerics mx = new MaximumUsingGenerics(45.87,88.23,24.67);
        mx.maxTest();


    }
}