import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<Rental>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}

	public void print() {
		for (Rental r : rentals) {

			System.out.println("Price Code =  " + r.getPriceCode() + "  title =  " + r.getTitle() + " fees =  "
					+ r.calculateFees() + " days =  " + r.days);
		//	System.out.print(r.getPriceCode());
		//	System.out.print(r.getTitle());
		//	System.out.print(r.calculateFees());
		//	System.out.print(r.days);
		}
		
	}

}
