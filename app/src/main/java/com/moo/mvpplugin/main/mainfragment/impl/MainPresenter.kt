package com.moo.mvpplugin.main.mainfragment.impl

import com.moo.mvpplugin.main.mainfragment.imp.IMainPresenter
import com.moo.mvpplugin.main.mainfragment.imp.IMainView
import com.moo.mvpplugin.main.mainfragment.impl.MainModel
import com.moo.mvpplugin.base.BaseMvpPresenter

internal class MainPresenter : BaseMvpPresenter<IMainView>(), IMainPresenter {

    private var mMainModel: MainModel? = null

    init {

        mMainModel = MainModel()

    }
}