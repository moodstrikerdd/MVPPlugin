package com.moo.mvpplugin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author moo
 * @date 2017/11/3.
 * @describe MVP activity基类
 */

abstract class BaseActivity<V, P : BaseMvpPresenter<V>> : AppCompatActivity() {
    protected var mPresenter: P? = null

    /**
     * 获取资源文件id
     *
     * @return 资源文件id
     */
    protected abstract val layoutId: Int

    /**
     * 获取该页面的Presenter
     *
     * @return Presenter实例
     */
    protected abstract val presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        mPresenter = presenter
        if (mPresenter != null) {
            mPresenter!!.attach(this as V)
        }
        initView()
        initData()
    }


    override fun onDestroy() {
        super.onDestroy()
        if (mPresenter != null) {
            mPresenter!!.detach()
        }
    }


    /**
     * 初始化界面
     */
    protected abstract fun initView()

    /**
     * 初始化数据（某些不用则不需要重写）
     */
    protected fun initData() {}
}
