package com.example.pravila_dorozh_dvizh

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var textboxTV:TextView
    lateinit var checkinfoCB:CheckBox
    lateinit var description:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textboxTV=findViewById(R.id.textboxTV)
        checkinfoCB=findViewById(R.id.checkInfoCB)
        description=findViewById(R.id.description)
        checkinfoCB.setOnCheckedChangeListener { _, isChecked ->
            if(checkinfoCB.isChecked) {
                textboxTV.text="Правила дорожного движения"
                description.text="1.3. Участники дорожного движения обязаны знать и соблюдать относящиеся к ним требования Правил, сигналов светофоров, знаков и разметки, а также выполнять распоряжения регулировщиков, действующих в пределах предоставленных им прав и регулирующих дорожное движение установленными сигналами.\n" +
                        "1.4. На дорогах установлено правостороннее движение транспортных средств."
            } else {
                textboxTV.text="Информация"
                description.text=""
            }
        }
    }
}