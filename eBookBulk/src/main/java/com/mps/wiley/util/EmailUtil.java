package main.java.com.mps.wiley.util;

import java.util.ArrayList;
import java.util.List;
import main.java.com.mps.common.AppSystem;
import main.java.com.mps.common.mail.MailObject;

public class EmailUtil {

	
	public static MailObject sendEmailWithAttachment(String toemail, String cc, String TemplateFile,String From, String Subject, String attachedFile)
	{
		boolean b=false;
		MailObject bean = null;
			try
			{
				bean = new MailObject();
				bean.setTemplate(TemplateFile);
				bean.setTo(toemail);
				bean.setCc(cc);
				bean.setFrom(From);
				bean.setSubject(Subject);
				bean.setAttachmentName(attachedFile);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		return bean;
	}
	
	public static MailObject sendEmailWithAttachment(String[] toemail, String[] cc, String TemplateFile,String From, String Subject, String attachedFile)
	{
		boolean b=false;
		MailObject bean = null;
			try
			{
				bean = new MailObject();
				bean.setTemplate(TemplateFile);
				bean.setTo(toemail);
				bean.setCc(cc);
				bean.setFrom(From);
				bean.setSubject(Subject);
				bean.setAttachmentName(attachedFile);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		return bean;
	}
	
}
