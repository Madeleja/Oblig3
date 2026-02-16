package ReplaceCommandTests;

import oblig3.madeleine.ReplaceCommands.ReplaceTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test class for the ReplaceTextCommand class.
 * Contains methods:
 * <ol>
 *   <li><b>TestConstructorWithNullTarget</b> and <b>TestConstructorWithNullReplacement</b> which is expected to throw a
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
public class ReplaceTextCommandTest {

  /**
   * Test expected to throw a
   * NullPointerException when parameter targetString in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullTarget() {
    assertThrows(NullPointerException.class,() -> {
      new ReplaceTextCommand(null, "unit");
    });
  }
  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter targetString in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankTarget() {
    assertThrows(IllegalArgumentException.class,() -> {
      new ReplaceTextCommand("", "unit");
    });
  }

  /**
   * Test expected to throw a
   * NullPointerException when parameter replacementString in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullReplacement() {
    assertThrows(NullPointerException.class,() -> {
      new ReplaceTextCommand("test", null);
    });
  }

  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter replacementString in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankReplacement() {
    assertThrows(IllegalArgumentException.class,() -> {
      new ReplaceTextCommand("test", "");
    });
  }


  /**
   * Test expected to show that the <b>execute</b> method works as intended
   * when valid input is given
   */
  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    ReplaceTextCommand replaceTest = new ReplaceTextCommand("test", "unit");
    String replacedString = "This is a test and test";

    //Act
    String executedText = replaceTest.execute(replacedString);

    //Assert
    assertEquals("This is a unit and unit", executedText);
  }


  /**
   * Test expected to throw a
   * NullPointerException when text is set to null
   */
  @Test
  public void TestExecuteWithNullPointerException() {
    ReplaceTextCommand replaceTest = new ReplaceTextCommand("test", "unit");
    assertThrows(NullPointerException.class,() -> {
      replaceTest.execute(null);
    });
  }

  /**
   * Test expected to throw a
   * IllegalArgumentException when text is blank
   */
  @Test
  public void TestExecuteWithIllegalArgumentException() {
    ReplaceTextCommand replaceTest = new ReplaceTextCommand("test", "unit");
    assertThrows(IllegalArgumentException.class,() -> {
      replaceTest.execute("");
    });
  }

}
