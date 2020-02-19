package com.afterwork.myfirstmvp

interface MainContracts {
    interface View{
        fun showResult(result: Int)
    }

    interface Presenter{
        fun addNum(first: Int, second: Int)

        fun saveData(num: Int)
    }

}