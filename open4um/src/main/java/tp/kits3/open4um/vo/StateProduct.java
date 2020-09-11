package tp.kits3.open4um.vo;

public class StateProduct {

    private Integer stateid;

    private String statename;

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    // Stateproduct 모델 복사
    public void CopyData(StateProduct param)
    {
        this.stateid = param.getStateid();
        this.statename = param.getStatename();
    }
}