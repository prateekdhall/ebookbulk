package main.java.com.mps.wiley.util;


public class StringUtility
{
	
	public StringUtility()
	{
		super();
	}
	
// method to replace the HTML codes with their corresponding characters
	public static String getDenormalizedHtmlString(String stringToNormalize)
	{
		if (stringToNormalize != null && stringToNormalize.length() > 0)
		{
			
			stringToNormalize = stringToNormalize.replaceAll("&lt;", "<");
			
			stringToNormalize = stringToNormalize.replaceAll("&gt;", ">");
			
			stringToNormalize = stringToNormalize.replaceAll("&#47;", "/");
			
			while (stringToNormalize.indexOf("&#92;") >= 0)
			{
				stringToNormalize = stringToNormalize.replace("&#92;", "\\");
			}
			
			stringToNormalize = stringToNormalize.replaceAll("&#34;", "\"");
			
			stringToNormalize = stringToNormalize.replaceAll("&#39;", "'");
			
			stringToNormalize = stringToNormalize.replaceAll("&#91;", "[");
			
			stringToNormalize = stringToNormalize.replaceAll("&#93;", "]");
			
			stringToNormalize = stringToNormalize.replaceAll("&#123;", "{");
			
			stringToNormalize = stringToNormalize.replaceAll("&#125;", "}");
			
			stringToNormalize = stringToNormalize.replaceAll("&#38;", "&");
			
		}
		return stringToNormalize;
	}
	
	public static boolean isNumberOrNot(String value)
	{
		boolean result = true;
		if (value != null)
		{
			try
			{
				Integer.parseInt(value);
			}
			catch (NumberFormatException integerNFE)
			{
				try
				{
					Double.parseDouble(value);
				}
				catch (NumberFormatException doubleNFE)
				{
					try
					{
						Long.parseLong(value);
					}
					catch (NumberFormatException longNFE)
					{
						result = false;
					}
				}
			}
		}
		else
		{
			return false;
		}
		return result;
	}// end of isNumberOrNot()
	
	public static String[] countryList = new String[] {"Please Select", "Afghanistan", "Algeria", "Angola", "Argentina", "Australia", "Austria", "Azerbaijan", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Brazil", "Brunei Darussalam", "Bulgaria", "Cambodia", "Cameroon", "Canada", "Chile", "China", "Colombia", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Dominican Republic", "Ecuador", "Egypt", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Georgia", "Germany", "Ghana", "Greece", "Guatemala", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kenya", "Korea (North)", ">Korea (South)", "Kuwait", "Laos", "Latvia", "Lebanon", "ibya", "Lithuania", "Luxembourg", "Malaysia", "Maldives", "Malta", "Mauritius", "Mexico", "Mongolia", "Montenegro", "Morocco", "Myanmar", "Namibia", "Nepal", "Netherlands", "New Zealand", "Nigeria", "Northern Ireland", "Norway", "Oman", "Pakistan", "Poland", "Panama", "Paraguay", "Peru", "Philippines", "Portugal", "Qatar", "Romania", "Russian Federation", "Saudi Arabia", "Serbia", "Singapore", "Slovak Republic", "Slovenia", "South Africa", "Spain", "Sri Lanka", "St Lucia", "United States", "Sudan", "Sweden", "Switzerland", "Taiwan", "Tanzania", "Thailand", "Tunisia", "Turkey", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan", "Vatican City State", "Venezuela", "Vietnam", "Virgin Islands (British)", "Yemen", "Yugoslavia", "Zaire", "Zambia", "Zimbabwe"};
	public static String[] countryKey = new String[] {"", "AF", "DZ", "AO", "AR", "AU", "AT", "AZ", "BH", "BD", "BB", "BY", "BE", "BM", "BT", "BO", "BA", "BR", "BN", "BG", "KH", "CM", "CA", "CL", "CN", "CO", "CR", "HR", "CU", "CY", "CZ", "DK", "DO", "EC", "EG", "EE", "ET", "FJ", "FI", "FR", "GE", "DE", "GH", "GR", "GT", "HK", "HU", "IS", "IN", "ID", "IR", "IQ", "IE", "IL", "IT", "JM", "JP", "JO", "KE", "KP", "KR", "KW", "LA", "LV", "LB", "LY", "LT", "LU", "MY", "MV", "MT", "MU", "MX", "MN", "ME", "MA", "MM", "NA", "NP", "NL", "NZ", "NG", "NI", "NO", "OM", "PK", "PL", "PA", "PY", "PE", "PH", "PT", "QA", "RO", "RU", "SA", "RS", "SG", "SK", "SI", "ZA", "ES", "LK", "LC", "US", "SD", "SE", "CH", "TW", "TZ", "TH", "TN", "TR", "UG", "UA", "AE", "UK", "UY", "UZ", "VA", "VE", "VN", "VG", "YE", "YU", "ZR", "ZM", "ZW"};
	public static String[] hearUSList = new String[] {"Please Select", "Internet", "Newspaper", "Newsletter" };
	public static String[] hearUSKey = new String[] {"", "internet", "newspaper", "newsletter" };
	
}
