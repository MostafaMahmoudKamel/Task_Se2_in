fun main() {
    //1: Ask the user to enter one integer (Int).
    print("Enter Integer::")
    var integer = readln().toInt()


    //2: Ask the user to enter one double (Double).
    print("Enter Double::")
    var double = readln().toDouble()


    //3: Calculate the quotient of the double divided by the integer
    var quotient = double / integer


    //4: Calculate the remainder when the integer is divided by 3
    var remainder = integer % 3

//    5: Print the results of both calculations.
    println("quotient is = $quotient")
    println("reminder is = $remainder")


//    6: Check if the double is greater than the integer.
    var comparison = double > integer


//    7: Print the result of this comparison.
    println("comparison double greater than integer is = $comparison")


//    8: check if the double is greater than 5 and the integer is greater than 5.
    var comparisonAnd = (double > 5) && (integer > 5)


//    9: check if the double is greater than 5 or the integer is greater than 5.
    var comaprsionOr = (double > 5) || (integer > 5)
//    10: Print the results of these logical operations.
    println("comparisonAnd is = $comparisonAnd")
    println("comparisonOr is = $comaprsionOr")


//    11: Prompt the user to enter an email address.
    print("Enter email ::")
    var email = readln()

//    12: Validate the entered email using a regular expression (regex).
//    val regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()
    val regex = "^[A-Za-z0-9+_.-]+@gmail.com+$".toRegex()


//    13: Print whether the entered email is valid or not
    println("email validation = ${regex.matches(email)}")


}