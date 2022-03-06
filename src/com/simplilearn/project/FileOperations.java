package com.simplilearn.project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileOperations {
	
	public static String DIR_NAME = "/tmp";
	
	public static void displayAllFiles() {
		File[] files = new File(DIR_NAME).listFiles();
		Arrays.sort(files);
		System.out.println();
		System.out.println("****** Available files are: ***********");
		for(int i = 0; i < files.length; i++ ) {
			System.out.println((i + 1) + ". "  + files[i].getName());
		}
	}
	
	public static void displayFileOperations() {
		System.out.println("1. Add file");
		System.out.println("2. Delete file");
		System.out.println("3. Search file");
		System.out.println("4. Return to main");
		System.out.println();
		int option = Utils.inputNumberOption();
		switch(option) {
		case 1:
			addFile();
			break;
		case 2:
			deleteFile();
			break;
		case 3:
			searchFile();
			break;
		case 4:
			Utils.mainMenuHandler();
			break;
		default:
			System.err.println("Operation not supported, allowed: [1,2,3,4]");
			System.exit(0);
		}
	}
	
	public static void addFile() {
		System.out.println("Enter file name to add :> ");
		File f = getFile();
		try {
			if(f.createNewFile()) {
				System.out.println("File sucessfully created");
			}else{
				System.err.println("Failed to create the file");
			};
			displayFileOperations();
		} catch (IOException e) {
			System.err.println("Failed to create file: " + f.getName());
		}
	}
	
	public static void deleteFile() {
		System.out.println("Enter file name to delete :> ");
		File f = getFile();
	    if(f.delete()) {
	    	System.out.println("File successfully deleted");
	    }else{
	    	System.out.println("Failed to delete the file");
	    };
	    displayFileOperations();
	}
	
	public static void searchFile() {
		System.out.println("Enter file name to search :> ");
		File f = getFile();
		if(f.exists()) {
			System.out.println("File found");
		}else {
			System.out.println("File Not Found");
		}
		displayFileOperations();
	}
	
	public static File getFile() {
		String fileName =  Utils.inputText();
		return new File(DIR_NAME + "/" + fileName);
	}

}
