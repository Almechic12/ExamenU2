package carballo.jesus.equipo5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class CarritoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        var listaCarrito: ArrayList<Carrito> = intent.getSerializableExtra("carrito") as ArrayList<Carrito>


        var adaptador = AdaptadorCarrito(this, listaCarrito)
        var listView: ListView = findViewById(R.id.litView) as ListView

        listView.adapter = adaptador

        var total : TextView=findViewById(R.id.total) as TextView
        var asd: Double = 0.0
        for (i in listaCarrito.indices){
            asd += (listaCarrito[i].cantidad * listaCarrito[i].price)
        }
        total.setText("$" + asd.toString())
    }


    private class AdaptadorCarrito(contexto: Context, var carrito: ArrayList<Carrito>) :
        BaseAdapter() {
        var contexto: Context?= contexto

        override fun getCount(): Int {
            return carrito.size
        }

        override fun getItem(p0: Int): Any {
            return carrito[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var carr = carrito[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.carrito_view, null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            //var desc = vista.findViewById(R.id.producto_desc) as TextView
            var cantidad = vista.findViewById(R.id.tv_cantidad) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(carr.image)
            nombre.setText(carr.name)
            cantidad.setText("1")
            precio.setText("$${carr.price}")


            return vista
        }
    }
}