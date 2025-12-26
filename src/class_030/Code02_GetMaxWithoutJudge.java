package class_030;

/**
 * @author Licyh
 * @version: 1.0
 * @since 2025/12/17 - 12 - 17 - 10:57
 * Description: class_030
 */
// 不用任何判断语句和比较操作，返回两个数的最大值
// 测试链接 : https://www.nowcoder.com/practice/d2707eaf98124f1e8f1d9c18ad487f76
public class Code02_GetMaxWithoutJudge {
    // 必须保证n一定是0或者1
    // 0变1，1变0
    public static int filp(int n){
        return n ^ 1;
    }

    // 正数返回1
    // 负数返回0
    public static int sign(int n){
        return filp(n >>> 31);
    }

    //有溢出风险
    public static int getMax1(int a,int b){
        int c = a - b;
        // c正数，returnA -> 1
        // c正数，returnB -> 0
        // c负数，returnA -> 0
        // c负数，returnB -> 1
        int returnA = sign(c);
        int returnB = filp(returnA);

        return a * returnA + b * returnB;
    }

    //无任何风险
    public static int getMax2(int a,int b){
        //c可能是溢出的
        int c = a - b;
        // a的符号
        int sa = sign(a);
        // b的符号
        int sb = sign(b);
        // c的符号
        int sc = sign(c);
        // 判断A和B，符号是不是不一样，不一样1，一样0
        int diffAB = sa ^ sb;
        //与diffAB相反的符号
        int sameAB = filp(diffAB);
        int returnA = diffAB * sa + sameAB * sc;
        int returnB = filp(returnA);

        return a * returnA + b * returnB;
    }
}
