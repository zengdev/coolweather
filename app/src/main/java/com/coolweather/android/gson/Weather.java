package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by iFuck on 2018/2/10.
 */

public class Weather {

	/* // 返回数据格式：
		{
			"HeWeather":[
				{
					"status":"ok",
					"basic":{},
					"aqi":{},
					"now":{},
					"suggestion":{},
					"daily_forecast":[]
				}
			]
		}
	*/

	// 成功返回ok，失败则返回具体原因
	@SerializedName("status")
	public String status;

	@SerializedName("basic")
	public Basic basic;

	@SerializedName("aqi")
	public AQI aqi;

	@SerializedName("now")
	public Now now;

	@SerializedName("suggestion")
	public Suggestion suggestion;

	@SerializedName("daily_forecast")
	public List<Forecast> forecastList;
}
