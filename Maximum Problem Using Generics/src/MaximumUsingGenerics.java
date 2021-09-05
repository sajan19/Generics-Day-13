    public class MaximumUsingGenerics {
        //instance Vairiables
         Integer x;
         Integer y;
         Integer z;
        //Constructor
        public MaximumUsingGenerics(Integer x, Integer y, Integer z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        //Method to get the Maximum of Integers
        Integer maxTest() {
            Integer max = x;
            if (y.compareTo(max) > 0)
                max = y;
            {
                if (z.compareTo(max) > 0) {
                    max = z;//z is largest now
                }
                System.out.println("Maximum of the Integers is: "+max);
                return max; //returns the largest object
            }

        }
        public static void main(String[] args) {
            System.out.println("Welcome to find the Maximum Integer...");
            //Created an Object
            MaximumUsingGenerics mx = new MaximumUsingGenerics(988,567,999);
            mx.maxTest();


        }
    }





