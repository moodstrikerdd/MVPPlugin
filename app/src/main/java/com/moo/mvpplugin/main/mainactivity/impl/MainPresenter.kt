package com.moo.mvpplugin.main.mainactivity.impl

import com.moo.mvpplugin.main.mainactivity.imp.IMainPresenter
import com.moo.mvpplugin.main.mainactivity.imp.IMainView
import com.moo.mvpplugin.base.BaseMvpPresenter
import com.moo.mvpplugin.base.CallBack

internal class MainPresenter : BaseMvpPresenter<IMainView>(), IMainPresenter {
    override fun getData() {
        mMainModel?.getData(object : CallBack<String> {
            override fun onSuccess(t: String) {
                v?.addFragment(t)
            }

            override fun onFail(code: Int, message: String) {
                v?.addFail(message)
            }

        })
    }

    private var mMainModel: MainModel? = null

    init {

        mMainModel = MainModel()

    }
}