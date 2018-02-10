package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iFuck on 2018/2/10.
 */

public class Basic {

	/* // 返回数据格式：
		"basic":{
			"city":"苏州",
			"id":"CN101190401",
			"update":{
				"loc":"2016-08-08 21:58"
			}
		}
	*/

	@SerializedName("city")
	public String cityName;

	@SerializedName("id")
	public String weatherId;

	@SerializedName("update")
	public Update update;

	public class Update {
		@SerializedName("loc")
		public String updateTime;
	}
}
