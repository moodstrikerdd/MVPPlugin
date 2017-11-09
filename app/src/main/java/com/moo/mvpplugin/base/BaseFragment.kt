package com.moo.mvpplugin.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author moo
 * @date 2017/11/7.
 * @describe MVP
 */

abstract class BaseFragment<V, P : BaseMvpPresenter<V>> : Fragment() {

    protected var mPresenter: P? = null
    protected var mView: View? = null


    /**
     * 获取布局资源id
     *
     * @return 布局资源id
     */
    protected abstract val layoutId: Int

    /**
     * 获取该页面的Presenter
     *
     * @return Presenter实例
     */
    protected abstract var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = presenter
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater!!.inflate(layoutId, container, false)
        return mView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mPresenter!!.attach(this as V)
        initView()
        initData()
    }

    /**
     * 初始化数据（需要时重写）
     */
    protected fun initData() {

    }

    /**
     * 初始化布局
     */
    protected abstract fun initView()
}
