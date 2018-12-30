package com.springjpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "m_adm_sign")
public class LoginData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String sign_no;
	
	@Column(name="passwd")
	private String passwd;
	
	@Column(name="sign_role")
	private String sign_role;
	
	@Column(name="sign_desc")
	private String sign_desc;
	
	@Column(name="choice_cntr_no")
	private String choice_cntr_no;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="description")
	private String description;
	
	@Column(name="smsid")
	private String smsid;
	
	@Column(name="fingerprintimage")
	private Byte[] fingerprintimage;
	
	@Column(name="superior_id")
	private String superior_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="cert_serial_num")
	private String cert_serial_num;
	
	@Column(name="mobile_no")
	private String mobile_no;
	
	@Column(name="generated_login")
	private Character generated_login;
	
	@Column(name="signing_option")
	private Character signing_option;
	
	
	@Column(name="last_mdfd_by")
	private String last_mdfd_by;
	
	@Column(name="last_mdfd_date")
	private Date last_mdfd_date; 
	
	@Column(name="user_id")// timestamp without time zone,
	private Integer user_id;
	
	@Column(name="location_type_id")
	private Integer location_type_id;
	
	@Column(name="location_id")
	private Integer location_id;

	@Column(name="state_id")
	private Integer state_id;
	
	@Column(name="location_type_flag")
	private Character location_type_flag;
	
	@Column(name="zila_parisad")
	private Integer zila_parisad;
	
	@Column(name="panchayat_samiti")
	private Integer panchayat_samiti;
	
	@Column(name="gram_panchayat")
	private Integer gram_panchayat;
	
	@Column(name="corporation")
	private Integer corporation;
	
	@Column(name="municipality")
	private Integer municipality;
	
	@Column(name="spdi_created_by")
	private Integer spdi_created_by;
	
	@Column(name="spdi_status")
	private Integer spdi_status;
	
	@Column(name="spdv_location_name")
	private String spdv_location_name;
	
	@Column(name="spdv_change_password_flag")
	private Character spdv_change_password_flag;
	
	@Column(name="smsemail_send_flag")
	private Character smsemail_send_flag;
	
	@Column(name="sync_user_flag")
	private boolean sync_user_flag;
	public String getSign_no() {
		return sign_no;
	}
	public void setSign_no(String sign_no) {
		this.sign_no = sign_no;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSign_role() {
		return sign_role;
	}
	public void setSign_role(String sign_role) {
		this.sign_role = sign_role;
	}
	public String getSign_desc() {
		return sign_desc;
	}
	public void setSign_desc(String sign_desc) {
		this.sign_desc = sign_desc;
	}
	public String getChoice_cntr_no() {
		return choice_cntr_no;
	}
	public void setChoice_cntr_no(String choice_cntr_no) {
		this.choice_cntr_no = choice_cntr_no;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSmsid() {
		return smsid;
	}
	public void setSmsid(String smsid) {
		this.smsid = smsid;
	}
	public Byte[] getFingerprintimage() {
		return fingerprintimage;
	}
	public void setFingerprintimage(Byte[] fingerprintimage) {
		this.fingerprintimage = fingerprintimage;
	}
	public String getSuperior_id() {
		return superior_id;
	}
	public void setSuperior_id(String superior_id) {
		this.superior_id = superior_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getCert_serial_num() {
		return cert_serial_num;
	}
	public void setCert_serial_num(String cert_serial_num) {
		this.cert_serial_num = cert_serial_num;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public Character getGenerated_login() {
		return generated_login;
	}
	public void setGenerated_login(Character generated_login) {
		this.generated_login = generated_login;
	}
	public Character getSigning_option() {
		return signing_option;
	}
	public void setSigning_option(Character signing_option) {
		this.signing_option = signing_option;
	}
	public String getLast_mdfd_by() {
		return last_mdfd_by;
	}
	public void setLast_mdfd_by(String last_mdfd_by) {
		this.last_mdfd_by = last_mdfd_by;
	}
	public Date getLast_mdfd_date() {
		return last_mdfd_date;
	}
	public void setLast_mdfd_date(Date last_mdfd_date) {
		this.last_mdfd_date = last_mdfd_date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getLocation_type_id() {
		return location_type_id;
	}
	public void setLocation_type_id(Integer location_type_id) {
		this.location_type_id = location_type_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public Integer getState_id() {
		return state_id;
	}
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}
	public Character getLocation_type_flag() {
		return location_type_flag;
	}
	public void setLocation_type_flag(Character location_type_flag) {
		this.location_type_flag = location_type_flag;
	}
	public Integer getZila_parisad() {
		return zila_parisad;
	}
	public void setZila_parisad(Integer zila_parisad) {
		this.zila_parisad = zila_parisad;
	}
	public Integer getPanchayat_samiti() {
		return panchayat_samiti;
	}
	public void setPanchayat_samiti(Integer panchayat_samiti) {
		this.panchayat_samiti = panchayat_samiti;
	}
	public Integer getGram_panchayat() {
		return gram_panchayat;
	}
	public void setGram_panchayat(Integer gram_panchayat) {
		this.gram_panchayat = gram_panchayat;
	}
	public Integer getCorporation() {
		return corporation;
	}
	public void setCorporation(Integer corporation) {
		this.corporation = corporation;
	}
	public Integer getMunicipality() {
		return municipality;
	}
	public void setMunicipality(Integer municipality) {
		this.municipality = municipality;
	}
	public Integer getSpdi_created_by() {
		return spdi_created_by;
	}
	public void setSpdi_created_by(Integer spdi_created_by) {
		this.spdi_created_by = spdi_created_by;
	}
	public Integer getSpdi_status() {
		return spdi_status;
	}
	public void setSpdi_status(Integer spdi_status) {
		this.spdi_status = spdi_status;
	}
	public String getSpdv_location_name() {
		return spdv_location_name;
	}
	public void setSpdv_location_name(String spdv_location_name) {
		this.spdv_location_name = spdv_location_name;
	}
	public Character getSpdv_change_password_flag() {
		return spdv_change_password_flag;
	}
	public void setSpdv_change_password_flag(Character spdv_change_password_flag) {
		this.spdv_change_password_flag = spdv_change_password_flag;
	}
	public Character getSmsemail_send_flag() {
		return smsemail_send_flag;
	}
	public void setSmsemail_send_flag(Character smsemail_send_flag) {
		this.smsemail_send_flag = smsemail_send_flag;
	}
	public boolean isSync_user_flag() {
		return sync_user_flag;
	}
	public void setSync_user_flag(boolean sync_user_flag) {
		this.sync_user_flag = sync_user_flag;
	}

	
	
}
