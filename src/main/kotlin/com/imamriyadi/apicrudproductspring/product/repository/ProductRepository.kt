package com.imamriyadi.apicrudproductspring.product.repository

import com.imamriyadi.apicrudproductspring.product.entity.Product

interface ProductRepository {
    fun getAllProduct():List<Product>
    fun getProductById(ids:String):Product?
    fun addProduct(product: Product):List<Product>
    fun updateProduct(ids: String,product: Product):Product?
    fun deleteProduct(ids: String):List<Product>
}