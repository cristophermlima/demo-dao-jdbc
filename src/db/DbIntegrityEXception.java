package db;

public class DbIntegrityEXception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityEXception(String msg) {
		super(msg);
	}
}

