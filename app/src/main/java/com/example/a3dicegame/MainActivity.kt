package com.example.a3dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById<Button>(R.id.button)

        rollButton.setOnClickListener {
            roll()
        }
    }

    private fun roll () {
        val diceOne = Dice (6)
        val rollDiceResult1 = diceOne.rollDice()
        val dice1 : ImageView = findViewById(R.id.dice1)

        val diceImageResource1 = when (rollDiceResult1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        dice1.setImageResource(diceImageResource1)

        val diceTwo = Dice (6)
        val rollDiceResult2 = diceTwo.rollDice()
        val dice2 : ImageView = findViewById(R.id.dice2)
        val diceImageResource2 = when (rollDiceResult2) {
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
        }

        dice2.setImageResource(diceImageResource2)

        val diceThree = Dice (6)
        val rollDiceResult3 = diceThree.rollDice()
        val dice3 : ImageView = findViewById(R.id.dice3)
        val diceImageResource3 = when (rollDiceResult3) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        dice3.setImageResource(diceImageResource3)

        val winningNumber = 6
        val option1 = rollDiceResult1 == winningNumber
        val option2 = rollDiceResult2 == winningNumber
        val option3 = rollDiceResult3 == winningNumber

        val loosingNumber = 9
        val option4 = rollDiceResult1 + rollDiceResult2
        val option5 = rollDiceResult2 + rollDiceResult3
        val option6 = rollDiceResult1 + rollDiceResult3

        if (option1 && option2 || option1 && option3 || option2 && option3) {
            Toast.makeText(applicationContext, "You Win", Toast.LENGTH_LONG).show()
        }

        else if (option4 == loosingNumber || option5 == loosingNumber || option6 == loosingNumber){
            Toast.makeText(applicationContext, "You Lose", Toast.LENGTH_LONG).show()
        }
    }

}

class Dice (var sides : Int)  {

    fun rollDice() : Int {
            return (1..sides).random()
    }
}