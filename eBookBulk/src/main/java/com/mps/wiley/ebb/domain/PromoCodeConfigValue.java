package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;


public class PromoCodeConfigValue implements Serializable
{
	
	private static final long serialVersionUID = -76032610247461189L;
	
	private CodeValue codeValue=new CodeValue();
	private CodeConfig codeConfig=new CodeConfig();
	
	public CodeConfig getCodeConfig()
	{
		return codeConfig;
	}
	
	public void setCodeConfig(CodeConfig codeConfig)
	{
		this.codeConfig = codeConfig;
	}
	
	public CodeValue getCodeValue()
	{
		return codeValue;
	}
	
	public void setCodeValue(CodeValue codeValue)
	{
		this.codeValue = codeValue;
	}
	/*
	 * private Project searchProject;
	 * private ProjectUrl projecturl;
	 * 
	 * private Integer codeConfig.PCODE_CONF_ID;
	 * private Integer codeConfig.PROJECT_ID;
	 * private String codeConfig.STYLE;
	 * private String codeConfig.CODE_TYPE;
	 * private String codeConfig.CODE_SIZE;
	 * private Integer codeConfig.QTY;
	 * private String codeConfig.CODE_PREFIX;
	 * private String codeValue.PROMO_CODE;
	 * private Integer codeValue.CODE_STATUS;
	 * private Integer codeValue.COUNT;
	 */
}
