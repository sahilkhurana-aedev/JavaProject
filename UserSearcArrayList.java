import java.util.ArrayList;
import java.util.Scanner;

public class UserSearcArrayList {

	ArrayList<Integer> userarr;
	ArrayList<String> emailarr;
	Scanner sc;

	public void createUseridArray(int userInput) {
		userarr = new ArrayList<>();
		System.out.println("Enter User id in user id array....");
		sc = new Scanner(System.in);

		for (int i = 1; i <= userInput; i++) {
			System.out.println("Enter User id of " + i + " user in array....");
			userarr.add(sc.nextInt());
		}

	}

	public void createEmailIdArray(int userInput) {
		emailarr = new ArrayList<>();
		System.out.println("Enter User id in email id array....");
		for (int i = 1; i <= userInput; i++) {
			System.out.println("Enter email of " + i + " user in array....");
			emailarr.add(sc.next());
		}

	}

	public void printUseridWithEmailArray() {

		for (int i = 0; i < userarr.size(); i++) {

			System.out.println("User id is: " + userarr.get(i) + " and email id is:" + emailarr.get(i));

		}
	}

	public void removeuser() {
		System.out.println("Enter user id you want to delete from list ");
		int userid = sc.nextInt();

		for (int i = 1; i < userarr.size(); i++) {

			if (userid == userarr.get(i).intValue()) {

				userarr.remove(i);
				emailarr.remove(i);
			} else {
				System.out.println("Entered user " + userid + " does not match with any user's email id");
			}
		}

	}

	public static void main(String[] args) {

		UserSearcArrayList usa = new UserSearcArrayList();
		int user = 5;
		usa.createUseridArray(user);
		usa.createEmailIdArray(user);
		System.out.println("Intial users and their email id is: ");
		usa.printUseridWithEmailArray();
		usa.removeuser();
		System.out.println("Remaining user list with their email id: ");
		usa.printUseridWithEmailArray();

	}

}
