package com.single.model.dto.member;

import java.sql.Date;

public class MemberProfileDTO {

	private int MEMBER_CODE;

	private int MEMBER_VERIFY;
	private String MEMBER_EMAIL;
	private String MEMBER_PASSWORD;
	private String MEMBER_NAME;
	private String MEMBER_NICKNAME;
	private String MEMBER_GENDER;

	private Date MEMBER_REGDATE;
	private String MEMBER_ENABLED;

	private String MPROFILE_INTRODUCE;
	private String MPROFILE_LATITUDE;
	private String MPROFILE_LONGITUDE;

	private String MPROFILE_IMG_NAME;
	private String MPROFILE_IMG_SERVERNAME;
	private String MPROFILE_IMG_PATH;

	public MemberProfileDTO() {
	}

	// 회원가입 시 프로필 NULL 셋팅
	public MemberProfileDTO(int mEMBER_CODE, String mPROFILE_INTRODUCE, String mPROFILE_LATITUDE,
			String mPROFILE_LONGITUDE, String mPROFILE_IMG_NAME, String mPROFILE_IMG_SERVERNAME,
			String mPROFILE_IMG_PATH) {
		super();
		MEMBER_CODE = mEMBER_CODE;
		MPROFILE_INTRODUCE = mPROFILE_INTRODUCE;
		MPROFILE_LATITUDE = mPROFILE_LATITUDE;
		MPROFILE_LONGITUDE = mPROFILE_LONGITUDE;
		MPROFILE_IMG_NAME = mPROFILE_IMG_NAME;
		MPROFILE_IMG_SERVERNAME = mPROFILE_IMG_SERVERNAME;
		MPROFILE_IMG_PATH = mPROFILE_IMG_PATH;
	}

	public MemberProfileDTO(int mEMBER_CODE, int mEMBER_VERIFY, String mEMBER_EMAIL, String mEMBER_PASSWORD,
			String mEMBER_NAME, String mEMBER_NICKNAME, String mEMBER_GENDER, Date mEMBER_REGDATE,
			String mEMBER_ENABLED, String mPROFILE_INTRODUCE, String mPROFILE_LATITUDE, String mPROFILE_LONGITUDE,
			String mPROFILE_IMG_NAME, String mPROFILE_IMG_SERVERNAME, String mPROFILE_IMG_PATH) {
		super();
		MEMBER_CODE = mEMBER_CODE;
		MEMBER_VERIFY = mEMBER_VERIFY;
		MEMBER_EMAIL = mEMBER_EMAIL;
		MEMBER_PASSWORD = mEMBER_PASSWORD;
		MEMBER_NAME = mEMBER_NAME;
		MEMBER_NICKNAME = mEMBER_NICKNAME;
		MEMBER_GENDER = mEMBER_GENDER;
		MEMBER_REGDATE = mEMBER_REGDATE;
		MEMBER_ENABLED = mEMBER_ENABLED;
		MPROFILE_INTRODUCE = mPROFILE_INTRODUCE;
		MPROFILE_LATITUDE = mPROFILE_LATITUDE;
		MPROFILE_LONGITUDE = mPROFILE_LONGITUDE;
		MPROFILE_IMG_NAME = mPROFILE_IMG_NAME;
		MPROFILE_IMG_SERVERNAME = mPROFILE_IMG_SERVERNAME;
		MPROFILE_IMG_PATH = mPROFILE_IMG_PATH;
	}

	@Override
	public String toString() {
		return "MemberProfileDTO [MEMBER_CODE=" + MEMBER_CODE + ", MEMBER_VERIFY=" + MEMBER_VERIFY + ", MEMBER_EMAIL="
				+ MEMBER_EMAIL + ", MEMBER_PASSWORD=" + MEMBER_PASSWORD + ", MEMBER_NAME=" + MEMBER_NAME
				+ ", MEMBER_NICKNAME=" + MEMBER_NICKNAME + ", MEMBER_GENDER=" + MEMBER_GENDER + ", MEMBER_REGDATE="
				+ MEMBER_REGDATE + ", MEMBER_ENABLED=" + MEMBER_ENABLED + ", MPROFILE_INTRODUCE=" + MPROFILE_INTRODUCE
				+ ", MPROFILE_LATITUDE=" + MPROFILE_LATITUDE + ", MPROFILE_LONGITUDE=" + MPROFILE_LONGITUDE
				+ ", MPROFILE_IMG_NAME=" + MPROFILE_IMG_NAME + ", MPROFILE_IMG_SERVERNAME=" + MPROFILE_IMG_SERVERNAME
				+ ", MPROFILE_IMG_PATH=" + MPROFILE_IMG_PATH + "]";
	}

