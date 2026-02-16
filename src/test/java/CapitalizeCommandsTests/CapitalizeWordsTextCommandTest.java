package CapitalizeCommandsTests;

import oblig3.madeleine.CapitalizeCommands.CapitalizeWordsTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CapitalizeWordsTextCommandTest {

  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    CapitalizeWordsTextCommand replaceTest = new CapitalizeWordsTextCommand();
    String capitalizedString = "this is a test";

    //Act
    String executedText = replaceTest.execute(capitalizedString);

    //Assert
    assertEquals("This Is A Test", executedText);
  }


  @Test
  public void TestExecuteWithNullPointerException() {
    CapitalizeWordsTextCommand wrappedTest = new CapitalizeWordsTextCommand();
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    CapitalizeWordsTextCommand wrappedTest = new CapitalizeWordsTextCommand();
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
