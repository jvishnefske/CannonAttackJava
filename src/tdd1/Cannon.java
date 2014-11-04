package tdd1;

public final class Cannon {
	private static Cannon cannonInstance;
	public Cannon getInstance(){
			if (cannonInstance == null){
				cannonInstance=new Cannon();
			}
			return cannonInstance;
	}
	private String cannonID;
	protected Cannon(){
		this.cannonID="Human";
	}
	//static Cannon cannonInstance=Cannon();
	public String getID(){
		return cannonID;
	}
	public void setID(String id){
		this.cannonID = id;
	}
	
}
