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
//	DigitalEditionsDetection.js
//
//  This file uses the Open Source SWFObject to perform Flash Detection and 
//  instantiate instance of the ade_web_library.swf.  The parameter sendADEInstalled
//  is used on this instance of the SWF to signal the JS if ADE is installed or not
//  This JS is used in the ADE Detection HTML example
//
//  NOTE: This code and the sample code should be used from a web browser for
//  true test of the environment.  Opening the sample HTML files directly from the
//  file system may produce un-desirable results due to the flash security model
//  To ensure good test results, place the sample code all in a single folder then expose
//  that folder as a virtual directory from your favorite web server.
// ********************

//-----------------------------------------------------------------------------
//  Maintenance Log:
//  
//  10/20/2008	ADEVersion update.	ADEVersion CAN NOT be "1" or "2" anymore
//  04/17/2008	the (3) buttonLabel params were removed
//				buttonLabelNotRequirements, buttonLabelNot, buttonLabelInst
//				ALSO badgeImagePath is removed
//  04/03/2008	Adjust buttonLabel settings to use internal defaults in some cases
//				ADEVersion moved to "2" by default now (ADE 1.5)
//  01/23/2008	update to use locale, ADEVersion, sendSWFVersion, sendButtonPush
//				Assign Marked background image for clear ID of SWF in testing
//-----------------------------------------------------------------------------

var G_nPlatform = 888;		// 1-WIN 2-Mac 3-Linux 4-Unknown
var G_bFlashInstalled = false;
var G_nav_platform = "";

var	GD_at_ShowADE_DivLayer = 0;
var	GD_at_ADE_Detect_doOnLoad = 0;

// ********************
// set_ADE_TestDetectionForm_Data
// Update the data in the test form
//
// Stub function provided to support operation
// independent of use of test_DigitalEditionsDetection.js
// If using that JS, then comment this stub function
// ********************
//function set_ADE_TestDetectionForm_Data()
//{
	// Comment this function if using test_DigitalEditionsDetection.js
//}

// ********************
// onShowADE_ShowContentDiv
// Do dynamic layout
//
// Stub function provided to support operation
// independent of implementation in HTML file
// You would have this function in HTML page to 
// ********************
//function onShowADE_ShowContentDiv()
//{
	// PLEASE SEE THE REFERENCE HTML FILE 
	
	// Code is added in this function in the HTML/Display file that instantiates
	// instances of the DigitalEditions Launcher using the function
	//	ADEBadgeLauncherInstance(<params>);
//}

// ********************
// Decide what layer (1 of 4) to show
//
// This function is replacement function for the 
// stub provided in ADEBadgeLauncher.js
// ********************
function ShowADE_DivLayer()
{
	GD_at_ShowADE_DivLayer++;

	// see comments inline below
	var bShowADE_DetectAndInstallDiv = false;
	var bShowADE_UnsupportedOSDiv = false;
	var bShowADE_NeedFlashDiv = false;
	var bShowADE_ShowContentDiv = false;
	
	// master logic
	// Show 1 of the 4 layers
	if ((G_nPlatform != 1) && (G_nPlatform != 2))
	{
		// div ADE_UnsupportedOSDiv is shown if Unsupported operating system is detected 
		bShowADE_UnsupportedOSDiv = true;
	}
	else	// Windows
	{
		if (G_bFlashInstalled)
		{
			if (G_nADEInstalled == 1)
			{
				// everything is good, let page show what it wants
				bShowADE_ShowContentDiv = true;
			}
			else	// need ADE
			{
				// div ADE_DetectAndInstallDiv is placeholder for ADE launcher SWF, using deconcept flash detection.
				// This object does reliable flash detection to ensure the ade_web_library.swf can load -->
				bShowADE_DetectAndInstallDiv = true;
			}
		}
		else // no Flash
		{
			// div ADE_NeedFlashDiv is shown if basic Flash is not detected
			bShowADE_NeedFlashDiv = true;
		}
	}
	
	// Set the div states
	// block, inline, none
	var element = document.getElementById("ADE_DetectAndInstallDiv");
	if (bShowADE_DetectAndInstallDiv)
		element.style.display = "block";
	else		
		element.style.display = "none";
	
	element = document.getElementById("ADE_UnsupportedOSDiv");
	if (bShowADE_UnsupportedOSDiv)
		element.style.display = "block";
	else		
		element.style.display = "none";
	
	element = document.getElementById("ADE_NeedFlashDiv");
	if (bShowADE_NeedFlashDiv)
		element.style.display = "block";
	else		
		element.style.display = "none";
	
	element = document.getElementById("ADE_ShowContentDiv");
	if (bShowADE_ShowContentDiv)
	{
//		onShowADE_ShowContentDiv();
		element.style.display = "block";
	}
	else		
	{
		element.style.display = "none";
	}
	
	// Update the debugging DIV
	//
	// have code like this on a page
	// <hr/>
	// DEBUGGING DIV <br/><br/>
	// <!-- div ADE_DebugDiv -->
	// <div id="ADE_DebugDiv"></div>
	
/**********************************	
	element = document.getElementById("ADE_DebugDiv");
	
	var strDBG = "at_doOnLoad (" + GD_at_doOnLoad + ")";
	strDBG += (" at_setG_nADEInstalled (" + GD_at_setG_nADEInstalled + ")");
	strDBG += (" at_onShowADE_ShowContentDiv (" + GD_at_onShowADE_ShowContentDiv + ")");
	strDBG += (" at_ShowADE_DivLayer (" + GD_at_ShowADE_DivLayer + ")");
	strDBG += (" at_ADE_Detect_doOnLoad (" + GD_at_ADE_Detect_doOnLoad + ")");
	strDBG += (" at_setG_strSWFVersion (" + GD_at_setG_strSWFVersion + ")");
	
	strDBG += "<br/>";
	
	strDBG += (" at_set_ADE_TestDetectionForm_Data (" + GD_at_set_ADE_TestDetectionForm_Data + ")");
	strDBG += (" at_TPlat (" + GD_at_TPlat + ")");
	strDBG += (" at_TFlash (" + GD_at_TFlash + ")");
	strDBG += (" at_TADE (" + GD_at_TADE + ")");

	element.innerHTML = strDBG;
	element.style.display = "block";
**********************************/
	
	// Update ADE_TestDetectionForm, if using test_DigitalEditionsDetection.js
	// This calls stub function, above.  Comment that out if actually
	// using test_DigitalEditionsDetection.js to have the call land there
	set_ADE_TestDetectionForm_Data();
}

