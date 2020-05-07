import java.util.HashMap;
import java.util.Scanner;

public class UserSearcHashmap {

	HashMap<Integer, String> user;

	Scanner sc;

	public void createUseridArray(int userId) {
		user = new HashMap<>();
		System.out.println("Enter User id in user id and email of users....");
		sc = new Scanner(System.in);

		for (int i = 1; i <= userId; i++) {
			System.out.println("Enter " + i + " user id of user");
			int userid = sc.nextInt();
			System.out.println("Enter " + i + " email id of user");
			String email = sc.next();
			user.put(userid, email);
		}

	}

	public void printUseridWithEmailArray() {

		for (Integer i : user.keySet()) {
			System.out.println("User id is: " + i + " email id of user is: " + user.get(i));

		}
	}

	public void removeuser() {
		System.out.println("Enter user id you want to delete from list ");
		int userid = sc.nextInt();

		if (user.containsKey(userid)) {
			user.remove(userid);
		} else {
			System.out.println("Entered user " + userid + " does not match with any user's email id");
		}
	}

	public static void main(String[] args) {

		UserSearcHashmap usa = new UserSearcHashmap();
		int user1 = 5;
		usa.createUseridArray(user1);
		System.out.println("Intial users and their email id is: ");
		usa.printUseridWithEmailArray();
		usa.removeuser();
		System.out.println("Remaining user list with their email id: ");
		usa.printUseridWithEmailArray();

	}

}
