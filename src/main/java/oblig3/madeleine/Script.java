package oblig3.madeleine;

import oblig3.madeleine.Interfaces.TextCommand;

import java.util.ArrayList;

/**
 * This class handles the <b>Script</b>.
 * It contains the method: <ul><li><b>execute</b> which executes a list of textCommands in a given text.</li></ul>
 *
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */

public class Script{
  private final ArrayList<TextCommand> textCommands;

  /**
   *
   * Constructor that sets up the class.
   *
   * @param textCommands creates a new list that will contain the textCommands added to the list
   */
  public Script(ArrayList<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  /**
   *
   * Method that executes a number of TextCommands from a list <b><i>textCommands</i></b> on a text of choice.
   * The commands are done in the order they are added to the list.
   *
   * @param text the text that will be modified
   * @return the modified text
   */
  public String execute(String text){
    String finalText = text;
    for (TextCommand commands : textCommands) {
      String changedText = commands.execute(finalText);
      finalText = text.replace(text, changedText);
    }
    return finalText;
  }
}
