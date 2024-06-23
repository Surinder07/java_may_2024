package june18.encap;

import java.util.List;

public class ExcelDemo {

     private String name;

    public void setName(String name) {
        this.name = name;
    }

    public ExcelDemo(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {


        ExcelDemo excelDemo = new ExcelDemo("Test");
        //excelDemo.show();
       // excelDemo.name = "";
        excelDemo.setName(" pragra ");

    }
}