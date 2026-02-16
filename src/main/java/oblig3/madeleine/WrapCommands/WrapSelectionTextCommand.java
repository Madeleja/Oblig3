package oblig3.madeleine.WrapCommands;

/**
 * This class handles the WrapSelectionTextCommand
 * Subclass of WrapTextCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>execute</b> that wraps a selection of a text between the opening and the end</li>
 *     <li>A method <b>getSelection</b> that returns the selected part of the text that will be wrapped</li>
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
   * Method that wraps a selection of the text provided between the opening and the end.
   *
   * @param text that will be wrapped
   * @return the text with the selection wrapped
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
