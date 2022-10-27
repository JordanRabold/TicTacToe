package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentPlayer = 0
        var playersTurn = findViewById<TextView>(R.id.textView)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var button5 = findViewById<Button>(R.id.button5)
        var button6 = findViewById<Button>(R.id.button6)
        var button7 = findViewById<Button>(R.id.button7)
        var button8 = findViewById<Button>(R.id.button8)
        var button9 = findViewById<Button>(R.id.button9)
        var button10 = findViewById<Button>(R.id.button10)
        var newGameButton = findViewById<Button>(R.id.button11)

        // Clears the buttons when newGameButton is pressed
        newGameButton.setOnClickListener{
            if(newGameButton.isPressed){
                button2.text = ""
                button2.setEnabled(true)
                button3.text = ""
                button3.setEnabled(true)
                button4.text = ""
                button4.setEnabled(true)
                button5.text = ""
                button5.setEnabled(true)
                button6.text = ""
                button6.setEnabled(true)
                button7.text = ""
                button7.setEnabled(true)
                button8.text = ""
                button8.setEnabled(true)
                button9.text = ""
                button9.setEnabled(true)
                button10.text = ""
                button10.setEnabled(true)
                playersTurn.text = "Player X's Turn"
                currentPlayer = 0
            }
        }

        button2.setOnClickListener{
            if(currentPlayer == 0){
                button2.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button2.setEnabled(false)
            }
            else{
                button2.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button2.setEnabled(false)
            }
        }

        button3.setOnClickListener{
            if(currentPlayer == 0){
                button3.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button3.setEnabled(false)
            }
            else{
                button3.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button3.setEnabled(false)
            }
        }

        button4.setOnClickListener{
            if(currentPlayer == 0){
                button4.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button4.setEnabled(false)
            }
            else{
                button4.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button4.setEnabled(false)
            }
        }

        button5.setOnClickListener{
            if(currentPlayer == 0){
                button5.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button5.setEnabled(false)
            }
            else{
                button5.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button5.setEnabled(false)
            }
        }

        button6.setOnClickListener{
            if(currentPlayer == 0){
                button6.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button6.setEnabled(false)
            }
            else{
                button6.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button6.setEnabled(false)
            }
        }

        button7.setOnClickListener{
            if(currentPlayer == 0){
                button7.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button7.setEnabled(false)
            }
            else{
                button7.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button7.setEnabled(false)
            }
        }

        button8.setOnClickListener{
            if(currentPlayer == 0){
                button8.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button8.setEnabled(false)
            }
            else{
                button8.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button8.setEnabled(false)
            }
        }

        button9.setOnClickListener{
            if(currentPlayer == 0){
                button9.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button9.setEnabled(false)
            }
            else{
                button9.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button9.setEnabled(false)
            }
        }

        button10.setOnClickListener{
            if(currentPlayer == 0){
                button10.text = "X"
                currentPlayer = 1
                playersTurn.text = "Player O's Turn"
                button10.setEnabled(false)
            }
            else{
                button10.text = "O"
                currentPlayer = 0
                playersTurn.text = "Player X's Turn"
                button10.setEnabled(false)
            }
        }




    }
}