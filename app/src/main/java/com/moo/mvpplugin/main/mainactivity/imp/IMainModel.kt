package com.moo.mvpplugin.main.mainactivity.imp

import com.moo.mvpplugin.base.CallBack

interface IMainModel {
    fun getData(callBack: CallBack<String>)
}