package WrapCommandsTests;

import oblig3.madeleine.WrapCommands.WrapTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


/**
 * Test class for the WrapTextCommand class.
 * Contains methods:
 * <ol>
 *   <li><b>TestConstructorWithNullOpening</b> and <b>TestConstructorWithNullEnd</b> which is expected to throw a
 *   NullPointerException when a parameter in the constructor is set to null</li>
 *   <li><b>TestConstructorWithBlankOpening</b> and <b>TestConstructorWithBlankEnd</b>
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
public class WrapTextCommandTest {

  /**
   * Test expected to throw a
   * NullPointerException when parameter opening in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullOpening() {
    assertThrows(NullPointerException.class,() -> {
      new WrapTextCommand(null, "unit");
    });
  }
  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter opening in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankOpening() {
    assertThrows(IllegalArgumentException.class,() -> {
     new WrapTextCommand("", "unit");
    });
  }

  /**
   * Test expected to throw a
   * NullPointerException when parameter end in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullEnd() {
    assertThrows(NullPointerException.class,() -> {
      new WrapTextCommand("unit", null);
    });
  }

  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter end in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankEnd() {
    assertThrows(IllegalArgumentException.class,() -> {
      new WrapTextCommand("unit", "");
    });
  }

  /**
   * Test expected to show that the <b>execute</b> method works as intended
   * when valid input is given
   */
  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    WrapTextCommand replaceTest = new WrapTextCommand("opening ", " end");
    String wrappedString = "This is a test";

    //Act
    String executedText = replaceTest.execute(wrappedString);

    //Assert
    assertEquals("opening This is a test end", executedText);
  }

  /**
   * Test expected to throw a
   * NullPointerException when text is set to null
   */
  @Test
  public void TestExecuteWithNullPointerException() {
    WrapTextCommand wrappedTest = new WrapTextCommand("test", "unit");
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
    WrapTextCommand wrappedTest = new WrapTextCommand("test", "unit");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
