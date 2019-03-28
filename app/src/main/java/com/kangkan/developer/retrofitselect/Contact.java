package com.kangkan.developer.retrofitselect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("s_id")
    @Expose
    private String sId;
    @SerializedName("s_roll")
    @Expose
    private String sRoll;
    @SerializedName("s_name")
    @Expose
    private String sName;
    @SerializedName("s_reg")
    @Expose
    private String sReg;
    @SerializedName("institute")
    @Expose
    private String institute;
    @SerializedName("211")
    @Expose
    private String _211;
    @SerializedName("212")
    @Expose
    private String _212;
    @SerializedName("213")
    @Expose
    private String _213;
    @SerializedName("214")
    @Expose
    private String _214;
    @SerializedName("215")
    @Expose
    private String _215;

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSRoll() {
        return sRoll;
    }

    public void setSRoll(String sRoll) {
        this.sRoll = sRoll;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSReg() {
        return sReg;
    }

    public void setSReg(String sReg) {
        this.sReg = sReg;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String get211() {
        return _211;
    }

    public void set211(String _211) {
        this._211 = _211;
    }

    public String get212() {
        return _212;
    }

    public void set212(String _212) {
        this._212 = _212;
    }

    public String get213() {
        return _213;
    }

    public void set213(String _213) {
        this._213 = _213;
    }

    public String get214() {
        return _214;
    }

    public void set214(String _214) {
        this._214 = _214;
    }

    public String get215() {
        return _215;
    }

    public void set215(String _215) {
        this._215 = _215;
    }

}