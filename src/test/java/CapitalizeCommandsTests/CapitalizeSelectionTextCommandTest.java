package CapitalizeCommandsTests;

import oblig3.madeleine.CapitalizeCommands.CapitalizeSelectionTextCommand;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test class for the CapitalizeTextCommand class.
 * Contains methods:
 * <ol>
 *   <li><b>TestConstructorWithNullSelection</b> which is expected to throw a
 *   NullPointerException when parameter selection in the constructor is set to null</li>
 *  <li><b>TestConstructorWithBlankSelection</b> which is expected to throw a
 *  IllegalArgumentException when parameter selection in the constructor is blank</li>
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
public class CapitalizeSelectionTextCommandTest {

  /**
   * Test expected to throw a
   * NullPointerException when parameter selection in the constructor is set to null
   */
  @Test
  public void TestConstructorWithNullSelection() {
    assertThrows(NullPointerException.class,() -> {
      new CapitalizeSelectionTextCommand(null);
    });
  }

  /**
   * Test expected to throw a
   * IllegalArgumentException when parameter selection in the constructor is blank
   */
  @Test
  public void TestConstructorWithBlankSelection() {
    assertThrows(IllegalArgumentException.class,() -> {
      new CapitalizeSelectionTextCommand("");
    });
  }

  /**
   * Test expected to show that the <b>execute</b> method works as intended
   * when valid input is given
   */
  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    CapitalizeSelectionTextCommand replaceTest = new CapitalizeSelectionTextCommand("is a");
    String capitalizedString = "this is a test";

    //Act
    String executedText = replaceTest.execute(capitalizedString);

    //Assert
    assertEquals("this Is A test", executedText);
  }

  /**
   * Test expected to throw a
   * NullPointerException when text is set to null
   */
  @Test
  public void TestExecuteWithNullPointerException() {
    CapitalizeSelectionTextCommand wrappedTest = new CapitalizeSelectionTextCommand("is a");
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  /**
   * Test expected to throw a
   * NullPointerException when text is set to null
   */
  @Test
  public void TestExecuteWithIllegalArgumentException() {
    CapitalizeSelectionTextCommand wrappedTest = new CapitalizeSelectionTextCommand("is a");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
