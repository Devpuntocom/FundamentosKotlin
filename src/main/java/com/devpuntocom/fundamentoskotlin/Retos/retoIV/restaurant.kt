package com.devpuntocom.fundamentoskotlin.Retos.retoIV

class restaurant {
}
fun main(){
    var salir = false
    println("menu de un restaurante")
    println("Digite la opcion que desea")
    var entradaNueva : String = ""
    var platoFuerteNuevo : String = ""
    var postreNuevo : String = ""
    var bebidaNueva : String = ""


    while (!salir){
        println("1. Entradas")
        println("2. Platos fuertes")
        println("3. Postre")
        println("4. Bebidas")
        println("5. Salir")
        var eleccion : Int = readln().toInt()
        when (eleccion){
            1->{
                println("Usted Entro a las Entradas")
                val Entrada1:String = "empanada con precio de $4000 \n descripcion \n empanada muy buena de carne"
                val Entrada2:String = "Papa con precio de $4000 \n descripcion \n papa de carne muy buena"
                val Entrada3:String = "Arepa de huevo con precio de $4000 \n" +
                        " descripcion \narepa de huevo la mejor"
                var resultadoEntrada : String="Las entradas principales son :\n $Entrada1 \n $Entrada2\n $Entrada3"
                println(resultadoEntrada)
                println("1. Agregar")
                println("Ingrese la opcion")
                var entradaNueva : Int = readln().toInt()
                when(entradaNueva){
                    1->{
                        println("Ingrese la entrada nueva")
                        var entradaNueva = readln().toString()
                        println("Las entradas actualizadas son : \n$resultadoEntrada \n$entradaNueva")
                    }
                }


            }
            2->{
                println("Usted Entro a los platos fuertes")
                val platoFuerte1:String = "Bandeja Paisa con precio de $20000 \n" +
                        " descripcion \nbandeja paisa traida de medellin"
                val platoFuerte2:String = "Caldo de Costilla con precio de $20000 \n" +
                        " descripcion \ncostilla de res de las mas mela"
                val platoFuerte3:String = "Tamal Tolimense con precio de $20000 \n" +
                        " descripcion \nTamal directamente traido del toli,a"
                var resultadoPlatoFuerte : String="Las entradas principales son :\n $platoFuerte1 \n $platoFuerte2\n $platoFuerte3"
                println(resultadoPlatoFuerte)
                println("1. Agregar")
                println("Ingrese la opcion")
                var platoFuerteNuevo : Int = readln().toInt()
                when(platoFuerteNuevo){
                    1->{
                        println("Ingrese la entrada nueva")
                        var platoFuerteNuevo = readln().toString()
                        println("Las entradas actualizadas son : \n$resultadoPlatoFuerte \n$platoFuerteNuevo")
                    }
                }
            }
            3->{
                println("Usted entro a los postres")
                val postre1:String = "postre de maracuya con precio de $7000 \n" +
                        " descripcion \npostre de maracuya de los mejores"
                val postre2:String = "Postre de chocolate con precio de $7000 \n" +
                        " descripcion \n Chocolate echo con el cacao mas melo"
                val postre3:String = "postre de bocadillo con precio de $7000\n" +
                        " descripcion \nBocadillo echo con la mejor "
                var resultadoPostre : String="Las entradas principales son :\n $postre1 \n $postre2\n $postre3"
                println(resultadoPostre)
                println("1. Agregar")
                println("Ingrese la opcion")
                var postreNuevo : Int = readln().toInt()
                when(postreNuevo){
                    1->{
                        println("Ingrese la entrada nueva")
                        var postreNuevo = readln().toString()
                        println("Las entradas actualizadas son : \n$resultadoPostre \n$postreNuevo")
                    }
                }
            }

            4->{
                println("Usted entro a las bebidad")
                val bebida1:String = "Jugo de lulo con precio de $4000 \n" +
                        " descripcion \n con lulo de la mejor calidad"
                val bebida2:String = "Jugo de mango con precio de $4000 \n" +
                        " descripcion \n manguito del mas melo"
                val bebida3:String = "jugo de Guayaba con precio de $4000\n" +
                        " descripcion \nLa guayaba mas Agropecuaria del mundo"
                var resultadoPostre : String="Las entradas principales son :\n $bebida1 \n $bebida2\n $bebida3"
                println(resultadoPostre)
                println("1. Agregar")
                println("Ingrese la opcion")
                var postreNuevo : Int = readln().toInt()
                when(postreNuevo){
                    1->{
                        println("Ingrese la entrada nueva")
                        var postreNuevo = readln().toString()
                        println("Las entradas actualizadas son : \n$resultadoPostre \n$postreNuevo")
                    }
                }
            }
            5->{

                println("saliendo \n :))")
                salir = true
            }
        }



    }



}