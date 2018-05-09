package com.example.demo.controller.deslk;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseController {
    @Autowired
    protected HttpSession session;

    protected Pageable wrapPageable() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new PageRequest(
                ServletRequestUtils.getIntParameter(request, "pn", 1) - 1,
                ServletRequestUtils.getIntParameter(request, "pageSize", 5)
        );
    }
    protected Pageable WallwrapPageable() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new PageRequest(
                ServletRequestUtils.getIntParameter(request, "pn", 1) - 1,
                ServletRequestUtils.getIntParameter(request, "pageSize", 9)
        );
    }
    protected Pageable wrapPageable(Integer pn, Integer pageSize) {
        return new PageRequest(
                pn == null || pn == 0 ? 0 : pn - 1,
                pageSize == null || pageSize == 0 ? 10 : pageSize
        );
    }

    /**
     * @param pn       当前页
     * @param pageSize 分页数
     * @param sort     0-asc;1-desc
     * @param filter
     * @return
     */
    protected Pageable wrapPageable(Integer pn, Integer pageSize, Integer sort, String filter) {
        return new PageRequest(
                pn == null || pn == 0 ? 0 : pn - 1,
                pageSize == null || pageSize == 0 ? 10 : pageSize,
                new Sort(
                        sort == null || sort == 0 ? Sort.Direction.ASC : Sort.Direction.DESC,
                        StringUtils.isBlank(filter) ? "id" : filter
                )
        );
    }

    protected String getSuffix(String name) {
        int pos = name.lastIndexOf(".");
        return name.substring(pos);
    }
}


