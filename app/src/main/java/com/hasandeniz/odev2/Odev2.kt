package com.hasandeniz.odev2

class Odev2{
    fun degreeToFahrenheit(degree:Double): Double{
        return degree * 1.8 + 32
    }

    fun calculatePerimeter(edge1:Int,edge2:Int,edge3:Int,edge4:Int){
        println(edge1+edge2+edge3+edge4)
    }

    fun calculateFactorial(number:Int):Int{
        var result = 1
        for (i in 1..number)
            result*=i

        return result
    }

    fun findOccurrence(word:String,character:Char){
        var occurrence = 0
        for (element in word){
            if(element == character) {
                occurrence++
            }
        }
        println("$character letter occurs $occurrence times")
    }

    fun calculateInternalAngles(edgeNumber:Int):Int{
        return (edgeNumber-2)*180
    }

    fun calculateSalary(daysWorked:Int):Int{
        var salary = 0
        salary = if(daysWorked > 160){
            160*10 + (daysWorked - 160)*20
        }else{
            daysWorked*10
        }
        return salary
    }

    fun calculatePrice(quota:Int):Int{
        var price = 0
        price = if(quota > 50){
            100 + (quota - 50) * 4
        }else{
            100
        }
        return price
    }
}
