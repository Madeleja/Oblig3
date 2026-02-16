package CapitalizeCommandsTests;

import oblig3.madeleine.CapitalizeCommands.CapitalizeSelectionTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CapitalizeSelectionTextCommandTest {

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


  @Test
  public void TestExecuteWithNullPointerException() {
    CapitalizeSelectionTextCommand wrappedTest = new CapitalizeSelectionTextCommand("is a");
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    CapitalizeSelectionTextCommand wrappedTest = new CapitalizeSelectionTextCommand("is a");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
