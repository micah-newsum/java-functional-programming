import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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
    System.out.println();
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
    System.out.println();
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
    System.out.println();
    if (ingredients.contains("eggs")){
      System.out.println("has eggs declarative.");
    }
  }

  private static void printIngredientsImperative() {
    System.out.println();
    System.out.println("print ingredients imperative.");
    for (String ingredient : ingredients) {
      System.out.println(ingredient);
    }
  }

  private static void printIngredientsForEachDeclarative(){
    System.out.println();
    System.out.println("print ingredients using forEach method declarative.");
    ingredients.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });
  }

  public static void main(String[] args) {
    hasEggsImperative();
    hasEggsForEachImperative();
    hasEggsDeclarative();
    printIngredientsImperative();
    printIngredientsForEachDeclarative();
  }
}
