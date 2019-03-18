package rando;

public class Input{
	public static boolean CRAFT = false;
	public static boolean SMELT = true;
	
	private boolean type;
	private String filename;
	
	public Input() {
		type = this.CRAFT;
		filename = "null";
	}
	
	public Input(boolean intype) {
		type = intype;
		filename = "null";
	}
	
	public Input(boolean intype, String file) {
		type = intype;
		filename = ""+file;
	}
	
	public String getName() {
		return filename+"";
	}
	
	public String getFilename() {
		return filename+".json";
	}
	
	public boolean isSmelt() {
		return type;
	}
}