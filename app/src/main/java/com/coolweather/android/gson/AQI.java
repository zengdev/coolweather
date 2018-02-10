package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iFuck on 2018/2/10.
 */

public class AQI {

	/* // 返回数据格式：
		"aqi":{
			"city":{
				"aqi":"44",
				"pm25":"13"
			}
		}
	*/

	@SerializedName("city")
	public AQICity city;

	public class AQICity {
		@SerializedName("aqi")
		public String aqi;

		@SerializedName("pm25")
		public String pm25;
	}
}
