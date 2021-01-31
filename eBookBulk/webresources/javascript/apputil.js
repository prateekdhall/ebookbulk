function length(fldId, lbl, size) {
	var val = jQuery("#" + fldId).val();
	if (val.length != size) {
		alert("Length for " + lbl + " should be " + size + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;

}

function alphaNumeric(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}

	return true;

}

function alphaNumericPhoneSagePay(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	val = val.replace(/^[a-zA-Z0-9 \-\(\)\+]+$/, "");
	if (val != "") {
		alert("Only alphanumeric values allowed for " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}
	return true;

}

function alphaNumericPostCodeSagePay(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	val = val.replace(/^[a-zA-Z0-9 \-]+$/, "");
	if (val != "") {
		alert("Only alphanumeric values allowed for " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}
	return true;

}

function numericVal(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	val = val.replace(/[0-9]*/g, "");
	if (val != "") {
		alert("Only numeric values allowed for " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function doiCheck(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	if (val.toString().indexOf("..") != -1) {
		alert("Please provide valid " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}
	val = val.replace(/[0-9\.]*/g, "");
	if (val != "") {
		alert("please provide valid " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function decimalVal(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	if (val == "")
		return true;
	if (!(/^[-+]?[0-9]+(\.[0-9]+)?$/.test(val))) {
		alert("Only decimal values allowed for " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function charVal(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	val = val.replace(/[A-Z]*/g, "");
	if (val != "") {
		alert("Only characters are allowed in capital letters for " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function blankVal(fldId, lbl) {
	var val = jQuery("#" + fldId).val();
	val = val.replace(/[ ]*/g, "");
	if (val == "") {
		alert("Please enter " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function blankVal2zero(fldId, lbl) {
	var val = jQuery("#" + fldId).val();
	if (val == "") {
		alert("Field " + lbl + " value is " + val + ".");
		var val = jQuery("#" + fldId).val(0);
		alert("Field " + lbl + " value is " + val + ".");
		return false;
	}

	return true;
}

function Val0(fldId, lbl, blk) {
	if (blk == 0) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	if (val == 0) {
		alert("Please Enter " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function multiSelectedVal(fldId, lbl) {
	if (jQuery("#" + fldId + ' option').length == 0) {
		alert("Please assign " + lbl + ".");
		return false;
	}

	return true;
}

function multiSelectedValAvailableUsers(fldId, lbl) {
	if (jQuery("#" + fldId + ' option').length == 0) {
		alert("" + lbl + ".");
		return false;
	}

	return true;
}

function selectAll(fldId) {
	jQuery("select[id=" + fldId + "]").each(function() {
		jQuery("#" + fldId + " option").attr("selected", "selected");
	});
}

function selectCombo(fldId, lbl) {
	if (jQuery("#" + fldId).val() <= 0) {
		alert("Please select " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}
	return true;
}

function emailVal(fldId, lbl, blk) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}
	var val = jQuery("#" + fldId).val();
	if (!(/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/
			.test(val))) {
		alert("Please enter valid " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function multiEmailVal(fldId, lbl, blk, val) {
	if (blk == 1) {
		if (!blankVal(fldId, lbl)) {
			return false;
		}
	}

	if (!(/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/
			.test(val))) {
		alert("Please enter valid " + lbl + ".");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function yearlength(fldId, lbl, size) {
	var val = jQuery("#" + fldId).val();
	if (val.length != size) {
		alert(lbl + " should be of " + size + " digits only.");
		jQuery("#" + fldId).focus();
		return false;
	}

	return true;
}

function addNewOption(objCmb, strText, strValue) {
	var iLength = objCmb.options.length;
	objCmb.options[iLength] = new Option(strText, strValue);
	objCmb.selectedIndex = iLength;
}

function noBack() {
	window.history.forward();
}

function numericOnly(evt) {

	var charCode = (evt.which) ? evt.which : event.keyCode;
	if (charCode > 31 && (charCode < 48 || charCode > 57))
		return false;

	return true;
}

function trim(stringToTrim) {
	return stringToTrim.replace(/^\s+|\s+$/g, "");
}
function ltrim(stringToTrim) {
	return stringToTrim.replace(/^\s+/, "");
}
function rtrim(stringToTrim) {
	return stringToTrim.replace(/\s+$/, "");
}
