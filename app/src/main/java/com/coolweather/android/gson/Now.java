package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iFuck on 2018/2/10.
 */

public class Now {

	/* // 返回数据格式：
		"now":{
			"tmp":"29",
			"cond":{
				"txt":"降雨"
			}
		}
	*/

	@SerializedName("tmp")
	public String temperature;

	@SerializedName("cond")
	public More more;

	public class More {
		@SerializedName("txt")
		public String info;
	}
}
