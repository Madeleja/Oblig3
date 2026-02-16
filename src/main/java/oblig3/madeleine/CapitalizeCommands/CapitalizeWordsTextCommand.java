package oblig3.madeleine.CapitalizeCommands;


/**
 * This class handles the CapitalizeSelectionTextCommand which makes it possible to capitalize a selection of a text.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A method <b>execute</b> which executes the action.</li>
 *   </ul>
 *
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

  /**
   * Method that executes the action
   *
   * @param text that will be capitalized
   * @return text capitalized
   */
  public String execute(String text) {
    String[] splitText = text.split(" ");
    StringBuilder capitalizedText = new StringBuilder();
    for (String texts : splitText) {
      capitalizedText.append(super.execute(texts)).append(" ");
    }
    return capitalizedText.toString().trim();
  }
}
