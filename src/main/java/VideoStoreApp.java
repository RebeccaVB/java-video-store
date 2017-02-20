import java.util.Scanner;

public class VideoStoreApp {

	public static void main(String[] args) {
		RentalStatement statement = new RentalStatement();

		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strnage");

		Rental regularMovie = new Rental(regular, 3);
		Rental newReleaseMovie = new Rental(newRelease, 2);
		Rental childrensMovie = new Rental(childrens, 3);

		statement.add(childrensMovie);
		statement.add(newReleaseMovie);
		statement.add(regularMovie);
		statement.print();

		// System.out;
	}

}
