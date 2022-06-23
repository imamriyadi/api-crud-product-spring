package com.imamriyadi.apicrudproductspring.product.service

import com.imamriyadi.apicrudproductspring.product.entity.Product

interface ProductService {
    fun getAllProduct():List<Product>
    fun getProductById(ids:String): Product?
    fun addProduct(product: Product):List<Product>
    fun updateProduct(ids: String,product: Product): Product?
    fun deleteProduct(ids: String):List<Product>
}