package com.ln.model;

public class dwgl {
    private Integer bh;

    private String dwmc;

    private Integer sjdw;

    private Integer wzh;

    private Integer lft;

    private Integer rgt;

    private Byte scbz;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc == null ? null : dwmc.trim();
    }

    public Integer getSjdw() {
        return sjdw;
    }

    public void setSjdw(Integer sjdw) {
        this.sjdw = sjdw;
    }

    public Integer getWzh() {
        return wzh;
    }

    public void setWzh(Integer wzh) {
        this.wzh = wzh;
    }

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getRgt() {
        return rgt;
    }

    public void setRgt(Integer rgt) {
        this.rgt = rgt;
    }

    public Byte getScbz() {
        return scbz;
    }

    public void setScbz(Byte scbz) {
        this.scbz = scbz;
    }
}