package com.example.myapplication
fun main(){
    var name = ""
    var computerchoice = ""
    var playerchoice = ""
    println("Please enter your name ")
    name = readln()
    println("Rock, Paper or Scissors? Please enter your choice! ")
    playerchoice = readln()
    val randomnumber = (1..3).random()
    when (randomnumber) {
        1 -> {
            computerchoice = "Rock"

        }
        2 -> {
            computerchoice = "Paper"
        }
        3 -> {
            computerchoice = "Scissors"
        }
    }
    println(name+" "+"choice" + " "+" : "+" "+playerchoice)
    println("computer choice : "+" "+computerchoice)

    val winner = when{
        playerchoice == computerchoice -> "Tie"
        playerchoice == "Rock" && computerchoice == "Scissors" -> "you"
        playerchoice == "Paper" && computerchoice == "Rock" -> "you"
        playerchoice == "Scissors" && computerchoice == "Paper" -> "you"
        else -> "computer"
    }
    if(winner == "Tie"){
        println(name + " " + "it's a tie")

    }else if(winner == "you"){
        println(name + " " + "WON!!")
    }else{
        println(name + " " + "COMPUTER WON!!")
    }

}


