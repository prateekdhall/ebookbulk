package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;


public class Email implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4981733987663599103L;
	private String from;
	private String subject;
	private String editor;
	private String to;
	private String cc;
	
	public String getSubject()
	{
		return subject;
	}
	
	
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	
	public String getEditor()
	{
		return editor;
	}
	
	
	public void setEditor(String editor)
	{
		this.editor = editor;
	}
	
	
	public String getFrom()
	{
		return from;
	}
	
	
	public void setFrom(String from)
	{
		this.from = from;
	}
	
	
	public String getTo()
	{
		return to;
	}
	
	
	public void setTo(String to)
	{
		this.to = to;
	}
	
	
	public String getCc()
	{
		return cc;
	}
	
	
	public void setCc(String cc)
	{
		this.cc = cc;
	}
	
	
	public Email()
	{
	}
	
	
	public String toString()
	{
		StringBuilder ret = new StringBuilder();
		ret.append("from=" + from);
		ret.append(", to=" + to);
		ret.append(", cc=" + cc);
		ret.append(", subject=" + subject);
		ret.append(", editor=" + editor);
		
		return ret.toString();
	}
	
	
}
