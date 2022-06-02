package pjwstk.edu.pl.s20246.prm_pro2

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProductDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addProduct(product: Product)

    @Query("SELECT * FROM product_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Product>>
}