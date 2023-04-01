import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task2 {
    ArrayList<String> planets = new ArrayList<>();
    ArrayList<String> uniquePlanets = new ArrayList<>();

    public  void addPlanets(){
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Плутон");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Плутон");
        planets.add("Земля");

        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < planets.size(); j++) {
                if(i !=j && !planets.get(i).equals(planets.get(j)) && !uniquePlanets.contains(planets.get(i))){
                    int count = Collections.frequency(planets, planets.get(i));  // frequency считает количество вхождений элементов в колекцию
                    System.out.println(planets.get(i) + " " + count);
                    uniquePlanets.add(planets.get(i));
                }
            }
        }
        System.out.println(uniquePlanets);
    }
}
    /*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.*/
