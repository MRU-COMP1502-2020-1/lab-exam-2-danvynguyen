package lsystems;

public class A_Q extends LRule{

    public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		char[] body = {'Q'};
		return body;
	}

}
