package models;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class loginTest {
    @Test
    public void test() throws Throwable{
        int a=1+2;
        assertEquals(3,a);
        assertTrue(a==3);
    }
    @Test
    void getUsername() {
        login a= new login(1,"this","thos");
        String b;
        b=a.getUsername();
//        System.out.println(a.getUsername());
        assertEquals(b,"this");
//        assertTrue(a== this);

    }

    @Test
    void getPassword() {
        login a= new login(1,"this","passw");
        String b;
        b=a.getPassword();
//        System.out.println(a.getUsername());
        assertEquals(b,"passw");
//        assertTrue(a== this);
    }
}