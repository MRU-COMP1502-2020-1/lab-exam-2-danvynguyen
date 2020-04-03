package lsystems;

public class A_BC extends LRule{
	
    public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		char[] body = {'B','C'};
		return body;
	}

}
