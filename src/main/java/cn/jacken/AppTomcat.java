package cn.jacken;

import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * 纯手写  springboot启动 实现springmvc的功能
 *
 * src/main
 */
public class AppTomcat {

    public static void main(String[] args) throws Exception {
        start();
    }

    private static void start() throws  Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        //读取项目路径
        StandardContext context = (StandardContext)tomcat.addWebapp("/", new File("src/main").getAbsolutePath());
        //禁止重新载入
        context.setReloadable(false);
        //class 文件读取地址
        File file = new File("target/classes");
        //创建webroot
        WebResourceRoot standardRoot = new StandardRoot(context);
        //tomcat内部读取class执行
        standardRoot.addPreResources(new DirResourceSet(standardRoot,"/WEB-INF/classes",file.getAbsolutePath(),"/"));
        tomcat.start();
        tomcat.getServer().await();
    }
}
