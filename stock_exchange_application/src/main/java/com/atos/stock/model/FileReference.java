package com.atos.stock.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="FILE_REFERENCE")
@NamedQuery(name="FileReference.findAll", query="SELECT f FROM FileReference f")
public class FileReference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FILE_ID")
	private long fileId;

	@Lob
	@Column(name="FILE_DATA")
	private byte[] fileData;

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="FILE_PROCESSING_DATA")
	private Date fileProcessingData;

	public FileReference() {
	}

	public long getFileId() {
		return this.fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public byte[] getFileData() {
		return this.fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getFileProcessingData() {
		return this.fileProcessingData;
	}

	public void setFileProcessingData(Date fileProcessingData) {
		this.fileProcessingData = fileProcessingData;
	}

}