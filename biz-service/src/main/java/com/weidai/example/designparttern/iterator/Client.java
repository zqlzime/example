package com.weidai.example.designparttern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/2/18.
 */
public class Client {

    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        //collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
