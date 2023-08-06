package com.devpuntocom.fundamentoskotlin.Retos.retoIII

class subasta {
}
fun main(){
    println("Ingrese el numero de articulos que se van a vender")
    var art : Int = readln().toInt()
    println("Ingrese el numero de ofertantes")
    var ofertantes : Int = readln().toInt()
    var Nauto : Int = 0
    var maxOferta : Double = 0.0
    if (ofertantes == 0){
        println("No hay ofertantes por lo cual se va a vender al precio base a la casa de subastas")
    }
    else{

        for (i in 1..art){
            println("nombre del articulo")
            var nArt : String = readln().toString()
            println("por favor digite el precio base del articulo")
            var pArticulo : Double = readln().toDouble()
            Nauto = Nauto + 1
            for (i in 1..ofertantes){

                println("oferta $Nauto")
                var oferta : Double = readln().toDouble()
                if (oferta>maxOferta){
                    maxOferta = oferta
                    println("Por ahora el precio que va ganando es de $maxOferta")
                }
                else{
                    println("no hay ofertas")
                }

            }


        }

    }

}