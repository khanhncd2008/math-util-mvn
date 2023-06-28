/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khanh.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.khanh.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtilityAdvancedTest {
    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT ỒI FILL VÀO HÀM
    //DDT
    //hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    //mảng chứa các cặp n -> expected, ví dụ 0! -> 1; 1! -> 1; 5 -> 120
    public static Object[][] initTestData(){
        
        Object [][] testData = {{0, 1},
                                {1, 1}, 
                                {2, 2}, 
                                {5, 120}, 
                                {6, 7200}
        };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
                //tham số hóa việc đưa test data vào hàm assertE()
                // biến đổi dữ liệu thành tham số cho tổng quát
                //PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
        
    }
}

//TDD vs. DDT
//TDD - Test Driven Development
//Kĩ thuật viết code chính đan xen, xen kĩ cùng với viết Test Case/ Testing
//Script, tức là quá trình viết code làm app ta viết luôn những đoạn code 
//(dùng thư viện Unit Test như JUnit, TestNG, xUnit, MSTest
//dùng để test hàm t avuwfa viết

//Viết code và viết code test cùng với nhau thì gọi là
//kĩ thuật lập trình hướng veef kiểm thử - TDD

//DDT - Data Driven Testing
//là kĩ thuật bổ trợ/mở rộng thêm cho kĩ thuật TDD
//là kĩ thuật viết test code mà ta tách riêng những bộ data test
//ra 1 chỗ, câu lệnh so sánh ra 1 chỗ
//kết nối, map/fill test data vào hàm test thông qua các tham số
//{6, 720} -> fill vào 2 biến n, expected và lát hồi 2 biến này
//đc fill vào tiếp cái hàm assertEquals(expectef, getF(n))

//Data đcc tách riêng ra, biến thành tham số cho hàm kiểm thử
//kĩ thuật này đc gọi là tách data hướng cho việc kiểm thử
//DDT
//Còn gọi là 1 tên khác Parameterized testing
//kĩ thuật kiểm thử code mà hướng về tham số hóa các data test
