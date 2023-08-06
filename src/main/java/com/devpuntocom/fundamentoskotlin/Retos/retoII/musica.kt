package com.devpuntocom.fundamentoskotlin.Retos.retoII

import java.util.Date

class musica {
}

fun main(){
    var popular = ""
    println("ingrese el numero de canciones")
    var n : Int = readln().toInt()
    println("digite el tipo de musica del album")
    var categoria : String = readln().toString()
    var max = 0
    val popularidad = 1000
    for (i in 1..n){
        println("por favor digite el titulo de la cancion")
        var tituloCancion : String = readln().toString()
        println("por favor digite el artista de la cancion")
        var artistaCancion : String = readln().toString()
        println("por favor digite el año de la cancion")
        var añoCancion : Int = readln().toInt()
        println("por favor digite las reproducciones de la cancion")
        var reproCancion : Int = readln().toInt()
        if (max<reproCancion){
            max = reproCancion
        }
        else{
            println("Dato Invalido")
        }
        if (reproCancion>popularidad){
            popular ="popular"
        }
        else{
            popular="poco popular"
        }
        println("La cancion con mas reproducciones es : $max")
        println("La cancion $tituloCancion del artista $artistaCancion del año $añoCancion con $reproCancion reproducciones el estado de la cancion es $popular")
    }


}