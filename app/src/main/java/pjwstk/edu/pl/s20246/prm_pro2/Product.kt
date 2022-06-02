package pjwstk.edu.pl.s20246.prm_pro2

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val location: String,
    val imagePath: String
    //val drawableResourceId: Int
        )