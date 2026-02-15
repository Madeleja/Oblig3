package WrapCommandsTests;

import oblig3.madeleine.WrapCommands.WrapSelectionTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WrapSelectionTextCommandTest {

  @Test
  public void TestConstructorWithNullTarget() {
    assertThrows(NullPointerException.class,() -> {
      new WrapSelectionTextCommand(null, "unit", "for sure");
    });
  }

  @Test
  public void TestConstructorWithBlankTarget() {
    assertThrows(IllegalArgumentException.class,() -> {
     new WrapSelectionTextCommand("", "unit", "for sure");
    });
  }

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


  @Test
  public void TestExecuteWithNullPointerException() {
    WrapSelectionTextCommand wrappedTest = new WrapSelectionTextCommand("test", "unit", "for sure");
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    WrapSelectionTextCommand wrappedTest = new WrapSelectionTextCommand("test", "unit", "for sure");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
