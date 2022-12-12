package excel;

public class ExcelReader {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"/src/excel/Studentform2.xlsx";
		Xls_Reader reader = new Xls_Reader(path);
		int rowcount = reader.getRowCount("Sheet1");
		int colcount = reader.getColumnCount("Sheet1");
		System.out.println("Rows: "+rowcount+".....Columns: "+colcount);
		String celldata = reader.getCellData("Sheet1", 1, 3);
		System.out.println(celldata);
		
		for(int i=1;i <= rowcount;i++)
		{
			for(int j = 0;j < colcount;j++)
			{
				String data=reader.getCellData("Sheet1", j, i);
				if(data.equals(null))
					break;
				System.out.print(data+" \t   ");
			}
			System.out.println("\n");
		}
		System.out.println("end");
		//System.getProperty ctrl spacebar to see the command completion help
	}
	
}
