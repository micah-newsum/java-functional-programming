import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * Test a variety of functional programming constructs.
 */
public class BasicsTest {
  /**
   * The Objects.requireNonNull is method that throws an exception if the first parameter is null. It accepts two arguments. The first may be an instance of any type,
   * and the second of type Supplier<T>. The Supplier<T> can be passed as a lambda expression, as in the first test, or a defined Supplier<T> type, as in the second test.
   * The method generates a custom null pointer exception message with Supplier<String>. In adition, second parameter is Supplier<String> and is called lazily. In other words,
   * the Supplier<String> is only invoked if first param is null; otherwise, it is ignored.
   */
  @Test
  void generateCustomNullPointerExceptionMessageWithSupplier(){
    String exceptionMessage = "This is the custom NullPointerException message.";

    // with lambda expression
    assertThatExceptionOfType(NullPointerException.class)
        .isThrownBy(
            () -> {
              Objects.requireNonNull(null,() -> exceptionMessage);
            }
            );

    // with Supplier<String>
    Supplier<String> exceptionMessageSupplier = () -> exceptionMessage;

    assertThatExceptionOfType(NullPointerException.class)
        .isThrownBy(
            () -> {
              Objects.requireNonNull(null,exceptionMessageSupplier);
            }
        );
  }
}
