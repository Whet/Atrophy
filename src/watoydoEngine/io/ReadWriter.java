/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



// TODO: Auto-generated Javadoc
//reads and writes files with .watoydo
/*
 * Under heavy reconstruction
 */
/**
 * The Class ReadWriter.
 */
public class ReadWriter{
	
	/**
	 * The Constant ESCAPE_COMMA.
	 */
	private static final Character ESCAPE_COMMA = '~';
	
	/**
	 * Read from array.
	 *
	 * @param inputline the inputline
	 * @param index the index
	 * @return the string
	 */
	public static String readFromArray(String inputline, int index){
		if(!inputline.equals("")){
			char[] inputChars = new char[inputline.length()];
			
			inputChars = inputline.toCharArray();
			
			StringBuilder sb = new StringBuilder();
			
			int indexCount = -1;
			
			String returnString = "";
			
			boolean ignoreComma = false;
			
			// Array written as [i1,i2,i3]
			// [] are ignored
			// at every , delete the current entry and increase the indexCount
			
			// skip past any commands before brackets e.g addButton[], addButton should be ignored
			int j = 0;
			while(!Character.toString(inputChars[j]).equals("[")){
			j++;
			}
			
			// have to set i=i for formatting issues
			for(int i = j; i < inputChars.length; i++){
				if(Character.toString(inputChars[i]).equals("[") || (Character.toString(inputChars[i]).equals(",") && !ignoreComma) || Character.toString(inputChars[i]).equals("]")){
					if(indexCount == index){
						returnString = sb.toString();
						return returnString;
					}
					else{
						// Empty buffer
						sb.delete(0, sb.length());
						indexCount++;
					}
				}
				else{
					
					if(inputChars[i] == ESCAPE_COMMA){
						ignoreComma = !ignoreComma;
						continue;
					}
					
					sb.append(Character.toString(inputChars[i]));
				}
			}
		}
		
		return "";
		
	}
	
	// get size of a text array by counting commas
	// it is assumed that the entry is an array
	/**
	 * Gets the array size.
	 *
	 * @param inputline the inputline
	 * @return the array size
	 */
	public static int getArraySize(String inputline){
		
		int entries = 1;
		
		char[] inputChars = new char[inputline.length()];
		
		inputChars = inputline.toCharArray();
		
		boolean ignoreComma = false;
		
		for(int i = 0; i < inputChars.length; i++){
			// every comma states there is another entry in the array
			if(inputChars[i] == ',' && !ignoreComma){
				++entries;
			}
			else if(inputChars[i] == ESCAPE_COMMA){
				ignoreComma = !ignoreComma;
			}
		}
		return entries;
	}
	
	// Code from anon on /v/idya gamedev thread
    /**
	 * Gets the resource as input stream.
	 *
	 * @param resource the resource
	 * @return the resource as input stream
	 * @throws FileNotFoundException the file not found exception
	 */
	public static InputStream getResourceAsInputStream(String resource) throws FileNotFoundException {
    	
		InputStream resourceInputStream = ReadWriter.class.getClassLoader().getResourceAsStream("watoydoEngine/mods/"+resource);
		
		if (resourceInputStream == null){
			File file = new File(resource);
			if (file.exists()) {
				resourceInputStream = new FileInputStream(file);
			}
		}
		
		if (resourceInputStream == null){
			throw new FileNotFoundException(resource);
		}
		
		return resourceInputStream;
	}
	
	/**
	 * Gets the root file.
	 *
	 * @param resource the resource
	 * @return the root file
	 * @throws FileNotFoundException the file not found exception
	 */
	public static File getRootFile(String resource) throws FileNotFoundException {
		String homeLocation = System.getProperty("user.home");
		
//		System.out.println(homeLocation);
//		System.out.println(homeLocation + "/" + resource);
		
		File file =  new File(homeLocation + "/Atrophy/" + resource);
		
//		System.out.println("FILE EXISTS:  " + file.exists());
		
		if(!file.exists())
			throw new FileNotFoundException();
		
		return file;
	}
	
	/**
	 * Read from file.
	 *
	 * @param file the file
	 * @param line the line
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static String readFromFile(File file, int line) throws IOException{
		
		BufferedReader in = null;
		String returnString = "";
		try{
           in = new BufferedReader(new FileReader(file));
		   for(int i = 0; i < line; i++){
				in.readLine();
		   }
		   returnString = in.readLine();
		   in.close();
		  
        }
		finally{
			in.close();
		}
		
		return returnString;
	}

	/**
	 * Read from file.
	 *
	 * @param inputStream the input stream
	 * @param line the line
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static String readFromFile(InputStream inputStream, int line) throws IOException{
		BufferedReader in = null;
		String returnString = "";
		try{
           in = new BufferedReader(new InputStreamReader(inputStream));
		   for(int i = 0; i < line; i++){
				in.readLine();
		   }
		   returnString = in.readLine();
		   in.close();
		  
        }
		finally{
			in.close();
		}
		
		return returnString;
	}
	
	
	
	
}
