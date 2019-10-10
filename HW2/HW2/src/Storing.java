
public class Storing implements Table_Store,Document_Store,Node_Store {
	
	private int dbAlgorithm = 0; //selection int
	public Storing(int inAlgorithm){ 
		dbAlgorithm = inAlgorithm;
		store(); //Our default chosen store algorithm 
		setStoreStrategy(); // A randomly chosen other strategy. 
		store();
	}
	
	private void store(){ // Our default store method.
		//A switch could be used here but meh.
		if(dbAlgorithm == 1){
			tableStore();
		}
		if(dbAlgorithm == 2){
			documentStore();
		}
		if(dbAlgorithm == 3){
			nodeStore();
		}
	}
	
	private void setStoreStrategy(){ //A simple change of strategy by incrementing by one.
		System.out.println("New store strategy being used.");
		dbAlgorithm++;
		if(dbAlgorithm >= 4){
			dbAlgorithm = 1;
		}		
	}	
}
