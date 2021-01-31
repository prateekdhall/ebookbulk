DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_update_project_details`$$

CREATE PROCEDURE `sp_ebulkbook_update_project_details`(  	
	IN `in_PROJECT_ID` INT,
	IN `in_PROJECT_NAME` VARCHAR(255),
	IN `in_PRJ_ADMIN` SMALLINT,
	IN `in_REQUESTER` SMALLINT,
	IN `in_CUSTOMER` SMALLINT,
	IN `in_PROJECT_STATUS` SMALLINT,
	IN `in_NOTES` VARCHAR(255),
	IN `in_PROJECT_TYPE` SMALLINT,
	IN `in_ST_URL` VARCHAR(255),
	IN `in_ECOMP` SMALLINT,
	IN `in_AVAILABLE_DATE` DATETIME,
	IN `in_EXPIRY_DATE` DATETIME,
	IN `in_THRESOLD_DATE` DATETIME,
	IN `in_DRM` SMALLINT,
	IN `in_REGISTRATION` SMALLINT,
	IN `in_PROMO_CODE` SMALLINT,
	IN `in_SOLD_QTY` SMALLINT,
	IN `in_BACKUP_QTY` SMALLINT,
	IN `in_THRESOLD_QTY` SMALLINT,
	IN `in_PRINT_ALLOWED` SMALLINT,
	IN `in_COPY_ALLOWED` SMALLINT,
	IN `in_CONVERSION_ALLOWED` SMALLINT,
	IN `in_PROJECT_TEMPLATE` VARCHAR(255),
	IN `in_CREATED_BY` VARCHAR(255),
	IN `in_CREATED_DATE` DATETIME,
	IN `in_UPDATED_BY` VARCHAR(255),
	IN `in_UPDATED_DATE` DATETIME,
	IN `in_URL_FLAG` SMALLINT,
	IN `in_ONCE_ACTIVE` SMALLINT)
BEGIN
	DECLARE old_project_status SMALLINT;     
	DECLARE local_IDENTITY INT(10);
     
	SELECT PROJECT_STATUS INTO old_project_status FROM PROJECT WHERE PROJECT_ID = in_PROJECT_ID;
	
	IF (old_project_status = 3 AND in_PROJECT_STATUS = 1) 
	THEN
		INSERT INTO PROJECT_MOMENTUM (PROJECT_ID,PROJECT_NAME,PRJ_ADMIN,REQUESTER,CUSTOMER,PROJECT_STATUS,NOTES,PROJECT_TYPE,ST_URL,ECOMP,AVAILABLE_DATE,EXPIRY_DATE,THRESOLD_DATE,DRM,REGISTRATION,PROMO_CODE,SOLD_QTY,BACKUP_QTY,THRESOLD_QTY,PRINT_ALLOWED,COPY_ALLOWED,CONVERSION_ALLOWED,PROJECT_TEMPLATE,CREATED_BY,CREATED_DATE,UPDATED_BY,UPDATED_DATE,URL_FLAG,CONTENT_FLAG,TEMPLATE_FLAG,ONCE_ACTIVE)
		(SELECT PROJECT_ID,PROJECT_NAME,PRJ_ADMIN,REQUESTER,CUSTOMER,PROJECT_STATUS,NOTES,PROJECT_TYPE,ST_URL,ECOMP,AVAILABLE_DATE,EXPIRY_DATE,THRESOLD_DATE,DRM,REGISTRATION,PROMO_CODE,SOLD_QTY,BACKUP_QTY,THRESOLD_QTY,PRINT_ALLOWED,COPY_ALLOWED,CONVERSION_ALLOWED,PROJECT_TEMPLATE,CREATED_BY,CREATED_DATE,UPDATED_BY,UPDATED_DATE,URL_FLAG,CONTENT_FLAG,TEMPLATE_FLAG,ONCE_ACTIVE FROM PROJECT WHERE PROJECT_ID = in_PROJECT_ID);
				  
		UPDATE PROJECT SET 
			PROJECT_NAME = in_PROJECT_NAME,
			PRJ_ADMIN = in_PRJ_ADMIN,
			REQUESTER = in_REQUESTER,
			CUSTOMER = in_CUSTOMER,
			PROJECT_STATUS = 1,
			UPDATED_BY = in_UPDATED_BY,
			UPDATED_DATE = NOW(),
			URL_FLAG = 0,
			ONCE_ACTIVE = 0,
			TEMPLATE_FLAG = 0,
			CONTENT_FLAG = 0
			WHERE PROJECT_ID=in_PROJECT_ID;
			
		SELECT MAX(PRJ_MOMENTUM_ID) INTO local_IDENTITY FROM PROJECT_MOMENTUM WHERE PROJECT_ID=in_PROJECT_ID;	
		UPDATE CONTENT_FILES SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE PROJECT_HISTORY SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE REGISTRATION_DETAILS SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE TRANSACTION_LOG SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE PROMO_CODE_CONFIG SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE PROMO_CODE_VALUES SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE PROJECT_URL SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE WEBSITE_TEMPLATE SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE PROJECT_FIELDS SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
		UPDATE PROJECT_EXCEPTION_MESSAGE SET PRJ_MOMENTUM_ID = local_IDENTITY WHERE PROJECT_ID = in_PROJECT_ID AND PRJ_MOMENTUM_ID IS NULL;
	ELSE
		UPDATE PROJECT SET 
			PROJECT_NAME = in_PROJECT_NAME,
			PRJ_ADMIN = in_PRJ_ADMIN,
			REQUESTER = in_REQUESTER,
			CUSTOMER = in_CUSTOMER,
			PROJECT_STATUS = in_PROJECT_STATUS,
			NOTES = in_NOTES,
			PROJECT_TYPE = in_PROJECT_TYPE,
			ST_URL = in_ST_URL,
			ECOMP = in_ECOMP,
			AVAILABLE_DATE = in_AVAILABLE_DATE,
			EXPIRY_DATE = in_EXPIRY_DATE,
			THRESOLD_DATE = in_THRESOLD_DATE,
			DRM = in_DRM,
			REGISTRATION = in_REGISTRATION,
			PROMO_CODE = in_PROMO_CODE,
			SOLD_QTY = in_SOLD_QTY,
			BACKUP_QTY = in_BACKUP_QTY,
			THRESOLD_QTY = in_THRESOLD_QTY,
			PRINT_ALLOWED = in_PRINT_ALLOWED,
			COPY_ALLOWED = in_COPY_ALLOWED,
			CONVERSION_ALLOWED = in_CONVERSION_ALLOWED,
			PROJECT_TEMPLATE = in_PROJECT_TEMPLATE,
			UPDATED_BY = in_UPDATED_BY,
			UPDATED_DATE = in_UPDATED_DATE,
			URL_FLAG = in_URL_FLAG,
			ONCE_ACTIVE = in_ONCE_ACTIVE
		WHERE PROJECT_ID=in_PROJECT_ID;
	 
	END IF;
 
END$$

DELIMITER ;

---------------------------------------------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_update_promocode_config_details`$$

