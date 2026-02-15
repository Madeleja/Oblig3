package ReplaceCommandTests;

import oblig3.madeleine.ReplaceCommands.ReplaceTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ReplaceTextCommandTest {

  @Test
  public void TestConstructorWithNullTarget() {
    assertThrows(NullPointerException.class,() -> {
      new ReplaceTextCommand(null, "unit");
    });
  }

  @Test
  public void TestConstructorWithBlankTarget() {
    assertThrows(IllegalArgumentException.class,() -> {
     new ReplaceTextCommand("", "unit");
    });
  }

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

  @Test
  public void TestExecuteWithNullPointerException() {
    ReplaceTextCommand replaceTest = new ReplaceTextCommand("test", "unit");
    assertThrows(NullPointerException.class,() -> {
      replaceTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    ReplaceTextCommand replaceTest = new ReplaceTextCommand("test", "unit");
    assertThrows(IllegalArgumentException.class,() -> {
      replaceTest.execute("");
    });
  }

}
