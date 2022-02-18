import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] ints) {
        
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());

        HashSet<Integer> hashSet = new HashSet<Integer>();

        List<Integer> filtrarDuplicados = list.stream()
                .filter(i -> !hashSet.add(i))
                .collect(Collectors.toList());

        return new TreeSet<>(filtrarDuplicados);
    }
}