CREATE PROCEDURE `sp_ebulkbook_update_promocode_config_details`(
	IN `in_PCODE_CONF_ID` INT,
	IN `in_PROJECT_ID` INT,
	IN `in_STYLE` VARCHAR(10),
	IN `in_CODE_TYPE` VARCHAR(10),
	IN `in_CODE_SIZE` VARCHAR(50),
	IN `in_QTY` SMALLINT,
	IN `in_CODE_PREFIX` VARCHAR(10),
	IN `in_CREATED_BY` VARCHAR(50),
	IN `in_UPDATED_BY` VARCHAR(50),
	IN `in_UPDATED_DATE` DATETIME)
BEGIN
    IF (in_PCODE_CONF_ID != 0) THEN
	UPDATE PROMO_CODE_CONFIG SET 
         PROJECT_ID = in_PROJECT_ID,
         STYLE = in_STYLE,
         CODE_TYPE = in_CODE_TYPE,
         CODE_SIZE = in_CODE_SIZE,
         QTY = in_QTY,
         CODE_PREFIX = in_CODE_PREFIX,
         CREATED_BY = in_CREATED_BY,
         UPDATED_BY = in_UPDATED_BY,
         UPDATED_DATE = in_UPDATED_DATE        
	
	 WHERE PCODE_CONF_ID=in_PCODE_CONF_ID;
    END IF;
 
END$$

DELIMITER ;

