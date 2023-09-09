fun main(args: Array<String>) {
    // задача 1
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved++
    // exercises объявлена  типом val, что означает, что она является неизменяемой
    // а exercisesSolved объявлена с типом var, что означает, что она является изменяемой
    //Оператор ++ используется для увеличения значения переменной exercisesSolved на 1.

    //задача 2
    val myAge: Int = 18
    // val это константа, а  age это обозначение возраста

    //задача 3
    var meAge: Double = 18.0
    meAge = (meAge + 30) / 2
    // double позволяет  писать дробные числа

    //задача 4
    val testNumber = 13
    val evenOdd = testNumber % 2
    // % делит константу testNunber на два оставляя остаток равный 1

    //задача 5
    var answer = 0
    answer++
    answer +=10
    answer *=10
    answer = answer shr 3
    println("znachenie =:$answer")
    // shr смещяет вправо переменную на 3

    //зaдaча 6
    var age: Int
    age =16
    print(age)
    age =30
    // age является переменной ведь она меняется, а print выводит сообщение на экран

    //задача 7
    val x: Int =56
    val y: Int =34
    //1 вар
    val ansver1: Int = (x * 100) * y
    //2 вар
    val ansver2: Int = (x * 100) + (y * 100)
    //3 вар
    val ansver3: Int = (x * 100) + (y / 100)

    //задача 8
    (5 * 3) - (4 / 2 * 2)
    // ну тут все  понятно, математика

    //задача 9
    val  a: Double= 15.0
    val  b: Double= 25.0
    val average = (a + b)/2
    println("rezultat =: $average")
    // (а + б) /2 является фрмулой среднего врифметического числа

    //задача 10
   val fahrenheit: Double = 212.0
    val celcius: Double =( fahrenheit - 32)/ 1.8
    println ("temperatura in celcius:$celcius" )
   //ну получается так

 //задача 11
    val position = 25
    val row = position / 8
    val column = position % 8
    println("position =:$position")
    println("row =:$row")
    println("colemn +:$column =:$position")
    // объясню словами
}