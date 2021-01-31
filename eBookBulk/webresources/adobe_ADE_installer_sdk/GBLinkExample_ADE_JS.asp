<%@ Language=JScript %>
<%

// THIS IS THE SERVER-SIDE CODE
// Server VARS are declared here at the top

/*************************************************************
 *
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2006-2009 Adobe Systems Incorporated
 * All Rights Reserved
 *
 * NOTICE: Adobe permits you to use, modify, and distribute
 * this file in accordance with the terms of the Adobe license
 * agreement accompanying it. If you have received this file
 * from a source other than Adobe, then your use, modification,
 * or distribution of it requires the prior written permission
 * of Adobe.
 *
 *************************************************************/
 
// ********************
//	GBLinkExample_ADE_JS.asp
//
//  This is an example file that details passing the server-side variable server_side_GBLinkURL
//  Into the client-side code that is returned from this server-side ASP page
//  
//  it illustrates passing the server-side variable directly into the js escape() function
//  And then calling
//	escapedContentURL = fix_gblink_plus_characters(escapedContentURL);
//
//  If you have deployed the ADE Launcher SDK sample code directly into a Microsoft IIS
//  server that supports ASP, and already has GBLink component installed, this will work
//  by using a browser to hit your server at the URL and virtual folder that points to the un-zipped files
// ********************

//-----------------------------------------------------------------------------
//  Maintenance Log:
//  
//  04/17/2008	the (3) buttonLabel params were removed
//				buttonLabelNotRequirements, buttonLabelNot, buttonLabelInst
//  04/03/2008  Adjust buttonLabel settings to use internal defaults in some cases
//	04/01/2008  Adapted from ACS GBLinkExample_JS.asp for illustration
//
//-----------------------------------------------------------------------------

 
// JavaScript ASP Example for ActiveGBLink
//
// NOTE: Require MS Scripting Host 5.0 or later (see Microsoft Site). Included in Windows 2000.
//
// To test:
// A. Create virtual directory in IIS Web Server pointing to the un-zipped ADE Launcher SDK files
// B. Must be used on server system where GBLink component is already installed
// 1. Leave this file with the ADE Launcher SDK Files
// 2. In your browser, open the URL "localhost/your_directory/GBLinkExample_ADE_JS.asp". 
//    The page will present a link for fulfilling a mythical booka from a mythical fulfillment server.
// 3. Substitute data from YOUR Content Server on lines marked with (1) through (9) to make it
//    generate a REAL fulfillment URL for your content server.

// The data in these strings must be available from the e-commerce pages
// at the time the "Order Confirmation" or "Thank-You" page is displayed

// THIS IS THE SERVER-SIDE CODE
// Server VARS are declared here at the top

var strOrderSource = "STOREKEYNAME";      // See (2) in GBLink.txt 
var strSignatureKey = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";	// See (3) in GBLink.txt  
var strOrderID = "ORDERID";               // Any unique string that identifies the order (See (7) in GBLink.txt)
strFulfillmentServer = "myserver.com";	// Server that will fulfill (See (1) in GBLink.txt)

var server_side_GBLinkURL = "not_set_yet";		// resultant string

var server_side_ERROR = "";		// resultant string

// these are OPTIONAL parameters
var strCustID = "CUSTOMERID";             // Any string that identifies the customer to the store (See (8) in GBLink.txt)
var strProtocol = "ebx";                   // Fulfillment Protocol, one of "ebx" or "pdfm" (See (6) in GBLink.txt)
var strSiteKeyname = "DOWNLOADSITEKEYNAME"; // specifies alternate DOWNLOAD site (versus default one for the store)
					// See (5) in GBLink.txt

