package com.simplilearn.project;

import java.util.Scanner;

public class Utils {
	
	public static int displayOptions() {
		System.out.println("*****************************");
		System.out.println("* Developer: Israel Mwangoka*");
		System.out.println("* App Name:  LockedMe.com   *");
		System.out.println("* 1. List all Files         *");
		System.out.println("* 2. Available Operations   *");
		System.out.println("* 3. Close Application      *");
		System.out.println("*                           *");
		System.out.println("*                           *");
		System.out.println("*****************************");
		System.out.printf( "Please select option: $> ");
		return inputNumberOption();
	}
	
	public static void closeApplication() {
	   System.out.println("Closing application...");
	   System.exit(0);
	}
	
	public static int inputNumberOption() {
		Scanner scanner =  new Scanner(System.in);
		int optionSelected = scanner.nextInt();
		return optionSelected;
	}
	
	public static String inputText() {
		Scanner scanner =  new Scanner(System.in);
		String inputText = scanner.nextLine();
		return inputText;
	}
	
	public static void mainMenuHandler() {
		int option = displayOptions();
		switch(option) {
		case 1:
			FileOperations.displayAllFiles();
		break;
		case 2:
			FileOperations.displayFileOperations();
			break;
		case 3:
			Utils.closeApplication();
		default:
			System.out.println("Allowed options are: [ 1, 2, 3 ]");
		}
	}

}
