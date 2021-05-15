package add.murata.muraken.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://www.rbbtoday.com/imgs/ogp_f/510534.jpg"
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.load(url)
    }
}