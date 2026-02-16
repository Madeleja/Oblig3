package WrapCommandsTests;

import oblig3.madeleine.WrapCommands.WrapSelectionTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test class for the WrapSelectionTextCommand class.
 * Contains methods:
 * <ol>
 *   <li><b>TestConstructorWithNullOpening</b>, <b>TestConstructorWithNullEnd</b> and <b>TestConstructorWithNullSelection</b> which is expected to throw a
 *   NullPointerException when a parameter in the constructor is set to null</li>
 *  <li><b>TestConstructorWithBlankOpening</b>, <b>TestConstructorWithBlankEnd</b> and <b>TestConstructorWithBlankSelection</b>
 *   which is expected to throw a IllegalArgumentException when a parameter in the constructor is blank</li>
 *   <li><b>TestExecuteWithValidInput</b> which is expected to show that the <b>execute</b> method works as intended</li>
 *   <li><b>TestExecuteWithNullPointerException</b> which is expected to show that the <b>execute</b>
 *   method throws a NullPointerException when the text is set to null</li>
 *   <li><b>TestExecuteWithIllegalArgumentException</b> which is expected to show that the <b>execute</b>
 *   method throws a IllegalArgumentException when the text is blank</li>
 * </ol>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 *
 */
public class WrapSelectionTextCommandTest {

  /**
   * Test expected to throw a
   * NullPointerException when parameter opening in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullOpening() {
    assertThrows(NullPointerException.class,() -> {
      new WrapSelectionTextCommand(null, "unit", "for sure");
    });
  }
  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter opening in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankOpening() {
    assertThrows(IllegalArgumentException.class,() -> {
      new WrapSelectionTextCommand("", "unit", "for sure");
    });
  }

  /**
   * Test expected to throw a
   * NullPointerException when parameter end in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullEnd() {
    assertThrows(NullPointerException.class,() -> {
      new WrapSelectionTextCommand("unit", null, "for sure");
    });
  }

  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter end in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankEnd() {
    assertThrows(IllegalArgumentException.class,() -> {
      new WrapSelectionTextCommand("unit", "", "for sure");
    });
  }

  /**
   * Test expected to throw a
   * NullPointerException when parameter selection in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullSelection() {
    assertThrows(NullPointerException.class,() -> {
      new WrapSelectionTextCommand("unit", "unit", null);
    });
  }

  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter selection in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankSelection() {
    assertThrows(IllegalArgumentException.class,() -> {
      new WrapSelectionTextCommand("unit", "unit", "");
    });
  }

  /**
   * Test expected to show that the <b>execute</b> method works as intended
   * when valid input is given
   */
  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    WrapSelectionTextCommand replaceTest = new WrapSelectionTextCommand("opening ", " end", "for sure");
    String wrappedString = "This is a test for sure";

    //Act
    String executedText = replaceTest.execute(wrappedString);

    //Assert
    assertEquals("This is a test opening for sure end", executedText);
  }

  /**
   * Test expected to throw a
   * NullPointerException when text is set to null
   */
  @Test
  public void TestExecuteWithNullPointerException() {
    WrapSelectionTextCommand wrappedTest = new WrapSelectionTextCommand("test", "unit", "for sure");
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }
  /**
   * Test expected to throw a
   * IllegalArgumentException when text is blank
   */
  @Test
  public void TestExecuteWithIllegalArgumentException() {
    WrapSelectionTextCommand wrappedTest = new WrapSelectionTextCommand("test", "unit", "for sure");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
