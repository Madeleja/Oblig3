package oblig3.madeleine.WrapCommands;

/**
 * This class handles the WrapSelectionTextCommand
 * which makes it possible to replace a selection of a text.
 * It is the subclass of WrapTextCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>getTarget</b> which gets the targetString to be replaced</li>
 *     <li>A method <b>getReplacement</b> which
 *     gets the replacementString that will replace the targetString</li>
 *     <li>A method <b>execute</b> that executes the action</li>
 *   </ul>
 *
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class WrapSelectionTextCommand extends WrapTextCommand{
  private final String selection;


  /**
   *
   * Constructor that initiates the class
   *
   * @param opening to be wrapped around the beginning
   * @param end to be wrapped around the end
   * @param selection text that will be wrapped
   */
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    if (selection == null) {
      throw new NullPointerException("Selection cannot be null");
    }
    if (selection.isBlank()) {
      throw new IllegalArgumentException("Selection cannot be blank");
    }
    this.selection = selection;
  }

  /**
   *
   * Execute method that executes the action
   *
   * @param text that will be wrapped
   * @return the wrapped text
   */
  @Override
  public String execute(String text) {
    if (text == null) {
      throw new NullPointerException("Text cannot be null");
    }
    if (text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be blank");
    }
    return text.replace(getSelection(), getOpening() + getSelection() + getEnd());
  }


  /**
   *
   * Method that returns the selection set in the constructor
   *
   * @return the selection
   */
  public String getSelection() {
    return this.selection;
  }
}
