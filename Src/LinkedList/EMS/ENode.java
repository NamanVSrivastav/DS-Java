package LinkedList.EMS;

import java.lang.System;

 class ENode {
    String name;
    int id;
    float sal;
    char gender;
    ENode next;

    void print(){
       System.out.print(" Employee Name: "+name+"\n Employee Id: "+id+"\n Employee Salary: "+sal+"\n Employee Gender: "+gender);
    }
    ENode(String name, int id, float sal,char gender){
        this.name=name;
        this.id = id;
        this.sal = sal;
        this.gender = gender;
        this.next=null;
    }

}
