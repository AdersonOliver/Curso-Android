fun main() {

    //idoso - 60 mais
    //adulto 21 a 59
    //jovem 13 entre 20
    //criança 12 anos a baixo

    var idade:Int = 20

    if(idade >= 60){
        println("idoso")
    }else if (idade >=21 && idade <= 59){
        println("Adulto")
    }else if (idade >= 13 && idade <= 20){
        println("Jovem")
    }else{
        println("Criança")
    }
}