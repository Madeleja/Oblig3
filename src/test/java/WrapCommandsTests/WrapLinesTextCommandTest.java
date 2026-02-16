package WrapCommandsTests;

import oblig3.madeleine.WrapCommands.WrapLinesTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WrapLinesTextCommandTest {

  @Test
  public void TestConstructorWithNullOpening() {
    assertThrows(NullPointerException.class,() -> {
      new WrapLinesTextCommand(null, "unit");
    });
  }

  @Test
  public void TestConstructorWithBlankOpening() {
    assertThrows(IllegalArgumentException.class,() -> {
     new WrapLinesTextCommand("", "unit");
    });
  }

  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    WrapLinesTextCommand replaceTest = new WrapLinesTextCommand("opening ", " end");
    String wrappedString = "This is a test" + "\n" + "for sure";

    //Act
    String executedText = replaceTest.execute(wrappedString);

    //Assert
    assertEquals("opening This is a test end" + "\n" + "opening for sure end", executedText);
  }


  @Test
  public void TestExecuteWithNullPointerException() {
    WrapLinesTextCommand wrappedTest = new WrapLinesTextCommand("test", "unit");
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    WrapLinesTextCommand wrappedTest = new WrapLinesTextCommand("test", "end");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
