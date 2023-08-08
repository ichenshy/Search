package com.chen.yuso.controller;

import com.chen.yuso.common.BaseResponse;
import com.chen.yuso.common.ResultUtils;
import com.chen.yuso.model.vo.SearchVO;
import com.chen.yuso.service.PictureService;
import com.chen.yuso.service.PostService;
import com.chen.yuso.service.UserService;
import com.chen.yuso.manager.SearchFacade;
import com.chen.yuso.model.dto.search.SearchRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}
