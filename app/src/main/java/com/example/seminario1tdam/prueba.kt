package com.example.seminario1tdam

fun main(){




}
//Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un texto

fun ej5( a:Char, texto:String ){
    var contador = 0
    for (letra in texto){
        if (letra == a){
            contador++
        }
    }
    println("La letra $a aparece $contador veces en el texto $texto")

}

fun ej5_2( a:Char, texto:String ){
    var contador = 0
    for (i in 0 until texto.length){
        if (texto[i] == a){
            contador++
        }
    }
    println("La letra $a aparece $contador veces en el texto $texto")

}

//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.

fun ej6( subcadena:String, texto:String ){
    var contador = 0
    for (i in 0 until texto.length){
        if (texto[i] == subcadena[0]){
            var j = 0
            while (j < subcadena.length && i+j < texto.length){
                if (texto[i+j] != subcadena[j]){
                    break
                }
                j++
            }

            if (j == subcadena.length){
                contador++
            }
        }
    }
    println("La subcadena $subcadena aparece $contador veces en el texto $texto")

}