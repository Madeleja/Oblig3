package oblig3.madeleine.WrapCommands;

import java.util.Arrays;

/**
 * This class handles the WrapLinesTextCommand
 * which makes it possible to wrap a selection of a text.
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
 * </p>
 *
 * @author Madeleine Jacobsen
 * @version 0.0.1
 */
public class WrapLinesTextCommand extends WrapTextCommand{


  /**
   *
   * Constructor that sets up the class
   *
   * @param opening text that will wrap at the beginning
   * @param end text that wil wrap at the end
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  /**
   *
   * Method that executes the wrap
   *
   * @param text that will be wrapped
   * @return wrapped text
   */
  public String execute(String text) {
    String[] splitText = text.split("\\R");
    String wrappedText = "";
    for (String texts : splitText) {

      wrappedText = wrappedText + super.execute(texts) + "\n";
    }
    return wrappedText.trim();
  }
}
