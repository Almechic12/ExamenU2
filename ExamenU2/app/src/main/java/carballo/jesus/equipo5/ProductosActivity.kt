package carballo.jesus.equipo5

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ProductosActivity : AppCompatActivity() {

    var menu: ArrayList<Producto> = ArrayList<Producto>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listView: ListView = findViewById(R.id.litView) as ListView
        var adaptador = AdaptadorProductos(this, menu)


        listView.adapter = adaptador

        //Obtener que item de la lista seleccionamos listView (Ejemplo de práctica Pelicula)
        listView.setOnItemClickListener { adapterView, View, i, l ->
            Toast.makeText(applicationContext,"Seleccionado"+menu[i].name + menu[i].price,Toast.LENGTH_SHORT).show()
            //Cantidad descripcion precio
            // sum precio*can
        }
    }


    fun agregarProductos(option: String?){
        var titulo = findViewById(R.id.titulo) as ImageView
        when(option)
        {
            "sideOrders" -> {
                titulo.setImageResource(R.drawable.side_guacamole)//checar
                menu.add(Producto("Chips Salsa", R.drawable.chips_salsa, " ", 2.25))
                menu.add(Producto("Flour Tacos", R.drawable.flour_tacos, " ", 2.99))
                menu.add(Producto("Side Beans", R.drawable.side_beans, " ", 1.99))
                menu.add(Producto("Side Guacamole", R.drawable.side_guacamole, " ", 3.75))
                menu.add(Producto("Side Rice", R.drawable.side_rice, " ", 1.99))
            }

            "antojitos" -> {
                //titulo.setImageResource(R.drawable.antojitos)
                menu.add(Producto("Gringa", R.drawable.gringa, " Tortilla de harina con queso, carne al pastor y piña. Flour torilla with cheese marinated pork and pineapple", 6.47))
                menu.add(Producto("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big thick tortilla with beans, your choice of meat, fresh cheese, and sour cream ", 9.87))
                menu.add(Producto("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of met, served with salad. ", 4.75))
                menu.add(Producto("Sincronizadas", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole. Sandwich of two four tortillas filled with ham and cheese. Served with lettuce, source cream, and guacamole. ", 6.99))
                menu.add(Producto("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes ", 3.39))
                menu.add(Producto("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes ", 3.55))
            }

            "sopas" -> {
                //titulo.setImageResource(R.drawable.sweets)
                menu.add(Producto("Caldo de Camarón", R.drawable.caldo_camaron, "Shrimp soup ", 10.69))
                menu.add(Producto("Caldo de Res", R.drawable.caldo_res,  " ", 5.99))
                menu.add(Producto("Coctel de Camarón", R.drawable.coctel_camaron, "Shrimp cocktail ", 13.50))
                menu.add(Producto("Menudo", R.drawable.menudo, "Wednesday to Sunday ", 5.99))
                menu.add(Producto("Pozole", R.drawable. pozole, "Weekends only ", 5.99))
                menu.add(Producto("Sopa Mariscos", R.drawable.sopa_mariscos, "Seafood soup ", 15.75))
            }

            "tortas" -> {
                //titulo.setImageResource(R.drawable.salties)
                menu.add(Producto("Torta Regular", R.drawable.torta, "All tortas come with lettuce, onions, tomatoes, avocado do, sour cream, mayo, jalapeno pepper and your choice of meat.", 10.95))
                menu.add(Producto("Mexican Torta", R.drawable.mexican_torta, "Bolillo bread sandwich with your choice of filling. Topped with Lettuce, tomatoes, onions, and avocado.", 6.89))
                menu.add(Producto("Torta Cubana", R.drawable.torta_cubana, "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese",12.35))
                menu.add(Producto("Torta Milanesa", R.drawable. torta_milanesa, "Breaded Steak or Chicken", 11.99))
                menu.add(Producto("Torta Mixta", R.drawable. tortamixta, " Chorizo, asada y pastor Mexican sausage, steak and marinated pork",  11.99))
            }

            "tacos" -> {
                menu.add(Producto("Taco Pescado", R.drawable.taco_pescado, "Fish taco ", 2.35))
                menu.add(Producto("Tacos", R.drawable.tacos, " Traditional Taco", 2.35))
            }

            "combinations" -> {

                menu.add(Producto("Burrito Pepe", R.drawable.burrito_pepe, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Producto("Cinco", R.drawable.cinco, "A delicious sandwich served with french fries.", 5.0))
                menu.add(Producto("Dos amigos", R.drawable.dos_amigos, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
                menu.add(Producto("Mexican Burritos", R.drawable. mexican_burritos, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
                menu.add(Producto("Portales Burritos", R.drawable. portales_burritos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Producto("Taco Combo", R.drawable. taco_combo, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
            }
            "caldos" ->{
                menu.add(Producto("Larger",R.drawable.caldo_larger,"",10.99))
                menu.add(Producto("Camaron",R.drawable.caldo_camaron,"",11.99))
            }

            "especialidades" -> {
                menu.add(Producto("Botana de Camarones", R.drawable.botana_camarones, " ", 17.99))
                menu.add(Producto("Coctel de Camarón", R.drawable.coctel_camaron, " ", 14.50))
                menu.add(Producto("Fajita Burrito", R.drawable.fajita_burrito, "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.", 11.79))
                menu.add(Producto("Fajita Quesadilla", R.drawable. fajita_quesadilla, "Quesadilla extra grande, rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada Extra large quesadilla with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.", 12.49))
                menu.add(Producto("Mojarra Frita", R.drawable. mojarra_frita, "Tilapia frita servida con lechiga, cebolla, jitomate, aguacate y tortillas. Agregue arroz y frijoles por $1.50 adicinales Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas. Add rice and beans for $1.50 extra. ",  14.49))
                menu.add(Producto("Tostada Ceviche", R.drawable. tostada_ceviche, "Tilapia, camarones y pico de gallo servido en una crujiente tostada Tilapia, Shrimp and pico de gallo, served on a crispy shell",  2.99))
            }

            "bebidas" -> {
                menu.add(Producto("Aguas Frescas", R.drawable.aguas_frescas, "", 2.75))
                menu.add(Producto("Caguama", R.drawable.caguama, "", 7.99))
                menu.add(Producto("Caguama Michelada", R.drawable.caguama_michelada, "", 10.99))
                menu.add(Producto("Charolazo", R.drawable. charolazo, "", 15.75))
                menu.add(Producto("Cubetazo", R.drawable. cubetazo, "",  21.99))
                menu.add(Producto("Cubetazos", R.drawable. cubetazos, "",  19.99))
                menu.add(Producto("Domestic Beer", R.drawable.domestic_beer, "", 3.55))
                menu.add(Producto("Jarritos", R.drawable.jarritos, "", 2.35))
                menu.add(Producto("La Mamalona", R.drawable.la_mamalona, "(Michelada 2 Cervezas)", 12.99))
                menu.add(Producto("La Mamalona con Camarones", R.drawable. lamamalona_camarones, "", 14.99))
                menu.add(Producto("Lata Beer", R.drawable. lata_beer, "",  2.99))
                menu.add(Producto("Mexican Beer", R.drawable. mexican_beer, "",  3.99))
                menu.add(Producto("Michelada", R.drawable. michelada, "",  6.75))
                menu.add(Producto("Sodas", R.drawable. sodas, "",  2.75))
            }
        }
    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Producto>()
        var contexto: Context?=null

        constructor(contexto: Context, productos: ArrayList<Producto>){
            this.productos = productos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod = productos[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")
            return vista
        }
    }
}