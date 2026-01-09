import com.autoworld.excelreader.ReadExcel;
import org.testng.annotations.Test;

import java.util.logging.Logger;
import java.util.List;
import java.util.Map;

public class TestReadExcel {
    Logger logger = Logger.getLogger(TestReadExcel.class.getName());

    @Test
    public void readTestData(){
        List<Map<String, String>> data = ReadExcel.readData("TestData", "sheet1");
        logger.info("Read " + data.size() + " rows from Excel file");
        logger.info(data.toString());
    }
}
