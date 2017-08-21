package com.test.sleep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTool {
  
    public static String object2String(Object obj){  
        String objBody = null;  
        ByteArrayOutputStream baops = null;  
        ObjectOutputStream oos = null;  
        
        try {  
            baops = new ByteArrayOutputStream();  
            oos = new ObjectOutputStream(baops);  
            oos.writeObject(obj);  
            byte[] bytes = baops.toByteArray();  
            objBody = new String(bytes);  
        } catch (IOException e) {  
            System.out.println("e.toString()-1: "+e.toString());  
        } finally  {  
            try {  
                if (oos != null)  
                    oos.close();  
                if (baops != null)  
                    baops.close();  
            } catch (IOException e) {  
            	System.out.println("e.toString()-2: "+e.toString());  
            }  
        }  
        return objBody;  
    }  
  
    @SuppressWarnings("unchecked")  
    public static <T extends Serializable> T getObjectFromString(String objBody, Class<T> clazz) {  
        byte[] bytes = objBody.getBytes();  
        ObjectInputStream ois = null;  
        T obj = null;  
        try{  
            ois = new ObjectInputStream(new ByteArrayInputStream(bytes));  
            obj = (T) ois.readObject();  
        } catch (IOException e){  
        	System.out.println("e.toString()-3: "+e.toString());   
        } catch (ClassNotFoundException e) {  
        	System.out.println("e.toString()-4: "+e.toString());    
        } finally{  
            try {  
                if (ois != null)  
                    ois.close();  
            } catch (IOException e){  
            	System.out.println("e.toString()-5: "+e.toString());  
            }  
        }  
  
        return obj;  
    }  
	  
	  

}
