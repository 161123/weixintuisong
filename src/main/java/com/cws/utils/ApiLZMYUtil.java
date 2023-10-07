package com.cws.utils;
/**
 * <h3>weather-push</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2023-10-07 15:28
 **/

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cws.configure.PushConfigure;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * <h3>weather-push</h3>
 * <p></p>
 * @author : 头上有犄角
 * @date : 2023-10-07 15:28
 **/
public class ApiLZMYUtil {
    public static String getInspirationalOldSaying() {
        String httpUrl = "https://apis.tianapi.com/lzmy/index?key=" + PushConfigure.getRainbowKey();
        BufferedReader reader = null;
        String result = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                stringBuilder.append(strRead);
                stringBuilder.append("\r\n");
            }
            reader.close();
            result = stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        if (jsonObject == null) {
            return "";
        }
        JSONArray newslist = jsonObject.getJSONArray("newslist");
        return newslist.getJSONObject(0).getString("saying");
    }



}
