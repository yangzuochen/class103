package cn.itcast;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String email;
    private String deptName;
    private String companyName;


    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", deptName='" + deptName + '\'' + ", companyName='" + companyName + '\'' + '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
