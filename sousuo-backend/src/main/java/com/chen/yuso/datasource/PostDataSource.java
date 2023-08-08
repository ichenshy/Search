package com.chen.yuso.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.yuso.model.dto.post.PostQueryRequest;
import com.chen.yuso.model.vo.PostVO;
import com.chen.yuso.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 帖子服务实现
 *
 * @author CSY
 * @version v1.0
 * @date 2023/3/28 18:29
 */
@Service
@Slf4j
public class PostDataSource implements DataSource<PostVO> {

    @Resource
    private PostService postService;

    //    @Override
//    public Page<PostVO> doSearch(String searchText, long pageNum, long pageSize) {
//        PostQueryRequest postQueryRequest = new PostQueryRequest();
//        postQueryRequest.setSearchText(searchText);
//        postQueryRequest.setCurrent(pageNum);
//        postQueryRequest.setPageSize(pageSize);
//        ServletRequestAttributes servletRequestAttributes =  (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = servletRequestAttributes.getRequest();
//        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
//        return postService.getPostVOPage(postPage, request);
//    }
    @Override
    public Page<PostVO> doSearch(String searchText, long pageNum, long pageSize) {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setSearchText(searchText);
        postQueryRequest.setCurrent(pageNum);
        postQueryRequest.setPageSize(pageSize);
        Page<PostVO> postVOPage = postService.listPostVOByPage(postQueryRequest);
        return postVOPage;

    }
}




