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
  private String selection;


  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  public String execute(String text) {
    return opening + text + end;
  }

  public String getSelection() {
    return this.selection;
  }
}
