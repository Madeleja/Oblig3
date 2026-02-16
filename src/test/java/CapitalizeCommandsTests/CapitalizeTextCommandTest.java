package CapitalizeCommandsTests;

import oblig3.madeleine.CapitalizeCommands.CapitalizeTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CapitalizeTextCommandTest {

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


  @Test
  public void TestExecuteWithNullPointerException() {
    CapitalizeTextCommand wrappedTest = new CapitalizeTextCommand();
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    CapitalizeTextCommand wrappedTest = new CapitalizeTextCommand();
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
