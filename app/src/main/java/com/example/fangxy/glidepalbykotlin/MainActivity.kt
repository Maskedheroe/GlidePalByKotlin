import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.request.RequestOptions
import com.example.fangxy.glidepalbykotlin.R

class MainActivity : AppCompatActivity() {

    private var button : Button? = null
    private var iv : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        iv = findViewById(R.id.iv)

    }
    fun onClick(view :View){

        val requestedOrientation :RequestOptions = RequestOptions()
                .error(null)
//        Glide.with(this).load("https://avatar.csdn.net/A/A/8/1_maskedfang.jpg?1527152743").apply(requestedOrientation).into(iv!!)

       /* GlidepalUtil.getInstance().setOptions(R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,false).
                glideLoad(this,"https://avatar.csdn.net/A/A/8/1_maskedfang.jpg?1527152743",iv!!)*/
    }


}
