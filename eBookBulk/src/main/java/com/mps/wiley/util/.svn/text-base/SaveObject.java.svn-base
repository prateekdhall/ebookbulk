package main.java.com.mps.wiley.util;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class SaveObject {
public Object javaObject=null;

public Object getJavaObject() {
	return javaObject;
}

public void setJavaObject(Object javaObject) {
	this.javaObject = javaObject;
}

public byte[] saveObject() throws Exception
{
	byte[] data=null;
	
	try {
		ByteArrayOutputStream bos=new ByteArrayOutputStream(); 
		ObjectOutputStream oos= new ObjectOutputStream(bos);
		oos.writeObject(javaObject);
		oos.flush();
		oos.close();
		bos.close();
		
		data = bos.toByteArray();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
}

}
