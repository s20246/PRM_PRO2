package pjwstk.edu.pl.s20246.prm_pro2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_product.*
import kotlinx.android.synthetic.main.item_product.*

class AddScreen : AppCompatActivity() {

    //tu tez inicjalizowac adapter??
   // private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_product)
        //productAdapter=ProductAdapter(mutableListOf())
        buttonAdd.setOnClickListener{
            var productid: Int? = null
            val productname = nameEnter.text
            val productlocation = locationEnter.text
            //?? id obrazka
            val productimage = "C:\\Users\\agala\\AndroidStudioProjects\\PRM_PRO2\\app\\src\\main\\res\\drawable\\imageexample.png"
            if(productname.isNotEmpty()&&productlocation.isNotEmpty()){
                val product = Product(0,productname.toString(), productlocation.toString(), productimage)
                //productAdapter.addProduct(product)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}