package io.its3squares.codmagic

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    var myClipboard: ClipboardManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myClipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager?;


        btnCodMagic.setOnClickListener {

            var myClip: ClipData? = null

            var word: String = txtword.text.toString()
            var newWord  = ""

            newWord = word.toUpperCase()

            var i = 0

            Log.i("info", newWord)
            while (i < newWord.length) {
                if (newWord.get(i).equals('A') || newWord.get(i).equals('Ã') || newWord.get(i).equals('À') || newWord.get(i).equals('Á') || newWord.get(i).equals('Â')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDD2E")
                }
                if (newWord.get(i).equals('B')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83C\uDFF9")
                }
                if (newWord.get(i).equals('C')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDDE1")
                }
                if (newWord.get(i).equals('Ç')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDDE1")
                }
                if (newWord.get(i).equals('D')){
                    newWord = newWord.replace(newWord.get(i).toString(), "⚔")
                }
                if (newWord.get(i).equals('E') || newWord.get(i).equals('É') || newWord.get(i).equals('È') || newWord.get(i).equals('Ê')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83C\uDF42")
                }
                if (newWord.get(i).equals('F')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83E\uDD81")
                }
                if (newWord.get(i).equals('G')){
                    newWord = newWord.replace(newWord.get(i).toString(), "❄")
                }
                if (newWord.get(i).equals('H')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC7B")
                }
                if (newWord.get(i).equals('I') || newWord.get(i).equals('Î') || newWord.get(i).equals('Ì') || newWord.get(i).equals('Í')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC64")
                }
                if (newWord.get(i).equals('J')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC78\uD83C\uDFFC")
                }
                if (newWord.get(i).equals('K')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC51")
                }
                if (newWord.get(i).equals('L')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC53")
                }
                if (newWord.get(i).equals('M')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC8D")
                }
                if (newWord.get(i).equals('N')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83C\uDF02")
                }
                if (newWord.get(i).equals('O') || newWord.get(i).equals('Õ') || newWord.get(i).equals('Ò') || newWord.get(i).equals('Ó') || newWord.get(i).equals('Ô')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC23")
                }
                if (newWord.get(i).equals('P')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83E\uDD84")
                }
                if (newWord.get(i).equals('Q')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDD77")
                }
                if (newWord.get(i).equals('R')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC00")
                }
                if (newWord.get(i).equals('S')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC3E")
                }
                if (newWord.get(i).equals('T')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDC32")
                }
                if (newWord.get(i).equals('U') || newWord.get(i).equals('Û') || newWord.get(i).equals('Ú') || newWord.get(i).equals('Ù')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83C\uDF83")
                }
                if (newWord.get(i).equals('V')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDD25")
                }
                if (newWord.get(i).equals('W')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83C\uDFF5")
                }
                if (newWord.get(i).equals('X')){
                    newWord = newWord.replace(newWord.get(i).toString(),"\uD83D\uDD2A" )
                }
                if (newWord.get(i).equals('Y')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDEAA")
                }
                if (newWord.get(i).equals('Z')){
                    newWord = newWord.replace(newWord.get(i).toString(), "\uD83D\uDEE1")
                }
                if (newWord.get(i).equals(' ')){
                    newWord = newWord.replace(newWord.get(i).toString(), "/")
                }
                else{
                    newWord = newWord
                }
                Log.i("info", "${i}" + newWord.get(i).toString())
                i++
            }
            myClip = ClipData.newPlainText("text", newWord);
            myClipboard?.setPrimaryClip(myClip)

            Toast.makeText(this, "Amassa", Toast.LENGTH_SHORT).show();

            txtword.setText("")
        }
    }
}

