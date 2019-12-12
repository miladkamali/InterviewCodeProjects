
package ir.fanap.questions.question1.Models;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("isDeleted")
    @Expose
    private Object isDeleted;
    @SerializedName("osId")
    @Expose
    private Long osId;
    @SerializedName("averageRateIndex")
    @Expose
    private Double averageRateIndex;
    @SerializedName("bulk")
    @Expose
    private Object bulk;
    @SerializedName("number_installs")
    @Expose
    private Object numberInstalls;
    @SerializedName("downLoadLink")
    @Expose
    private String downLoadLink;
    @SerializedName("iconThumbNail")
    @Expose
    private String iconThumbNail;
    @SerializedName("osTypeId")
    @Expose
    private Long osTypeId;
    @SerializedName("osTypeName")
    @Expose
    private String osTypeName;
    @SerializedName("appCategoryName")
    @Expose
    private String appCategoryName;
    @SerializedName("appCategoryID")
    @Expose
    private String appCategoryID;
    @SerializedName("permissionDetails")
    @Expose
    private Object permissionDetails;
    @SerializedName("creationDateTime")
    @Expose
    private CreationDateTime creationDateTime;
    @SerializedName("lastModifyDate")
    @Expose
    private LastModifyDate lastModifyDate;
    @SerializedName("versionName")
    @Expose
    private String versionName;
    @SerializedName("publishState")
    @Expose
    private String publishState;
    @SerializedName("targetSDK")
    @Expose
    private Object targetSDK;
    @SerializedName("developer")
    @Expose
    private String developer;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fileSize")
    @Expose
    private Long fileSize;
    @SerializedName("deleted")
    @Expose
    private Object deleted;
    @SerializedName("packageName")
    @Expose
    private String packageName;
    @SerializedName("minSDK")
    @Expose
    private Object minSDK;
    @SerializedName("versionCode")
    @Expose
    private String versionCode;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("keyword")
    @Expose
    private List<String> keyword = null;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("osName")
    @Expose
    private String osName;


    public Object getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Object isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getOsId() {
        return osId;
    }

    public void setOsId(Long osId) {
        this.osId = osId;
    }

    public Double getAverageRateIndex() {
        return averageRateIndex;
    }

    public void setAverageRateIndex(Double averageRateIndex) {
        this.averageRateIndex = averageRateIndex;
    }

    public Object getBulk() {
        return bulk;
    }

    public void setBulk(Object bulk) {
        this.bulk = bulk;
    }

    public Object getNumberInstalls() {
        return numberInstalls;
    }

    public void setNumberInstalls(Object numberInstalls) {
        this.numberInstalls = numberInstalls;
    }

    public String getDownLoadLink() {
        return downLoadLink;
    }

    public void setDownLoadLink(String downLoadLink) {
        this.downLoadLink = downLoadLink;
    }

    public String getIconThumbNail() {
        return iconThumbNail;
    }

    public void setIconThumbNail(String iconThumbNail) {
        this.iconThumbNail = iconThumbNail;
    }

    public Long getOsTypeId() {
        return osTypeId;
    }

    public void setOsTypeId(Long osTypeId) {
        this.osTypeId = osTypeId;
    }

    public String getOsTypeName() {
        return osTypeName;
    }

    public void setOsTypeName(String osTypeName) {
        this.osTypeName = osTypeName;
    }

    public String getAppCategoryName() {
        return appCategoryName;
    }

    public void setAppCategoryName(String appCategoryName) {
        this.appCategoryName = appCategoryName;
    }

    public String getAppCategoryID() {
        return appCategoryID;
    }

    public void setAppCategoryID(String appCategoryID) {
        this.appCategoryID = appCategoryID;
    }

    public Object getPermissionDetails() {
        return permissionDetails;
    }

    public void setPermissionDetails(Object permissionDetails) {
        this.permissionDetails = permissionDetails;
    }

    public CreationDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(CreationDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public LastModifyDate getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(LastModifyDate lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getPublishState() {
        return publishState;
    }

    public void setPublishState(String publishState) {
        this.publishState = publishState;
    }

    public Object getTargetSDK() {
        return targetSDK;
    }

    public void setTargetSDK(Object targetSDK) {
        this.targetSDK = targetSDK;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Object getMinSDK() {
        return minSDK;
    }

    public void setMinSDK(Object minSDK) {
        this.minSDK = minSDK;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(isDeleted, product.isDeleted) &&
                Objects.equals(osId, product.osId) &&
                Objects.equals(averageRateIndex, product.averageRateIndex) &&
                Objects.equals(bulk, product.bulk) &&
                Objects.equals(numberInstalls, product.numberInstalls) &&
                Objects.equals(downLoadLink, product.downLoadLink) &&
                Objects.equals(iconThumbNail, product.iconThumbNail) &&
                Objects.equals(osTypeId, product.osTypeId) &&
                Objects.equals(osTypeName, product.osTypeName) &&
                Objects.equals(appCategoryName, product.appCategoryName) &&
                Objects.equals(appCategoryID, product.appCategoryID) &&
                Objects.equals(permissionDetails, product.permissionDetails) &&
                Objects.equals(creationDateTime, product.creationDateTime) &&
                Objects.equals(lastModifyDate, product.lastModifyDate) &&
                Objects.equals(versionName, product.versionName) &&
                Objects.equals(publishState, product.publishState) &&
                Objects.equals(targetSDK, product.targetSDK) &&
                Objects.equals(developer, product.developer) &&
                Objects.equals(title, product.title) &&
                Objects.equals(fileSize, product.fileSize) &&
                Objects.equals(deleted, product.deleted) &&
                Objects.equals(packageName, product.packageName) &&
                Objects.equals(minSDK, product.minSDK) &&
                Objects.equals(versionCode, product.versionCode) &&
                Objects.equals(shortDescription, product.shortDescription) &&
                Objects.equals(keyword, product.keyword) &&
                Objects.equals(icon, product.icon) &&
                Objects.equals(id, product.id) &&
                Objects.equals(osName, product.osName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDeleted, osId, averageRateIndex, bulk, numberInstalls, downLoadLink, iconThumbNail, osTypeId, osTypeName, appCategoryName, appCategoryID, permissionDetails, creationDateTime, lastModifyDate, versionName, publishState, targetSDK, developer, title, fileSize, deleted, packageName, minSDK, versionCode, shortDescription, keyword, icon, id, osName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "isDeleted=" + isDeleted +
                ", osId=" + osId +
                ", averageRateIndex=" + averageRateIndex +
                ", bulk=" + bulk +
                ", numberInstalls=" + numberInstalls +
                ", downLoadLink='" + downLoadLink + '\'' +
                ", iconThumbNail='" + iconThumbNail + '\'' +
                ", osTypeId=" + osTypeId +
                ", osTypeName='" + osTypeName + '\'' +
                ", appCategoryName='" + appCategoryName + '\'' +
                ", appCategoryID='" + appCategoryID + '\'' +
                ", permissionDetails=" + permissionDetails +
                ", creationDateTime=" + creationDateTime +
                ", lastModifyDate=" + lastModifyDate +
                ", versionName='" + versionName + '\'' +
                ", publishState='" + publishState + '\'' +
                ", targetSDK=" + targetSDK +
                ", developer='" + developer + '\'' +
                ", title='" + title + '\'' +
                ", fileSize=" + fileSize +
                ", deleted=" + deleted +
                ", packageName='" + packageName + '\'' +
                ", minSDK=" + minSDK +
                ", versionCode='" + versionCode + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", keyword=" + keyword +
                ", icon='" + icon + '\'' +
                ", id=" + id +
                ", osName='" + osName + '\'' +
                '}';
    }
}
