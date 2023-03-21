fun main(args: Array<String>) {
    //build a simple grading system
    //80 -100 A
    //70-79 A-
    //69-60 B
    //if E, tell the student to repeat the examination

    println("Enter your marks: ")
    var grade:Int = readLine()!!.toInt()

    if (grade >= 80 ){
        print("A Congratulations")

    }
    else if (grade >=70) {
        print(" A- Congratulations")
    }
    else if (grade >=60) {
        print(" B+ Congratulations")
    }
    else if (grade >=50) {
        print(" B Excellent")
    }
    else if (grade >=40) {
        print(" B- Good trial")
    }
    else if (grade >=30) {
        print(" C+ Good trial")
    }
    else if (grade >=20) {
        print(" D+ You can do better")
    }

    else if (grade <=10) {
        print("E You have to repeat the examination")
    }

    }


