package com.qr.actions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileAction {
    @RequestMapping("/upload.action")
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
    }
}
