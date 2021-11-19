package A7;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Fruits> fruits = Arrays.asList(
                new Fruits("Mango","Yellow",70,100),
                new Fruits("Banana","Yellow",100,60),
                new Fruits("Orange","Orange",80,120)
        );
        fruits.stream().forEach(p -> System.out.println(fruits));
    }
}
class Fruits{
    String name, color;
    int calories, price;


    public Fruits(String name,String color, int calories, int price){
        this.name = name;
        this.color = color;
        this.calories = calories;
        this.price = price;
    }
    public void display(){
        System.out.println(name+ color+ calories+ price);
    }
    }
//class News{
//    int newsId;
//    String postedByUser, commentByUser, comment;
//}
//class Trader{
//    String name, city;
//}
//class Transaction{
//    String Trader;
//    int year, value;
//}