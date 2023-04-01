import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task3 {
    ArrayList<String> planets = new ArrayList<>();

    public  void removePlanets() {
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

        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            if (Collections.frequency(planets, iterator.next()) > 1) {
                iterator.remove();
            }
        }
        System.out.println(planets);

    }
}
   /* Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.*/