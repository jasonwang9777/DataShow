/**
 * 
 */
package com.datashow.usermanager.po;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.datashow.enumtype.StatusEnum;

/**
 * @author Jason
 *
 */
@Entity(name = "t_user")
public class UserPO {
	@Id
	@GeneratedValue
	private BigInteger userId;

	private String userEmail;
	private String userPassword;
	private boolean userActive;// 是否激活
	private String userPhone;// 手机号
	private boolean userPhoneValid;// 手机号验证
	private String userAvatar;// 头像
	private String userNickName;// 昵称
	private String userSocialappType;// 绑定类型
	private String userSocialappName;// 绑定昵称
	private String userSocialappId;// 绑定id
	private String userNation;// 国籍
	private String userProvince;// 地区
	private String userCity;// 城市
	private boolean userCareerState;// 在职或学生
	private int userCareerSchool;// 学校
	private String userCareerCollege;// 专业
	private String userCareerCompany;// 公司
	private String userCareerIndustry;// 公司
	private String userCareerPosition;// 职位
	private String userIntroduction;// 个人简介
	private Timestamp userRegisterTime;// 注册时间
	private BigInteger userMemPoint;// 积分
	private int userMemGrade;// 等级
	private String userConfigOrder;// 排序设置
	private String userConfigShowState;// 显示状态
	private int userStatisticsTable;// 表格数量
	private int userStatisticsFolder;// 文件夹数量
	private int userStatisticsShare;// 分享数量
	private BigInteger userGroupId;// 圈子id
	private int userStatisticsFollow;// 关注数量
	private int userStatisticsFavorite;// 收藏数量
	private BigInteger userLikeId;// 兴趣id
	private StatusEnum userStatus;// 用户状态

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean isUserActive() {
		return userActive;
	}

	public void setUserActive(boolean userActive) {
		this.userActive = userActive;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public boolean isUserPhoneValid() {
		return userPhoneValid;
	}

	public void setUserPhoneValid(boolean userPhoneValid) {
		this.userPhoneValid = userPhoneValid;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserSocialappType() {
		return userSocialappType;
	}

	public void setUserSocialappType(String userSocialappType) {
		this.userSocialappType = userSocialappType;
	}

	public String getUserSocialappName() {
		return userSocialappName;
	}

	public void setUserSocialappName(String userSocialappName) {
		this.userSocialappName = userSocialappName;
	}

	public String getUserSocialappId() {
		return userSocialappId;
	}

	public void setUserSocialappId(String userSocialappId) {
		this.userSocialappId = userSocialappId;
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public boolean isUserCareerState() {
		return userCareerState;
	}

	public void setUserCareerState(boolean userCareerState) {
		this.userCareerState = userCareerState;
	}

	public int getUserCareerSchool() {
		return userCareerSchool;
	}

	public void setUserCareerSchool(int userCareerSchool) {
		this.userCareerSchool = userCareerSchool;
	}

	public String getUserCareerCollege() {
		return userCareerCollege;
	}

	public void setUserCareerCollege(String userCareerCollege) {
		this.userCareerCollege = userCareerCollege;
	}

	public String getUserCareerCompany() {
		return userCareerCompany;
	}

	public void setUserCareerCompany(String userCareerCompany) {
		this.userCareerCompany = userCareerCompany;
	}

	public String getUserCareerIndustry() {
		return userCareerIndustry;
	}

	public void setUserCareerIndustry(String userCareerIndustry) {
		this.userCareerIndustry = userCareerIndustry;
	}

	public String getUserCareerPosition() {
		return userCareerPosition;
	}

	public void setUserCareerPosition(String userCareerPosition) {
		this.userCareerPosition = userCareerPosition;
	}

	public String getUserIntroduction() {
		return userIntroduction;
	}

	public void setUserIntroduction(String userIntroduction) {
		this.userIntroduction = userIntroduction;
	}

	public Timestamp getUserRegisterTime() {
		return userRegisterTime;
	}

	public void setUserRegisterTime(Timestamp userRegisterTime) {
		this.userRegisterTime = userRegisterTime;
	}

	public BigInteger getUserMemPoint() {
		return userMemPoint;
	}

	public void setUserMemPoint(BigInteger userMemPoint) {
		this.userMemPoint = userMemPoint;
	}

	public int getUserMemGrade() {
		return userMemGrade;
	}

	public void setUserMemGrade(int userMemGrade) {
		this.userMemGrade = userMemGrade;
	}

	public String getUserConfigOrder() {
		return userConfigOrder;
	}

	public void setUserConfigOrder(String userConfigOrder) {
		this.userConfigOrder = userConfigOrder;
	}

	public String getUserConfigShowState() {
		return userConfigShowState;
	}

	public void setUserConfigShowState(String userConfigShowState) {
		this.userConfigShowState = userConfigShowState;
	}

	public int getUserStatisticsTable() {
		return userStatisticsTable;
	}

	public void setUserStatisticsTable(int userStatisticsTable) {
		this.userStatisticsTable = userStatisticsTable;
	}

	public int getUserStatisticsFolder() {
		return userStatisticsFolder;
	}

	public void setUserStatisticsFolder(int userStatisticsFolder) {
		this.userStatisticsFolder = userStatisticsFolder;
	}

	public int getUserStatisticsShare() {
		return userStatisticsShare;
	}

	public void setUserStatisticsShare(int userStatisticsShare) {
		this.userStatisticsShare = userStatisticsShare;
	}

	public BigInteger getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(BigInteger userGroupId) {
		this.userGroupId = userGroupId;
	}

	public int getUserStatisticsFollow() {
		return userStatisticsFollow;
	}

	public void setUserStatisticsFollow(int userStatisticsFollow) {
		this.userStatisticsFollow = userStatisticsFollow;
	}

	public int getUserStatisticsFavorite() {
		return userStatisticsFavorite;
	}

	public void setUserStatisticsFavorite(int userStatisticsFavorite) {
		this.userStatisticsFavorite = userStatisticsFavorite;
	}

	public BigInteger getUserLikeId() {
		return userLikeId;
	}

	public void setUserLikeId(BigInteger userLikeId) {
		this.userLikeId = userLikeId;
	}

	public StatusEnum getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(StatusEnum userStatus) {
		this.userStatus = userStatus;
	}

}
