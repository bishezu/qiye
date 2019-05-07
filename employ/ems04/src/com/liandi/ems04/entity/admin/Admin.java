package com.liandi.ems04.entity.admin;

import java.util.Date;

/**
 * 
 * @author 此类是管理员类别的实体类
 * 
 */
public class Admin {

	private Integer adminTypeId; // (管理员类型id)
	private String adminType; // (管理员类型)
	private Date createTime; // (创建的时间)
	private Boolean addDept; // (添加部门的权限)
	private Boolean findStaffByDeptId; // (根据部门id查询员工的权限)
	private Boolean deleteDeptById; // (根据部门id删除部门的权限)
	private Boolean modifyDeptByStaffId; // (根据员工id修改部门的权限)
	private Boolean addTitle; // (添加职位的权限)
	private Boolean findStaffByTitleId; // (根据职位id查询员工的权限)
	private Boolean deleteTitleById; // (根据职位id删除职位的权限)
	private Boolean modifyTitleByStaffId; // (根据员工id修改职位的权限)
	private Boolean addAchieveById; // (根据绩效id添加绩效的权限)
	/*private Boolean deleteAdviceById; // (根据意见id删除意见及回复的权限)*/
	private Boolean addTrain; // (添加培训信息的权限)
	private Boolean modifySalaryBySalaryLevelId; // (根据薪资等级id修改基本工资的权限)
	private Boolean addStaff; // (添加员工的权限)
	private Boolean modifyStaffByStaffId; // (根据员工id修改员工信息的权限)
	private Boolean deleteStaffByStaffId; // (id删除员工的权限)
	private Boolean addAdminType;// (增加管理员类型权限)
	private Boolean modifyAdmin;// (修改管理员权限的权限)
	private Boolean deleteAdminType;// (删除管理员类型的权限)
	private Boolean modifyAdminType;// (修改管理员类型的权限)

	public Admin() {
		super();
	}

	public Admin(String adminType, Date createTime, Boolean addDept,
			Boolean findStaffByDeptId, Boolean deleteDeptById,
			Boolean modifyDeptByStaffId, Boolean addTitle,
			Boolean findStaffByTitleId, Boolean deleteTitleById,Boolean modifyTitleByStaffId,
			Boolean modifySalaryBySalaryLevelId, Boolean addStaff,
			Boolean modifyStaffByStaffId, Boolean deleteStaffByStaffId,
			Boolean addAdminType, Boolean modifyAdmin, Boolean deleteAdminType,
			Boolean modifyAdminType, Boolean addAchieveById,Boolean addTrain) {
		super();
		this.adminType = adminType;
		this.createTime = createTime;
		this.addDept = addDept;
		this.findStaffByDeptId = findStaffByDeptId;
		this.deleteDeptById = deleteDeptById;
		this.modifyDeptByStaffId = modifyDeptByStaffId;
		this.addTitle = addTitle;
		this.findStaffByTitleId = findStaffByTitleId;
		this.deleteTitleById = deleteTitleById;
		this.modifyTitleByStaffId=modifyTitleByStaffId;
		this.modifySalaryBySalaryLevelId = modifySalaryBySalaryLevelId;
		this.addStaff = addStaff;
		this.modifyStaffByStaffId = modifyStaffByStaffId;
		this.deleteStaffByStaffId = deleteStaffByStaffId;
		this.addAdminType = addAdminType;
		this.modifyAdmin = modifyAdmin;
		this.deleteAdminType = deleteAdminType;
		this.modifyAdminType = modifyAdminType;
		this.addAchieveById=addAchieveById;
		this.addTrain=addTrain;
	}

