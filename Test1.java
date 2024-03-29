/*
牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
例如:s = AGGTCTA
序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。

输入描述:
输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 2000),其中只包含'A','C','G','T'这四种字符。


输出描述:
输出一个正整数,即最短没有出现在DNA序列s中的DNA片段的长度。
示例1
输入
AGGTCTA

输出
2
*/
package bishi0609;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String str = "";
        int a = 0;
        for(int i=0;i<s.length()-n;i++){
            int count = judgeStr(s.substring(i,i+n),a,n);
            if(count >a ){
                a = count;
                str = s.substring(i,i+n);
            }
        }
        System.out.println(str);
    }

    public static int judgeStr(String s,int a,int n){
        int count = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == 'C' || s.charAt(i) == 'G'){
                count ++;
            }
        }
        if(a <count){
            return count;
        }
        return 0;
    }
}
