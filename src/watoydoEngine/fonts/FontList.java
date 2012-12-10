/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import watoydoEngine.io.ReadWriter;

/**
 * The Class FontList.
 */
public class FontList {
	
	/**
	 * The Constant AUD14.
	 */
	public static final Font AUD14;
	
	/**
	 * The Constant AUD16.
	 */
	public static final Font AUD16;
	
	/**
	 * The Constant AUD18.
	 */
	public static final Font AUD18;
	
	/**
	 * The Constant AUD24.
	 */
	public static final Font AUD24;
	
	static{
		
		Font dynamicFont = null;
	    
		try {
			dynamicFont = Font.createFont(Font.TRUETYPE_FONT, ReadWriter.getResourceAsInputStream("fonts/AUDIMRG_.TTF"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	   
		AUD14 = dynamicFont.deriveFont(14f);
		AUD16 = dynamicFont.deriveFont(16f);
		AUD18 = dynamicFont.deriveFont(18f);
		AUD24 = dynamicFont.deriveFont(24f);
	}
	
	public static String digitString(int digits, int number) {
		
		int length = (int)(Math.log10(number)+1);
		
		if(length > digits)
			return Integer.toString(number);
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(number);
		
		for(int i = 0; i < digits - length; i++) {
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
}
