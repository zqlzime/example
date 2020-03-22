package com.weidai.example.designparttern.responsibilitychain;

/**
 * Created by Administrator on 2020/2/19.
 */
public class Client {

    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,31000,1);
        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("彤院长");

        //需要将各个级别的下一个设置好(处理人构成环装)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
