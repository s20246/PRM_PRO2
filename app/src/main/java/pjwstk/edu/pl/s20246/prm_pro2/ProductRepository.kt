package pjwstk.edu.pl.s20246.prm_pro2


import androidx.lifecycle.LiveData

class ProductRepository(private val productDao: ProductDAO) {

    val readAllData: LiveData<List<Product>> = productDao.readAllData()

    suspend fun addProduct(product: Product){
        productDao.addProduct(product)
    }

}