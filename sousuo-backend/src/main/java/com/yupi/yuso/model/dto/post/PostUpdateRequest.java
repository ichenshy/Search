package com.yupi.yuso.model.dto.post;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * 更新请求
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
@Data
public class PostUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}