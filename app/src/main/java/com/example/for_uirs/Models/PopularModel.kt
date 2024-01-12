package com.example.for_uirs.Models

class PopularModel {

    private var workImage: Int? = null
    private var workName: String = ""
    private var workPrice: String = ""

    constructor()
    constructor(workImage: Int?, workName: String, workPrice: String) {
        this.workImage = workImage
        this.workName = workName
        this.workPrice = workPrice
    }

    fun getWorkImage(): Int? {
        return workImage
    }

    fun getWorkName(): String{
        return workName
    }

    fun getWorkPrice(): String{
        return workPrice
    }

    fun setWorkImage(workImage: Int?){
        this.workImage = workImage
    }

    fun setWorkName(workName: String){
        this.workName = workName
    }

    fun setWorkPrice(workPrice: String){
        this.workPrice = workPrice
    }

}