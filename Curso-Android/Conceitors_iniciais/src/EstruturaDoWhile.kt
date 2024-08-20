fun main() {
    var i = 0
        do {
            print("${i} ")
            i++
        }while (i != 20)

    do {
        print("Qual o seu nome?")
        val value = readLine()
    }while (value == "")
}