package oblig3.madeleine.ReplaceCommands;

import oblig3.madeleine.Interfaces.TextCommand;

/**
 * This class handles the ReplaceTextCommand
 * Implements Interface TextCommand
 * Superclass of ReplaceFirstTextCommand.
 * <p>
 *   It includes
 *   <ul>
 *     <li>A constructor which instantiates the class</li>
 *     <li>A method <b>getTarget</b> which gets the targetString to be replaced</li>
 *     <li>A method <b>getReplacement</b> which
 *     gets the replacementString that will replace the targetString</li>
 *     <li>A method <b>execute</b> that replaces all instances of the target in a text with the replacement</li>
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

  /**
   *
   * Constructor that sets up the class.
   *
   * @param target the word to be replaced
   * @param replacement the word to replace the target
   */
  public ReplaceTextCommand(String target, String replacement) {
    if (target == null) {
      throw new NullPointerException("Target cannot be null");
    }
    if (target.isBlank()) {
      throw new IllegalArgumentException("Target cannot be blank");
    }
    this.target = target;
    if (replacement == null) {
      throw new NullPointerException("Replacement cannot be null");
    }
    if (replacement.isBlank()) {
      throw new IllegalArgumentException("Replacement cannot be blank");
    }
    this.replacement = replacement;
  }

  /**
   * Method that gets the target set in the constructor
   * @return target
   */
  public String getTarget(){
    return this.target;
  }

  /**
   * Method that gets the replacement set in the constructor
   * @return replacement
   */
  public String getReplacement(){
    return this.replacement;
  }

  /**
   *
   * Method that replaces all instances of the target with the replacement
   *
   * @param text that will be searched and replaced
   * @return new text that contains the replacement word in place of the target
   */
 public String execute(String text){
    if (text == null) {
      throw new NullPointerException("String cannot be null");
    }
    if (text.isBlank()) {
      throw new IllegalArgumentException("String cannot be blank");
    }
    return text.replaceAll(getTarget(), getReplacement());
  }




}
