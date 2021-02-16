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
    boolean hasEggs = false;
    for (int i = 0; i < ingredients.size(); i++) {
      String ingredient = ingredients.get(i);
      if (ingredient.equals("eggs")) {
        hasEggs = true;
        System.out.println("has eggs imperative.");
        break;
      }
    }
  }

  private static void hasEggsForEachImperative()
  {
    boolean hasEggs = false;
    for (String ingredient : ingredients) {
      if (ingredient.equals("eggs")) {
        hasEggs = true;
        System.out.println("has eggs for each imperative.");
        break;
      }
    }
  }

  private static void hasEggsDeclarative(){
    if (ingredients.contains("eggs")){
      System.out.println("has eggs declarative.");
    }
  }

  public static void main(String[] args) {
    hasEggsImperative();
    hasEggsForEachImperative();
    hasEggsDeclarative();
  }
}
