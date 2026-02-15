package oblig3.madeleine.ReplaceCommands;

import oblig3.madeleine.Interfaces.TextCommand;

/**
 * This class handles the ReplaceTextCommand
 * which makes it possible to replace a selection of a text.
 * It is the superclass of FirstTextCommand.
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
public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String targetString, String replacementString) {
    if (targetString == null) {
      throw new NullPointerException("Target cannot be null");
    }
    if (targetString.isBlank()) {
      throw new IllegalArgumentException("Target cannot be blank");
    }
    this.target = targetString;
    if (replacementString == null) {
      throw new NullPointerException("Replacement cannot be null");
    }
    if (replacementString.isBlank()) {
      throw new IllegalArgumentException("Replacement cannot be blank");
    }
    this.replacement = replacementString;
  }

  public String getTarget(){
    return this.target;
  }

  public String getReplacement(){
    return this.replacement;
  }


 public String execute(String replacedString){
    if (replacedString == null) {
      throw new NullPointerException("String cannot be null");
    }
    if (replacedString.isBlank()) {
      throw new IllegalArgumentException("String cannot be blank");
    }
    return replacedString.replace(getTarget(), getReplacement());
  }




}
