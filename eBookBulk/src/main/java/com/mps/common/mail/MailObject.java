package main.java.com.mps.common.mail;


import java.util.HashMap;
import java.util.Map;


public class MailObject
{
	public final static int MAX_NUMBER = 5000;
	
	private String template;
	
	private String to;
	
	private String cc;
	
	private String bcc;
	
	private String from;
	
	private String subject;
	
	private String attachmentName;
	
	private String[] toArr;
	
	private String[] ccArr;
	
	private String[] bccArr;
	
	private final Map<Object, Object> root = new HashMap<Object, Object>();
	
	public String getTemplate()
	{
		return template;
	}
	
	public void setTemplate(String template)
	{
		this.template = template;
	}
	
	public String getTo()
	{
		return to;
	}
	
	public void setTo(String to)
	{
		this.to = to;
	}
	
	public String[] getToArr()
	{
		return toArr;
	}
	
	public void setTo(String[] toArr)
	{
		this.toArr = toArr;
	}
	
	public String[] getCcArr()
	{
		return ccArr;
	}
	
	public void setCc(String[] ccArr)
	{
		this.ccArr = ccArr;
	}
	
	public String[] getBccArr()
	{
		return bccArr;
	}
	
	public void setBcc(String[] bccArr)
	{
		this.bccArr = bccArr;
	}
	
	public String getFrom()
	{
		return from;
	}
	
	public void setFrom(String from)
	{
		this.from = from;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	public void put(String name, Object value)
	{
		root.put(name, value);
	}
	
	public void put(String name, String value)
	{
		root.put(name, value);
	}
	
	public void put(String name, int value)
	{
		root.put(name, value);
	}
	
	public void put(String name, boolean value)
	{
		root.put(name, value);
	}
	
	public Map<Object, Object> getRoot()
	{
		return root;
	}
	
	public String getAttachmentName()
	{
		return attachmentName;
	}
	
	public void setAttachmentName(String attachmentName)
	{
		this.attachmentName = attachmentName;
	}
	public String getCc()
	{
		return cc;
	}

	public void setCc(String cc)
	{
		this.cc = cc;
	}

	public String getBcc()
	{
		return bcc;
	}

	public void setBcc(String bcc)
	{
		this.bcc = bcc;
	}
}
