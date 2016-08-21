import java.util.ArrayList;
import java.util.List;

public class Foo {
  
  private List<Integer> list;
  
  public void add(int i) {
    if(list == null) {
      list = new ArrayList<>();
    }
    list.add(i);
  }
  
  public void remove(int i) {
    if(list.contains(i))
      list.remove(i);
  }
  
  public int sum() {
    return list.stream().mapToInt(Integer::intValue).sum();
  }
}