import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestImpl10 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test01");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.returnDocument("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "The document is not in member's loan");
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test02");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = library0.getTotalPenalty("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find member");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "Cannot find member");
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test03");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "The document is not in member's loan");
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test04");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "Documents with empty title are not allowed");
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test05");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = library0.getTotalPenalty("hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find member");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "Cannot find member");
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test06");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.addReference("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Documents with empty title are not allowed");
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test07");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Cannot find document to borrow");
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test08");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        library0.addProfMember("hi!");
        library0.addReference("asd", 100);
        library0.borrow("hi!", "asd");
        library0.timePass(5);
        int expected = library0.getTotalPenalty("hi!");
        org.junit.Assert.assertEquals(expected, 0);
        library0.timePass(1);
        expected = library0.getTotalPenalty("hi!");
        org.junit.Assert.assertEquals(expected, 5000);
        java.lang.Class<?> wildcardClass3 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test09");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.addMagazine("", (int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "Documents with empty title are not allowed");
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test10");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "The document is not in member's loan");

        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test11");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.addBook("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Documents with empty title are not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Documents with empty title are not allowed");
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test12");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        library0.addProfMember("hi!");
        library0.addMagazine("see", 2000, 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "see");
            library0.timePass(1);
            library0.extend("hi!", "see");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Can not extend Magazine");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Can not Extend Magazine");
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test13");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        library0.addProfMember("hi!");
        // The following exception was thrown during execution in test generation
        try {
            library0.addStudentMember("810", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Member with the same name exists");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Member with the same name exists");
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test14");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("hi!", "");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "The document is not in member's loan");
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test15");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "Cannot find document to borrow");
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test16");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        // The following exception was thrown during execution in test generation
        try {
            library0.borrow("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot find document to borrow");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Cannot find document to borrow");

            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test17");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.timePass(-100);
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Cannot go back in time");
        } catch (ir.ramtung.sts01.LibraryException e) {
            org.junit.Assert.assertEquals(e.getMessage(), "Cannot go back in time");
            // Expected exception.

        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test18");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        library0.addBook("title1", 100);
        library0.addBook("title2", 200);
        library0.addBook("title3", 300);
        java.util.List<String> titles = library0.availableTitles();
        org.junit.Assert.assertNotNull(titles);
        org.junit.Assert.assertTrue(titles.contains("title1"));
        org.junit.Assert.assertTrue(titles.contains("title2"));
        org.junit.Assert.assertTrue(titles.contains("title3"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test19");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
            org.junit.Assert.assertEquals(e.getMessage(), "Empty member name not allowed");
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test20");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        library0.timePass((int) (byte) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test21");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        library0.addProfMember("hi!");
        library0.timePass(100);
        library0.timePass(0);
        library0.addReference("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addProfMember("");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: Empty member name not allowed");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test22");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        library0.timePass((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.extend("", "hi!");
            org.junit.Assert.fail("Expected exception of type ir.ramtung.impl1.InvalidArgumentEx; message: The document is not in member's loan");
        } catch (ir.ramtung.sts01.LibraryException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestImpl10.test23");
        ir.ramtung.impl1.Library library0 = new ir.ramtung.impl1.Library();
        java.util.List<java.lang.String> strList1 = library0.availableTitles();
        java.lang.Class<?> wildcardClass2 = library0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

