package Adapter_Pattern;

public class Using_Adapter {
	    public static void main(String[] args) {

	        // round fits round, of course
	        RoundHole hole = new RoundHole(5);
	        RoundPeg rpeg = new RoundPeg(5);
	        if (hole.fits(rpeg)) {
	            System.out.println("Round peg r5 fits round hole r5.");
	        }

	        Square_Peg smallSqPeg = new Square_Peg(2);
	        Square_Peg largeSqPeg = new Square_Peg(20);
	        // hole.fits(smallSqPeg); // won't compile

	        // adapter solves the problem
	        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
	        if (hole.fits(smallSqPegAdapter)) {
	            System.out.println("Square peg w2 fits round hole r5.");
	        }

	        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
	        if (!hole.fits(largeSqPegAdapter)) {
	            System.out.println("Square peg w20 does not fit into round hole r5.");
	        }

	    }

	}


