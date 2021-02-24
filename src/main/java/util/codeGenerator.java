package util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

public class codeGenerator {

    @Test
    public void run(){



        //1.创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //2.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath="src/main/java");
        gc.setAuthor("Joey");
        gc.setOpen(false); // 生成后是否打开资源管理器
        gc.setFileOverride(false); // 重新生成文件覆盖
        gc.setServiceName("%sService"); // 去掉service接口的首字母
        gc.setIdType(IdType.ASSIGN_UUID); // 主键策略
        gc.setDateType(DateType.ONLY_DATE); // 定义生成的实体类中日期类型
        gc.setSwagger2(true); // 开启Swagger2模式

        mpg.setGlobalConfig(gc);


        // 3.数据源配置

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/newbee");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4. 包配置

        PackageConfig pc = new PackageConfig();
        pc.setModuleName("example");
        pc.setParent("com");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);


        // 5. 策略配置

        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("tb_newbee_mall_goods_category");

        strategy.setNaming(NamingStrategy.underline_to_camel);// 数据库表映射到实体的命名策略
        strategy.setTablePrefix(pc.getModuleName()+ "_");// 生成实体时去掉表前缀
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);// lombok 模型 @ Accessors(chain =true) setter 链式操作
        strategy.setRestControllerStyle(true); // restful api 风格控制器
        strategy.setControllerMappingHyphenStyle(true);// url 中驼峰转连字符


        mpg.setStrategy(strategy);

        // 6. 执行

        mpg.execute();
    }
}
