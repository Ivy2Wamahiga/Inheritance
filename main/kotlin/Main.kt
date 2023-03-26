//fun main(args: Array<String>) {
   // println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
//}
fun main(args: Array<String>){
    var student1= Student()
    student1.gender="female and male"
    student1.course="Tourism Management"
    println("The class has both ${student1.gender}gender and pursuing ${student1.course} course ")
    student1.curriculum()

    val ladiesa=Ladies()
    ladiesa.gender="female"
    ladiesa.course="Tourism Management"
    println("The class has 25 girls ${ladiesa.gender} and pursuing ${ladiesa. course} course")
    ladiesa.curriculum()
    ladiesa.hockey()

    var boys1=Boys()
    boys1.gender="male"
    boys1.course="Tourism Management"
    println("The class has 32 boys ${boys1.gender}  and pursuing ${boys1.course }course")
    boys1.curriculum()
    boys1.football()
}


open class Student {
    var  gender: String=""
    var course:String=""
    fun curriculum(){

        println("Students are using Tvet curriculum")
    }
}
class Ladies:Student(){
    fun hockey(){
        println("The ladies playing hockey are 25")
    }
}
class Boys:Student(){
    fun football(){
        println("The boys playing football are 32")
    }
}


