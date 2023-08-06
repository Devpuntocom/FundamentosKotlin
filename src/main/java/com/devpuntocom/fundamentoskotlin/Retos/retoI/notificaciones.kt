package com.devpuntocom.fundamentoskotlin.Retos.retoI

class notificaciones {
}

fun main(){

    println("Por favor digite el numero de notificaciones que tiene")
    var noti : Int = readln().toInt()
    if (noti < 100){
        println("La cantidad de mesajes son:  $noti")
    }
    else if(noti > 100){
        println("+99")
    }
    else if (noti == 0){
        println("No hay mensajes")
    }

}