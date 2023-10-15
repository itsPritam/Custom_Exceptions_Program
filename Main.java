package ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> team = new ArrayList<String>();
		
		team.add("Chennai Super Kings");
		team.add("Deccan Chargers");
		team.add("Delhi Daredevils");
		team.add("Kings XI Punjab");
		team.add("Kolkata Knight Riders");
		team.add("Mumbai Indians");
		team.add("Rajsthan Royals");
		team.add("Royal Challengers Banglore");
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String winner = TeamNotFound.throwException(team, sc, "Enter the Expected winner Team of IPL Season 4\n");
		String runner = TeamNotFound.throwException(team, sc, "Enter the Expected runner Team of IPL Season 4\n");
		 System.out.println("Expected IPL Season 4 winner: " + winner);
         System.out.println("Expected IPL Season 4 runner: " + runner);
         
         
		}
		catch (TeamNotFound e) {
            System.out.println(e);
        }
		
		
	}
}