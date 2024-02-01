package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders{
  @DataProvider(name="dp")
  public String[][] getData() throws IOException{
	  String filepath = "D:\\Selenium with Java\\opencart\\testdata\\testData.xlsx";
	  ExcelUtility eu = new ExcelUtility(filepath);
	  
	  int rowcount = eu.getRowCount("Sheet1");
	  int cellcount = eu.getCellCount("Sheet1",1);
	  
	  String [][] file_data = new String[rowcount][cellcount];
	  
	  for(int i=1;i<=rowcount;i++) {
		  for(int j=0;j<cellcount;j++) {
			  file_data[i-1][j] = eu.getCellData("Sheet1", i, j);
		  }
	  }
	  return file_data;
  }
}
