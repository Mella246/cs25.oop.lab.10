import java.util.*;

public class Zoo<T extends Animal> {
    public void transferAnimals(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
        source.clear();
    }
}
