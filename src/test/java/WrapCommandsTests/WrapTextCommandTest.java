package WrapCommandsTests;

import oblig3.madeleine.WrapCommands.WrapTextCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WrapTextCommandTest {

  @Test
  public void TestConstructorWithNullTarget() {
    assertThrows(NullPointerException.class,() -> {
      new WrapTextCommand(null, "unit");
    });
  }

  @Test
  public void TestConstructorWithBlankTarget() {
    assertThrows(IllegalArgumentException.class,() -> {
     new WrapTextCommand("", "unit");
    });
  }

  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    WrapTextCommand replaceTest = new WrapTextCommand("opening ", " end");
    String wrappedString = "This is a test";

    //Act
    String executedText = replaceTest.execute(wrappedString);

    //Assert
    assertEquals("opening This is a test end", executedText);
  }


  @Test
  public void TestExecuteWithNullPointerException() {
    WrapTextCommand wrappedTest = new WrapTextCommand("test", "unit");
    assertThrows(NullPointerException.class,() -> {
      wrappedTest.execute(null);
    });
  }

  @Test
  public void TestExecuteWithIllegalArgumentException() {
    WrapTextCommand wrappedTest = new WrapTextCommand("test", "unit");
    assertThrows(IllegalArgumentException.class,() -> {
      wrappedTest.execute("");
    });
  }

}
