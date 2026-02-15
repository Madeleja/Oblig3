package oblig3.madeleine.CapitalizeCommands;
/**
 * This class handles the CapitalizeSelectionTextCommand which makes it possible to capitalize a selection of a text.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A field <b>Selection</b></li>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>execute</b> which executes the action.</li>
 *     <li>A method <b>getSelection</b> which returns the selected text</li>
 *   </ul>
 *
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{

  private String selection;

  /**
   * Constructor that initiates the class
   *
   * @param selection text to be capitalized
   */
  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  /**
   * Method that capitalizes the selected text
   *
   * @param text to be capitalized
   * @return text with capitalized selection
   */
  public String execute(String text) {
    return text;
  }

  /**
   * Method that gets the selected text to be capitalized
   *
   * @return selected text
   */
  public String getSelection() {
    return selection;
  }
}
