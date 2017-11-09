package com.moo.mvpplugin.base


/**
 * @author moo
 * @date 2017/11/3.
 * @describe
 */


open class BaseMvpPresenter<V> {

    protected var v: V? = null


    fun attach(v: V) {
        this.v = v
    }

    fun detach() {
        v = null
    }
}
