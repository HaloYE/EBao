package com.qr.actions;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileAction {


    @RequestMapping("/upload.action")
    public Map upload(MultipartFile file){
//        如何获取服务器路径
        String path=getUploadPath();

//        System.out.println(path);

//        文件的原始名称
        String fileName=file.getOriginalFilename();
//        加上时间戳，防止覆盖图片的发生
        Date date=new Date();
        long time=date.getTime();
        String newfileName=time+fileName;

//        System.out.println(newfileName);

//      获取服务器upload文件夹的路径
//        File f=new File(path);
//        String uploadFile=f.getParentFile().getParent()+"/upload";

        Map map=new HashMap();
        try {
//            file.transferTo(new File(uploadFile+"/"+newfileName));
            file.transferTo(new File(path+"/"+newfileName));
            map.put("code",0);
            map.put("goodsPicture","upload/"+newfileName);
        } catch (IOException e) {
            map.put("code",-1);
            e.printStackTrace();
        }
        return map;
    }


    /**
     * 获取当前系统路径
     */
    private String getUploadPath() {
        File path = null;
        try {
//            path = new File(ResourceUtils.getURL("classpath:").getPath());
            path = new File(System.getProperty("user.dir"));
            System.out.println(path);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
/*        catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        if (!path.exists())
            path = new File("");
        File upload = new File(path.getAbsolutePath(), "src/main/resources/static/upload/");
        if (!upload.exists())
            upload.mkdirs();
        return upload.getAbsolutePath();
    }












    /*@RequestMapping("/upload.action")
    public Map upload(MultipartFile file, HttpServletRequest req){
//        如何获取服务器路径
        String path=req.getServletContext().getRealPath("WEB-INF");
//        文件的原始名称
        String fileName=file.getOriginalFilename();
//        加上时间戳，防止覆盖图片的发生
        Date date=new Date();
        long time=date.getTime();
        String newfileName=time+fileName;

//      获取服务器upload文件夹的路径
        File f=new File(path);
        String uploadFile=f.getParentFile().getParent()+"/upload";

        Map map=new HashMap();
        try {
            file.transferTo(new File(uploadFile+"/"+newfileName));
            map.put("code",0);
            map.put("picture","upload/"+newfileName);
        } catch (IOException e) {
            map.put("code",-1);
            e.printStackTrace();
        }
        return map;
    }*/
}