// ********************
// ADE_Detect_doOnLoad()
// HTML <body> bootstrap script
// ********************
function ADE_Detect_doOnLoad(badFlashRedirectURL, autoInstall, autoLaunch)
{
	GD_at_ADE_Detect_doOnLoad++;
	
	G_nPlatform = 999;	// MAC
	G_bFlashInstalled = false;
//	G_nADEInstalled = 0;
	
	G_nav_platform = navigator.platform;
	
	// the real code for OS, uses navigator.platform
	if (G_nav_platform.indexOf("Win") != -1)
		G_nPlatform = 1;	// win
	else if (G_nav_platform.indexOf("Mac") != -1)
		G_nPlatform = 2;	// Mac
	else if (G_nav_platform.indexOf("linux") != -1)
		G_nPlatform = 3;	// linux
	else		
		G_nPlatform = 4;	// unknown
		
	// ONLY GET FANCIER (use deconcept) if we have WINDOWS or MAC
	if ((G_nPlatform == 1) || (G_nPlatform == 2))
	{
		G_bFlashInstalled = false;
		
		// function from  ADEBadgeLauncher.js
		// SWFObject sets the MMredirectURL via the xiRedirectUrl
		// SWFObject performs escape internally, so dont do that here
		var bEscape = false;
		var finalBadFlashRedirectURL = getFinalBadFlashRedirectURL(badFlashRedirectURL, bEscape);
		
		// Use the deconcept SWFObject to detect FLASH or not	
		// We let deconcept create a special instance of the launcher SWF
		// This has the setting for sendADEInstalled = true
		var swf = "ade_web_library.swf";
		var id = "ADEBadgeDetector";
		
		var w = "315";	// Release 1.0 (june, 2007)
		var h = "220";	// Release 1.0 (june, 2007)
		var ver = "7"
		var color = "#ffffff";
		var useExpressInstall = null;
		var quality = null;
		var xiRedirectUrl = finalBadFlashRedirectURL;
		var redirectUrl = null;
		var detectKey = null;

		var swfObj = new SWFObject(swf, id, w, h, ver, color, useExpressInstall, quality, xiRedirectUrl, redirectUrl, detectKey);

		// This is the SWFObject method to add parameters to your SWF
		// These are the ade_web_library.swf parameters.
		// Please see ADEBadgeLauncher.js for details
		// The key here is to set sendADEInstalled = true
		// Then, THIS INSTANCE of the SWF will communicate with 
		// the function setG_nADEInstalled() [from ADEBadgeLauncher.js]
		
		// NOTES for LOCALE:
		// See documentation in ADEBadgeLauncher.js
		// Also may try navigator.userLanguage, navigator.systemLanguage;
		// navigator.language did not produce good results with IE7
		var locale = navigator.browserLanguage;
		var userAgent = navigator.userAgent;
		var strAutoInstall = "false";
		var strAutoLaunch = "false";
		if (autoInstall)
		{
			strAutoInstall = "true";
		}
		
		if (autoLaunch)
		{
			strAutoLaunch = "true";
		}
		
		// See io_ADEVersion documentation in ADEBadgeLauncher.js
		var ADEVersion = "4"; // "4" is ADE 1.7 or greater - "3" is ADE 1.7 Beta or greater
		
		swfObj.addVariable("ADEVersion", ADEVersion); // "4" is ADE 1.7 or greater - "3" is ADE 1.7 Beta or greater
		swfObj.addVariable("badgeJSLauncher", "true");
		swfObj.addVariable("userAgent", userAgent);
		swfObj.addVariable("locale", locale);
// NOTE: THis is done internally in SWFObject via xiRedirectUrl			
//		swfObj.addVariable("MMredirectURL", finalBadFlashRedirectURL);
		swfObj.addVariable("contentURL", "");
		swfObj.addVariable("autoInstall", strAutoInstall);
		swfObj.addVariable("autoLaunch", strAutoLaunch);

		swfObj.addVariable("doFulfillmentLink", "false");
		swfObj.addVariable("sendADEInstalled", "true");
//		swfObj.addVariable("sendSWFVersion", "false");	// not sent is same as "false"
//		swfObj.addVariable("sendButtonPush", "false");	// not sent is same as "false"
		swfObj.addParam("allowscriptaccess", "samedomain");
		
		// command SWFObject to install the SWF at the div Layer specified
		// SWFObject will perform basic flash detection and run the SWF
		// if it is able to do so.  If failure is indicated, this means that
		// SWFobject has not detected basic flash to run the SWF
		var bFlash = swfObj.write("ADE_DetectAndInstallDiv");

		// Check and see if valid FLASH detected
		if (bFlash)
		{
			G_bFlashInstalled = true;
		}
	}

	// prepare the content layers so they can be revealed when needed
	onShowADE_ShowContentDiv();
	
	// in all cases, show the appropriate DIV Layer	
	ShowADE_DivLayer();
}
