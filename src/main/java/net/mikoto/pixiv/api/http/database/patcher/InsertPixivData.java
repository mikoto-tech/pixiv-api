package net.mikoto.pixiv.api.http.database.patcher;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApi;
import net.mikoto.pixiv.api.annotation.HttpApiParameter;
import net.mikoto.pixiv.api.annotation.HttpApiParentNode;
import net.mikoto.pixiv.api.annotation.HttpApiPath;
import net.mikoto.pixiv.api.http.database.Patcher;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static net.mikoto.pixiv.api.http.HttpApi.DATABASE_PATCHER_INSERT_PIXIV_DATA;

/**
 * @author mikoto
 * @date 2022/3/12 11:34
 */
@HttpApiPath(
        value = DATABASE_PATCHER_INSERT_PIXIV_DATA,
        method = RequestMethod.POST
)
@HttpApiParentNode(Patcher.class)
public interface InsertPixivData {
    /**
     * Insert a pixiv data object.
     *
     * @param request  A http servlet request object.
     * @param response A http servlet response object.
     * @param token    The token of Pixiv-Patcher.
     * @return Result.
     */
    @HttpApi
    JSONObject insertPixivDataHttpApi(HttpServletRequest request,
                                      HttpServletResponse response,
                                      @RequestParam @HttpApiParameter("token") String token);
}
