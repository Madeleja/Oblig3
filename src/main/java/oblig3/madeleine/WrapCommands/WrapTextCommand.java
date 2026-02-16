package oblig3.madeleine.WrapCommands;

import oblig3.madeleine.Interfaces.TextCommand;


/**
 * This class handles the WrapTextCommand
 * Implements Interface TextCommand
 * Superclass of WrapLinesTextCommand and WrapSelectionCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>getOpening</b> which
 *  *     gets the opening that will wrap the text at the beginning</li>
 *     <li>A method <b>getEnd</b> which
 *     gets the end that will wrap the text at the end</li>
 *     <li>A method <b>execute</b> that wraps text between opening word and end word</li>
 *   </ul>
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;


  /**
   * Constructor that sets up the class
   *
   * @param opening text that will wrap at the beginning
   * @param end text that will wrap at the end
   */
  public WrapTextCommand(String opening, String end) {
    if (opening == null) {
      throw new NullPointerException("Opening cannot be null");
    }
    if (opening.isBlank()) {
      throw new IllegalArgumentException("Opening cannot be blank");
    }
    this.opening = opening;
    if (end == null) {
      throw new NullPointerException("End cannot be null");
    }
    if (end.isBlank()) {
      throw new IllegalArgumentException("End cannot be blank");
    }
    this.end = end;
  }

  /**
   *
   * Method that wraps the given text between the opening and end.
   *
   * @param text that will be wrapped
   * @return the wrapped text
   */
  public String execute(String text) {
    if (text == null) {
      throw new NullPointerException("String cannot be null");
    }
    if (text.isBlank()) {
      throw new IllegalArgumentException("String cannot be blank");
    }
    return getOpening() + text + getEnd();
  }

  /**
   * Method for getting the opening wrap.
   *
   * @return the opening wrap
   */
  public String getOpening() {
    return this.opening;
  }


  /**
   * Method for getting the end wrap.
   *
   * @return the end wrap
   */
  public String getEnd() {
    return this.end;
  }

}
