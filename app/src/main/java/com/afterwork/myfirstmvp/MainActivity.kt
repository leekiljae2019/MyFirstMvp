package com.afterwork.myfirstmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afterwork.myfirstmvp.presenter.MainPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContracts.View {

    val presenter: MainContracts.Presenter

    init {
        presenter = MainPresenterImpl(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListener()
    }

    fun initListener(){
        btn_result.setOnClickListener {
            presenter.addNum(edt_first.text.toString().toInt(), edt_second.text.toString().toInt())
        }
    }

    override fun showResult(result: Int) {
        tv_result.text = result.toString()
    }
}
