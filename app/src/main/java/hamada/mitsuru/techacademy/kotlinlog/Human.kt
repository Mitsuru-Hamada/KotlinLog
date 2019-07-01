package hamada.mitsuru.techacademy.kotlinlog

import android.util.Log

class Human : Animal,Thinkable{

    private var  hobby: String? = null

    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name,age){
        this.name = name
        this.age = age
    }
    constructor(name: String, age: Int, hobby: String): super(name,age){
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}