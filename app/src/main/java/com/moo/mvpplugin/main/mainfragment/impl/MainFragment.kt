package com.moo.mvpplugin.main.mainfragment.impl

import com.moo.mvpplugin.R

import android.os.Bundle

import com.moo.mvpplugin.base.BaseFragment
import com.moo.mvpplugin.main.mainfragment.imp.IMainView
import kotlinx.android.synthetic.main.fragment_main.*

internal class MainFragment : BaseFragment<IMainView, MainPresenter>(), IMainView {
    override var presenter: MainPresenter = MainPresenter()

    override val layoutId: Int = R.layout.fragment_main

    override fun initView() {
        tvMainShow.text = mParam1

        tvMainShow.setOnClickListener {
            tvMainShow.append("\n >-<\t\t>o<\t\t>-<")
        }
    }

    private var mParam1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
        }
    }

    companion object {

        private val ARG_PARAM1 = "param1"

        fun newInstance(param1: String): MainFragment {
            val fragment = MainFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            fragment.arguments = args
            return fragment
        }
    }

}
