//Acoustic legacy from the father ":Guitar"
class Acoustic: Guitar {
    constructor(marca:String,modelo:String):super(marca,modelo)

    //Override same Methods
    override fun vender():String{
        return "Acoustic Sell"
    }
}