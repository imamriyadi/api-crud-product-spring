package com.imamriyadi.apicrudproductspring.product.controller

import com.imamriyadi.apicrudproductspring.BaseResponse
import com.imamriyadi.apicrudproductspring.product.entity.Product
import com.imamriyadi.apicrudproductspring.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/product")
class ProductController {

    @Autowired
    private lateinit var productService: ProductService

    @GetMapping()
    fun getAllProduct():BaseResponse<List<Product>>{
        return BaseResponse(
            status = true,
            message = "Success Get All Data",
            data = productService.getAllProduct()
        )
    }

    @GetMapping("/{ids}")
    fun getProductById(
        @PathVariable(name = "ids") ids:String
    ):BaseResponse<Product>{
        return BaseResponse(
            status = true,
            message = "Success Get Data By Id",
            data = productService.getProductById(ids)
        )
    }

    @PostMapping()
    fun addProduct(
        @RequestBody product: Product
    ):BaseResponse<List<Product>>{
        return BaseResponse(
            status = true,
            message = "Add Product Success",
            data = productService.addProduct(product)
        )
    }

    @PutMapping("/{ids}")
    fun updateProduct(
        @PathVariable(name = "ids") ids:String,
        @RequestBody product: Product
    ):BaseResponse<Product>{
        return BaseResponse(
            status = true,
            message = "Update Product Success",
            data = productService.updateProduct(ids,product)
        )
    }

    @DeleteMapping("/{ids}")
    fun deleteProduct(
        @PathVariable(name="ids") ids: String
    ):BaseResponse<List<Product>>{
        return BaseResponse(
            status = true,
            message = "Delete Success",
            data = productService.deleteProduct(ids)
        )
    }
}