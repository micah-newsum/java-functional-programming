import java.util.Arrays;
import java.util.List;

public class App {
  private static List<String> ingredients;

  static {
    ingredients = Arrays.asList(
        "flour",
        "salt",
        "baking powder",
        "butter",
        "eggs",
        "milk"
    );
  }

  private static void hasEggsImperative() {
    System.out.println("has eggs imperative.");
    boolean hasEggs = false;
    for (int i = 0; i < ingredients.size(); i++) {
      String ingredient = ingredients.get(i);
      if (ingredient.equals("eggs")) {
        hasEggs = true;
        break;
      }
    }
  }

  public static void main(String[] args) {
    hasEggsImperative();
  }
}
