package org.example;

public class Department {
    private String departmentName;
    private Company company;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Department(String departmentName, Company company) {
        this.departmentName = departmentName;
        this.company = company;

    }
}
