import java.util.*;
import java.util.stream.Collectors;
public class Prg02{
    public static void main(String[] args){
       // int [] arr = {10,20,50,10,30,40,30,50,60,10,60};
       List<Integer> arr = Arrays.asList(10,20,50,10,30,40,30,50,60,10,60);
       Set<Integer> seen = new HashSet<>();
       Set<Integer> remove = arr.stream()
               .filter(n ->!seen.add(n))
               .collect(Collectors.toSet());
        System.out.println(remove);
    }
}
