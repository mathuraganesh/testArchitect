package dataFactoryDesignPatteren;

import java.util.LinkedHashMap;
import java.util.Map;

public class HardCodeData implements TestDataProvider{

	@Override
	public Map<String,String> dataSource() {
		Map<String,String> data=new LinkedHashMap<>();
		//Object[][] data=new Object[0][2];
		data.put("url","http://leaftaps.com/opentaps/control/main");
		data.put("userName","demosalesManager");
		data.put("password","crmsfa");
		return data;
	}

}
