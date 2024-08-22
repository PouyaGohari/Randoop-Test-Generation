import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.awt.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestImpl20 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test01");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: document with empty title");
        }catch (ir.ramtung.sts01.LibraryException e){
            org.junit.Assert.assertEquals(e.getMessage(), "document with empty title is not allowed");
        }

        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the reference has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test02");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test03");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s number is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test04");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try{
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: Member is not in a loan");
        }catch (ir.ramtung.sts01.LibraryException e){
            org.junit.Assert.assertEquals(e.getMessage(), "Member is not in a loan");
        }
        library0.addBook("", (int) 'a');
        library0.borrow("hi!", "");
        library0.returnDocument("hi!", "");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test05");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        try{
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: Can not be borrowed");
        }catch (ir.ramtung.sts01.LibraryException e){
            org.junit.Assert.assertEquals(e.getMessage(), "Can not be borrowed");
        }
        library0.timePass(100);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test06");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.returnDocument("", "hi!");
        java.lang.Class<?> wildcardClass5 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test07");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the magazine has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test08");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: the book has already added");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test09");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.addBook("hi", 10);
        library0.addProfMember("asd");

        library0.borrow("asd", "hi");
        try{
            library0.extend("asd", "asd");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: cant extend");
        }catch (ir.ramtung.sts01.LibraryException e){
            org.junit.Assert.assertEquals(e.getMessage(), "cant extend");
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test10");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.addBook("hi", 10);
        library0.addProfMember("asd");
        library0.borrow("asd", "hi");
        library0.timePass(2);
        int expected = library0.getTotalPenalty("asd");
        org.junit.Assert.assertEquals(expected, 0);
        library0.timePass(8);
        org.junit.Assert.assertEquals(expected, 0);
        int days = 25;
        library0.timePass(days);
        expected = library0.getTotalPenalty("asd");
        org.junit.Assert.assertEquals(expected, 7*2000 + 14*3000 + (days - 21)*5000);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test11");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addProfMember("hi!");
        library0.addProfMember("");
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", 0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: magazine`s year is incorrect");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test12");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        int int3 = library0.getTotalPenalty("");
        library0.addBook("", 100);
        int int8 = library0.getTotalPenalty("hi!");
        library0.borrow("", "");
        library0.extend("hi!", "");
        library0.timePass(10);
        library0.addBook("abs", 10);
        library0.addProfMember("abcd");
        library0.borrow("abcd", "abs");
        library0.timePass(2);
        library0.extend("abcd", "abs");
        library0.timePass(2);
        library0.extend("abcd", "abs");
        try{
            library0.extend("abcd", "abs");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.sts01.LibraryException; message: Can not be extended more than two");
        }catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Can not be extended more than two");
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl20.test13");
        ir.ramtung.impl2.Library library0 = new ir.ramtung.impl2.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        library0.borrow("hi!", "hi!");
        library0.addProfMember("hi!");
        library0.borrow("", "");
        org.junit.Assert.assertNotNull(strList1);
    }
}

