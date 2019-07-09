package com.study.springboot.component;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2019-05-27-21:50
 * @Description :  <br/>
 */


import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 *  可以在连接上携带区域信息
 */
public class MyLocaleResolver implements LocaleResolver {



    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String l = request.getParameter("l");
        Locale locale = Locale.getDefault();

        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            locale = new Locale(split[0], split[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
