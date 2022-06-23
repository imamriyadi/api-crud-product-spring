package com.imamriyadi.apicrudproductspring.product.service

import com.imamriyadi.apicrudproductspring.product.entity.Product
import com.imamriyadi.apicrudproductspring.product.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl:ProductService {

    @Autowired
    private lateinit var repositoryProduct:ProductRepository

    override fun getAllProduct(): List<Product> {
        return repositoryProduct.getAllProduct()
    }

    override fun getProductById(ids: String): Product? {
        return repositoryProduct.getProductById(ids)
    }

    override fun addProduct(product: Product): List<Product> {
        return repositoryProduct.addProduct(product)
    }

    override fun updateProduct(ids: String,product: Product): Product? {
        return repositoryProduct.updateProduct(ids,product)
    }

    override fun deleteProduct(ids: String): List<Product> {
        return repositoryProduct.deleteProduct(ids)
    }
}