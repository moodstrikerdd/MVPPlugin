package com.moo.mvpplugin.base

/**
 * @author moo
 * @date 2017/11/9.
 * @describe
 */
interface CallBack<T> {
    companion object {
        var CODE_NET_ERROR = 0;
        var MESSAGE_NET_ERROR = "网络异常"
        /*
         *  自定义CODE&MESSAGE
         */
    }

    fun onSuccess(t: T)

    fun onFail(code: Int, message: String)
}