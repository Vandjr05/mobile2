package com.example.alarmwhater.model

class calcularingestaodiaria {

    private val ML_jovem = 40.0
    private val ML_adulto = 35.0
    private val ML_idoso = 30.0
    private val ML_mais_de_66 = 25.0

    private var resultadoMl = 0.0
    private var resultado_total_ml = 0.0

    fun calculartotalml(peso: Double, idade: Int) {

        if (idade <= 17){
            resultadoMl = peso * ML_jovem
            resultado_total_ml = resultadoMl
        }
        else if (idade <= 55){
            resultadoMl = peso * ML_adulto
            resultado_total_ml = resultadoMl
        }
        else if (idade <= 65){
            resultadoMl = peso * ML_idoso
            resultado_total_ml = resultadoMl
        }
        else {
            resultadoMl = peso *ML_mais_de_66
            resultado_total_ml = resultadoMl
        }



    }
    fun ResultadoMl (): Double{
        return resultado_total_ml
    }
}