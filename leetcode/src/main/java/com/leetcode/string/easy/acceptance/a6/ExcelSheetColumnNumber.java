package com.leetcode.string.easy.acceptance.a6;
/**
* Given a string columnTitle that represents the column title
* as appear in an Excel sheet, return its corresponding column number.
 * https://leetcode.com/problems/excel-sheet-column-number/
 * */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int degree = 0;
        int sum = 0;
        for (int i = columnTitle.length()-1; i >= 0; i--) {
            sum += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26,  degree++);
        }
        return sum;
    }
}
