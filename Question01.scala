object Q1 extends App
{
    class Rational(numer:Int, denom:Int) 
    {
        //require(denominator > 0, "Denominator must be greater than 0")
        def numerator = numer
        def denominator = denom

        def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)

        def neg = new Rational(-this.numerator, this.denominator)

        override def toString(): String = /*numerator + "/" + denominator*/ s"$numerator/$denominator"
    } 

    val object1 = new Rational(1,4)
    //val object2 = new Rational(2,7)

    println("The negative of the relevant rational number:" + object1.neg)
    //val q = object1.add(object2)
    //println("The addition of the relevant two rational numbers:" + q)
}