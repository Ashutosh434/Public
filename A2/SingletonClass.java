package A2;
class Singleton {
    private static Singleton single_instance = null;

    public String s;
    private Singleton()
    {
        s = "This is a string ";
    }
    public static Singleton getInstance()
    {
        if(single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
    class Main {
        public static void main(String[] args) {
            Singleton x = Singleton.getInstance();
            Singleton y = Singleton.getInstance();
            Singleton z = Singleton.getInstance();

            System.out.println("Hashcode of x is "
                    + x.hashCode());
            System.out.println("Hashcode of y is "
                    + y.hashCode());
            System.out.println("Hashcode of z is "
                    + z.hashCode());

            if (x == y && y == z){
                System.out.println("\"Three objects point to the same memory location on " +
                        "the heap i.e, to the same object\"");
            }
            else{
                System.out.println("Three objects DO NOT point to the same memory location on the heap");
            }

        }
    }

// In a singleton class, when we first time call getInstance() method,
// it creates an object of the class with name single_instance and return it to the variable.
// Since single_instance is static, it is changed from null to some object.
// Next time, if we try to call getInstance() method, since single_instance is not null,
// it is returned to the variable, instead of instantiating the Singleton class again.
// This part is done by if condition.
//In the main class, we instantiate the singleton class with 3 objects x, y, z by calling
// static method getInstance(). But actually after creation of object x,
// variables y and z are pointed to object x as shown in the diagram. Hence,
// if we change the variables of object x, that is reflected when we access the variables
// of objects y and z. Also if we change the variables of object z, that is reflected when
// we access the variables of objects x and y.
//Now we are done with covering all aspects of example 1 and have implemented the same,
// now we will be implementing Singleton class with method name as that of class name.