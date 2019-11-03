package com.guilin.gmall.manage.util;


import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

//图片上传的工具类
public class PicUploadUtil {

    public static String uploadImage(MultipartFile multipartFile) {

        //上传图片到服务器


        String tracker = PicUploadUtil.class.getResource("/tracker.conf").getPath();// 获得配置文件的路径

        String imgUrl = "";

        try {
            ClientGlobal.init(tracker);

            TrackerClient trackerClient = new TrackerClient();

            // 获得一个trackerServer的实例
            TrackerServer trackerServer = null;

            trackerServer = trackerClient.getConnection();

            // 通过tracker获得一个Storage链接客户端
            StorageClient storageClient = new StorageClient(trackerServer, null);


            //获得上传的图片的二进制的对象
            byte[] bytes = multipartFile.getBytes();

            //获取图片的名称
            String originalFilename = multipartFile.getOriginalFilename();

            //获取文件名中最后一个点的位置
            int i = originalFilename.lastIndexOf(".");

            //截取到文件的类型的名称（jpg等）
            String exName = originalFilename.substring(i + 1);

            //上传
            String[] uploadInfos = storageClient.upload_file(bytes, exName, null);

             imgUrl = "http://192.168.152.106";

            for (String uploadInfo : uploadInfos) {
                imgUrl += "/" + uploadInfo;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }


        return imgUrl;
    }

}
