package com.wztlink1013.datastructure.java.times;

/**
 * fun：时间复杂度
 * 通过递归了解算法优劣
 * 试一些代码时间复杂度
 */
public class Main {

    // 递归：O(2^n)
    public static int fib1(int n) {
        if (n <= 1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    // for循环：O(n)
    public static int fib2(int n) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
    // 首尾法
    public static int fib3(int n) {
        if (n <= 1) return n;

        int first = 0;
        int second = 1;
        while (n-- > 1) {
            second += first;
            first = second - first;
        }
        return second;
    }
    // 特征方程解法：O（1）
    public static int fib4(int n) {
        double c = Math.sqrt(5);
        return (int) (Math.pow((1+c) / 2, n) - Math.pow((1-c) / 2, c));
    }
    // 主函数
    public static void main(String[] args) {
        int n = 45;

        // 测试耗费时间
		Times.test("fib1：递归", new Times.Task() {
			public void execute() {
				System.out.println(fib1(n));
			}
		});
		Times.test("fib2：for循环", new Times.Task() {
			public void execute() {
				System.out.println(fib2(n));
			}
		});
        Times.test("fib3：首位法", new Times.Task() {
            public void execute() {
                System.out.println(fib3(n));
            }
        });
        Times.test("fib4：线性代数 特征方程", new Times.Task() {
            public void execute() {
                System.out.println(fib4(n));
            }
        });
    }

    /**
     * 作用：以下权威测试时间复杂度代码
     *
     */
    public static void test1(int n) {
        // 汇编指令

        // 1
        if (n > 10) {
            System.out.println("n > 10");
        } else if (n > 5) { // 2
            System.out.println("n > 5");
        } else {
            System.out.println("n <= 5");
        }

        // 1 + 4 + 4 + 4
        for (int i = 0; i < 4; i++) {
            System.out.println("test");
        }

        // 140000
        // 时间复杂度：O(1)
        // 空间复杂度：O(1)
    }

    public static void test2(int n) {
        // O(n)
        // 1 + 3n
        for (int i = 0; i < n; i++) {
            System.out.println("test");
        }
    }

    public static void test3(int n) {
        // 1 + 2n + n * (1 + 3n)
        // 1 + 2n + n + 3n^2
        // 3n^2 + 3n + 1
        // O(n^2)

        // O(n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test4(int n) {
        // 1 + 2n + n * (1 + 45)
        // 1 + 2n + 46n
        // 48n + 1
        // O(n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test5(int n) {
        // 8 = 2^3
        // 16 = 2^4

        // 3 = log2(8)
        // 4 = log2(16)

        // 执行次数 = log2(n)
        // O(logn)
        while ((n = n / 2) > 0) {
            System.out.println("test");
        }
    }

    public static void test6(int n) {
        // log5(n)
        // O(logn)
        while ((n = n / 5) > 0) {
            System.out.println("test");
        }
    }

    public static void test7(int n) {
        // 1 + 2*log2(n) + log2(n) * (1 + 3n)

        // 1 + 3*log2(n) + 2 * nlog2(n)
        // O(nlogn)
        for (int i = 1; i < n; i = i * 2) {
            // 1 + 3n
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test10(int n) {
        // 空间复杂度：O(n)
        int a = 10;
        int b = 20;
        int c = a + b;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + c);
        }
    }
}

