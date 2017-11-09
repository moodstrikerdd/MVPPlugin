package com.moo.mvpplugin.main.mainactivity.impl

import android.widget.Toast
import com.moo.mvpplugin.R
import com.moo.mvpplugin.base.BaseActivity
import com.moo.mvpplugin.main.mainactivity.imp.IMainView
import com.moo.mvpplugin.main.mainfragment.impl.MainFragment
import kotlinx.android.synthetic.main.activity_main.*

internal class MainActivity : BaseActivity<IMainView, MainPresenter>(), IMainView {

    override val layoutId: Int = R.layout.activity_main

    override val presenter: MainPresenter = MainPresenter()

    private var mMainFragment: MainFragment? = null

    override fun initView() {
        btnMainAdd.setOnClickListener { v ->
            mPresenter?.getData()
        }
    }

    override fun addFragment(str: String) {
        if (mMainFragment == null) {
            mMainFragment = MainFragment.newInstance(str)
        } else {
            return
        }
        supportFragmentManager
                .beginTransaction()
                .add(R.id.fl_main_container, mMainFragment, "main")
                .commit()

    }

    override fun addFail(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }

}
