fun main(){
	var x:String
    var a:Int
    var b:Int
    
    a = 10
    b = 2
    
    x = calculate(a,b,::sum) // 3º parametro referencia ao tipo do calculo
    
    println("--Calculadora--")
    println("Valor de A = $a")
    println("Valor de B = $b\n")
    println("Resultado " + x)
}

fun sum(a:Int, b:Int) = "SOMA: " + a.plus(b)
fun sub(a:Int, b:Int) = "SUBTRAÇÃO: " + a.minus(b)
fun div(a:Int, b:Int) = "DIVISÃO: " + a.div(b)
fun mult(a:Int, b:Int) = "MULTIPLICAÇÃO: " + a.times(b)

fun calculate(a:Int, b:Int, operation:(Int,Int)->String):String {
    var result = operation(a,b)
    return result
}