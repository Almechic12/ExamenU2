package carballo.jesus.equipo5

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductosActivity : AppCompatActivity() {

    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listView: ListView = findViewById(R.id.litView) as ListView
        var adaptador = AdaptadorProductos(this, menu)


        listView.adapter = adaptador
    }

    fun agregarProductos(option: String?){
        var titulo = findViewById(R.id.titulo) as ImageView
        when(option)
        {
            "sideOrders" -> {
                //titulo.setImageResource(R.drawable.hotdrinks)
                menu.add(Product("Chips Salsa", R.drawable.chips_salsa, "Coffee drink made with espresso and steamed milk", 6.0))
                menu.add(Product("Flour Tacos", R.drawable.flour_tacos, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5.0))
                menu.add(Product("Side Beans", R.drawable.side_beans, "Full-flavored, concentrated form of coffee.", 4.0))
                menu.add(Product("Side Guacamole", R.drawable.side_guacamole, "Spiced tea concentrate with milk", 6.0))
                menu.add(Product("Side Rice", R.drawable.side_rice, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7.0))
            }

            "antojitos" -> {
                //titulo.setImageResource(R.drawable.antojitos)
                menu.add(Product("Gringa", R.drawable.gringa, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5.00))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", 6.00))
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3.00))
                menu.add(Product("Sincronizadas", R.drawable.sincronizadas, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4.00))
                menu.add(Product("Sopes", R.drawable.sopes, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7.00))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7.00))
            }

            "sopas" -> {
                //titulo.setImageResource(R.drawable.sweets)
                menu.add(Product("Caldo de Camarón", R.drawable.caldo_camaron, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6.0))
                menu.add(Product("Caldo de Res", R.drawable.caldo_res, "Chocolate cupcakes topped with butter cream and cherries", 3.0))
                menu.add(Product("Coctel de Camarón", R.drawable.coctel_camaron, "Pastry shell with a lemon flavored filling", 4.0))
                menu.add(Product("Menudo", R.drawable.menudo, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6.0))
                menu.add(Product("Pozole", R.drawable. pozole, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7.0))
                menu.add(Product("Sopa Mariscos", R.drawable.sopa_mariscos, "Coffee-flavored Italian dessert", 6.0))
            }

            "tortas" -> {
                //titulo.setImageResource(R.drawable.salties)
                menu.add(Product("Torta", R.drawable.torta, "A delicious sandwich served with french fries.", 5.0))
                menu.add(Product("Mexican Torta", R.drawable.mexican_torta, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Product("Torta Cubana", R.drawable.torta_cubana, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
                menu.add(Product("Torta Milanesa", R.drawable. torta_milanesa, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
                menu.add(Product("Torta Mixta", R.drawable. tortamixta, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
            }

            "tacos" -> {
                //titulo.setImageResource(R.drawable.salties)
                menu.add(Product("Taco Pescado", R.drawable.taco_pescado, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Product("Tacos", R.drawable.tacos, "A delicious sandwich served with french fries.", 5.0))
            }

            "combinations" -> {
                //titulo.setImageResource(R.drawable.salties)
                menu.add(Product("Burrito Pepe", R.drawable.burrito_pepe, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Product("Cinco", R.drawable.cinco, "A delicious sandwich served with french fries.", 5.0))
                menu.add(Product("Dos amigos", R.drawable.dos_amigos, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
                menu.add(Product("Mexican Burritos", R.drawable. mexican_burritos, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
                menu.add(Product("Portales Burritos", R.drawable. portales_burritos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Taco Combo", R.drawable. taco_combo, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
            }

            "especialidades" -> {
                //titulo.setImageResource(R.drawable.salties)
                menu.add(Product("Botana de Camarones", R.drawable.botana_camarones, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Product("Coctel de Camarón", R.drawable.coctel_camaron, "A delicious sandwich served with french fries.", 5.0))
                menu.add(Product("Fajita Burrito", R.drawable.fajita_burrito, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
                menu.add(Product("Fajita Quesadilla", R.drawable. fajita_quesadilla, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
                menu.add(Product("Mojarra Frita", R.drawable. mojarra_frita, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Tostada Ceviche", R.drawable. tostada_ceviche, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
            }

            "bebidas" -> {
                //titulo.setImageResource(R.drawable.salties)
                menu.add(Product("Aguas Frescas", R.drawable.aguas_frescas, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Product("Caguama", R.drawable.caguama, "A delicious sandwich served with french fries.", 5.0))
                menu.add(Product("Caguama Michelada", R.drawable.caguama_michelada, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
                menu.add(Product("Charolazo", R.drawable. charolazo, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
                menu.add(Product("Cubetazo", R.drawable. cubetazo, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Cubetazos", R.drawable. cubetazos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Domestic Beer", R.drawable.domestic_beer, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
                menu.add(Product("Jarritos", R.drawable.jarritos, "A delicious sandwich served with french fries.", 5.0))
                menu.add(Product("La Mamalona", R.drawable.la_mamalona, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
                menu.add(Product("La Mamalona con Camarones", R.drawable. lamamalona_camarones, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
                menu.add(Product("Lata Beer", R.drawable. lata_beer, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Mexican Beer", R.drawable. mexican_beer, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Michelada", R.drawable. michelada, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
                menu.add(Product("Sodas", R.drawable. sodas, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
            }
        }
    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, productos: ArrayList<Product>){
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