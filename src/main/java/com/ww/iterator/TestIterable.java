package com.ww.iterator;

public class TestIterable {

    TestIterable() {
        ScanAppleStore appleTree = new ScanAppleStore();
        System.out.println("采用系统自带迭代器iterator:");
        for (String str : appleTree) {
            System.out.println(str);
        }
        System.out.println("===================");

        System.out.println("采用自己重新迭代器，让相反输出");
        for (String str : appleTree.reverseIterator()) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        TestIterable a = new TestIterable();
    }
}
