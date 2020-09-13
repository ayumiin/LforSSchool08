package app.takemoto.ayumin.a08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.AvailableNetworkInfo
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minecraft = Word(R.drawable.minecraft,"MineCreft")
        val movie = Word(R.drawable.movie,"Movie")
        val unity = Word(R.drawable.unity,"Unity")
        val webD = Word(R.drawable.web_design,"WebD")


        addWord(minecraft)
        addWord(movie)
        addWord(unity)
        addWord(webD)
    }

    private fun addWord(word: Word){
        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)
    }

}