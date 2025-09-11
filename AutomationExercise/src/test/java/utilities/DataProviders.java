package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders 
{
	@DataProvider(name="LoginData")
	public Object[][] LoginData() throws IOException
	{
		String excelpath=".//testData//LoginData_DDT.xlsx";
		
		ExcelUtility utility=new ExcelUtility(excelpath);
		
		int row=utility.getRowCount("Sheet1");
		int cell=utility.getCellCount("Sheet1", row);
		
		String data[][]=new String[row][cell];
		
		for(int r=1;r<=row;r++)
		{
			for(int c=0;c<=cell-1;c++)
			{
				data[r-1][c]=utility.getCellData("Sheet1", r, c);
			}
		}		
		
		return data;
	}
}
