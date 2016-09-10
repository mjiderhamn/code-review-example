import java.util.ArrayList;
import java.util.List;

public class Foo {
  
  private List<Integer> numbers;
  
  public void add(int i) {
    if(numbers == null) {
      numbers = new ArrayList<>();
    }
    numbers.add(i);
  }
  
  public void remove(int i) {
    if(numbers != null)
      numbers.remove(i);
  }
  
  public int sum() {
    return (numbers == null) ? 0 : 
    numbers.stream().mapToInt(Integer::intValue).sum();
  }
}