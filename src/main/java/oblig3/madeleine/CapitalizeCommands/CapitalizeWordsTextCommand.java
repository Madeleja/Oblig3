package oblig3.madeleine.CapitalizeCommands;


/**
 * This class handles the CapitalizeSelectionTextCommand.
 * Subclass of CapitalizeText
 * <p>
 *   It includes
 *   <ul>
 *     <li>A method <b>execute</b> which capitalizes all words in a text.</li>
 *   </ul>
 *
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

  /**
   * Method that capitalizes a selection of a given text
   *
   * @param text that contains selection to be capitalized
   * @return text with capitalized selection
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
