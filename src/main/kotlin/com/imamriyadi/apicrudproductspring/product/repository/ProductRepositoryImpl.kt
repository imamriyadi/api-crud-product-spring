package com.imamriyadi.apicrudproductspring.product.repository

import com.imamriyadi.apicrudproductspring.database.DatabaseComponent
import com.imamriyadi.apicrudproductspring.product.entity.Product
import com.mongodb.client.MongoCollection
import org.litote.kmongo.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class ProductRepositoryImpl : ProductRepository {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    private fun productCollection(): MongoCollection<Product> =
        databaseComponent.database.getDatabase("product").getCollection()

    override fun getAllProduct(): List<Product> {
        return productCollection().find().toList()
    }

    override fun getProductById(ids: String): Product? {
        return productCollection().findOne { Product::id eq ids }
    }

    override fun addProduct(product: Product): List<Product> {
        val insert = productCollection().insertOne(product)
        return if (insert.wasAcknowledged()) {
            getAllProduct()
        } else {
            throw IllegalStateException("Insert failed")
        }
    }

    override fun updateProduct(ids: String, product: Product): Product? {
        val update = productCollection().updateOne(
            Product::id eq ids, set(
                Product::name setTo product.name,
                Product::qty setTo product.qty,
                Product::price setTo product.price
            )
        )
        return if (update.wasAcknowledged()) {
            getProductById(ids)
        } else {
            throw IllegalStateException("Update Failed")
        }
    }

    override fun deleteProduct(ids: String): List<Product> {
        val delete = productCollection().deleteOne(Product::id eq ids)
        return if (delete.wasAcknowledged()) {
            getAllProduct()
        } else {
            throw IllegalStateException("Delete Failed")
        }
    }
}