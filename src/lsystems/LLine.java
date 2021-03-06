package lsystems;

import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		
		try {
			for (LRule rule : rules) {
			
			String match = String.valueOf(rule.getMatch());
			String body = rule.getBody().toString();
			String s = line.toString();	
			
			if (s.equals(match)) {
				
				s.replaceAll(match, body);
				
				this.line = s.toCharArray();
				}
			}
	    } catch ()
		
		
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
