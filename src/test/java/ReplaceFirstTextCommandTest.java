import oblig3.madeleine.ReplaceCommands.ReplaceFirstTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ReplaceFirstTextCommandTest {

  @Test
  public void TestConstructorWithNullTarget() {
    assertThrows(NullPointerException.class,() -> {
      new ReplaceFirstTextCommand(null, "unit");
    });
  }

  @Test
  public void TestConstructorWithBlankTarget() {
    assertThrows(IllegalArgumentException.class,() -> {
     new ReplaceFirstTextCommand("", "unit");
    });
  }

  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    ReplaceFirstTextCommand replaceTest = new ReplaceFirstTextCommand("test", "unit");
    String replacedString = "This is a test and test";

    //Act
    String executedText = replaceTest.execute(replacedString);

    //Assert
    assertEquals("This is a unit and unit", executedText);
  }

  @Test
  public void TestExecuteWithNullPointerException() {
    ReplaceFirstTextCommand replaceTest = new ReplaceFirstTextCommand("test", "unit");
    assertThrows(NullPointerException.class,() -> {
      replaceTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    ReplaceFirstTextCommand replaceTest = new ReplaceFirstTextCommand("test", "unit");
    assertThrows(IllegalArgumentException.class,() -> {
      replaceTest.execute("");
    });
  }

}
