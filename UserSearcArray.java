import java.util.Scanner;

public class UserSearcArray {

	int[] userarr;
	String[] emailarr;
	Scanner sc;

	public void createUseridArray() {
		userarr = new int[5];

		System.out.println("Enter User id in user id array....");
		sc = new Scanner(System.in);

		for (int i = 0; i < userarr.length; i++) {
			System.out.println("Enter User id in user id in " + i + " place...");
			userarr[i] = sc.nextInt();
		}

	}

	public void createEmailIdArray() {
		emailarr = new String[5];

		System.out.println("Enter email id in email array....");
		sc = new Scanner(System.in);

		for (int i = 0; i < emailarr.length; i++) {
			System.out.println("Enter email id in " + i + " place...");
			emailarr[i] = sc.next();
		}

	}

	public void printUseridWithEmailArray() {

		for (int i = 0; i < userarr.length; i++) {
			int j = 1;
			System.out.println("User id of " + j + " user " + userarr[i] + " and email id is " + emailarr[i]);
			j++;
		}
	}

	public void removeuser() {
		System.out.println("Enter user id you want to delete from list ");
		int userid = sc.nextInt();

		for (int i = 0; i < userarr.length; i++) {
			if (userid == userarr[i]) {

				for (int k = i; k < userarr.length - 1; k++) {

					userarr[k] = userarr[k + 1];
					emailarr[k] = emailarr[k + 1];
				}
			} else {
				System.out.println("Entered user " + userid + " does not match with any user's email id");
			}
		}

	}

	public static void main(String[] args) {

		UserSearcArray usa = new UserSearcArray();
		usa.createUseridArray();
		usa.createEmailIdArray();
		System.out.println("Intial users and their email id is: ");
		usa.printUseridWithEmailArray();
		usa.removeuser();
		System.out.println("Remaining user list with their email id: ");
		usa.printUseridWithEmailArray();

	}

}
