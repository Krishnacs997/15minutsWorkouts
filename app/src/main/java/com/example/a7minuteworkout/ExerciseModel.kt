package com.example.a7minuteworkout

class ExerciseModel (
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isComplited: Boolean,
    private var isSelected : Boolean
    ){
    fun getId() :Int {
        return id
    }

    fun setId(id : Int){
        this.id = id
    }

    fun getName() : String{
        return name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getImage() : Int{
        return image
    }

    fun setImage(image : Int){
       this.image = image
    }

    fun getisComplited() : Boolean{
        return isComplited
    }

    fun setisComplited(isComplited: Boolean){
       this.isComplited = isComplited
    }

    fun getisSelected() : Boolean{
        return isSelected
    }

    fun setisSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }
}