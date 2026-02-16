package oblig3.madeleine;

import oblig3.madeleine.Interfaces.TextCommand;

import java.util.ArrayList;

public class Script{
  private final ArrayList<TextCommand> textCommands;

  public Script(ArrayList<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  /**
   *
   * Method that
   *
   * @param text
   * @return
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
