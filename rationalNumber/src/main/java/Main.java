public class Main {
    public static void main(String[] args) {

        Rational rational = new Rational(8,9);

        System.out.println("8/9 = " + rational.getResult());
        rational.SetNumerator(72);
        rational.SetDenominator(16);
        System.out.println("72/16 = " + rational.getResult());

        System.out.println(rational + "\n");
            
        
        Rational rational1 = new Rational(16,5);
        System.out.println(rational1.getResult());
        System.out.println(rational1);
        System.out.println(rational.compareTo(rational1));


    }

}