-----------------------------------------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_cron_project_Active_To_Inactive`$$

 CREATE PROCEDURE `sp_ebulkbook_cron_project_Active_To_Inactive`()
    BEGIN
	DECLARE prj_id_cursor INT;
	DECLARE total_qty INT;
	DECLARE count1 INT;
	DECLARE count2 INT;
	
    DECLARE done INT DEFAULT 0;
    DECLARE cur CURSOR FOR SELECT PROJECT_ID FROM PROJECT WHERE PROJECT_STATUS=2;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done =1;
    OPEN cur;
    read_loop:LOOP
      FETCH cur INTO prj_id_cursor;
        IF done THEN
          CLOSE cur;
          LEAVE read_loop;
		END IF;
    
	    SELECT (SOLD_QTY+BACKUP_QTY) INTO total_qty FROM PROJECT WHERE PROJECT_ID=prj_id_cursor;
	    SELECT SUM(URL_COUNT) INTO count1 FROM PROJECT_URL WHERE PROJECT_ID=prj_id_cursor;
	    SELECT SUM(COUNT) INTO count2 FROM PROMO_CODE_VALUES WHERE PROJECT_ID=prj_id_cursor;
	    
		UPDATE PROJECT SET PROJECT_STATUS = 3 WHERE PROJECT_ID = prj_id_cursor AND (total_qty = count1 OR total_qty=count2);
	END LOOP;
  END$$

DELIMITER ;

-----------------------------------------------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_reports_project_details`$$

CREATE PROCEDURE `sp_ebulkbook_reports_project_details`(
IN `in_projectId` INT,
IN `in_projectName` VARCHAR(255),
IN `in_requestervalue` VARCHAR(255),
IN `in_prjAdminvalue` VARCHAR(255),
IN `in_customervalue` VARCHAR(255),
IN `in_projectType` INT,
IN `in_ecomp` INT,
IN `in_status` VARCHAR(255),
IN `in_createdby` VARCHAR(255)
)
BEGIN
DECLARE SQLQuery TEXT;
  SET SQLQuery="SELECT prj.PROJECT_ID as projectId,
		prj.CREATED_DATE as createdDate,
		prj.PROJECT_NAME as projectName, 
		cust.COMPANY_NAME as customer,
		
		GROUP_CONCAT(keycnt.NAME) as contactName,
		GROUP_CONCAT(keycnt.EMAIL) as ContactEmail,
		GROUP_CONCAT(keycnt.PHONE_NO) as contactPhone,

		GROUP_CONCAT(files.FILE_ID) as title,
		 
		userreq.USER_NAME as requester, 
		useradmin.USER_NAME as prjAdmin,
		 
		prj.PROJECT_TYPE as projectType,
		get_project_type(prj.PROJECT_TYPE) as projectTypeValue,
		
		prj.ECOMP as ecomp,
		get_yes_no(prj.ECOMP) as ecompValue,
		 
		prj.EXPIRY_DATE as availableDate,
		prj.EXPIRY_DATE as expiryDate,
		prj.THRESOLD_DATE as thresoldDate, 
		prj.SOLD_QTY as soldQty,
		prj.BACKUP_QTY as backupQty,
		prj.THRESOLD_QTY as thresoldQty,
		
		prj.DRM as drm,	
		get_yes_no(prj.DRM) as drmValue,
		
		webtemp.TITLE as template,
		prj.REGISTRATION as registration,
		CASE 
			WHEN prj.REGISTRATION = 1 THEN 'Mandatory'
			WHEN prj.REGISTRATION = 0 THEN 'No'
			WHEN prj.REGISTRATION = 2 THEN 'Optional'
		END as registrationValue,
		
		prj.PROMO_CODE as promoCode,
		CASE 
			WHEN prj.PROMO_CODE = 1 THEN 'Mandatory'
			WHEN prj.PROMO_CODE = 0 THEN 'No'
			WHEN prj.PROMO_CODE = 2 THEN 'Optional'
		END as promoCodeValue,
		prj.ST_URL as stUrl,
		prj.NOTES as notes,
		
		prj.PROJECT_STATUS as projectStatus,
		get_project_status(prj.PROJECT_STATUS) as projectStatusValue,
		
		prj.UPDATED_DATE as updatedDate,		
		prj.URL_FLAG, 
		prj.ONCE_ACTIVE 

		FROM PROJECT prj INNER JOIN CUSTOMER AS cust ON prj.CUSTOMER = cust.CUST_ID 
		LEFT JOIN KEY_CONTACT as keycnt ON cust.CUST_ID = keycnt.CUST_ID
		INNER JOIN USER AS useradmin ON prj.PRJ_ADMIN = useradmin.USR_ID 
		INNER JOIN USER AS userreq ON prj.REQUESTER = userreq.USR_ID 
		LEFT JOIN CONTENT_FILES AS files ON prj.PROJECT_ID = files.PROJECT_ID
		LEFT JOIN WEBSITE_TEMPLATE webtemp ON prj.PROJECT_ID = webtemp.PROJECT_ID";

		SET SQLQuery=CONCAT(SQLQuery,' where 1=1');
			IF(in_projectId IS NOT NULL AND in_projectId <>0 )THEN
				SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_ID = ",in_projectId);
			END IF;
			IF(in_projectName IS NOT NULL AND in_projectName!="")THEN
				SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_NAME like ","'%",in_projectName,"%'");
			END IF;	
			IF(in_requestervalue IS NOT NULL AND in_requestervalue!="")THEN
				SET SQLQuery=CONCAT(SQLQuery," and userreq.USER_NAME like ","'%",in_requestervalue,"%'");
			END IF;	
			IF(in_prjAdminvalue IS NOT NULL AND in_prjAdminvalue!="")THEN
				SET SQLQuery=CONCAT(SQLQuery," and useradmin.USER_NAME like ","'%",in_prjAdminvalue,"%'");
			END IF;	
			IF(in_customervalue IS NOT NULL AND in_customervalue!="")THEN
				SET SQLQuery=CONCAT(SQLQuery," and cust.COMPANY_NAME like ","'%",in_customervalue,"%'");
			END IF;
			IF(in_projectType IS NOT NULL AND in_projectType<>-1)THEN
				SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_TYPE = ",in_projectType);
			END IF;	
			IF(in_ecomp IS NOT NULL AND in_ecomp<>-1)THEN
				SET SQLQuery=CONCAT(SQLQuery," and prj.ECOMP = ",in_ecomp);
			END IF;	
			IF(in_status IS NOT NULL AND in_status!="" )THEN
				SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_STATUS in (",in_status,")");
			END IF;	
			IF(in_createdby IS NOT NULL  AND in_createdby!="")THEN
				SET SQLQuery=CONCAT(SQLQuery," and files.FILE_ID like ","'%",in_createdby,"%'");
			END IF;	
		
