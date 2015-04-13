package com.hopwork.compose.web.controllers.sitemesh;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

@Controller
public class SitemeshController {

    private final OkHttpClient client = new OkHttpClient();

    @Value("${sitemesh.decorator.url}")
    private String decoratorUrl;


    @RequestMapping(value = "/decorators/decorator", method = RequestMethod.GET)
    @ResponseBody
    public Object decorator() throws IOException {
        Request request = new Request.Builder()
                .url(decoratorUrl)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
