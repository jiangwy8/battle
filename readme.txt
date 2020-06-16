物流wms测试（前端）
https://wms-t.legendcf.com
ip 10.101.33.8

portal
https://wms-t.legendcf.com:80
cfwms
https://wms-t.legendcf.com:8888直接开放8888端口

物流wms测试（后端）
https://wmsapi-t.legendcf.com
ip 10.101.33.8
二级地址
/system
端口8080
/base
端口8081
/biz
端口8082
/stat
端口8083
/job
端口8084


物流wms-dtm前端
https://wmsdtm-t.legendcf.com:8091

https://wmsdtmapi-t.legendcf.com:8092


location /wmsdtmapi {
            proxy_pass http://10.101.33.6:8092;
           # root   html;
           # index  index.html index.htm;
}


