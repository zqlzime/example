package com.weidai.example.designparttern.responsibilitychain;

/**
 * Created by Administrator on 2020/2/19.
 */
public class SchoolMasterApprover extends Approver  {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() >30000) {
            System.out.println("编号id="+request.getId()+",被"+this.name+"处理");
        } else {
            approver.processRequest(request);
        }
    }
}
