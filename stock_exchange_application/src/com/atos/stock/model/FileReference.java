package com.atos.stock.model;

import java.io.Serializable;
import java.sql.Timestamp;

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

	@Column(name="FILE_PROCESSING_DATE")
	private Timestamp fileProcessingDate;

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

	public Timestamp getFileProcessingDate() {
		return this.fileProcessingDate;
	}

	public void setFileProcessingDate(Timestamp fileProcessingDate) {
		this.fileProcessingDate = fileProcessingDate;
	}

}