SET SQLQuery=CONCAT(SQLQuery," GROUP BY prj.PROJECT_ID;");
SET @SQLQuery =SQLQuery;
PREPARE stmt FROM @SQLQuery;
EXECUTE stmt;
		
 
END$$

DELIMITER ;

--------------------------------------------------------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_reports_project_activity`$$

CREATE PROCEDURE `sp_ebulkbook_reports_project_activity`(
IN `in_projectId` INT,
IN `in_projectName` VARCHAR(255),
IN `in_requestervalue` VARCHAR(255),
IN `in_prjAdminvalue` VARCHAR(255),
IN `in_customervalue` VARCHAR(255),
IN `in_projectType` INT,
IN `in_ecomp` INT
)
BEGIN
DECLARE SQLQuery TEXT;
  SET SQLQuery="SELECT prj.PROJECT_ID as projectId,
		prj.PROJECT_NAME as projectName, 
		
		prj.PROJECT_TYPE as projectType,
		get_project_type(prj.PROJECT_TYPE) as projectTypeValue,
		
		prj.ECOMP as ecomp,
		get_yes_no(prj.ECOMP) as ecompValue,
		
		traslog.URL AS url,
		traslog.ACTIVITY_DATE AS date,
		traslog.REGISTRATION_NAME AS registrations,
		traslog.PROMO_CODE AS promocodes,
		
		CASE 
			WHEN traslog.ACTIVITY_TYPE = 'SUCCESS' THEN cf.FILE_ID
			WHEN traslog.ACTIVITY_TYPE = 'FAIL' THEN ''
			WHEN traslog.ACTIVITY_TYPE = 'BROWSE' THEN ''		
		END as success,
		 
		CASE		
			
			WHEN traslog.ACTIVITY_TYPE = 'SUCCESS' THEN ''
			WHEN traslog.ACTIVITY_TYPE = 'FAIL' THEN cf.FILE_ID
			WHEN traslog.ACTIVITY_TYPE = 'BROWSE' THEN ''
		END as failure,
		
		CASE	
			WHEN traslog.ACTIVITY_TYPE = 'SUCCESS' THEN get_yes_no(0)
			WHEN traslog.ACTIVITY_TYPE = 'FAIL' THEN get_yes_no(0)
			WHEN traslog.ACTIVITY_TYPE = 'BROWSE' THEN get_yes_no(1)		 
		END as abort

		FROM PROJECT prj INNER JOIN TRANSACTION_LOG traslog ON prj.PROJECT_ID = traslog.PROJECT_ID 
		LEFT JOIN CONTENT_FILES AS cf ON traslog.CF_ID = cf.CF_ID 
		INNER JOIN CUSTOMER AS cust ON prj.CUSTOMER = cust.CUST_ID 
		INNER JOIN USER AS useradmin ON prj.PRJ_ADMIN = useradmin.USR_ID 
		INNER JOIN USER AS userreq ON prj.REQUESTER = userreq.USR_ID ";
		
	SET SQLQuery=CONCAT(SQLQuery,' where 1=1 ');
	IF(in_projectId IS NOT NULL AND in_projectId <>0 )THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_ID = ",in_projectId);
	END IF;
	IF(in_projectName IS NOT NULL AND in_projectName!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_NAME like ","'%",in_projectName,"%'");
	END IF;	
	IF(in_requestervalue IS NOT NULL AND in_requestervalue!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and userreq.USER_NAME like ","'%",in_requestervalue,"%'");
	END IF;	
	IF(in_prjAdminvalue IS NOT NULL AND in_prjAdminvalue!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and useradmin.USER_NAME like ","'%",in_prjAdminvalue,"%'");
	END IF;	
	IF(in_customervalue IS NOT NULL AND in_customervalue!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and cust.COMPANY_NAME like ","'%",in_customervalue,"%'");
	END IF;
	IF(in_projectType IS NOT NULL AND in_projectType<>-1)THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_TYPE = ",in_projectType);
	END IF;	
	IF(in_ecomp IS NOT NULL AND in_ecomp<>-1)THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.ECOMP = ",in_ecomp);
	END IF;	
		
SET SQLQuery=CONCAT(SQLQuery," ORDER BY prj.PROJECT_ID,traslog.URL;");
SET @SQLQuery =SQLQuery;
PREPARE stmt FROM @SQLQuery;
EXECUTE stmt;
		
 
END$$

DELIMITER ;


-------------------------------------------------------------------------------------


DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_reports_my_project`$$

