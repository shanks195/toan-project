package tp.kits3.open4um.vo;

import java.sql.Timestamp;

public class Report {

    private Integer reportid;

    private String reportname;

    private Integer userid;

    private Integer productid;

    private Timestamp reportdate;

    private Integer cmtid;

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Timestamp getReportdate() {
        return reportdate;
    }

    public void setReportdate(Timestamp reportdate) {
        this.reportdate = reportdate;
    }

    public Integer getCmtid() {
        return cmtid;
    }

    public void setCmtid(Integer cmtid) {
        this.cmtid = cmtid;
    }

    // Report 모델 복사
    public void CopyData(Report param)
    {
        this.reportid = param.getReportid();
        this.reportname = param.getReportname();
        this.userid = param.getUserid();
        this.productid = param.getProductid();
        this.reportdate = param.getReportdate();
        this.cmtid = param.getCmtid();
    }
}