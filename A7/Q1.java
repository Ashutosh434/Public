package A7;

@interface Test{
    String testCase();

}
@Test(testCase = "This method is a test case")
class T{
    public String test_Case(String x){
        System.out.println("Testing");
        return x;
    }
        }
public class Q1 {
    public static void main(String[] args) {
        T obj = new T();
        String str = obj.test_Case("We are Testing ");
        System.out.println(str);
    }
}