try
{
  // Construct the GBLink object
  var oGBLink = Server.CreateObject("ActiveGBLink.GBLink");

  // Now build the the query. The Method BuildQuery takes 6 name-value pairs
  // all unused pairs must have the empty string as the parameter
  // BuildQuery URLEncodes the name and value for each name-value pair if necessary
  var strQueryParams = oGBLink.BuildQuery("action", "enterorder",
			"ordersource", strOrderSource,
			"orderid", strOrderID,
			"handoff", "true",
			"bookid", "ISBN:193016100X",
			"", "");

  // after the initial query string is built, the only way to append 
  // is to use the AppendToQuery Method, one name-value pair at a time 

  // NOT SHOWING THIS for ADEBadgeLauncher example

  // once you are done Appending, sign the query like this 
  // you will need to use the key here 
  var strSignedQuery = oGBLink.SignQuery(strSignatureKey, strQueryParams);

  // now append the signed query to the base fulfillment server (note the "?")
  server_side_GBLinkURL = "http://" + strFulfillmentServer  + "/fulfill/ebx.etd?" + strSignedQuery; 
  
  // YOU CAN DO THIS HERE, but done in BODY INSTEAD
//	Response.Write("<BR>\r\n");
//	Response.Write("<A HREF=\"");
//	Response.Write(server_side_GBLinkURL);
//	Response.Write("\">Click here to download your e-books</A>");

}
catch (exception)	
{
    var pnum = parseInt(exception.number);
    if (!isNaN(pnum))
        iErrNormalized = pnum & 0xFFFF; 
    // write out some error message here 
    
    server_side_ERROR = "ActiveX/Scripting Exception building href: " + exception.description + "<BR/>\r\n"
    server_side_ERROR += "Exception code: " + exception.number + "<BR/>\r\n"
    server_side_ERROR += "Normalized code: " + iErrNormalized + "<BR/>\r\n"

//  Response.Write("\r\n");
//  Response.Write("ActiveX/Scripting Exception building href: " + exception.description);
//  Response.Write("Exception code: " + exception.number);
//  Response.Write("Normalized code: " + iErrNormalized);
}


// LEAVING SERVER-SIDE CODE HERE
// THE NEXT SECTIION is EMITTED directly to the output

%>
<html>
<head>
<title>GBLink example with ADE Badge Launcher included</title>
</head>
<script language="javascript" src="ADEBadgeLauncher.js" type="text/javascript"></script>
<script language="javascript">
<!--
// THIS IS THE CLIENT-SIDE JAVASCRIPT
function doOnLoad()
{
	// Please reference ADEBadgeLauncher.js for full documentation

	// *******************************
	// FOR launcherDivLayer1
	// *******************************
	
	//  HTML Section params:
	//  =========================
	var HTMLdivID = "launcherDivLayer1"; 
	var HTMLobjectID = "ADEBadgeLauncherInstance1";
	
	//  Flash SWF parameters:
	//  =========================
	// var contentURL = "http://ebookfulfill.adobe.com/fulfill/ebx.etd?action=free&ordersource=adbestor&bookid=ISBN:1930161069";
	var autoInstall = false; 
	var autoLaunch = false;
	var badFlashRedirectURL	= null; // "http://my.domain.com/flashhelp";  // null; // can be null

	var doFulfillmentLink = true;	// NEEDED for ACS fulfillment
	var sendADEInstalled = false;
	var sendSWFVersion = false;
	var sendButtonPush = false;  // if true, only call the JS function - contentURL would be ignored if used
	
	// This line would plop the server_side_GBLinkURL as text into the client javascript that is returned
	var escapedContentURL = escape("<%=server_side_GBLinkURL%>");

	// This line will fix the + into %2B for proper operation
	escapedContentURL = fix_gblink_plus_characters(escapedContentURL);
	
	ADEBadgeLauncherInstance(HTMLdivID, HTMLobjectID, escapedContentURL, doFulfillmentLink, autoInstall, autoLaunch, badFlashRedirectURL, sendADEInstalled, sendSWFVersion, sendButtonPush);
	
}

//-->
</script>

<body onLoad="doOnLoad();">

<!--  // NOW LETS ADD the ERROR  -->
<hr/>
ERROR WAS: 
<%=server_side_ERROR%><br/>
<br/>
<!--  // Here is the GBLink URL as HREF on the page -->
<hr/>
HERE is the Href server_side_GBLinkURL<br/>
<br/>
<a href="<%=server_side_GBLinkURL%>">Click here to download your e-books</a><br/>
<br/>
<!--  // NOW LETS ADD the ADE Launcher to this page -->
<hr/>
HERE is the Launcher SWF with the server_side_GBLinkURL setup by escape then fix_gblink_plus_characters<br/>
<br/>
Adobe Content Server download with real GBLink URL <br/><br/>
<!-- Download "button" - the SWF -->
<div id="launcherDivLayer1"></div>

</body>
</html>