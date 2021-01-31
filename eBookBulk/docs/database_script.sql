
CREATE TABLE `ROLE` (
  `ROLE_ID` SMALLINT(6) NOT NULL,
  `ROLE_NAME` VARCHAR(50) NOT NULL,
  `ROLE_RIGHTS` ENUM('RO','RW') NOT NULL,
  PRIMARY KEY  (`ROLE_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `MENU_ITEM` (
  `MENU_ID` SMALLINT(6) NOT NULL,
  `MENU_TYPE` VARCHAR(10) NOT NULL, 
  `MENU_NAME` VARCHAR(50) NOT NULL,
  `MENU_URL` VARCHAR(50) NOT NULL,
  `MENU_IMG` VARCHAR(50) NOT NULL,
  `MENU_ORDER` SMALLINT(6) NOT NULL,
  `MENU_SHOW` SMALLINT(6) NOT NULL,
  PRIMARY KEY  (`MENU_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `ROLE_PROFILE` (
  `RP_ID` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` SMALLINT(6) NOT NULL,
  `RES_ID` SMALLINT(6) NOT NULL,
  CONSTRAINT `FK_ROLE_PROFILE_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `ROLE` (`ROLE_ID`),
  CONSTRAINT `FK_ROLE_PROFILE_2` FOREIGN KEY (`RES_ID`) REFERENCES `MENU_ITEM`(`MENU_ID`),
  PRIMARY KEY  (`RP_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `COUNTRY` (
  `COUNTRY_ID` SMALLINT(6) NOT NULL,
  `COUNTRY_CODE` VARCHAR(10) NOT NULL,
  `COUNTRY_NAME` VARCHAR(50) NOT NULL,
  `ISO_CODE` VARCHAR(10) NULL,
  PRIMARY KEY  (`COUNTRY_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `WILEY_OFFICES` (
  `OFFICE_ID` SMALLINT(6) NOT NULL,
  `OFFICE_NAME` VARCHAR(50) NOT NULL,
  `TIME_DIFF_TO_EST` SMALLINT(4) NOT NULL,
  PRIMARY KEY  (`OFFICE_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `USER` (
  `USR_ID` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `USER_NAME` VARCHAR(50) NOT NULL,
  `PASSWORD` VARCHAR(100)  NOT NULL,
  `NAME` VARCHAR(50) NOT NULL,
  `PHONE_NO` VARCHAR(50) NOT NULL,
  `MOBILE_NO` VARCHAR(50) DEFAULT NULL,
  `IS_ACTIVE` TINYINT(1) DEFAULT '1',	--	0 - InActive, 1 - Active
  `IS_KEY_CONTACT` TINYINT(1) DEFAULT '0',	--	0 - NO, 1 - YES
  `COUNTRY_ID` SMALLINT(6) NULL,
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  `ROLE_ID` SMALLINT(6) NOT NULL,
  PRIMARY KEY  (`USR_ID`),
  UNIQUE KEY  (`USER_NAME`),
  CONSTRAINT `FK_USER_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `ROLE` (`ROLE_ID`),
  CONSTRAINT `FK_USER_2` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `WILEY_OFFICES` (`OFFICE_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `CUSTOMER` (
  `CUST_ID` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `COMPANY_NAME` VARCHAR(50) NOT NULL,
  `PHONE_NO` VARCHAR(50) DEFAULT NULL,
  `ADDRESS` VARCHAR(255) DEFAULT NULL,
  `ADD_CITY` VARCHAR(50) DEFAULT NULL,
  `ADD_STATE` VARCHAR(50) DEFAULT NULL,
  `ADD_ZIPCODE` VARCHAR(10) DEFAULT NULL,
  `COUNTRY_ID` SMALLINT(6) NOT NULL,
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  PRIMARY KEY  (`CUST_ID`),
  UNIQUE KEY  (`COMPANY_NAME`),
  CONSTRAINT `FK_CUSTOMER_1` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `COUNTRY` (`COUNTRY_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `KEY_CONTACT` (
  `KC_ID` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `CUST_ID` SMALLINT(6) NOT NULL,
  `EMAIL` VARCHAR(50) NOT NULL,
  `NAME` VARCHAR(50) NOT NULL,
  `PHONE_NO` VARCHAR(50) NOT NULL,
  `MOBILE_NO` VARCHAR(50) DEFAULT NULL,
  `ADDRESS` VARCHAR(255) DEFAULT NULL,
  `ADD_CITY` VARCHAR(50) DEFAULT NULL,
  `ADD_STATE` VARCHAR(50) DEFAULT NULL,
  `ADD_ZIPCODE` VARCHAR(10) DEFAULT NULL,
  `COUNTRY_ID` SMALLINT(6) NOT NULL,
  `IS_ACTIVE` TINYINT(1) DEFAULT '1',	--	0 - InActive, 1 - Active
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  PRIMARY KEY  (`KC_ID`),
  CONSTRAINT `FK_KEY_CONTACT_1` FOREIGN KEY (`CUST_ID`) REFERENCES `CUSTOMER` (`CUST_ID`),
  CONSTRAINT `FK_KEY_CONTACT_2` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `COUNTRY` (`COUNTRY_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

  CREATE TABLE `PROJECT_SEQUENCE` (
  `PROJECT_ID` INT(10) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;

  CREATE TABLE `PROJECT` (
  `PROJECT_ID` INT(10) NOT NULL,
  `PROJECT_NAME` VARCHAR(20) NOT NULL,
  `PRJ_ADMIN` SMALLINT(6) NOT NULL,
  `REQUESTER` SMALLINT(6) NOT NULL,
  `CUSTOMER` SMALLINT(6) NOT NULL,
  `PROJECT_STATUS` SMALLINT(1) DEFAULT '1',		--	1 - Pending	2 - Active 3 - InActive 4 - Deleted
  `NOTES` VARCHAR(2000) NULL,
  `PROJECT_TYPE` SMALLINT(6) DEFAULT '2',		--	1 - Single	2 - Multiple
  `ST_URL` VARCHAR(255) NULL,
  `ECOMP` SMALLINT(6) DEFAULT '1',		--	1 - YES	0 - NO
  `AVAILABLE_DATE` DATETIME NULL,
  `EXPIRY_DATE` DATETIME NULL,
  `THRESOLD_DATE` DATETIME NULL,
  `DRM` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `REGISTRATION` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `PROMO_CODE` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `SOLD_QTY` SMALLINT(6) NULL,
  `BACKUP_QTY` SMALLINT(6) NULL,
  `THRESOLD_QTY` SMALLINT(6) NULL,
  `DOWNLOADED_COUNT` SMALLINT(6) NULL,
  `PRINT_ALLOWED` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `COPY_ALLOWED` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `CONVERSION_ALLOWED` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `PROJECT_TEMPLATE` VARCHAR(50) NULL,
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  `URL_FLAG` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `CONTENT_FLAG` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  `TEMPLATE_FLAG` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  `ONCE_ACTIVE` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  PRIMARY KEY  (`PROJECT_ID`),
  UNIQUE KEY  (`PROJECT_NAME`),
  CONSTRAINT `FK_PROJECT_1` FOREIGN KEY (`PRJ_ADMIN`) REFERENCES `USER` (`USR_ID`),
  CONSTRAINT `FK_PROJECT_2` FOREIGN KEY (`REQUESTER`) REFERENCES `USER` (`USR_ID`),
  CONSTRAINT `FK_PROJECT_3` FOREIGN KEY (`CUSTOMER`) REFERENCES `CUSTOMER` (`CUST_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

  CREATE TABLE `PROJECT_MOMENTUM` (
  `AUTO_ID` INT(10) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
  `PROJECT_NAME` VARCHAR(20) NOT NULL,
  `PRJ_ADMIN` SMALLINT(6) NOT NULL,
  `REQUESTER` SMALLINT(6) NOT NULL,
  `CUSTOMER` SMALLINT(6) NOT NULL,
  `PROJECT_STATUS` TINYINT(1) DEFAULT '1',		--	1 - Pending	2 - Active 3 - InActive 4 - Deleted
  `NOTES` VARCHAR(2000) NULL,
  `PROJECT_TYPE` TINYINT(1) DEFAULT '2',		--	1 - Single	2 - Multiple
  `ST_URL` VARCHAR(255) NULL,
  `ECOMP` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `AVAILABLE_DATE` DATETIME NULL,
  `EXPIRY_DATE` DATETIME NULL,
  `THRESOLD_DATE` DATETIME NULL,
  `DRM` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `REGISTRATION` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `PROMO_CODE` TINYINT(1) DEFAULT '0',		--	1 - YES	0 - NO
  `SOLD_QTY` SMALLINT(6) NULL,
  `BACKUP_QTY` SMALLINT(6) NULL,
  `THRESOLD_QTY` SMALLINT(6) NULL,
  `DOWNLOADED_COUNT` SMALLINT(6) NULL,
  `PRINT_ALLOWED` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `COPY_ALLOWED` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `CONVERSION_ALLOWED` TINYINT(1) DEFAULT '1',		--	1 - YES	0 - NO
  `PROJECT_TEMPLATE` VARCHAR(50) NULL,
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  `URL_FLAG` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  `CONTENT_FLAG` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  `TEMPLATE_FLAG` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  `ONCE_ACTIVE` TINYINT(1) NOT NULL DEFAULT '0',		--	1 - YES	0 - NO
  PRIMARY KEY  (`AUTO_ID`),
  CONSTRAINT `FK_PROJECT_MOMENTUM_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`),
  CONSTRAINT `FK_PROJECT_MOMENTUM_2` FOREIGN KEY (`PRJ_ADMIN`) REFERENCES `USER` (`USR_ID`),
  CONSTRAINT `FK_PROJECT_MOMENTUM_3` FOREIGN KEY (`REQUESTER`) REFERENCES `USER` (`USR_ID`),
  CONSTRAINT `FK_PROJECT_MOMENTUM_4` FOREIGN KEY (`CUSTOMER`) REFERENCES `CUSTOMER` (`CUST_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `DYNAMIC_FIELDS` (
  `FLD_ID` SMALLINT(6) NOT NULL,
  `FLD_NAME` VARCHAR(100) NOT NULL,
  `FLD_TYPE` ENUM('TEXT','BIGTEXT','DROPDOWN','RADIO') NOT NULL,
  PRIMARY KEY  (`FLD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `REGISTRATION_DETAILS` (
  `RECORD_ID` INT(20) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
  `IP_ADDRESS` VARCHAR(20) NULL,
--  `WT_URL` VARCHAR(200) NOT NULL, 			New
  `REGISTRATION_OBJECT` BLOB NOT NULL,
  PRIMARY KEY  (`RECORD_ID`),
  CONSTRAINT `FK_REGISTRATION_DETAILS_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `CONTENT_FILES` (
  `CF_ID` INT(20) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
  `FILE_ID` VARCHAR(20) NOT NULL,
  `FILE_NAME` VARCHAR(100) NULL,
  `FILE_SIZE` INT(10) NULL,
  `TITLE` VARCHAR(100) NULL,
  `AUTHORS` VARCHAR(100) NULL,
  `NO_OF_PAGES` SMALLINT(6) NULL,
  `PUBLICATION_DATE` DATETIME NULL,
  `FILE_STATUS` TINYINT(1) DEFAULT '0',		--	0 - None	1 - Uploaded	2 - Activated	3 - Archived
--  `DOWNLOAD_URL` VARCHAR(255) NULL,
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  PRIMARY KEY  (`CF_ID`),
  CONSTRAINT `FK_CONTENT_FILES_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `PROJECT_HISTORY` (
  `HST_ID` INT(20) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
  `FIELD_NAME` VARCHAR(20) NULL,
  `PREV_VALUE` VARCHAR(20) NULL,
  `CURR_VALUE` VARCHAR(20) NULL,
  `NOTIFICATION` TINYINT(1) DEFAULT '1',		--	1 - YES	2 - NO
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  PRIMARY KEY  (`HST_ID`),
  CONSTRAINT `FK_PROJECT_HISTORY_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `TRANSACTION_LOG` (
  `LOG_ID` INT(20) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
--  `FILE_ID` INT(10) NULL,			New
  `IP_ADDRESS` VARCHAR(20) NOT NULL,
  `URL` VARCHAR(255) NOT NULL,
  `DOWNLOAD_URL` VARCHAR(255) NOT NULL,
  `PROMO_CODE` VARCHAR(15) NOT NULL,
  `ACTIVITY_DATE` DATETIME NOT NULL,
  `ACTIVITY_TYPE` ENUM('SUCCESS','FAIL','BROWSE') NOT NULL,	-- Aborted = Browse
  PRIMARY KEY  (`LOG_ID`),
  CONSTRAINT `FK_TRANSACTION_LOG_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `WORKFLOW_EXCEPTION` (
  `EVENT_ID` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `EVENT_DESC` VARCHAR(200) NOT NULL,
  `TEMPLATE_PATH` VARCHAR(200) NOT NULL,
  PRIMARY KEY  (`EVENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `PROMO_CODE_CONFIG` (
  `PCODE_CONF_ID` INT(10) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
  `STYLE` ENUM('MANUAL','PREFIX','AUTO') NOT NULL,
  `CODE_TYPE` ENUM('SINGLE','MULTI','') NULL,
  `CODE_SIZE` ENUM('5-ALPHANUMERIC','6-ALPHANUMERIC','7-ALPHANUMERIC','8-ALPHANUMERIC','') NULL,
  `QTY` SMALLINT(6) NULL,
  `CODE_PREFIX` VARCHAR(10) NULL,
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  PRIMARY KEY  (`PCODE_CONF_ID`),
  CONSTRAINT `FK_PROMO_CODE_CONFIG_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `PROMO_CODE_VALUES` (
  `PROJECT_ID` INT(10) NOT NULL,
  `PROMO_CODE` VARCHAR(15) NOT NULL,
  `CODE_TYPE` ENUM('SINGLE','MULTI','') NULL,
  `CODE_STATUS` TINYINT(1) DEFAULT '1',		--	1 - Used	2 - Unused
--  `IP_ADDRESS` VARCHAR(20) NULL,			New
--  `WT_URL` VARCHAR(200) NULL, 			New
  `GENERATED_BY` VARCHAR(50)  NOT NULL,
  `GENERATED_DATE` DATETIME NOT NULL,
  `COUNT` int(10) DEFAULT NULL,
  UNIQUE KEY  (`PROJECT_ID`,`PROMO_CODE`),
  CONSTRAINT `FK_PROMO_CODE_VALUES_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `PROJECT_URL` (
  `PROJECT_ID` INT(10) NOT NULL,
  `URL` VARCHAR(255) NOT NULL,
  `URL_TYPE` ENUM('SINGLE','MULTI') NULL,
  `CODE_STATUS` TINYINT(1) DEFAULT '1',		--	1 - Used	2 - Unused
  `GENERATED_BY` VARCHAR(50)  NOT NULL,
  `GENERATED_DATE` DATETIME NOT NULL,
  `URL_COUNT` varchar(50) DEFAULT NULL,
  UNIQUE KEY  (`PROJECT_ID`,`URL`),
  CONSTRAINT `FK_PROJECT_URL_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE `WEBSITE_TEMPLATE` (
  `TEMPLATE_ID` INT(10) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NULL,
  `NAME` VARCHAR(50) NOT NULL,
  `TYPE` ENUM('SYSTEM','USER') NOT NULL,
  `CATEGORY` ENUM('SINGLE','MULTI','BLANK') NOT NULL,
  `TITLE` VARCHAR(50) NOT NULL,
  `DESCRIPTION` VARCHAR(250) NOT NULL,
  `PAGE_COUNT` TINYINT(1) NOT NULL DEFAULT '1',
  `CREATED_BY` VARCHAR(50) NOT NULL,
  `CREATED_DATE` DATETIME NOT NULL,
  `UPDATED_BY` VARCHAR(50) NOT NULL,
  `UPDATED_DATE` DATETIME NOT NULL,
  PRIMARY KEY  (`TEMPLATE_ID`),
  CONSTRAINT `FK_WEBSITE_TEMPLATE_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `WEBSITE_EXCEPTION_MESSAGE` (
  `MSG_ID` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `EXCEPTION_EVENT` VARCHAR(255) NOT NULL,
  `EXCEPTION_TEXT` VARCHAR(255) NOT NULL,
  PRIMARY KEY  (`MSG_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `PROJECT_EXCEPTION_MESSAGE` (
  `MSG_ID` INT(10) NOT NULL AUTO_INCREMENT,
  `PROJECT_ID` INT(10) NOT NULL,
  `EXCEPTION_EVENT` VARCHAR(255) NOT NULL,
  `EXCEPTION_TEXT` VARCHAR(255) NOT NULL,
  PRIMARY KEY  (`MSG_ID`),
  CONSTRAINT `FK_PROJECT_EXCEPTION_MESSAGE_1` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `PROJECT_FIELDS` (
  `AUTO_ID` INT(10)  NOT NULL AUTO_INCREMENT,
  `TEMPLATE_ID` INT(10) NOT NULL,
  `PROJECT_ID` INT(10) NOT NULL,
  `FLD_ID` SMALLINT(6) NOT NULL,
  `FLD_TEXT` VARCHAR(100) NOT NULL,
  `FLD_MANDATORY` TINYINT(1) NOT NULL,	-- 1 - YES	0 - NO
  `FLD_ORDER` SMALLINT(6) NOT NULL,
  PRIMARY KEY  (`AUTO_ID`),
  CONSTRAINT `FK_PROJECT_FIELDS_1` FOREIGN KEY (`TEMPLATE_ID`) REFERENCES `WEBSITE_TEMPLATE` (`TEMPLATE_ID`),
  CONSTRAINT `FK_PROJECT_FIELDS_2` FOREIGN KEY (`PROJECT_ID`) REFERENCES `PROJECT` (`PROJECT_ID`),
  CONSTRAINT `FK_PROJECT_FIELDS_3` FOREIGN KEY (`FLD_ID`) REFERENCES `DYNAMIC_FIELDS` (`FLD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;