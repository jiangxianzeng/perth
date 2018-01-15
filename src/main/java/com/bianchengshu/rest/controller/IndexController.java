package com.bianchengshu.rest.controller;

import com.bianchengshu.core.result.Result;
import com.bianchengshu.core.result.ResultEnum;
import com.bianchengshu.core.result.ResultUtil;
import com.bianchengshu.rest.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangxianzeng on 18/1/12.
 */

@RestController
public class IndexController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/api", method = RequestMethod.GET)
    public Result getIndex() {
        //public ResponseEntity<?> discover() {
        Object userAge = userService.getUserAgeByName("123");

        logger.info("start..... api.......");

        Result result = ResultUtil.success(userAge);

       /* int i = 1/0;

        try{
            //int i = 1/0;
        } catch (Exception e) {
            throw  new ServiceException(ResultEnum.NET_WORK_ERROR);
        }*/

        return result;

        //Result result = new Result(ResultCode.WEAK_NET_WORK);

        //return new ResponseEntity<Result>(result, HttpStatus.OK);
    }
}
