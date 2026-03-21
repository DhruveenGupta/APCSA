
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToyStore {
    private List<Toy> toys;
    private Map<Toy, Integer> toyCount;

    public ToyStore() {
        toys = new ArrayList<>();
        toyCount = new HashMap<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
        toyCount.put(toy, toyCount.getOrDefault(toy, 0) + 1);
    }

    public Toy getMostFrequentToy() {
        return toyCount.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
    }

    public List<Toy> sortToysByCount() {
        return toyCount.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}
