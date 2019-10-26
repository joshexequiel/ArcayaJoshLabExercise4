package com.arcaya.arcaya_josh_labexercise4;

public class TopCompanies {

    private int logo;
    private String compName,compCountry,compCEO,compIndustry,compDesc;

    public TopCompanies(int logo, String compName, String compCountry, String compCEO, String compIndustry, String compDesc) {
        this.logo = logo;
        this.compName = compName;
        this.compCountry = compCountry;
        this.compCEO = compCEO;
        this.compIndustry = compIndustry;
        this.compDesc = compDesc;
    }

    public int getLogo() {
        return logo;
    }

    public String getCompName() {
        return compName;
    }

    public String getCompCountry() {
        return compCountry;
    }

    public String getCompCEO() {
        return compCEO;
    }

    public String getCompIndustry() {
        return compIndustry;
    }

}
