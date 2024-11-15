package dataFactoryDesignPatteren;

import java.util.Map;

public class DataSourceTest {

	public static void main(String[] args) {

		Map<String, String> data = DataSourceFactory.DataSourceType(DataSourceName.HardCoded).dataSource();
		DataSourceFactory.loginApplication(data);

	}

}
