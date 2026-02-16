package oblig3.madeleine.ReplaceCommands;

/**
 * This class handles the ReplaceFirstTextCommand
 * Subclass of ReplaceTextCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>execute</b> that replaces the frist instance of the target in a text with the replacement</li>
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
   * @param target the String that will be replaced
   * @param replacement the string that replaces the old string
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  /**
   * Method that replaces the first instance of the target in the text with the replacement
   *
   * @param text that will be searched and replaced
   * @return text with the first instance of the target replaced with the replacement
   */
  @Override
  public String execute(String text) {
    if (text == null) {
      throw new NullPointerException("Text cannot be null");
    }
    if (text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be blank");
    }
    return text.replaceFirst(getTarget(), getReplacement());
  }




}
