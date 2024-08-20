fun main() {
    for (i in 1..10){
        print("${i} ")
    }

    print("\n")

    for (i in 10 downTo 1){
        print("${i} ")
    }

    print("\n")

    val str = "frase placeholder"

    for (i in str) {
        print("${i} ")
    }

    print("\n")

    for (i in 20 downTo 1 step 3){
        print("${i} ")
    }
}