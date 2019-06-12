# Zalenium

1.本测试框架依赖Zalenium环境
docker pull elgalu/selenium
docker pull dosel/zalenium

2.拉取玩上面两个镜像后
[root@localhost ~]# docker images
REPOSITORY                                                     TAG                 IMAGE ID            CREATED             SIZE
docker.io/dosel/zalenium                                       latest              7e7adf0d5c6a        4 days ago          588 MB
docker.io/elgalu/selenium                                      latest              f98a57e57137        2 weeks ago         1.45 GB

3.启动镜像
[root@localhost ~]# docker run --rm -ti --name zalenium -p 4444:4444     -v /var/run/docker.sock:/var/run/docker.sock     -v /tmp/videos:/home/seluser/videos     --privileged dosel/zalenium start


4.就可以在浏览器中打开
http://192.168.253.133:4444/dashboard/#


