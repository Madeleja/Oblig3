package CapitalizeCommandsTests;

import oblig3.madeleine.CapitalizeCommands.CapitalizeTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test class for the CapitalizeTextCommand class.
 * Contains methods:
 * <ol>
 *   <li><b>TestExecuteWithValidInput</b> which is expected to show that the <b>execute</b> method works as intended
 *   when valid input is given</li>
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
public class CapitalizeTextCommandTest {

  /**
   * Test expected to show that the <b>execute</b> method works as intended
   * when valid input is given
   */
  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    CapitalizeTextCommand replaceTest = new CapitalizeTextCommand();
    String capitalizedString = "this is a test";

    //Act
    String executedText = replaceTest.execute(capitalizedString);

    //Assert
    assertEquals("This is a test", executedText);
  }

  /**
   * Test expected to throw a
   * NullPointerException when text is set to null
   */
  @Test
  public void TestExecuteWithNullPointerException() {
    CapitalizeTextCommand wrappedTest = new CapitalizeTextCommand();
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
    CapitalizeTextCommand wrappedTest = new CapitalizeTextCommand();
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