	public int getMEMBER_CODE() {
		return MEMBER_CODE;
	}

	public void setMEMBER_CODE(int mEMBER_CODE) {
		MEMBER_CODE = mEMBER_CODE;
	}

	public int getMEMBER_VERIFY() {
		return MEMBER_VERIFY;
	}

	public void setMEMBER_VERIFY(int mEMBER_VERIFY) {
		MEMBER_VERIFY = mEMBER_VERIFY;
	}

	public String getMEMBER_EMAIL() {
		return MEMBER_EMAIL;
	}

	public void setMEMBER_EMAIL(String mEMBER_EMAIL) {
		MEMBER_EMAIL = mEMBER_EMAIL;
	}

	public String getMEMBER_PASSWORD() {
		return MEMBER_PASSWORD;
	}

	public void setMEMBER_PASSWORD(String mEMBER_PASSWORD) {
		MEMBER_PASSWORD = mEMBER_PASSWORD;
	}

	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}

	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}

	public String getMEMBER_NICKNAME() {
		return MEMBER_NICKNAME;
	}

	public void setMEMBER_NICKNAME(String mEMBER_NICKNAME) {
		MEMBER_NICKNAME = mEMBER_NICKNAME;
	}

	public String getMEMBER_GENDER() {
		return MEMBER_GENDER;
	}

	public void setMEMBER_GENDER(String mEMBER_GENDER) {
		MEMBER_GENDER = mEMBER_GENDER;
	}

	public Date getMEMBER_REGDATE() {
		return MEMBER_REGDATE;
	}

	public void setMEMBER_REGDATE(Date mEMBER_REGDATE) {
		MEMBER_REGDATE = mEMBER_REGDATE;
	}

	public String getMEMBER_ENABLED() {
		return MEMBER_ENABLED;
	}

	public void setMEMBER_ENABLED(String mEMBER_ENABLED) {
		MEMBER_ENABLED = mEMBER_ENABLED;
	}

	public String getMPROFILE_INTRODUCE() {
		return MPROFILE_INTRODUCE;
	}

	public void setMPROFILE_INTRODUCE(String mPROFILE_INTRODUCE) {
		MPROFILE_INTRODUCE = mPROFILE_INTRODUCE;
	}

	public String getMPROFILE_LATITUDE() {
		return MPROFILE_LATITUDE;
	}

	public void setMPROFILE_LATITUDE(String mPROFILE_LATITUDE) {
		MPROFILE_LATITUDE = mPROFILE_LATITUDE;
	}

	public String getMPROFILE_LONGITUDE() {
		return MPROFILE_LONGITUDE;
	}

	public void setMPROFILE_LONGITUDE(String mPROFILE_LONGITUDE) {
		MPROFILE_LONGITUDE = mPROFILE_LONGITUDE;
	}

	public String getMPROFILE_IMG_NAME() {
		return MPROFILE_IMG_NAME;
	}

	public void setMPROFILE_IMG_NAME(String mPROFILE_IMG_NAME) {
		MPROFILE_IMG_NAME = mPROFILE_IMG_NAME;
	}

	public String getMPROFILE_IMG_SERVERNAME() {
		return MPROFILE_IMG_SERVERNAME;
	}

	public void setMPROFILE_IMG_SERVERNAME(String mPROFILE_IMG_SERVERNAME) {
		MPROFILE_IMG_SERVERNAME = mPROFILE_IMG_SERVERNAME;
	}

	public String getMPROFILE_IMG_PATH() {
		return MPROFILE_IMG_PATH;
	}

	public void setMPROFILE_IMG_PATH(String mPROFILE_IMG_PATH) {
		MPROFILE_IMG_PATH = mPROFILE_IMG_PATH;
	}

}
