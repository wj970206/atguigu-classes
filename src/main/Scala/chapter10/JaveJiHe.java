package chapter10;

import org.omg.Messaging.SyncScopeHelper;

import java.nio.file.FileSystemNotFoundException;

/**
 * @Auther:weijian
 * @Date:2021/10/16-10-16-11:17
 * @Description:chapter10
 * @version:1.0
 */
public class JaveJiHe {
    public static void main(String[] args) {
        int[] i=new int[3];
        i[0]=1;
        i[0]=1;
        i[0]=1;
        //System.out.println(i);
        for(int j=0;j<=2;j++){
            System.out.println(i[j]);
        }

        String[] names=new String[3];
        names[0]="zhangsan";
        names[1]="lisi";
        names[2]="wangwu";
        for(String j:names){
            System.out.println(j);
        }
    }
}
