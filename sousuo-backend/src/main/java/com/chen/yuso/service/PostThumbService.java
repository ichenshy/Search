package com.chen.yuso.service;

import com.chen.yuso.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.yuso.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
