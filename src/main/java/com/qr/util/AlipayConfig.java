package com.qr.util;

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
	public static String app_id = "2016110200785538";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCPRaR7fCMVR+Rk+P20k9br/dkq8iskeDcYPx2fmD2auvtUGcZNU9yZtEZlDbvtzV2LlxzKowq13qltRG8MdHh574XGimQQGLj6O516/0wPlBxYYwwV+psrCxq5bNk/6dVjbI9DKgwdafYRuLOn+MHURyRno6kyKYW2824v6JUSlJIDVoJGvdaQPkKJtGJrtLY1oBxinJN546QR1GGlxd3o2jjXNgkP4Sd3Smlh6lmaiRu2gl0Z9AA98OaTVUvR+sZSJXxvo3g/bFk8sxjZr8HSLVBXMgrtZ+1rhnfmmlOeo1Y7lwXjTMwjaaD1FeQIc484Xqw7aNMgwwAdLDUmyKgxAgMBAAECggEAGbjRHPJeghWUJaSmN+NK9LdwY8tyf2utyIacVOjKNptXP/QYrA1gT6AT+1SJ5tm177fDjYXUCG7fUCS3Iy9N6eZcyBZUfKdTnmlRjqGDEFDw/dVaeB+z9/hYZe3q2xSqIN1+ovpLjoRVjzzv1DpO4kObf5fcaosV3JC7uZIyIVGQeIXevxlF3vJavvMORrxKsBvn9OKpSCz6KHJhsuq1FyyXesUv2eQzQvG0sJ+i8iuXLV34ha2xzwkTVdpC/2XwI+89my+QNf8gE9rGv6YF3YGT1KKUDxi+sHvY1MtYDmE/qVT+VGnSgBdV+Z3xKZGT9/YVz8nwnBzB6xmiZRPngQKBgQDxykCnrZ63WB2cTd5yDdLJj/tfvg8ch9tfd7fcnjw1AcFFZ0nTxkFL+a5Nj6BTKOxeQh+XQceixS4ptwlZuvL++FsYGwJqtdexpQhymvSMjbhIfy5GjtpWNVEejDt1EJK2Fi4fDNpJPVAdMz0RIC0fIwusNPA5tE0yVwy9oah9qQKBgQCXsS4QcuovtOycocvRFXX5x6jTbXLqrX19npTsTmpI/23sAo3w0JBiaAx5ET+iaBIdYoUFju63GOCf5xjiQgDIZduXJaaXqg62lXjl/E9udObWXMVOwTpk7Mlb8zE0EX76sEvMIdsaHbc2Xc6q+JPGQOG8JO/oy1ZMUbq9ehwbSQKBgBkZSJrfT/FySSiXgLbQLohT1OE8Zm8svx3q3IAfQNqzwu9EaIp+MvsDAQ/2D8tyHQ8vx/24i1OfKkqUQHk7Ccxj1XjsHNUc6TX8jqLu6OHKOE32PcR/QbTfNft4zRc60C/sn38Do4kkvzM4xWcIswZfae/HUwR6beUC2kS5Cjd5AoGAETtyhTHYwsSl4IFM2xq6BT8WQbZ8SIae6+dY+aNK1bIWtanwn/vBezxgtlwsQ3HZJPdtLx12ptwvoFqrbACdgCZ6FKiVTUNnWnyOeGn6SA0FsDJnw7OVw6NWmJh+7XBTYX0njzAFaOkZSBbOBIQqnWn/etUjX+nBivf54858ZOkCgYBBU9UV4LWB5DESTNmwQ5IM42FSsPtraUDn3VNDapyNoLb/oXcrr/EHH9LbdnmOf/TB8pvlF0L6B19Fbag7rEFul2qUJPOpbX5I2YsqjFDEtae9BNODyq2R137WPMqtR9ZU48vmPsFFcaZUIH5edv2LAWnvHaRirGh+5Ba67mq3Hw==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnhRrgr6r/pKQUvToFxImErxXXEAVTY6m9VRY2Jt1BfM8J+hcjz49ebLbbQiZuv5Qy/qjXTX+jLGN5/zelEhy1m8+DrRzO3Nt1BDEHJh0JfIvlKd8HiwiEAOcVCCf8lwF/PuQiCqeWHHfGN7GoWqyA7vM8btjPAqaZ3jMttmunJMtNJBu/4o2fffPAhkUeRUIZe7kI2A8khTtnX+lARlWZJPfv1by2feuvmsG8nr3kJ7Tiwu66FQcHEuKj794I0iwKHICvOGLcmUmLLprbpJrbGBph+NwDBOnERBWOBiG6deHG58PwVvAM5F+IwcjoIV18uMlhSHAT7MI8bV4RoLZaQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


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

