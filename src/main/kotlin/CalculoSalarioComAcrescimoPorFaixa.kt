/**
 * Calcular um salário acrescido de aumento salarial por faixa
 * Informar salário atual
 * Verificar:
 * Para salário atual <= 800
 * SIM: Aplicar acréscimo de 1,25
 * NÃO: Aplicar acréscimo de 1,05
 * Imprimir novo salário atual
 */
import java.util.Scanner

fun main() {
//    Entrada de dados

    val salarioAtual = Scanner(System.`in`)
    print(message = "Inorme o Salário Atual: ")
    val integer:Int = salarioAtual.nextInt()
    val a:Double
    val b:Double


//    Processamento
    if (integer <= 800.00) {
        a = (integer * 1.25)
        println(message = "Salário atual (Acréscimo de 1.25): R$ $a")
    } else {
        b = (integer * 1.05)
        println(message = "Salário atual (Acréscimo de 1.05): R$ $b")
    }
//    Saída de dados }
}