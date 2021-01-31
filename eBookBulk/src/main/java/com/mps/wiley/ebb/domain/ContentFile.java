package main.java.com.mps.wiley.ebb.domain;


import java.io.Serializable;
import java.util.Date;


public class ContentFile implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -784474946061065963L;
	
	/**
	 * This attribute maps to the column CF_ID in the CONTENT_FILES table.
	 */
	private Integer cfId;
	
	/**
	 * This attribute maps to the column PROJECT_ID in the CONTENT_FILES table.
	 */
	private Integer projectId;
	
	/**
	 * This attribute maps to the column PRJ_MOMENTUM_ID in the CONTENT_FILES table.
	 */
	private Integer momentumId;
	
	/**
	 * This attribute maps to the column FILE_ID in the CONTENT_FILES table.
	 */
	private String fileId;
	
	/**
	 * This attribute maps to the column FILE_NAME in the CONTENT_FILES table.
	 */
	private String fileName;
	
	/**
	 * This attribute maps to the column FILE_TYPE in the CONTENT_FILES table.
	 */
	private Integer fileType = new Integer(1);
	
	/**
	 * This attribute maps to the column FILE_SIZE in the CONTENT_FILES table.
	 */
	private Integer fileSize;
	
	/**
	 * This attribute maps to the column TITLE in the CONTENT_FILES table.
	 */
	private String title;
	
	/**
	 * This attribute maps to the column AUTHORS in the CONTENT_FILES table.
	 */
	private String authors;
	
	/**
	 * This attribute maps to the column NO_OF_PAGES in the CONTENT_FILES table.
	 */
	private Integer noOfPages;
	
	/**
	 * This attribute maps to the column PUBLICATION_DATE in the CONTENT_FILES table.
	 */
	private String publicationDate;
	
	/**
	 * This attribute maps to the column FILE_STATUS in the CONTENT_FILES table.
	 */
	private Integer fileStatus = new Integer(0);
	
	/**
	 * This attribute maps to the column DOWNLOAD_URL in the CONTENT_FILES table.
	 */
	private String downloadUrl;
	
	/**
	 * This attribute maps to the column DOWNLOAD_COUNT in the CONTENT_FILES table.
	 */
	private Integer downloadCount = new Integer(0);
	
	/**
	 * This attribute maps to the column CREATED_BY in the CONTENT_FILES table.
	 */
	private String createdBy;
	
	/**
	 * This attribute maps to the column CREATED_DATE in the CONTENT_FILES table.
	 */
	private Date createdDate = new Date();
	
	/**
	 * This attribute maps to the column UPDATED_BY in the CONTENT_FILES table.
	 */
	private String updatedBy;
	
	/**
	 * This attribute maps to the column UPDATED_DATE in the CONTENT_FILES table.
	 */
	private Date updatedDate = new Date();
	
	/**
	 * Method 'ContentFiles'
	 * 
	 */
	public ContentFile()
	{
	}
	
	
	/**
	 * @return the cfId
	 */
	public final Integer getCfId()
	{
		return cfId;
	}
	
	
	/**
	 * @param cfId the cfId to set
	 */
	public final void setCfId(Integer cfId)
	{
		this.cfId = cfId;
	}
	
	
	/**
	 * @return the projectId
	 */
	public final Integer getProjectId()
	{
		return projectId;
	}
	
	
	/**
	 * @param projectId
	 *           the projectId to set
	 */
	public final void setProjectId(Integer projectId)
	{
		this.projectId = projectId;
	}
	
	
	/**
	 * @return the fileId
	 */
	public final String getFileId()
	{
		return fileId;
	}
	
	
	/**
	 * @param fileId
	 *           the fileId to set
	 */
	public final void setFileId(String fileId)
	{
		this.fileId = fileId;
	}
	
	
	/**
	 * @return the fileName
	 */
	public final String getFileName()
	{
		return fileName;
	}
	
	
	/**
	 * @param fileName
	 *           the fileName to set
	 */
	public final void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	
	
	/**
	 * @return the fileSize
	 */
	public final Integer getFileSize()
	{
		return fileSize;
	}
	
	
	/**
	 * @param fileSize
	 *           the fileSize to set
	 */
	public final void setFileSize(Integer fileSize)
	{
		this.fileSize = fileSize;
	}
	
	
	/**
	 * @return the title
	 */
	public final String getTitle()
	{
		return title;
	}
	
	
	/**
	 * @param title
	 *           the title to set
	 */
	public final void setTitle(String title)
	{
		this.title = title;
	}
	
	
	/**
	 * @return the authors
	 */
	public final String getAuthors()
	{
		return authors;
	}
	
	
	/**
	 * @param authors
	 *           the authors to set
	 */
	public final void setAuthors(String authors)
	{
		this.authors = authors;
	}
	
	
	/**
	 * @return the noOfPages
	 */
	public final Integer getNoOfPages()
	{
		return noOfPages;
	}
	
	
	/**
	 * @param noOfPages
	 *           the noOfPages to set
	 */
	public final void setNoOfPages(Integer noOfPages)
	{
		this.noOfPages = noOfPages;
	}
	
	
	/**
	 * @return the publicationDate
	 */
	public final String getPublicationDate()
	{
		return publicationDate;
	}
	
	
	/**
	 * @param publicationDate
	 *           the publicationDate to set
	 */
	public final void setPublicationDate(String publicationDate)
	{
		this.publicationDate = publicationDate;
	}
	
	
	/**
	 * @return the fileStatus
	 */
	public final Integer getFileStatus()
	{
		return fileStatus;
	}
	
	
	/**
	 * @param fileStatus
	 *           the fileStatus to set
	 */
	public final void setFileStatus(Integer fileStatus)
	{
		this.fileStatus = fileStatus;
	}
	
	
	/**
	 * @return the momentumId
	 */
	public final Integer getMomentumId()
	{
		return momentumId;
	}
	
	
	/**
	 * @param momentumId the momentumId to set
	 */
	public final void setMomentumId(Integer momentumId)
	{
		this.momentumId = momentumId;
	}
	
	
	/**
	 * @return the fileType
	 */
	public final Integer getFileType()
	{
		return fileType;
	}
	
	
	/**
	 * @param fileType the fileType to set
	 */
	public final void setFileType(Integer fileType)
	{
		this.fileType = fileType;
	}
	
	
	/**
	 * @return the downloadUrl
	 */
	public final String getDownloadUrl()
	{
		return downloadUrl;
	}
	
	
	/**
	 * @param downloadUrl the downloadUrl to set
	 */
	public final void setDownloadUrl(String downloadUrl)
	{
		this.downloadUrl = downloadUrl;
	}
	
	
	/**
	 * @return the downloadCount
	 */
	public final Integer getDownloadCount()
	{
		return downloadCount;
	}
	
	
	/**
	 * @param downloadCount the downloadCount to set
	 */
	public final void setDownloadCount(Integer downloadCount)
	{
		this.downloadCount = downloadCount;
	}
	
	
	/**
	 * @return the createdBy
	 */
	public final String getCreatedBy()
	{
		return createdBy;
	}
	
	
	/**
	 * @param createdBy
	 *           the createdBy to set
	 */
	public final void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	
	
	/**
	 * @return the createdDate
	 */
	public final Date getCreatedDate()
	{
		return createdDate;
	}
	
	
	/**
	 * @param createdDate
	 *           the createdDate to set
	 */
	public final void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}
	
	
	/**
	 * @return the updatedBy
	 */
	public final String getUpdatedBy()
	{
		return updatedBy;
	}
	
	
	/**
	 * @param updatedBy
	 *           the updatedBy to set
	 */
	public final void setUpdatedBy(String updatedBy)
	{
		this.updatedBy = updatedBy;
	}
	
	
	/**
	 * @return the updatedDate
	 */
	public final Date getUpdatedDate()
	{
		return updatedDate;
	}
	
	
	/**
	 * @param updatedDate
	 *           the updatedDate to set
	 */
	public final void setUpdatedDate(Date updatedDate)
	{
		this.updatedDate = updatedDate;
	}
	
	
	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append("projectId=" + projectId);
		ret.append(", momentumId=" + momentumId);
		ret.append(", fileId=" + fileId);
		ret.append(", fileName=" + fileName);
		ret.append(", fileType=" + fileType);
		ret.append(", fileSize=" + fileSize);
		ret.append(", title=" + title);
		ret.append(", authors=" + authors);
		ret.append(", noOfPages=" + noOfPages);
		ret.append(", publicationDate=" + publicationDate);
		ret.append(", fileStatus=" + fileStatus);
		ret.append(", downloadUrl=" + downloadUrl);
		ret.append(", downloadCount=" + downloadCount);
		ret.append(", createdBy=" + createdBy);
		ret.append(", createdDate=" + createdDate);
		ret.append(", updatedBy=" + updatedBy);
		ret.append(", updatedDate=" + updatedDate);
		return ret.toString();
	}
}
