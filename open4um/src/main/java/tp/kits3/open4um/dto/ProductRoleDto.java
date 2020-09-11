/**
 * author:TOan
 */
package tp.kits3.open4um.dto;
import java.sql.Timestamp;

public class ProductRoleDto {
	 private Integer proid;
	 private String title;
	 private Integer ctgid;
	 private Integer like;
	 private Integer views;
	 private Timestamp datepost;
	 private String content;
	 private String image;
	 private int userid;
	 private Integer stateid;
	 private String statename;
	 public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	private String reason;
	 private Integer dislikes;
	 private String username;
	 private String phone;
	 private String avatar;
	private String email;
	private String roleaccount_name ;
	private String status;
	private int money;
	private Integer rateid;
	private Integer ratevalue;
	private String ratename;
	private Integer sourceid;
    private String ctgname;
    
    private String ctgdate;
    private Integer parentid;
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCtgid() {
		return ctgid;
	}
	public void setCtgid(Integer ctgid) {
		this.ctgid = ctgid;
	}
	public Integer getLike() {
		return like;
	}
	public void setLike(Integer like) {
		this.like = like;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Timestamp getDatepost() {
		return datepost;
	}
	public void setDatepost(Timestamp datepost) {
		this.datepost = datepost;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Integer getStateid() {
		return stateid;
	}
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getDislikes() {
		return dislikes;
	}
	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoleaccount_name() {
		return roleaccount_name;
	}
	public void setRoleaccount_name(String roleaccount_name) {
		this.roleaccount_name = roleaccount_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Integer getRateid() {
		return rateid;
	}
	public void setRateid(Integer rateid) {
		this.rateid = rateid;
	}
	public Integer getRatevalue() {
		return ratevalue;
	}
	public void setRatevalue(Integer ratevalue) {
		this.ratevalue = ratevalue;
	}
	public String getRatename() {
		return ratename;
	}
	public void setRatename(String ratename) {
		this.ratename = ratename;
	}
	public Integer getSourceid() {
		return sourceid;
	}
	public void setSourceid(Integer sourceid) {
		this.sourceid = sourceid;
	}
	public String getCtgname() {
		return ctgname;
	}
	public void setCtgname(String ctgname) {
		this.ctgname = ctgname;
	}
	public String getCtgdate() {
		return ctgdate;
	}
	public void setCtgdate(String ctgdate) {
		this.ctgdate = ctgdate;
	}
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	public ProductRoleDto(Integer proid, String title, Integer ctgid, Integer like, Integer views, Timestamp datepost,
			String content, String image, int userid, Integer stateid, String reason, Integer dislikes, String username,
			String phone, String avatar, String email, String roleaccount_name, String status, int money,
			Integer rateid, Integer ratevalue, String ratename, Integer sourceid, String ctgname, String ctgdate,
			Integer parentid) {
		super();
		this.proid = proid;
		this.title = title;
		this.ctgid = ctgid;
		this.like = like;
		this.views = views;
		this.datepost = datepost;
		this.content = content;
		this.image = image;
		this.userid = userid;
		this.stateid = stateid;
		this.reason = reason;
		this.dislikes = dislikes;
		this.username = username;
		this.phone = phone;
		this.avatar = avatar;
		this.email = email;
		this.roleaccount_name = roleaccount_name;
		this.status = status;
		this.money = money;
		this.rateid = rateid;
		this.ratevalue = ratevalue;
		this.ratename = ratename;
		this.sourceid = sourceid;
		this.ctgname = ctgname;
		this.ctgdate = ctgdate;
		this.parentid = parentid;
	}
	public ProductRoleDto() {
	}
   
	
    
} 