

		public class PunctColorat extends Punct {
		    private String c; 

		    
		    public PunctColorat(int x, int y, String culoare) {
		        super(x, y); 
		        this.c = culoare; 
		    }

		    
		    public void afisare() {
		        System.out.println("Coordonatele punctului: (" + this.getX() + ", " + this.getY() + ")");
		        System.out.println("Codul culorii: " + this.c);
		    }

		    

	}

