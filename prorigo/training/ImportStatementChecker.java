package com.prorigo.training;

import java.io.*;
import java.util.*;

public class ImportStatementChecker {

	public static void main(String[] args) {
		String folderPath = "C:\\Users\\pardeepy\\eclipse-workspace\\helloword\\src";
		File folder = new File(folderPath);

		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Invalid folder path.");
			return;
		}

		Map<String, Integer> importCountMap = new HashMap<>();

		for (File file : folder.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".java")) {
				try {
					BufferedReader reader = new BufferedReader(new FileReader(file));
					String line;
					while ((line = reader.readLine()) != null) {
						if (line.trim().startsWith("import ")) {
							String importStatement = line.trim();
							importCountMap.put(importStatement, importCountMap.getOrDefault(importStatement, 0) + 1);
						}
					}
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Duplicate Import Statements:");
		for (Map.Entry<String, Integer> entry : importCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
			}
		}

		System.out.println("\nTotal Unique Import Statements: " + importCountMap.size());
	}
}
