package com.afterwork.myfirstmvp.presenter

import com.afterwork.myfirstmvp.MainContracts
import com.afterwork.myfirstmvp.model.MainModel

class MainPresenterImpl(val view: MainContracts.View): MainContracts.Presenter {

    val mainModel: MainModel

    init {
        mainModel = MainModel(this)
    }

    override fun addNum(first: Int, second: Int) {
        view.showResult(first + second)
    }

    override fun saveData(num: Int) {
        mainModel.saveData(num)
    }
}