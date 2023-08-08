package com.chen.yuso.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.yuso.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




