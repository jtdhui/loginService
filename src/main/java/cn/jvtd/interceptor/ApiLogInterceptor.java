package cn.jvtd.interceptor;

import cn.jvtd.common.ResultBean;
import cn.jvtd.common.ResultConstant;
import cn.jvtd.domain.SysUser;
import cn.jvtd.util.TokenClientUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.google.gson.Gson;
@Component
public class ApiLogInterceptor implements HandlerInterceptor {
	private Logger logger = Logger.getLogger(ApiLogInterceptor.class);

    @Autowired
    TokenClientUtil tokenClientUtil;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String path = request.getRequestURI();
		if (path.equals(request.getContextPath() + "/")) {
			response.sendRedirect(request.getContextPath() + "/index.jsp");
			return true;
		}
		if (path.endsWith("/userLogin") || path.endsWith("userLogin.action") || path.endsWith("logout.action")) {
			return true;
		}

		// 移动端入口校验
		if (path.startsWith(request.getContextPath() + "/api")) {
			try {
				String token = request.getHeader("userToken");
				if (StringUtils.isNotBlank(token)) {
					SysUser sysUser=tokenClientUtil.getUserByToken(token);
					if (sysUser != null) {
					    int expireInterval = 7 * 24 * 60 * 60 * 1000;// 过期时间7天
						tokenClientUtil.refreshToken(token, expireInterval,sysUser);
						return true;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				ResultBean resultBean = new ResultBean(ResultConstant.SYSTEM_EXCEPTION, e.getMessage());
				responseMessage(response, resultBean);
				return false;
			}
			responseMessage(response);
			return false;
		}
		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

	/**
	 * 获取登录用户远程主机ip地址
	 *
	 * @param request
	 * @return
	 */
	private String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.indexOf(",") > 0) {
			ip = ip.split(",")[0];
		}
		return ip;
	}

	/**
	 * 请求不通过，返回错误信息给客户端
	 *
	 * @param response
	 */
	private void responseMessage(HttpServletResponse response) throws IOException {
		ResultBean resultBean = new ResultBean(ResultConstant.UNAUTHORIZED, "用户信息失效，请重新登录！");
		responseMessage(response, resultBean);
	}

	private void responseMessage(HttpServletResponse response, ResultBean resultBean) throws IOException {
		response.setContentType("application/json; charset=utf-8");
		PrintWriter writer = response.getWriter();
		Gson gson = new Gson();
		writer.print(gson.toJson(resultBean));
		writer.flush();
		writer.close();
	}

}