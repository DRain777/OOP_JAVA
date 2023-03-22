package Task.RoundHoleMachin;

public class HomeWorkMain {

    public static void main(String[] args) {
        RoundHoleMachine machin = new RoundHoleMachine();

        RoundPeg roundPeg = new RoundPeg() {
            @Override
            public double radius() {
                return 10.0;
            }
        }; 
        RoundHole roundHole = machin.create(roundPeg);
        System.out.println(roundHole.radius());

        SquarePeg squarePeg = new SquarePeg(){
            @Override
            public double side() {
                return 10.0;
            }
        };
        RoundHole roundHole2 = machin.create(new SquarePegAdapter(squarePeg));
        System.out.println(roundHole2.radius());

    }

    public static class SquarePegAdapter implements RoundPeg {
        private final SquarePeg squarePeg;

        public SquarePegAdapter(SquarePeg squarePeg) {
            this.squarePeg = squarePeg;
        }
        @Override
        public double radius() {
            // вычислить такой радиус ,что бы в него влез squarePeg
            double x = squarePeg.side();
            double radius = Math.sqrt(2*x*x) / 2.0;
            
            return radius;
        }
    }

   public static class RoundHoleMachine {

        public RoundHole create(RoundPeg peg) {
            return new RoundHole() {
                @Override
                public double radius(){
                    return peg.radius();
                }
            };
        }

    }

   // public static class DefaultRoundHole implements RoundHole {
     

  //  }

    public interface RoundPeg {
        double radius();
    }

    public interface RoundHole {
        double radius();
    }

    public interface SquarePeg {
        double side();
    }

}
