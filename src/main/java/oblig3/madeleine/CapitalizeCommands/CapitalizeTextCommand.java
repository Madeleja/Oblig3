package oblig3.madeleine.CapitalizeCommands;

import oblig3.madeleine.Interfaces.TextCommand;
/**
 * This class handles the CapitalizeText and is the superclass of
 * CapitalizeSelectionTextCommand and CapitalizeWordTextCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A field <b>Selection</b></li>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>execute</b> which executes the action.</li>
 *     <li>A method <b>getSelection</b> which returns the selected text</li>
 *   </ul>
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class CapitalizeTextCommand implements TextCommand {

  /**
   *
   * Method that capitalizes selected text
   *
   * @param text to be capitalized
   * @return text with capitalized text
   */
  public String execute(String text) {
    return text;
  }
}
