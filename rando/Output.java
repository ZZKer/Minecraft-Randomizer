package rando;

import java.util.List;
import java.util.ArrayList;

public class Output{
	private boolean progressive;
	private List<Integer> options;
	private String regex;
	//only used if progressive
	private Output nextSet;
	
	public Output() {
		progressive = false;
		options = new ArrayList<Integer>();
		regex = "";
	}
	
	public Output(int out, String reg) {
		progressive = false;
		options = new ArrayList<Integer>();
		options.add(out);
		regex = ""+reg;
	}
	
	public Output(int[] outs, String reg) {
		progressive = false;
		options = new ArrayList<Integer>();
		for(int i : outs) {
			options.add(i);
		}
		regex = ""+reg;
	}
	
	public Output(List<Integer> outs, String reg) {
		progressive = false;
		options = new ArrayList<Integer>();
		for(int i : outs) {
			options.add(i);
		}
		regex = ""+reg;
	}
	
	public Output(boolean p, int[] outs, String reg) {
		progressive = p;
		options = new ArrayList<Integer>();
		options.add(outs[0]+0);
		if(p && outs.length > 1) {
			int[] newOuts = new int[outs.length-1];
			for(int i=0; i<newOuts.length; i++) {
				newOuts[i] = 0+outs[i+1];
			}
			nextSet = new Output(p, newOuts, reg);
		} else {
			for(int i : outs) {
				options.add(i);
			}
		}
		regex = ""+reg;
	}
	
	public Output(boolean p, List<Integer> outs, String reg) {
		progressive = p;
		options = new ArrayList<Integer>();
		options.add(outs.remove(0));
		if(!(!(p) || outs.isEmpty())) {
			nextSet = new Output(p, outs, reg);
		}
		else {
			for(int i : outs) {
				options.add(i);
			}
		}
		regex = ""+reg;
	}
	
	public Output(boolean p, int out, String reg, Output nextO) {
		progressive = p;
		options = new ArrayList<Integer>();
		options.add(out);
		regex = ""+reg;
		nextSet = nextO;
	}
	
	public Output(boolean p, List<Integer> outs, String reg, Output nextO) {
		progressive = p;
		options = new ArrayList<Integer>();
		for(int i : outs) {
			options.add(i);
		}
		regex = ""+reg;
		nextSet = nextO;
	}
	
	public boolean isProgressive() {
		return progressive;
	}
	
	public int size() {
		return options.size();
	}
	
	public int getOption(int seededRNGInt) {
		if(options.size() > 0) {
			if(progressive) {
				return options.remove(0);
			}
			else {
				if(seededRNGInt < options.size()) {
					return options.remove(seededRNGInt);
				}
				else {
					return options.remove(0);
				}
			}
		}
		else {
			return -1;
		}
	}
	
	public List<Integer> getRest() {
		return options;
	}
	
	public void add(int x) {
		options.add(x);
	}
	
	public boolean checkExpression(String expres) {
		return (regex.compareTo(expres) == 0);
	}
}