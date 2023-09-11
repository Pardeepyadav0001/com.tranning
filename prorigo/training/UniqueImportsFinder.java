package com.prorigo.training;

import java.io.*;
import java.util.*;

public class UniqueImportsFinder {

	public static void abc(String folderPath) {

		File folder = new File(folderPath);// folder path loaded

		if (!folder.exists() || !folder.isDirectory()) {// checking folder exist or not
			System.out.println("Invalid folder path.");
			return;
		}

		Map<String, Integer> importCountMap = new HashMap<>();// creating map using hashmap

		for (File file : folder.listFiles()) {// ittrate files from folder
			if (file.isFile() && file.getName().endsWith(".java")) {// findes the java files and get program name
				try {
					BufferedReader reader = new BufferedReader(new FileReader(file));// read the files with help of
																						// buffer reader lib
					String line;
					while ((line = reader.readLine()) != null) {
						if (line.trim().startsWith("import ")) {// count the text when import occur
							String importStatement = line.trim();
							importCountMap.put(importStatement, importCountMap.getOrDefault(importStatement, 0) + 1);
						}
					}
					reader.close();
				} catch (IOException e) {
					System.out.println("Input and output error");
					e.printStackTrace();// print the exeception which saved in e lib
				}
			}
		}

		System.out.println("Duplicate Import Statements:");
		for (Map.Entry<String, Integer> entry : importCountMap.entrySet()) {// get entry set from map
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
			}
		}

		System.out.println("\nTotal Unique Import Statements: " + importCountMap.size());// print total unique imports
	}

	public static void main(String[] args) {

	}
}