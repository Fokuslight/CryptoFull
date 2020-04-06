package com.example.cryptoapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cryptoapp.api.ApiFactory.BASE_IMAGE_URL
import com.example.cryptoapp.utils.convertTimeStampToTime
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @SerializedName("TYPE")
    @Expose
    val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    val market: String? = null,

    @SerializedName("FROMSYMBOL")
    @Expose
    val fromSymbol: String? = null,

    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val flags: String? = null,

    @SerializedName("PRICE")
    @Expose
    val price: Double? = null,

    @PrimaryKey(autoGenerate = true)
    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Long? = null,

    @SerializedName("MEDIAN")
    @Expose
    val median: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: Double? = null,

    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val topTierVolume24Hour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val topTierVolume24HourTo: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24Hour: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changePCT24Hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeDay: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changePCTDay: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changeHour: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changePCTHour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversionType: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionSymbol: String? = null,

    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String? = null


){
    fun getFormattedTime(): String {
        return convertTimeStampToTime(lastUpdate)
    }

    fun getFullImageUrl(): String {
        return BASE_IMAGE_URL + imageUrl
    }

}