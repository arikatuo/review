package com.hy.Factory_Method;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class ExportStandardHtmlFile implements ExportFile{

    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("导出标准HTML文件");
        return true;
    }
}
