package hamada.mitsuru.techacademy.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("はまだ", 27)      // 名前をはまだ、年齢を27歳でHumanのインスタンスを作る
        human.say()

        val human2 = Human("はまだ",27,"バスケ")      // 名前をはまだ、年齢を27歳、趣味をバスケでHumanのインスタンスを作る
        human2.think()
    }
}
