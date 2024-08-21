//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var op = Operaciones(4.5,5.5)
    var op1 = Operaciones(4.5,5.5)
    var op2 = Operaciones(4.5,5.5)
    var op3 = Operaciones(4.5,5.5)
    var op4 = Operaciones(4.5,5.5)
    var op5 = Operaciones(4.5,5.5)

    val miLista: MutableList<Operaciones> = mutableListOf()
    miLista.add(op)
    miLista.add(op1)
    miLista.add(op2)
    miLista.add(op3)
    miLista.add(op4)
    miLista.add(op5)

    for (i in miLista){
        println(i)
    }

//    op.suma()
//    op.resta()
//    println(" La division es: ${op.div()}")
//    op.raiz(4.0)
//    println( op.cuadrado(2.0))
}