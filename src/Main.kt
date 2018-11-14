fun main(args: Array<String>){

    /*
    1.Class father(Guitar)
      -Write "open" before class
      -Write "open" before method
    2.Class son(Acoustic)
      -Write "override" before method to override with the SAME NAME and the SAME TYPE
   */

    //Build class guitar
    val guitar = Guitar("Fender")
    println("Method original: "+guitar.vender())

    //Build class Acoustic
    val acoustic = Acoustic("Epiphone","Rosewood")
    println("Method override: "+acoustic.vender())

}