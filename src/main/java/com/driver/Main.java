package com.driver;

public class Main {
    public static void main(String[] args)
    {
        A ob = new B();
        ob.meth();
    }
  
}

class A
{
    public String meth()
    {
        return "Invoking method from class A";
    }
}

class B extends A
{
    public String meth()
    {
        return "Method is overridden in Extended class B";
    }
}
