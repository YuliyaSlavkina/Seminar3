import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Task1 {
public void  randomNumberList(){
//    Random random = new Random();  //рандом с типом integer
//    random.nextInt();
    ArrayList<Double> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        numbers.add(Math.random());
    }
    System.out.println(numbers);
    Collections.sort(numbers);
    System.out.println(numbers);
}
}
    /*Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.*/
