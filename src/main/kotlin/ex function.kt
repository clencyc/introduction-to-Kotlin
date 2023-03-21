fun main(args: Array<String>) {
    //function that adds 2 numbers
    //sum total is 800

    //create another function to multiply
    //result to be 2000

    //Divide
    //result to be 20
    addsnum(num1 = 400, num2 = 400)
    multiply()
    divide()
}
fun addsnum(num1:Int, num2:Int){
    var result = num1 + num2
    println(result)

}
fun multiply(){
    var mul1 = 200
    var mul2 = 10

    var result = mul1 * mul2
    println(result)

}
fun divide(){
    var div1 = 200
    var div2 = 10

    var result = div1 / div2
    println(result)
}