package oct21;

import java.io.*;

public class AllFileDetails {
	
	public static void main(String[] args) {
	
		File folder = new File("D:/FreshersTraining/freshersbatch-oct16/Assignments/core_java/Workspace/Eclipse/src/oct21/");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	
		    	System.out.println("File: "+ file.getName() +" \nexists in folder: " + file.getAbsolutePath() + " \nhaving a size of: " + file.length() + " \nmodified on date: " + file.lastModified() + " \nhaving read permision as: " + file.canRead() + " \nhaving write permission as: " + file.canRead() + " \nhaving executable permission as: " + file.canExecute()+ "\n\n\n");
//		    	
//		        System.out.println(file.getName());
		    }
		}
		
	}
}
