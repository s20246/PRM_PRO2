package pjwstk.edu.pl.s20246.prm_pro2

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_product.view.*
import java.io.File


class ProductAdapter(private val products: MutableList<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productName: TextView = itemView.findViewById(R.id.textViewName)
        val productLocation: TextView = itemView.findViewById(R.id.textViewLocation)
        val productImage: ImageView = itemView.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_product,
                parent,
                false
            )
        )
    }

    fun addProduct (product: Product){
        products.add(product)
        notifyItemInserted(products.size-1)
    }



    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currProduct = products[position]

        holder.itemView.apply {
            textViewName.text = currProduct.name
            textViewLocation.text = currProduct.location
            //??
            val imgFile = File("/storage/emulated/0/20210319_124439.jpg")
           // image.setImageURI("/storage/emulated/0/20210319_124439.jpg")
            val myBitmap = BitmapFactory.decodeFile(imgFile.absolutePath)
            image.setImageBitmap(myBitmap)
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}