CREATE PROCEDURE `sp_ebulkbook_reports_my_project`(IN `in_status` INT)
BEGIN
DECLARE SQLQuery TEXT;
  SET SQLQuery="SELECT prj.PROJECT_ID as projectId,
		prj.PROJECT_NAME as projectName,      
        cust.COMPANY_NAME as customer,
        GROUP_CONCAT(files.FILE_ID,'-',files.TITLE) as title,
        get_yes_no(prj.DRM) as drmValue,
        get_project_type(prj.PROJECT_TYPE) as projectType,
        get_yes_no(prj.ECOMP) as ecompValue,
        prj.EXPIRY_DATE as availableDate,
		prj.EXPIRY_DATE as expiryDate,
		prj.SOLD_QTY as soldQty,
		prj.BACKUP_QTY as backupQty,
		prj.PROJECT_TEMPLATE as template,
		prj.NOTES as notes 
		
		FROM PROJECT prj INNER JOIN CUSTOMER AS cust ON prj.CUSTOMER = cust.CUST_ID  
		LEFT JOIN KEY_CONTACT as keycnt ON cust.CUST_ID = keycnt.CUST_ID 
		INNER JOIN USER AS useradmin ON prj.PRJ_ADMIN = useradmin.USR_ID 
		INNER JOIN USER AS userreq ON prj.REQUESTER = userreq.USR_ID 
		LEFT JOIN CONTENT_FILES AS files 
		ON prj.PROJECT_ID = files.PROJECT_ID";
		
		IF(in_status<>0 )THEN
			SET SQLQuery=CONCAT(SQLQuery," Where prj.PROJECT_STATUS = ",in_status," ");
		END IF; 
		
