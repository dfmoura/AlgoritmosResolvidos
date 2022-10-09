/**
 * Calcular um salário acrescido de aumento salarial por faixa
 * Informar salário atual
 * Verificar:
 * Para salário atual <= 800
 * SIM: Aplicar acréscimo de 1,25
 * NÃO: Aplicar acréscimo de 1,05
 * Imprimir novo salário atual
 */

fun main() {
//    Entrada de dados

    val salarioAtual = 1000

//    Processamento
    if (salarioAtual <= 800.00) {
        (salarioAtual * 1.25).toInt()
        println(message = "Salário atual (Acréscimo de 1.25): R$ $salarioAtual")
    } else {
        (salarioAtual * 1.05).toInt()

//    Saída de dados
        println(message = "Salário atual (Acréscimo de 1.05): R$ $salarioAtual")
    }
}