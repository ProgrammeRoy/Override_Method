//"OPEN" convert class father
open class Guitar(marca:String) {

    //Properties
    var marca:String=""
    var modelo:String=""

    //forced inicialization
    init {
        this.marca = marca
    }

    //Constructor
    constructor(marca: String,modelo:String):this(marca){
        this.modelo = modelo
    }

    //Write "open" allow override method
    open fun vender():String{
        return "Guitar Sell"
    }
}