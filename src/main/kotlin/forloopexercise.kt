fun main(args: Array<String>) {
    //range between 1 to 100
    //check numbers divisible by the following
    // 3 -Prints fizzbuzz
    // 5 -Prints buzz
    // 15 -Prints Fizz
    for (num in 0..100)
        if (num % 3 == 0){
            println("Fizzbuzz")
        }else if (num % 5 == 0){
            println("Buzz")
        }else if (num % 15 == 0){
            println("Fizz")
        }else{
            println("$num")
        }
}