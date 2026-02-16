package oblig3.madeleine.CapitalizeCommands;

import oblig3.madeleine.Interfaces.TextCommand;
/**
 * <p>This class handles the CapitalizeTextCommand.</p>
 * <p>Implements Interface TextCommand.</p>
 * <p>Superclass of CapitalizeSelectionTextCommand and CapitalizeWordTextCommand.</p>
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>execute</b> which capitalizes the first word in a text.</li>
 *   </ul>
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class CapitalizeTextCommand implements TextCommand {

  /**
   *
   * Method that capitalizes the first word in a text
   *
   * @param text to be capitalized
   * @return capitalized text
   */
  public String execute(String text) {
    if (text == null) {
      throw new NullPointerException("Text can't be null");
    }
    if (text.isBlank()) {
      throw new IllegalArgumentException("Text can't be blank");
    }
    return text.substring(0,1).toUpperCase() + text.substring(1);
  }
}
