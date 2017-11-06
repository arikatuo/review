package com.hy.Factory_Method;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class ExportStandardPdfFile implements ExportFile {

    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("导出标准PDF文件");
        return true;
    }
}
