package com.moo.mvpplugin.main.mainactivity.impl

import com.moo.mvpplugin.base.CallBack
import com.moo.mvpplugin.main.mainactivity.imp.IMainModel

class MainModel : IMainModel {

    override fun getData(callBack: CallBack<String>) {
        //get data code
        callBack.onSuccess("hello MVP")
    }
}