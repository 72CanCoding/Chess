/**
 * Implements a visitor that creates a string representation
 * from the fields of a board and makes it available via a
 * getter.
 * 
 * @author Marcus
 *
 */
public class FieldStringifyer implements Visitor{

	
	private String text = "";
	
	public String getText() {
		return this.text;
	}
	@Override
	public void nextField(Field field) {
		// TODO Auto-generated method stub
		this.text += field.toString();
	}

	@Override
	public void nextRow() {
		this.text +="\n";
		// TODO Auto-generated method stub
		
	} // TODO: change type declaration
	
	/**
	 * The text that has been gathered by the stringifyer.
	 */
	// TODO: add text variable
	
	/**
	 * Returns the text that has been gathered by the
	 * stringifyer so far.
	 * 
	 * @return The text of the stringifyer.
	 */
	// TODO: add getter for text
	
	/**
	 * Appends the string representation of the field to
	 * the text.
	 * 
	 * @param field The field whose string representation
	 * 	should be appended.
	 */
	// TODO: override nextField

	/**
	 * Appends a newline character ("\n") to the text.
	 */
	// TODO: override nextRow
	
	
}
