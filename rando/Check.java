package rando;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Check{
	private int[] inputs;
	private String requirement;//regular expression used to check
	
	public Check() {
		inputs = new int[0];
		requirement = "";
	}
	
	public Check(int[] i, String r){
		inputs = i;
		requirement = "" + r;
	}
	
	public Check(List<Integer> i, String r){
		inputs = new int[i.size()];
		for(int x=0; x<i.size(); x++) {
			inputs[x] = i.get(x);
		}
		requirement = "" + r;
	}
	
	public boolean checkin(String item){
		String itemFix = item.substring(0,1)+"*"+item.substring(1)+"*";
		requirement = requirement.replaceAll(item, itemFix);
		if(Pattern.matches(requirement, "")){
			return true;
		}
		return false;
	}
	
	public int[] getInputs(){
		return inputs;
	}
}