fun main(args: Array<String>) {
//    classWork();
    homeWork()


}

fun homeWork () {
    println("Home work 4");

    fun plusFiveElementsToArray(array: Array<Int>):Array<Int>{
        var i = array[array.lastIndex]+1;
        val newArray = Array(5, {i++});
        val resultArray = array
        return  resultArray.plus(newArray)
    }

    fun  reverseArray(array: Array<String>):Array<String>{
        array.reverse();
        return  array;
    }

    var indexFirstArray = 0;
    val firstArray = Array(5, {indexFirstArray++});

    println("First array ${firstArray.joinToString()}");
    println("Result work: plusFiveElementsToArray ${plusFiveElementsToArray(firstArray).joinToString()}");
    print("Enter string: ")
    val string = readln();
    val arrayForString:Array<String> = string.toCharArray().map{it.toString()}.toTypedArray();
    val result = reverseArray(arrayForString)
    println("Result work  ${result.joinToString()}");
    println("Reverse string $string : ${result.joinToString(separator = "")}");

}

fun classWork ():Unit{
    println("Class work 4")

    val arrayNumber = arrayOf(5, 7, 8);

    val arraySecondNumber = arrayNumber.plus(18)

    println(arrayNumber.joinToString())
    println(arraySecondNumber.joinToString())

    var i = 2

    val numbers = Array(9, { x ->
        println( "x : $x");
        x+3
    });

    var students = arrayOf(
        "Sam",
        "John",
        "Maria",
        "Kate"
    )
    students.forEach { el -> println("Student name id $el") };
    students = students.plus("Ivan")
    println("----------------------------------")
    students.forEach {
        println(it)
    }
    println("----------------------------------");
    for(student in students){
        println(student);
    }
    students.reverse();
    println("----------------------------------");
    for(student in students) {
        println(student);
    }
    students = students.plus("Anna")
    students.sort();
    println("----------------------------------");
    for(student in students) {
        println(student);
    }

    val arrayNumberSort = arrayOf(3, 7, 8, 2, 4, 2, 6, 1)
    arrayNumberSort.sort();
    println("----------------------------------");
    for(number in arrayNumberSort) {
        println(number);
    }
    arrayNumberSort.sortDescending();
    println("----------------------------------");
    for(number in arrayNumberSort) {
        println(number);
    }
    students.sortBy { el ->
        el.length
    }
    println("----------------------------------");
    for(student in students) {
        println(student);
    }
    students.sortBy { el ->
        el.length
    }
    println("----------------------------------");
    for(student in students) {
        println(student);
    }
    students.reverse()
    println("----------------------------------");
    for(student in students) {
        println(student);
    }

    println("----------------------------------");
    fun createArrayWithSameNumber(size: Int, parameter: Int): Array<Int> {
        return Array(size, { parameter })
    }

    println(createArrayWithSameNumber(9, 3).joinToString())


//    println(numbers.joinToString())
//    println(students.joinToString())
}