package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class approveTest {

    @Test
    void isDirectS() {
        boolean actual= true;
        boolean expected= true;
        approve one= new approve(true,false,true,1);
        assertEquals(actual,expected);
    }

    @Test
    void setDirectS() {
//        boolean actuak=

    }

    @Test
    void isDepartmentH() {
        boolean actual= true;
        boolean expected= true;
        approve one= new approve(true,false,true,1);
        expected=one.isDirectS();
        assertEquals(actual,expected);
    }

    @Test
    void setDepartmentH() {

    }

    @Test
    void isBenCO() {
        boolean actual= true;
        boolean expected= true;
        approve one= new approve(true,false,true,1);
        expected=one.isBenCO();
        assertEquals(actual,expected);
    }

    @Test
    void setBenCO() {
    }

    @Test
    void getRequestFK() {
        int actual= 1;
        int expected= 0;
        approve one= new approve(true,false,true,1);
       expected= one.getRequestFK();
        assertEquals(actual,expected);
    }

    @Test
    void setRequestFK() {
    }
}