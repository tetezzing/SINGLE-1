package com.single.model.dto.board;

import java.sql.Date;

public class ResaleDTO {

	private int RESALE_CODE;
	private int MEMBER_CODE;
	private String RESALE_TITLE;
	private String RESALE_CONTENT;
	private String RESALE_ADDRESS;
	private String RESALE_PRICE;
	private String RESALE_IMG_ORIGINAL;
	private String RESALE_IMG_SERVER;
	private int RESALE_LIKE;
	private Date RESALE_REGDATE;
	private int RESALE_COUNTVIEW;

	public ResaleDTO() {
	}

	public ResaleDTO(int rESALE_CODE, int mEMBER_CODE, String rESALE_TITLE, String rESALE_CONTENT,
			String rESALE_ADDRESS, String rESALE_PRICE, String rESALE_IMG_ORIGINAL, String rESALE_IMG_SERVER,
			int rESALE_LIKE, Date rESALE_REGDATE, int rSALE_COUNTVIEW) {
		RESALE_CODE = rESALE_CODE;
		MEMBER_CODE = mEMBER_CODE;
		RESALE_TITLE = rESALE_TITLE;
		RESALE_CONTENT = rESALE_CONTENT;
		RESALE_ADDRESS = rESALE_ADDRESS;
		RESALE_PRICE = rESALE_PRICE;
		RESALE_IMG_ORIGINAL = rESALE_IMG_ORIGINAL;
		RESALE_IMG_SERVER = rESALE_IMG_SERVER;
		RESALE_LIKE = rESALE_LIKE;
		RESALE_REGDATE = rESALE_REGDATE;
	}

	// 중고게시판 글쓰기 때 사용
	public ResaleDTO(int mEMBER_CODE, String rESALE_TITLE, String rESALE_CONTENT, String rESALE_ADDRESS,
			String rESALE_PRICE, String rESALE_IMG_ORIGINAL, String rESALE_IMG_SERVER) {
		MEMBER_CODE = mEMBER_CODE;
		RESALE_TITLE = rESALE_TITLE;
		RESALE_CONTENT = rESALE_CONTENT;
		RESALE_ADDRESS = rESALE_ADDRESS;
		RESALE_PRICE = rESALE_PRICE;
		RESALE_IMG_ORIGINAL = rESALE_IMG_ORIGINAL;
		RESALE_IMG_SERVER = rESALE_IMG_SERVER;

	}

	// 중고게시판 글 파일 재첨부 후 수정시 사용
	public ResaleDTO(String rESALE_TITLE, String rESALE_CONTENT, String rESALE_ADDRESS, String rESALE_PRICE,
			String rESALE_IMG_ORIGINAL, String rESALE_IMG_SERVER, int rESALE_CODE, int mEMBER_CODE) {
		MEMBER_CODE = mEMBER_CODE;
		RESALE_CODE = rESALE_CODE;
		RESALE_TITLE = rESALE_TITLE;
		RESALE_CONTENT = rESALE_CONTENT;
		RESALE_ADDRESS = rESALE_ADDRESS;
		RESALE_PRICE = rESALE_PRICE;
		RESALE_IMG_ORIGINAL = rESALE_IMG_ORIGINAL;
		RESALE_IMG_SERVER = rESALE_IMG_SERVER;
	}

	// 중고게시판 글 파일 원본파일 유지 후 수정시 사용
	public ResaleDTO(String rESALE_TITLE, String rESALE_CONTENT, String rESALE_ADDRESS, String rESALE_PRICE,
			int rESALE_CODE, int mEMBER_CODE) {
		MEMBER_CODE = mEMBER_CODE;
		RESALE_CODE = rESALE_CODE;
		RESALE_TITLE = rESALE_TITLE;
		RESALE_CONTENT = rESALE_CONTENT;
		RESALE_ADDRESS = rESALE_ADDRESS;
		RESALE_PRICE = rESALE_PRICE;
	}

	public int getRESALE_CODE() {
		return RESALE_CODE;
	}

	public void setRESALE_CODE(int rESALE_CODE) {
		RESALE_CODE = rESALE_CODE;
	}

	public int getMEMBER_CODE() {
		return MEMBER_CODE;
	}

	public void setMEMBER_CODE(int mEMBER_CODE) {
		MEMBER_CODE = mEMBER_CODE;
	}

	public String getRESALE_TITLE() {
		return RESALE_TITLE;
	}

	public void setRESALE_TITLE(String rESALE_TITLE) {
		RESALE_TITLE = rESALE_TITLE;
	}

	public String getRESALE_CONTENT() {
		return RESALE_CONTENT;
	}

	public void setRESALE_CONTENT(String rESALE_CONTENT) {
		RESALE_CONTENT = rESALE_CONTENT;
	}

	public String getRESALE_ADDRESS() {
		return RESALE_ADDRESS;
	}

	public void setRESALE_ADDRESS(String rESALE_ADDRESS) {
		RESALE_ADDRESS = rESALE_ADDRESS;
	}

	public String getRESALE_PRICE() {
		return RESALE_PRICE;
	}

	public void setRESALE_PRICE(String rESALE_PRICE) {
		RESALE_PRICE = rESALE_PRICE;
	}

	public String getRESALE_IMG_ORIGINAL() {
		return RESALE_IMG_ORIGINAL;
	}

	public void setRESALE_IMG_ORIGINAL(String rESALE_IMG_ORIGINAL) {
		RESALE_IMG_ORIGINAL = rESALE_IMG_ORIGINAL;
	}

	public String getRESALE_IMG_SERVER() {
		return RESALE_IMG_SERVER;
	}

	public void setRESALE_IMG_SERVER(String rESALE_IMG_SERVER) {
		RESALE_IMG_SERVER = rESALE_IMG_SERVER;
	}

	public int getRESALE_LIKE() {
		return RESALE_LIKE;
	}

	public void setRESALE_LIKE(int rESALE_LIKE) {
		RESALE_LIKE = rESALE_LIKE;
	}

	public Date getRESALE_REGDATE() {
		return RESALE_REGDATE;
	}

	public void setRESALE_REGDATE(Date rESALE_REGDATE) {
		RESALE_REGDATE = rESALE_REGDATE;
	}

	public int getRESALE_COUNTVIEW() {
		return RESALE_COUNTVIEW;
	}

	public void setRESALE_COUNTVIEW(int rESALE_COUNTVIEW) {
		RESALE_COUNTVIEW = rESALE_COUNTVIEW;
	}

	@Override
	public String toString() {
		return "ResaleDTO [RESALE_CODE=" + RESALE_CODE + ", MEMBER_CODE=" + MEMBER_CODE + ", RESALE_TITLE="
				+ RESALE_TITLE + ", RESALE_CONTENT=" + RESALE_CONTENT + ", RESALE_ADDRESS=" + RESALE_ADDRESS
				+ ", RESALE_PRICE=" + RESALE_PRICE + ", RESALE_IMG_ORIGINAL=" + RESALE_IMG_ORIGINAL
				+ ", RESALE_IMG_SERVER=" + RESALE_IMG_SERVER + ", RESALE_LIKE=" + RESALE_LIKE + ", RESALE_REGDATE="
				+ RESALE_REGDATE + ", RESALE_COUNTVIEW=" + RESALE_COUNTVIEW + "]";
	}

}