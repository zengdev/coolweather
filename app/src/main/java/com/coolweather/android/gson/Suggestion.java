package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iFuck on 2018/2/10.
 */

public class Suggestion {

	/* // 返回数据格式：
		"suggestion":{
			"comf":{
				"txt":"白天天气较热......"
			},
			"cw":{
				"txt":"不宜洗车......"
			},
			"sport":{
				"txt":"有降雨，风力较强，推荐室内低强度运动......"
			}
		}
	*/

	// 舒适度
	@SerializedName("comf")
	public Comfort comfort;

	// 洗车建议
	@SerializedName("cw")
	public CarWash carWash;

	// 运动建议
	@SerializedName("sport")
	public Sport sport;

	public class Comfort {
		@SerializedName("txt")
		public String info;
	}

	public class CarWash {
		@SerializedName("txt")
		public String info;
	}

	public class Sport {
		@SerializedName("txt")
		public String info;
	}
}
