package oblig3.madeleine.WrapCommands;

import oblig3.madeleine.Interfaces.TextCommand;


/**
 * This class handles the WrapTextCommand
 * which makes it possible to replace a selection of a text.
 * It is the superclass of WrapTextCommand and WrapSelectionCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>getTarget</b> which gets the targetString to be replaced</li>
 *     <li>A method <b>getReplacement</b> which
 *     gets the replacementString that will replace the targetString</li>
 *     <li>A method <b>execute</b> that executes the action</li>
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
    this.opening = opening;
    this.end = end;
  }

  /**
   *
   * Method that executes the wrapping.
   *
   * @param text that will be wrap
   * @return the text wrapped
   */
  public String execute(String text) {
    return opening + text + end;
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
