package A8;

public class Q1 {

    public static class LambdaGreeter {

        public static void main(String[] args) {

            MyLambda myLambdaFunction = () -> System.out.println("Hello world");
            MyAdd addFunction = (int a, int b) -> a + b;

            MyAdd subtractFunction = (int a, int b) -> a - b;
            MyAdd multiplyFunction = (int a, int b) -> a * b;
            MyAdd divisionFunction = (int a, int b) -> {
                if (b == 0) return 0;
                return a / b;
            };
            int a = 8;
            int b = 4;
            System.out.println("Addition : "+subtractFunction.add(a,b));
            System.out.println("Subtraction : "+addFunction.add(a,b));
            System.out.println("Multiplication : "+multiplyFunction.add(a,b));
            System.out.println("Division : "+divisionFunction.add(a,b));

        }



        interface MyLambda {
            void foo();
        }

        interface MyAdd {
            int add(int x, int y);
        }
    }
}
