
/**
 * Reads a chosen CSV file of country exports and prints each country that exports coffee.
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import org.apache.commons.csv.*;
public class Week03Solution {
    
    int qtd = 0;
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
    
    /**
    public void q01() {
     
        for(CSVRecord record : parser){                  
            String value = record.get("Exports");
            if(value.contains("cotton") && value.contains("flowers")){
                System.out.println(record.get("Country"));
            }                            
        }
        
    }
    
    /**
    
    public void q02() {
       
        for(CSVRecord record : parser){                  
            String value = record.get("Exports");
               
            
            if(value.contains("cocoa")){
               qtd ++;
            }
        }
        System.out.println ("--------------------------------");        
        System.out.println ("Q03: " + qtd);
        
    }
    

      public void q04() {
        
         System.out.println ("--------------------------------");        
        System.out.println ("Q04: " + qtd);
        for(CSVRecord record : parser){                  
            String value = record.get("Time EST");
               
            
            if(value.length() > 17){
              System.out.println(record.get("Country") + " - " + value);
            }
        }
       
        
    }
    
    
    
    
    public void listExporters(CSVParser parser, String exportOfInterest) {
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

    public void q05() {
        //for each row in the CSV File
        int lower = 999;
  
        for(CSVRecord record : parser){                  
            String value = record.get("Humidity");
               
            
            if(Integer.parseInt(value) < lower){
             lower = Integer.parseInt(value);
            }
        }
       System.out.println ("--------------------------------");        
       System.out.println ("Q05: " + lower);
        
    }
    
    public void q06() {
        //for each row in the CSV File
        int lower = 999;
        String date = "";
  
        for(CSVRecord record : parser){                  
            Integer value = Integer.parseInt(record.get("Humidity"));                           
            if(value < lower){
                lower = value; 
                date =  record.get("TimeEDT");
            }
        }
       System.out.println ("--------------------------------");        
       System.out.println ("Q05: " + lower);
       System.out.println ("Date: " + date);
        
    }
    
      public void q08() {
        //for each row in the CSV File
        Float total = 0f;
        Float lower = 999f;
        Float high = -999f;
        String date_lower = "";
        String date_high = "";
        Integer cont = 0;
        Float mean = 0f;
  
        for(CSVRecord record : parser){                  
            Float value = Float.parseFloat(record.get("TemperatureF"));                           
            if(value <= lower){
                lower = value; 
                date_lower =  record.get("TimeEDT");
            }
            if(value >= high){
                high = value; 
                date_high =  record.get("TimeEDT");
            }
            cont ++;
            total += value;
        }
        
       mean = total / cont;
       System.out.println ("--------------------------------");        
       System.out.println ("Q08:");
       System.out.println ("Mean: " + mean);
       System.out.println ("Lower: " + lower);
       System.out.println ("High: " + high);
        
    }
    
    public void q09() {
        //for each row in the CSV File
        Float total = 0f;
        Float lower = 999f;
        Float high = -999f;
        String date_lower = "";
        String date_high = "";
        Integer cont = 0;
        Float mean = 0f;
  
        for(CSVRecord record : parser){                  
            Float value = Float.parseFloat(record.get("TemperatureF"));                           
           if(value >= 80){
             if(value <= lower){
                lower = value; 
                date_lower =  record.get("TimeEDT");
            }
            if(value >= high){
                high = value; 
                date_high =  record.get("TimeEDT");
            }
            cont ++;
            total += value;}
        }
        
       mean = total / cont;
       System.out.println ("--------------------------------");        
       System.out.println ("Q09:");
       System.out.println ("Mean: " + mean);
       System.out.println ("Lower: " + lower);
       System.out.println ("High: " + high);
        
    }
    
 **/
       
     public void info() {
        //for each row in the CSV File
        Float total = 0f;
        Float lower = 999f;
        Float high = -999f;
        String date_lower = "";
        String time_lower = "";
        String date_high = "";
        String time_high = "";
        Integer cont = 0;
        Float mean = 0f;
        String h_record = "";
  
        for(CSVRecord record : parser){      
          Float value = Float.parseFloat(record.get("TemperatureF"));  
          if(value >= high){
              high = value;
              h_record = record.toString();
          }

        }
        
       mean = total / cont;
       System.out.println ("--------------------------------");   
       System.out.println ("INFO:");
       System.out.println (h_record);   
       /**System.out.println ("Mean: " + mean);
       System.out.println ("Lower: " + lower);
       System.out.println ("Date Low: " + date_lower);
       System.out.println ("Time Low: " + time_lower);
       System.out.println ("High: " + high);
       System.out.println ("Date High: " + date_high);
       System.out.println ("Time High: " + time_high);**/
        
    }
    
    public void whoExports() {
       
       
    }
}
