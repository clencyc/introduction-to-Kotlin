fun main(args: Array<String>) {
    //build a simple *544# ussd app
    //using when statements
    println("Enter number:")
    var num = readLine()!!.toInt()

    when(num){
        1-> println("Sh20=1GB for 1hr")
        2-> println("Data deals")
        3-> println("Daily Bundles")
        4-> println("Weekly bundles")
        5-> println("GO MONTHLY")
        6-> println("NO Expiry")
        7-> println("Video Bundles")
        8-> println("Okoa Data")
        9-> println("Lipa Mdogo")
        10-> println("Data plus new")
        11-> println("MORE")

        else -> println("Invalid characters")
    }
}