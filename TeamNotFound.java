package ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamNotFound(String desc) {
		super(desc);

	}

	public static String throwException(ArrayList<String> s, Scanner sc, String msg) throws TeamNotFound {

		while (true) {
			System.out.print(msg);
			String teamName = sc.nextLine();

			if (s.contains(teamName)) {

				return teamName;

			} else {
				throw new TeamNotFound("Entered team is not a part of IPL Season 4");
			}

		}

	}

}
