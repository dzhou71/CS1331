/**
 * The main driver for Undergrad
 *
 * @author David Zhou
 * @version 1.0
 */
public class Undergrad extends Student {
    private Year year;

	/**
	* Default empty Undergrad constructor
	*/
	public Undergrad() {
		super();
	}

	/**
	* Default Undergrad constructor
	*/
	public Undergrad(String name, int creditHours, boolean inState, Year year) {
		super(name, creditHours, inState);
		this.year = year;
	}

	/**
	* Returns value of year
	* @return value of year
	*/
	public Year getYear() {
        return year;
	}

    /**
    *@param other the user defined
    *@return comparable integer
    */
    @Override
    public int compareTo(User other) {
        if (other instanceof Undergrad) {
            Undergrad casted = (Undergrad) other;
            if (year.ordinal() < casted.getYear().ordinal()) {
                return 1;
            } else if (year.ordinal() > casted.getYear().ordinal()) {
                return -1;
            } else {
                super.compareTo(other);
            }
        } else {
            return this.getClass().getName().compareTo(other.getClass().getName());
        }
        return 0;
    }
}
