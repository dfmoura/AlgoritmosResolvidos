/**
 * Média Ponderada Simples - Duas Notas
 */
fun main(){
//    Entrada de dados
    val primeiroNota = 2  //val=imutável var=mutável
    val segundaNota = 7

//    Processamento
    val mediaAritmetica = medAritmeticaDuasNotas(primeiroNota,segundaNota)

//    Saída de dados
    imprimirMediaSimples(primeiroNota, segundaNota, mediaAritmetica)

    imprimirMediaSimples(25,20,
        medAritmeticaDuasNotas(25,20))
}

private fun imprimirMediaSimples(primeiroNota: Int, segundaNota: Int, mediaAritmetica: Int) {
    println("1° nota: $primeiroNota")
    println("2° nota: $segundaNota")
    println("Média Aritmética: $mediaAritmetica")
}

fun medAritmeticaDuasNotas(primeiroNota:Int, segundaNota:Int):Int {

    return (primeiroNota + segundaNota)/2
}