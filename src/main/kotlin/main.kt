



    //Variable de tipo funcion que recibe dos int y devuelve uno
    //suma
    var numero: (Int, Int) -> Int = {n1: Int, n2: Int -> n1 + n2}





    //Variable que recibe dos int y devuelve un boolean
    var afirmacion: (Int, Int) -> Boolean = { n1: Int, n2: Int -> n1 < n2}

    var afirmacion2: (Int, Int) -> Boolean = { n1: Int, n2: Int -> n1%2 + n2%2 == 0}


    //tabla del 2
    val tabla2 = Array<Int>(11, {indice -> indice * 2})
    //tabla del 2 con it
    val tablait = Array<Int>( 11, {it * 2 }  )

    val tabla3 = Array<Int>( 11, {it * 3 }  )

    val tabla4 = Array<Int>( 11, {it * 4 }  )

    val nombres = arrayListOf("Adam","Andrew","Chike","Kechi")

    fun main(args: Array<String>) {

        //Variable de tipo funcion que recibe dos int y devuelve uno
        //resta
        numero = {n1: Int, n2: Int -> n1 - n2}
        println(afirmacion(1,2))
        println(afirmacion2(2,2))

        tabla2.forEach{
            println("2*${it/2} = ${it}")
        }

        var longitud =6
        fun filtrarLenghth(longitud: Int){

            nombres.filter{
                nombres[1].length == longitud
            }.forEach{
                println(it)
            }
        }

}