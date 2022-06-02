package pjwstk.edu.pl.s20246.prm_pro2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_product.*

// ten sam ekran na add i edit?

class MainActivity : AppCompatActivity() {

    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        productAdapter= ProductAdapter(mutableListOf(Product(0,"product1", "location1", "C:\\Users\\agala\\AndroidStudioProjects\\PRM_PRO2\\app\\src\\main\\res\\drawable\\imageexample.png"), Product(1,"product2", "location2", "C:\\Users\\agala\\AndroidStudioProjects\\PRM_PRO2\\app\\src\\main\\res\\drawable\\imageexample.png")))
        recyclerView.adapter = productAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        buttonAddProduct.setOnClickListener{
            val intent = Intent(this, AddScreen::class.java)
            startActivity(intent)
        }
    }
}