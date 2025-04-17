//package org.example.controller;
//
//import jakarta.servlet.http.HttpSession;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
///**
// * 在引入了Spring Security的场景启动器后，
// * 默认情况下所有的请求都将被Spring Security接管，
// * 都需要认证（登录）后才可以访问。
// */
//@RestController
//public class HelloController {
//
//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello Spring Security!";
//    }
//
//    /**
//     * 我们可以编写一个接口，来查看 Session 中存储的 Security 上下文：
//     */
//    @RequestMapping("/showAuthentication")
//    public SecurityContext showAuthentication(HttpSession session) {
//        // 获取 session 中存储的 Security 上下文
//        SecurityContext loginUser = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
//        System.out.println(loginUser);
//
//        return loginUser;
//    }
//}