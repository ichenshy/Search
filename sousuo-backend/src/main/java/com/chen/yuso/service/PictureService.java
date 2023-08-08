package com.chen.yuso.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.yuso.model.entity.Picture;

/**
 * 图片服务
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
