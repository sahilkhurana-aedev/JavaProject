import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListOfHashMap {

	ArrayList<HashMap<String, String>> userList;
	HashMap<String, String> user;
	String userid;
	String firstname;

	Scanner sc;

	public void createUseridArray(int userId) {
		userList = new ArrayList<>();
		user = new HashMap<>();

		// System.out.println("Enter Number of elements needed in each list of map");
		sc = new Scanner(System.in);
		// int elements=sc.nextInt();

		System.out.println("Enter User id and firtsname in hashmap for every user....");

		for (int i = 1; i <= userId; i++) {
			user = new HashMap<>();
			System.out.println("Enter " + i + " value of userid key of user");
			userid = sc.next();
			System.out.println("Enter " + i + " value of firstname key of user");
			firstname = sc.next();
			user.put("userid", userid);
			user.put("firstname", firstname);
			userList.add(user);
		}

	}

	public void printUseridWithEmailArray() {

		Iterator<HashMap<String, String>> it = userList.iterator();

		while (it.hasNext()) {
			HashMap<String, String> list = it.next();
			for (String i : list.keySet()) {
				System.out.println(i + " of user is: " + list.get(i));

			}
		}
	}

	public void removeuser() {
		System.out.println("Enter user id you want to delete from list ");
		String useridd = sc.next();
		Iterator<HashMap<String, String>> it = userList.iterator();

		while (it.hasNext()) {
			HashMap<String, String> list = it.next();

			if (list.get("userid").equals(useridd)) {
				list.remove("userid");
				list.remove("firstname");
			} else {
				System.out.println("Entered user " + list.get("userid") + " does not match with user id " + useridd);
			}
		}
	}

	public static void main(String[] args) {

		ArrayListOfHashMap usa = new ArrayListOfHashMap();
		int userid = 5;
		usa.createUseridArray(userid);
		System.out.println("Intial users and their email id is: ");
		usa.printUseridWithEmailArray();
		usa.removeuser();
		System.out.println("Remaining user list with their email id: ");
		usa.printUseridWithEmailArray();

	}

}
