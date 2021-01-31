package main.java.com.mps.wiley.common;


public interface AppConstants
{
	public static final int ROLE_SUPER_ADMIN = 1;
	public static final int ROLE_PROJECT_ADMIN = 2;
	public static final int ROLE_REQUESTER = 3;
	public static final int ROLE_KEY_CONTACT = 4;
	
	public static final String USER_OBJECT = "user";
	public static final String MENU_LIST = "menu_list";
	
	public static final String CF_GRID_LIST = "CF_GRID_LIST";
	public static final String CF_DELETE_LIST = "CF_DELETE_LIST";
	public static final String CF_AUTO_COUNT = "CF_AUTO_COUNT";
	
	public static final String KC_GRID_LIST = "KC_GRID_LIST";
	public static final String KC_DELETE_LIST = "KC_DELETE_LIST";
	public static final String KC_AUTO_COUNT = "KC_AUTO_COUNT";
	
	public static final String EM_GRID_LIST =  "EM_GRID_LIST";
	
	public static final int STATUS_PENDING = 1;
	public static final int STATUS_ACTIVE = 2;
	public static final int STATUS_INACTIVE = 3;
	public static final int STATUS_DELETED = 4;
	
	public static final int PROJECT_TYPE_SINGLE = 1;
	public static final int PROJECT_TYPE_MULTIPLE = 2;
	
	public static final int YES = 1;
	public static final int NO = 0;
	public static final int MANDATORY = 1;
	public static final int OPTIONAL = 2;
	
	public static final String DATE_FORMAT = "dd-MMM-yyyy HH:mm:ss";
	public static final String DATE_FORMAT_NO_TIME = "dd-MMM-yyyy";
	
	public static final String TEMPLATE_SYSTEM = "SYSTEM";
	public static final String TEMPLATE_USER = "USER";

	public static final String FILE_SEPARATOR = System.getProperty("file.separator");

	public static final String REPORT_DOWNLOAD_PATH = FILE_SEPARATOR + "usr" + FILE_SEPARATOR + "wiley" + FILE_SEPARATOR + "WileyBulkSales"
			+ FILE_SEPARATOR+"export"+ FILE_SEPARATOR;
	public static final String Subject = "Generated Url and Promocode List";
	public static final String body=" <html>	<head>		<title> </title>	</head> <body>  Hi  <br /> Please find attached Generated Url and Promocode List. </b> <br /> <h5> Note: This is an auto generated mail. Please do not reply. </h5> <br> <br> From <br> e-Bulk Book System  </body> </html> ";

	public static final String CONTENTSTARTDYNAMICHTMLID="COVERIMAGE_START";
	public static final String CONTENTENDDYNAMICHTMLID="COVERIMAGE_END";
}
