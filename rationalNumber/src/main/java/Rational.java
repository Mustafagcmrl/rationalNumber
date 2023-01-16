public class Rational implements Comparable<Rational>{

    private static int numberOfObjects = 0;
    private int numerator;
    private int denominator;
    private double result;

    public Rational(int numerator, int denominator){ //constructor
       this.numerator = numerator;
       this.denominator = denominator;
       result = (double)numerator/denominator;
       numberOfObjects += 1;
    }

    @Override
    public int compareTo(Rational o) { //Method Comparable interface'inden geliyor fakat override ederek içini doldurmak zorundayız.

        if(result == o.getResult()){ //Karşılaştırılan objedeki result değeriyle eşitse "0" döndür.
            return 0;
        }
        else if(result > o.getResult()){ //Karşılaştırılan objedeki result değerinden büyükse "1" döndür.
            return 1;
        }
        else{ //Karşılaştırılan objedeki result değerinden küçükse "-1" döndür.
            return -1;
        }

    }


    public void SetNumerator(int value){ //sets numerator
        numerator = value;
        setResult(); //updates result
    }

    public void SetDenominator(int value){ //sets denominator
        denominator = value;
        setResult(); //updates result
    }

    public int GetNumerator(){ //returns numerator
        return numerator;
    }

    public int GetDenominator(){ //returns denominator
        return denominator;
    }

    public double getResult(){ //Sonuç değerini döndürür.
        return result;
    }

    private void setResult(){
        this.result = (double)numerator/denominator;
    }

    public int objectNumber(){ //Rational class'ından kaç adet obje oluşturulduğunu döndürür.
        return numberOfObjects;
    }


    @Override
    public String toString(){ //Java'da System.out.println() object class'ındaki toString methodunu çağırır.
                              //System.out.println(rational) yazıldığında class ismi ve bir adres döndürür.
                              //Ama bu methodu class içinde override ederek System.out.println(rational) şeklindeki
                              //Kullanımlarda istediğimiz herhangi bir yazıyı/veriyi bastırabilir.
        return (numerator + "/" + denominator);
    }

}
