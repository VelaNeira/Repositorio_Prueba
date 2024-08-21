class Operaciones(var n1:Double, var n2:Double) {
    fun suma(){
        var suma = n2 + n1
        println(suma)
    }

    fun resta() {
        var resta = n1 - n2
        println(resta)
    }

    fun div():Double{
        return n1/n2
    }

    fun raiz(x:Double){
        var r = Math.sqrt(x)
        println(r)
    }

    fun cuadrado(c:Double):String{
        return "El cuadrado es: ${Math.pow(c,2.0)}"
    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }

}