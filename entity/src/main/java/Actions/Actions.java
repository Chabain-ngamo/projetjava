package Actions;

import elements.mobileElements;
import entity.Entity;

/**
 * The Actions class.
 * @author Maiva
 * @author Chabain
 *  @author Vladimir
 *
 */

public abstract class Actions <T extends Entity>{
	
	/** The mobile element concerned by the strategy */
	protected mobileElements me = null;
	/** The method that contains the strategy */
	public abstract void runStrategy();
	/** The method that gives the name of the strategy */
	public abstract String returnStrategy();

}