SET SQLQuery=CONCAT(SQLQuery," GROUP BY prj.PROJECT_ID;");
SET @SQLQuery =SQLQuery;
PREPARE stmt FROM @SQLQuery;
EXECUTE stmt;
		
 
END$$

DELIMITER ;

-------------------------------------------------------------------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `sp_ebulkbook_reports_project_history`$$

CREATE PROCEDURE `sp_ebulkbook_reports_project_history`(
IN `in_projectId` INT,
IN `in_projectName` VARCHAR(255),
IN `in_projectType` INT,
IN `in_ecomp` INT,
IN `in_customervalue` VARCHAR(255),
IN `in_requestervalue` VARCHAR(255),
IN `in_prjAdminvalue` VARCHAR(255)

)
BEGIN
DECLARE SQLQuery TEXT;
	SET SQLQuery="SELECT prj.PROJECT_ID as projectId,
		prj.PROJECT_NAME as projectName, 
		prj.PROJECT_TYPE as projectType,
		get_project_type(prj.PROJECT_TYPE) as projectTypeValue,
		prj.ECOMP as ecomp,
		get_yes_no(prj.ECOMP) as ecompValue,		
		prjhstry.FIELD_NAME as fieldName,
		prjhstry.PREV_VALUE as prevalue,
		prjhstry.CURR_VALUE as currvalue,
		cb.NAME as createdBy,
		prjhstry.CREATED_DATE as createdDate
		FROM PROJECT prj 
		INNER JOIN CUSTOMER AS cust ON prj.CUSTOMER = cust.CUST_ID 
		INNER JOIN USER AS useradmin ON prj.PRJ_ADMIN = useradmin.USR_ID 
		INNER JOIN USER AS userreq ON prj.REQUESTER = userreq.USR_ID
		INNER JOIN PROJECT_HISTORY as prjhstry ON prj.PROJECT_ID = prjhstry.PROJECT_ID  
		INNER JOIN USER AS cb ON prjhstry.CREATED_BY = cb.USR_ID";

	SET SQLQuery=CONCAT(SQLQuery,' where 1=1 ');
	IF(in_projectId<>0 )THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_ID = ",in_projectId);
	END IF;
	IF(in_projectName IS NOT NULL AND in_projectName!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_NAME like ","'%",in_projectName,"%'");
	END IF;
	IF(in_projectType<>0 AND in_projectType>0)THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.PROJECT_TYPE = ",in_projectType);
	END IF;
	IF(in_ecomp IS NOT NULL AND in_ecomp > 0)THEN
		SET SQLQuery=CONCAT(SQLQuery," and prj.ECOMP = ",in_ecomp);
	END IF;			
	IF(in_customervalue IS NOT NULL AND in_customervalue!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and cust.COMPANY_NAME like ","'%",in_customervalue,"%'");
	END IF;
	
	IF(in_requestervalue IS NOT NULL AND in_requestervalue!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and userreq.USER_NAME like ","'%",in_requestervalue,"%'");
	END IF;	
	IF(in_prjAdminvalue IS NOT NULL AND in_prjAdminvalue!="")THEN
		SET SQLQuery=CONCAT(SQLQuery," and useradmin.USER_NAME like ","'%",in_prjAdminvalue,"%'");
	END IF;	

SET SQLQuery=CONCAT(SQLQuery," ORDER BY prj.PROJECT_ID,createdDate;");
SET @SQLQuery =SQLQuery;
PREPARE stmt FROM @SQLQuery;
EXECUTE stmt;
		
END$$

DELIMITER ;

-------------------------------------------------------------------------------------

DELIMITER $$


DROP PROCEDURE IF EXISTS `sp_ebulkbook_reports_customer_project_activity`$$

CREATE PROCEDURE `sp_ebulkbook_reports_customer_project_activity`(
IN `in_projectId` INT,
IN `in_projectName` VARCHAR(255),
IN `in_customer` VARCHAR(255) 
)
BEGIN
DECLARE SQLQuery TEXT;
  SET SQLQuery="SELECT prj.PROJECT_ID as projectId,
		prj.PROJECT_NAME as projectName, 
		GROUP_CONCAT(pl.URL) as url,
		GROUP_CONCAT(pl.ACTIVITY_DATE) as dateas,
		rd.REGISTRATION_OBJECT as registrationObject,
		GROUP_CONCAT(files.FILE_ID) as download 
		
		FROM PROJECT prj INNER JOIN CUSTOMER AS cust ON prj.CUSTOMER = cust.CUST_ID  
		LEFT JOIN KEY_CONTACT as keycnt ON cust.CUST_ID = keycnt.CUST_ID 
		INNER JOIN transaction_log AS pl ON prj.PROJECT_ID=pl.PROJECT_ID 
		INNER JOIN registration_details AS rd ON rd.PROJECT_ID = prj.PROJECT_ID 
		LEFT JOIN content_files AS files 
		ON files.PROJECT_ID=pl.PROJECT_ID";

	IF(in_projectId<>0 )THEN
		SET SQLQuery=CONCAT(SQLQuery," where prj.PROJECT_ID = ",in_projectId," ");
	END IF;
	IF(in_projectName IS NOT NULL AND in_projectName!="")THEN
		SET SQLQuery=CONCAT(SQLQuery,"and prj.PROJECT_NAME like ","'%",in_projectName,"%'"," ");
	END IF;	
	IF(in_customer IS NOT NULL AND in_customer!="")THEN
		SET SQLQuery=CONCAT(SQLQuery,"and cust.COMPANY_NAME like ","'%",in_customer,"%'"," ");
	END IF;	 
		
SET SQLQuery=CONCAT(SQLQuery," GROUP BY prj.PROJECT_ID;");
SET @SQLQuery =SQLQuery;
PREPARE stmt FROM @SQLQuery;
EXECUTE stmt;
		
 
END$$

DELIMITER ;


DELIMITER $$


DROP PROCEDURE IF EXISTS `sp_ebulkbook_reports_customer_Project_overview`$$

CREATE  PROCEDURE `sp_ebulkbook_reports_customer_Project_overview`(
IN `in_projectId` INT,
IN `in_projectName` VARCHAR(255),
IN `in_customer` VARCHAR(255) 
 
)
BEGIN
DECLARE SQLQuery TEXT;
  SET SQLQuery="SELECT prj.PROJECT_ID as projectId,
  
		prj.PROJECT_NAME as projectName, 
		
                prj.AVAILABLE_DATE as available,
		
		prj.EXPIRY_DATE as expiration,
		
                prj.SOLD_QTY as soldQty,
                
                prj.BACKUP_QTY as backupQty,
                
                ph.CURR_VALUE as activationStart,
                
                ph.PREV_VALUE as acivationEnd,

	    GROUP_CONCAT(files.FILE_ID,'-', files.TITLE) as title,
		 
		prj.DOWNLOADED_COUNT as download 
		
		FROM PROJECT prj INNER JOIN CUSTOMER AS cust 
		
		ON prj.CUSTOMER = cust.CUST_ID 
				
		INNER JOIN project_history AS ph ON prj.PROJECT_ID =ph.PROJECT_ID
				
		LEFT JOIN CONTENT_FILES AS files 
		
		ON prj.PROJECT_ID = files.PROJECT_ID";
 
IF(in_projectId<>0 )THEN
	SET SQLQuery=CONCAT(SQLQuery,"  where prj.PROJECT_ID = ",in_projectId," ");
END IF;
IF(in_projectName IS NOT NULL AND in_projectName!="")THEN
	SET SQLQuery=CONCAT(SQLQuery,"and prj.PROJECT_NAME like ","'%",in_projectName,"%'"," ");
END IF;	
IF(in_customer IS NOT NULL AND in_customer!="")THEN
	SET SQLQuery=CONCAT(SQLQuery,"and cust.COMPANY_NAME like ","'%",in_customer,"%'"," ");
END IF;	 
		
SET SQLQuery=CONCAT(SQLQuery," GROUP BY prj.PROJECT_ID;");
SET @SQLQuery =SQLQuery;
PREPARE stmt FROM @SQLQuery;
EXECUTE stmt;
		
 
END$$

DELIMITER ;