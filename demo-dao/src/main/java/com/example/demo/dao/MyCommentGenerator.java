package com.example.demo.dao;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 增加swagger注释
 * 增加Lombok @Data
 *
 * @author yunsheng
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    private Properties thisProperties;

    public MyCommentGenerator() {
        thisProperties = new Properties();
    }


    @Override
    public void addConfigurationProperties(Properties properties) {
        // 为了使用自定义的属性
        thisProperties.putAll(properties);
        // 继续父类的处理
        super.addConfigurationProperties(properties);
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = thisProperties.getProperty("author");
        String dateFormat = thisProperties.getProperty("dateFormat", "yyyy-MM-dd");
        SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        //1.添加类引用
        topLevelClass.addJavaDocLine("import io.swagger.annotations.ApiModel;");
        topLevelClass.addJavaDocLine("import io.swagger.annotations.ApiModelProperty;");
        topLevelClass.addJavaDocLine("import lombok.Data;");

        //2.添加类注释
        String remarks = introspectedTable.getRemarks();
        String entityName = introspectedTable.getFullyQualifiedTable().getDomainObjectName();

        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * " + entityName);
        topLevelClass.addJavaDocLine(" * " + remarks);
        topLevelClass.addJavaDocLine(" * @Author: " + author);
        topLevelClass.addJavaDocLine(" * @Date: " + dateFormatter.format(new Date()));
        topLevelClass.addJavaDocLine(" */");
        topLevelClass.addJavaDocLine("@Data");
        topLevelClass.addJavaDocLine(String.format("@ApiModel(value =\"%s\", description=\"%s\")", entityName, remarks));
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        field.addJavaDocLine(String.format("@ApiModelProperty(value = \"%s\")", remarks));
    }
}
