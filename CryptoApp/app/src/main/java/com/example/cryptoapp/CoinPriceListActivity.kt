package com.example.cryptoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var appViewModel: AppViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)

        appViewModel = ViewModelProviders.of(this)[AppViewModel::class.java]

//        appViewModel.priceList.observe(this, Observer {
//            Log.d("Success", "in activity $it")
//        })

        appViewModel.getDetailInfo("ETC").observe(this, Observer {
            Log.d("Success2", "in activity $it")
        })

    }


}
