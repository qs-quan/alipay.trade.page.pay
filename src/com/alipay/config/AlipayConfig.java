package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116666942";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCthbyEErS1CVyHtX1Bt73UQebeLy0hGYkEfGaDeOyvwJjxHf5Hx2w8hgG1eFC15u6M0U5RpStQ2hv6OQkAbBucB7Lr+BZcWg5PYIJsWubWOdz5k7aDuybSbElMJhX6a5omyJjTksCjjiz5NHQuTqsid1lGnNR8gCZwfEq2Sem5Ez0XFHREo3/OLkbiNoW/lKr2rHIJ+W06t/jC5GImnO86bY2d4S4NTWKVz+qVR8s0adu1HJdY847LtbVbXLzj6mX1e2jORTQkwTXAJMdZJmMXSNkeyRo/MLw/7nor+P0PfkA9OpQGoMFe3hvxXi4ORICju0Z3b5rrBEfxczFKPMxFAgMBAAECggEBAKViJMYAiilODdnumb6MIKpwUVmMv0ef7d7Prmk6VORB/cM54gSJxth8pJ5QWSS2QMEIMMxST1GVQDsiJzk20K3LDLYo0y8cSi1Pf59EmGSv67QYHEm7k4nU2ZtxZVszOU4jvL1STrbUKHswilckdam49Ob/TOqIvZpSbGcHVXMll8XQ/9NuJlkbJ//gYa6VLrFaBo0DIHKniTGDeYARrPlw/m841itdrlr/BgdlS7q+FADOCPrWrls+306w4CraQsYDXl7Sbfz4pSmfbwoFpeyp1Kk77xO8OgJwc1fmEY2TMYiPNiGvwxr/hTNBEVSg1r69c4FET0H59pUqdlbNx5UCgYEA3TAfaroVHMouOUNk4XMWN4PUB/7x7Z8BBGDGCjExoo0aaXfvdqrZE61wvCHVc9NZiidRA3rNFlwF19WPiJHzLuxkOGIOXMmhDXxfSjO2jSpybp3d2TXMLXpEkKrZuLYr2Rjf5I0bPKEO/tVCCeQh3VCdR0XTIieAdiTTdJ5OBrMCgYEAyNUfK6m4gdjXenVDbqvJecMZCeK6CEAtJ2NTJ+X2l7G0xCdsMS5IL4s0b0xz8G9KSJ2efNOyUwjKe3pRKXf6EatF3mAjES3TxCOaw57zzy2IP+Am0spWV2AESqChD/KpVH/Q1g24mRp4zdwFkJLEdns+et+HWKbBXxq0/lPKnScCgYEAnvux+UKbXkAsjVhVsH7KX0jQJJcpSYTadE0iy7ykUpRdgaWFZ6RRt4UY3QDsrf4iA91Sq8+ejg3C3WpRavaM9xNOzgAdFrCOpGTbETiuZDU4Xy31geTbR2z0z48eQ1gdmEP62gpao2+Yma6rcvSZKryA7/POWGRQP5skqlQG/WUCgYAkvgkD3fspllhlyQpbNwaXRkBQdLCATe105VETXZkty488y9GZddQzDo67Rgt4E4RNoLicMcbQNi2FRa2PnqmbjfAsbP49aFrz6WepHm2Qm83vkbzIl8gQGDrwxE5zMnwUP4Yfg0cgi51KXFSQTKmw239kz3xdlbSPB73RQdcxxQKBgCDkWf1EVQT+mDlk0rt1SpA6mB+0IP181Rj6yNqTXDPcHiC7tNJiHV60rcytQkYgURH8KyKjr4lrbgZNKB4lmsxbxf7/A9BAhQ9gtDd+TfGGPpYLKS9yg778waC6oSlEOmfqOGaD+VLFYVUWCpKHHqyxRYS+TLPLj1q6g2mXT1vR";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlntBLGbtFfKdi2BaTkaUlqK2WHFDh4y1vvc5347sDvWHWu3xVNMsdzf7gD+hZJDSytFcEKmKFLEp7lgZJmurzlkWY6yeSfKUMwiG4jN+0sgpPEUvJk7wJTMwbY7Z6N8FXt4WsgfvhzEE1kcOzXWaLGorPkr/gg1deXQ0iow41Qy4zmIrE7HQCV9OUhrfJISBz4XzesHc6Qunp1vO9G9UraIU6xI90THAYbDsl9NifrzfQXHcGVrx1HUF8IM+SVmXcsSN/BG1WUD5dwM8JWMaWRiKE4Al7/vIuPjzft/b+n7WJK4ELuAFWYGC+KfWFJXdGF8Ih5Nk42N0OX0T4cYQfwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://wurta3.natappfree.cc/alipay.trade.page.pay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://wurta3.natappfree.cc/alipay.trade.page.pay/return_url.jsp";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关(正式环境)
//	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    // 支付宝网关(沙箱环境)
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 支付宝网关vv
    public static String log_path = "C:\\logs";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

