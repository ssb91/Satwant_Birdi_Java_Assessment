public abstract class Swamp {

//coordinates in arbitrary units, north(+)/south(-), and distance travelled east(+)/west(-)

	int a; int b; 
	int x; int y;
	int coordNS;
	int coordEW;
	
	public Swamp(int setcoordNS, int setcoordEW) {

//pass initial variables to new method swamp
		
		coordNS = setcoordNS;
		coordEW = setcoordEW;
				
	}	
	
}

