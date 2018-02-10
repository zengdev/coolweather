package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iFuck on 2018/2/10.
 */

public class Forecast {

	/* // 返回数据格式：
		"daily_forecast": [
			{
				"date":"2016-08-08",
				"cond":{
					"txt_d":"降雨"
				},
				"tmp":{
					"max":"34".
					"min":"27"
				}
			},
			{
				"date":"2016-08-09",
				"cond":{
					"txt_d":"多云"
				},
				"tmp":{
					"max":"35".
					"min":"29"
				}
			},
			...
		]
	*/

	@SerializedName("date")
	public String date;

	@SerializedName("tmp")
	public Temperature temperature;

	@SerializedName("cond")
	public More more;

	public class Temperature {
		@SerializedName("max")
		public String max;

		@SerializedName("min")
		public String min;
	}

	public class More {
		@SerializedName("txt_d")
		public String info;
	}
}
