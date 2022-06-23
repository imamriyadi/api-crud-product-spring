package com.imamriyadi.apicrudproductspring.product.entity

import java.util.*

data class Product(

    var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var qty: Int = 0,
    var price: Int = 0
)
