package oblig3.madeleine.ReplaceCommands;

/**
 * This class handles the CapitalizeSelectionTextCommand which makes it possible to capitalize a selection of a text.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *   </ul>
 *
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  /**
   * A constructor which initiates the class
   *
   * @param targetString the String that will be replaced
   * @param replacementString the string that replaces the old string
   */
  public ReplaceFirstTextCommand(String targetString, String replacementString) {
    super(targetString, replacementString);
  }
  @Override
  public String execute(String text) {
    if (text == null) {
      throw new NullPointerException("String cannot be null");
    }
    if (text.isBlank()) {
      throw new IllegalArgumentException("String cannot be blank");
    }
    return text.replaceFirst(getTarget(), getReplacement());
  }




}
