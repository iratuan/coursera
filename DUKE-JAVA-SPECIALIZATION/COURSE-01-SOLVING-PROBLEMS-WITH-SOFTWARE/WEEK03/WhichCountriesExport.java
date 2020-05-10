/**
 * Reads a chosen CSV file of country exports and prints each country that exports coffee.
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import org.apache.commons.csv.*;
public class WhichCountriesExport {
      FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        
    public void listExportersByEconomy() {
        //for each row in the CSV File
        for(CSVRecord record : parser){                  
            String value = record.get("Value (dollars)");       
            if(value.length() > 17){
                System.out.println("País: " + record.get("Country") + ", Valor: " + record.get("Value (dollars)"));
            }
            
        }
        

    }
    public void listExporters(String exportOfInterest) {
        //for each row in the CSV File
        for(CSVRecord record : parser){                  
            String export = record.get("Exports");
            String[] params = exportOfInterest.split(",");
            int count = 0;
            for(String p : params){
                if(export.indexOf(p) != -1){
                        count ++;
                }
            }
            
            if(count == params.length){
                System.out.println(record.get("Country"));
            }
            
        }
        

    }

    public void whoExports() {
      
        listExportersByEconomy();
    }
}
