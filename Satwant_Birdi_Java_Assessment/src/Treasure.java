//all treasure attributes
//add other variables specifically for the treasure

public class Treasure extends Swamp {
	
	public Treasure(int coordNS, int coordEW) {
	
		super(coordNS, coordEW);
			
		}	
		
		public String toString( ) {
			
			return "Treasure position coordinates. North/south: " + coordNS + "and east/west: " + coordEW;
			
		}
			    		    	
	}
	
