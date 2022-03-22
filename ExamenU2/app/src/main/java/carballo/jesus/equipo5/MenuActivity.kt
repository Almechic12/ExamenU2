package carballo.jesus.equipo5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnTacos: Button = findViewById(R.id.button_tacos) as Button
        var btnAntojitos: Button = findViewById(R.id.button_antojitos) as Button
        var btnEspecialdades: Button = findViewById(R.id.button_especialidades) as Button
        var btnCaldos: Button = findViewById(R.id.button_caldos) as Button
        var btnCombination: Button = findViewById(R.id.button_combination) as Button
        var btnTortas: Button = findViewById(R.id.button_tortas) as Button
        var btnSopas: Button = findViewById(R.id.button_sopas) as Button
        var btnSideorders: Button = findViewById(R.id.button_sideorders) as Button
        var btnBebidas: Button = findViewById(R.id.button_bebidas) as Button

        btnTacos.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "tacos")
            startActivity(intent)
        }
        btnAntojitos.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "antojitos")
            startActivity(intent)
        }
        btnEspecialdades.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "especialidades")
            startActivity(intent)
        }
        btnCaldos.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "caldos")
            startActivity(intent)
        }
        btnCombination.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "combination")
            startActivity(intent)
        }
        btnTortas.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "sopas")
            startActivity(intent)
        }
        btnSideorders.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "sideOrders")
            startActivity(intent)
        }
        btnBebidas.setOnClickListener{
            var intent: Intent = Intent( this, ProductosActivity:: class.java)
            intent.putExtra("menuType", "bebidas")
            startActivity(intent)
        }


    }
}