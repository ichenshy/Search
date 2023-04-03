package com.yupi.yuso.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * SQL 工具
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
public class SqlUtils {

    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}
