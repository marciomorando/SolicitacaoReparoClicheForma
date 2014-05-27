/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marcio.morando
 */
public class clsDataHoraConverte {
          public Date transformaData(String data)  
{  
  SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
  try  
  {  
    return formatador.parse(data);  
  }  
  catch(ParseException ex)  
  {   
      throw new RuntimeException(ex);  
  }  
}
}
