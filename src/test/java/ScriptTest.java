import oblig3.madeleine.CapitalizeCommands.CapitalizeTextCommand;
import oblig3.madeleine.Interfaces.TextCommand;
import oblig3.madeleine.ReplaceCommands.ReplaceTextCommand;
import oblig3.madeleine.Script;
import oblig3.madeleine.WrapCommands.WrapTextCommand;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ScriptTest {

  @Test
  public void TestConstructorWithNullOpening() {
    assertThrows(NullPointerException.class, () -> {
      new Script(null);
    });
  }


  @Test
  public void TestExecuteWithValidInput() {
    //Arrange
    TextCommand wrapCommand = new WrapTextCommand("opening ", " end");
    TextCommand capitalizeCommand = new CapitalizeTextCommand();
    TextCommand replaceCommand = new ReplaceTextCommand("test", "unit");
    ArrayList<TextCommand> commands = new ArrayList<>();
    commands.add(wrapCommand);
    commands.add(capitalizeCommand);
    commands.add(replaceCommand);
    Script scriptTest = new Script(commands);
    String testString = "this is a test";

    //Act
    String executedText = scriptTest.execute(testString);

    //Assert
    assertEquals("Opening this is a unit end", executedText);
  }
}
