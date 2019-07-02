package hamada.mitsuru.techacademy.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("はまだ", 27,"バスケ")      // 名前をはまだ、年齢を27歳でHumanのインスタンスを作る
        human.say()
        human.think()

        val human2 = Human("かいさん",25,"Kotlin")      // 名前をかいさん、年齢を25歳、趣味をKotlinでHumanのインスタンスを作る
        human2.say()
        human2.think()
    }
}
