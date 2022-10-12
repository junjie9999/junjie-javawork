package Adapter_Pattern;

public class SquarePegAdapter extends RoundPeg {
    private Square_Peg peg;

    public SquarePegAdapter(Square_Peg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        //calculate a minimum circle radius, which can fit this peg
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }

}