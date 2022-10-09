/**
 * Soma de dois números inteiros
 */
fun main(){
//    Entrada de dados
    val primeiroNumero = 10
    val segundoNumero = 10
//    Processamento
//    var soma = primeiroNumero + segundoNumero
    val soma = somarDoisNumeros(primeiroNumero,segundoNumero)
//    Saída de dados
    imprimirSoma(primeiroNumero, segundoNumero, soma)

    imprimirSoma(25,20,
        somarDoisNumeros(25,20))
}

private fun imprimirSoma(primeiroNumero: Int, segundoNumero: Int, soma: Int) {
    println("1° número: $primeiroNumero")
    println("2° número: $segundoNumero")
    println("Soma: $soma")
}

fun somarDoisNumeros(primeiroNumero:Int, segundoNumero:Int):Int {

    return primeiroNumero + segundoNumero
}