public class MaximumUsingGenerics {
    //instance variables
    int x;
    int y;
    int z;
    //Constructor to get the values of x,y,z
    public MaximumUsingGenerics(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Method to find Maximum of 3 numbers
    void maximum(){
        int max =  Math.max(Math.max(Integer.valueOf(x),Integer.valueOf(y)),Integer.valueOf(z));
        System.out.println("Maximum of 3 Numbers is: "+max);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find Maximum using Generics");
        //Create an Object
        MaximumUsingGenerics obj = new MaximumUsingGenerics(120,545,320);
//        System.out.println(Integer.valueOf(obj.x));
//        System.out.println(Integer.valueOf(obj.y));
//        System.out.println(Integer.valueOf(obj.z));
        
        //Call the Method to find Maximum of 3 Numbers
        obj.maximum();
//        int max =  Math.max(Math.max(Integer.valueOf(obj.x),Integer.valueOf(obj.y)),Integer.valueOf(obj.z));
//        System.out.println("Maximum of 3 NUmbers is: "+max);
    }

}
