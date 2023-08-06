package com.Devpuntocom.prueba.nequi

import java.util.Random

class nequi {
}

fun main() {
    var telefonoR: Int = 312869168
    var contraR: Int = 1403
    var saldo: Double = 4500.0
    var salir = false

    println("Por favor ingrese su numero telefonico")
    var telefono: Int = readln().toInt()
    println("Por favor ingrese su contraseña")
    var contra: Int = readln().toInt()
    if (telefono == telefonoR && contra == contraR) {
        while (!salir) {
            println("Bienvenido a nequi")
            println("el valor de tu cuenta es: $saldo")
            println("opciones de nequi")
            println("1. saca")
            println("2. envia")
            println("3. recarga")
            println("4. Salir")
            println("Por favor digite la opcion que usted deseea")
            var eleccion: Int = readln().toInt()
            when (eleccion) {
                1 -> {
                    println("1. cajero")
                    println("2. Punto fisico")
                    println("Por favor eliga la la opcion que deseea")
                    println("por favor digite sus valores en decimal con un punto(.)")
                    var eleccionSaca: Int = readln().toInt()
                    when (eleccionSaca) {
                        1 -> {
                            if (saldo > 2000) {
                                println("Por favor digite la suma que quiere retirar :")
                                var sacarSaldo: Double = readln().toDouble()
                                var nAleatorio = 100000..900000
                                var codigo = nAleatorio.random()
                                var Rsaldo = (saldo - sacarSaldo)
                                println("Su codigo de verificacion es: $codigo \n por seguridad no comparta este codigo con nadie")
                                println("su saldo Actualizado es $Rsaldo")
                            } else {
                                println("Dato ingresado Invalido")
                            }
                        }

                        2 -> {
                            if (saldo > 2000) {
                                println("Por favor digite la suma que quiere retirar :")
                                var sacarSaldo: Double = readln().toDouble()
                                var nAleatorio = 100000..900000
                                var codigo = nAleatorio.random()
                                var Rsaldo = (saldo - sacarSaldo)
                                println("Su codigo de verificacion es: $codigo \n por seguridad no comparta este codigo con nadie")
                                println("su saldo Actualizado es $Rsaldo")
                            } else {
                                println("Dato ingresado Invalido")
                            } } }}
                2 -> {
                    if (saldo >= 2000) {

                        println("Por favor digite el numero de telefono del usuario al cual le quiere enviar dinero")
                        var Nenviar: Int = readln().toInt()
                        println("Por favor digite la cantidad de dinero que desea depositar")
                        var pEnviar: Double = readln().toDouble()
                        println(
                            "El numero al cual se le va a enviar el dinero es: $Nenviar\n y " +
                                    "el valor que se va a enviar es $pEnviar"
                        )
                        var sobro = (saldo - pEnviar)
                        println("Su Saldo actualizado es :$sobro ")
                    } else {

                        println("Su saldo es menor a 2500 por lo cual no puede hacer ninguna transaccion")
                    } }
                3->{
                    println("por favor digite el valor de su recarga")
                    var recargar: Double = readln().toDouble()
                    println("Confirma el valor de la recarga?")
                    var decision: String = readln().toString()
                    if (decision == "si") {
                        var Vsaldo = recargar + saldo
                        println("El valor de su saldo es : $Vsaldo")
                    } else {
                        println("Usted cancelo la accion")
                        println("el valor de su saldo es : $saldo")
                    }
                }
                4->{
                    println("saliendo...\n :))")
                    salir = true
                }

            }

        }
    }
    else{

        println("Su usuario o constraseña son incorrectos")
    }
}




