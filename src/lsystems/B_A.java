package lsystems;

public class B_A extends LRule{

    public char getMatch() {
		return 'B';
	}
	
	public char[] getBody() {
		char[] body = {'A'};
		return body;
	}

}