	@Override
	public String toString() {
		return "Admin [adminTypeId=" + adminTypeId + ", adminType=" + adminType
				+ ", createTime=" + createTime + ", addDept=" + addDept
				+ ", findStaffByDeptId=" + findStaffByDeptId
				+ ", deleteDeptById=" + deleteDeptById
				+ ", modifyDeptByStaffId=" + modifyDeptByStaffId
				+ ", addTitle=" + addTitle + ", findStaffByTitleId="
				+ findStaffByTitleId + ", deleteTitleById=" + deleteTitleById
				+ ",modifyTitleByStaffId"+modifyTitleByStaffId+", modifySalaryBySalaryLevelId="
				+ modifySalaryBySalaryLevelId + ", addStaff=" + addStaff
				+ ", modifyStaffByStaffId=" + modifyStaffByStaffId
				+ ", deleteStaffByStaffId=" + deleteStaffByStaffId
				+ ", addAdminType=" + addAdminType + ", modifyAdmin="
				+ modifyAdmin + ", deleteAdminType=" + deleteAdminType
				+ ", modifyAdminType=" + modifyAdminType +",addAchieveById="+addAchieveById+ ",addTrain="+addTrain+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((addAdminType == null) ? 0 : addAdminType.hashCode());
		result = prime * result + ((addDept == null) ? 0 : addDept.hashCode());
		result = prime * result
				+ ((addStaff == null) ? 0 : addStaff.hashCode());
		result = prime * result
				+ ((addTitle == null) ? 0 : addTitle.hashCode());
		result = prime * result
				+ ((adminType == null) ? 0 : adminType.hashCode());
		result = prime * result
				+ ((adminTypeId == null) ? 0 : adminTypeId.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((deleteAdminType == null) ? 0 : deleteAdminType.hashCode());
	
		result = prime * result
				+ ((deleteDeptById == null) ? 0 : deleteDeptById.hashCode());
		result = prime
				* result
				+ ((deleteStaffByStaffId == null) ? 0 : deleteStaffByStaffId
						.hashCode());
		result = prime * result
				+ ((deleteTitleById == null) ? 0 : deleteTitleById.hashCode());
		result = prime
				* result
				+ ((modifyTitleByStaffId == null) ? 0 : modifyTitleByStaffId.hashCode());
				result = prime
						* result
				+ ((findStaffByDeptId == null) ? 0 : findStaffByDeptId
						.hashCode());
		result = prime
				* result
				+ ((findStaffByTitleId == null) ? 0 : findStaffByTitleId
						.hashCode());
		result = prime * result
				+ ((modifyAdmin == null) ? 0 : modifyAdmin.hashCode());
		result = prime * result
				+ ((modifyAdminType == null) ? 0 : modifyAdminType.hashCode());
		result = prime
				* result
				+ ((modifyDeptByStaffId == null) ? 0 : modifyDeptByStaffId
						.hashCode());
		result = prime
				* result
				+ ((modifySalaryBySalaryLevelId == null) ? 0
						: modifySalaryBySalaryLevelId.hashCode());
		result = prime
				* result
				+ ((modifyStaffByStaffId == null) ? 0 : modifyStaffByStaffId
						.hashCode());
		result = prime
				* result
				+ ((addAchieveById == null) ? 0 : addAchieveById
						.hashCode());
		result = prime
				* result
				+ ((addTrain == null) ? 0 : addTrain
						.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (addAdminType == null) {
			if (other.addAdminType != null)
				return false;
		} else if (!addAdminType.equals(other.addAdminType))
			return false;
		if (addDept == null) {
			if (other.addDept != null)
				return false;
		} else if (!addDept.equals(other.addDept))
			return false;
		if (addStaff == null) {
			if (other.addStaff != null)
				return false;
		} else if (!addStaff.equals(other.addStaff))
			return false;
		if (addTitle == null) {
			if (other.addTitle != null)
				return false;
		} else if (!addTitle.equals(other.addTitle))
			return false;
		if (adminType == null) {
			if (other.adminType != null)
				return false;
		} else if (!adminType.equals(other.adminType))
			return false;
		if (adminTypeId == null) {
			if (other.adminTypeId != null)
				return false;
		} else if (!adminTypeId.equals(other.adminTypeId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (deleteAdminType == null) {
			if (other.deleteAdminType != null)
				return false;
		} else if (!deleteAdminType.equals(other.deleteAdminType))
			return false;
		
		if (deleteDeptById == null) {
			if (other.deleteDeptById != null)
				return false;
		} else if (!deleteDeptById.equals(other.deleteDeptById))
			return false;
		if (deleteStaffByStaffId == null) {
			if (other.deleteStaffByStaffId != null)
				return false;
		} else if (!deleteStaffByStaffId.equals(other.deleteStaffByStaffId))
			return false;
		if (deleteTitleById == null) {
			if (other.deleteTitleById != null)
				return false;
		} else if (!deleteTitleById.equals(other.deleteTitleById))
			return false;
		if (modifyTitleByStaffId == null) {
			if (other.modifyTitleByStaffId != null)
				return false;
		} else if (!modifyTitleByStaffId.equals(other.modifyTitleByStaffId))
			return false;
	
		if (findStaffByDeptId == null) {
			if (other.findStaffByDeptId != null)
				return false;
		} else if (!findStaffByDeptId.equals(other.findStaffByDeptId))
			return false;
		if (findStaffByTitleId == null) {
			if (other.findStaffByTitleId != null)
				return false;
		} else if (!findStaffByTitleId.equals(other.findStaffByTitleId))
			return false;
		if (modifyAdmin == null) {
			if (other.modifyAdmin != null)
				return false;
		} else if (!modifyAdmin.equals(other.modifyAdmin))
			return false;
		if (modifyAdminType == null) {
			if (other.modifyAdminType != null)
				return false;
		} else if (!modifyAdminType.equals(other.modifyAdminType))
			return false;
		if (modifyDeptByStaffId == null) {
			if (other.modifyDeptByStaffId != null)
				return false;
		} else if (!modifyDeptByStaffId.equals(other.modifyDeptByStaffId))
			return false;
		
		if (modifySalaryBySalaryLevelId == null) {
			if (other.modifySalaryBySalaryLevelId != null)
				return false;
		} else if (!modifySalaryBySalaryLevelId
				.equals(other.modifySalaryBySalaryLevelId))
			return false;
		if (modifyStaffByStaffId == null) {
			if (other.modifyStaffByStaffId != null)
				return false;
		} 
		if (addAchieveById == null) {
			if (other.addAchieveById != null)
				return false;
		} else if (!addAchieveById.equals(other.addAchieveById))
			return false;
		
		if (addTrain == null) {
			if (other.addTrain != null)
				return false;
		} else if (!addTrain.equals(other.addTrain))
			return false;
		return true;
		
		
	}

	public Boolean getAddTrain() {
		return addTrain;
	}

	public void setAddTrain(Boolean addTrain) {
		this.addTrain = addTrain;
	}

	public Boolean getAddAchieveById() {
		return addAchieveById;
	}

	public void setAddAchieveById(Boolean addAchieveById) {
		this.addAchieveById = addAchieveById;
	}

	public Boolean getModifyTitleByStaffId() {
		return modifyTitleByStaffId;
	}

	public void setModifyTitleByStaffId(Boolean modifyTitleByStaffId) {
		this.modifyTitleByStaffId = modifyTitleByStaffId;
	}

	public Integer getAdminTypeId() {
		return adminTypeId;
	}

	public void setAdminTypeId(Integer adminTypeId) {
		this.adminTypeId = adminTypeId;
	}

	public String getAdminType() {
		return adminType;
	}

	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getAddDept() {
		return addDept;
	}

	public void setAddDept(Boolean addDept) {
		this.addDept = addDept;
	}

	public Boolean getFindStaffByDeptId() {
		return findStaffByDeptId;
	}

	public void setFindStaffByDeptId(Boolean findStaffByDeptId) {
		this.findStaffByDeptId = findStaffByDeptId;
	}

	public Boolean getDeleteDeptById() {
		return deleteDeptById;
	}

	public void setDeleteDeptById(Boolean deleteDeptById) {
		this.deleteDeptById = deleteDeptById;
	}

	public Boolean getModifyDeptByStaffId() {
		return modifyDeptByStaffId;
	}

	public void setModifyDeptByStaffId(Boolean modifyDeptByStaffId) {
		this.modifyDeptByStaffId = modifyDeptByStaffId;
	}

	public Boolean getAddTitle() {
		return addTitle;
	}

	public void setAddTitle(Boolean addTitle) {
		this.addTitle = addTitle;
	}

	public Boolean getFindStaffByTitleId() {
		return findStaffByTitleId;
	}

	public void setFindStaffByTitleId(Boolean findStaffByTitleId) {
		this.findStaffByTitleId = findStaffByTitleId;
	}

	public Boolean getDeleteTitleById() {
		return deleteTitleById;
	}

	public void setDeleteTitleById(Boolean deleteTitleById) {
		this.deleteTitleById = deleteTitleById;
	}

	

	public Boolean getModifySalaryBySalaryLevelId() {
		return modifySalaryBySalaryLevelId;
	}

	public void setModifySalaryBySalaryLevelId(
			Boolean modifySalaryBySalaryLevelId) {
		this.modifySalaryBySalaryLevelId = modifySalaryBySalaryLevelId;
	}

	public Boolean getAddStaff() {
		return addStaff;
	}

	public void setAddStaff(Boolean addStaff) {
		this.addStaff = addStaff;
	}

	public Boolean getModifyStaffByStaffId() {
		return modifyStaffByStaffId;
	}

	public void setModifyStaffByStaffId(Boolean modifyStaffByStaffId) {
		this.modifyStaffByStaffId = modifyStaffByStaffId;
	}

	public Boolean getDeleteStaffByStaffId() {
		return deleteStaffByStaffId;
	}

	public void setDeleteStaffByStaffId(Boolean deleteStaffByStaffId) {
		this.deleteStaffByStaffId = deleteStaffByStaffId;
	}

	public Boolean getAddAdminType() {
		return addAdminType;
	}

	public void setAddAdminType(Boolean addAdminType) {
		this.addAdminType = addAdminType;
	}

	public Boolean getModifyAdmin() {
		return modifyAdmin;
	}

	public void setModifyAdmin(Boolean modifyAdmin) {
		this.modifyAdmin = modifyAdmin;
	}

	public Boolean getDeleteAdminType() {
		return deleteAdminType;
	}

	public void setDeleteAdminType(Boolean deleteAdminType) {
		this.deleteAdminType = deleteAdminType;
	}

	public Boolean getModifyAdminType() {
		return modifyAdminType;
	}

	public void setModifyAdminType(Boolean modifyAdminType) {
		this.modifyAdminType = modifyAdminType;
	}

}
