package projects;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import projects.exception.DbException;

public class ProjectsApp {
	private Scanner scanner = new Scanner(System.in);
	
	
	// @formatter: off
	private List<String> operations = List.of(
			"1) Add a project"
			
	);
	// @formatter:on

	public static void main(String[] args) {
		new ProjectsApp().processUserSelections();
		
	}

	private void processUserSelections() {
		//local variable
		boolean done = false;
		
		//while loop until variable done is true
		while (!done) {
			try {
				int selection = getUserSelection();
				
				switch(selection) {
					case -1:
						done = exitMenu();
						break;
						
					case 1:
						createProject();
						break;
					
					default:
						System.out.println("\n" + selection + " is not a valid selection. Try again.");
						break;
				}
			}
			catch (Exception e) {
				System.out.println("\nError: " + e + " Try again.");
			}
		}
	}

	private void createProject() {
		// TODO Auto-generated method stub
		
	}

	private boolean exitMenu() {
		// TODO Auto-generated method stub
		return false;
	}

	private int getUserSelection() {
		printOperations();
		
		Integer input = getIntInput("Enter a menu selection");
		return Objects.isNull(input) ? -1 : input;
	}

	private Integer getIntInput(String prompt) {
		String input = getstringInput(prompt);
		
		if (Objects.isNull(input)) {
			return null;
		}
		
		try {
			return Integer.valueOf(input);
		}
		catch (NumberFormatException e) {
			throw new DbException(input + "is not a valid number.");
		}
	}

	private String getstringInput(String prompt) {
		System.out.println(prompt + ": ");
		String input = scanner.nextLine();
		
		return input.isBlank() ? null : input.trim();
	}

	private void printOperations() {
		System.out.println();
		System.out.println("\nThese are the available selections. Press the Enter key to quit:");
		
		operations.forEach(line -> System.out.println("  " + line));
				
		
	}

}
