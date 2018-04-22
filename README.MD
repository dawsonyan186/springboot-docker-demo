```shell
mvn package -Dskip.test=true
mvn docker:build
docker run -d -p 8080:8080 -v /tmp/docker-logs:/app/logs springboot-docker-demo
http://{docker-machine-ip}:8080/
```
启动后查看日志
```shell
docker-machine ssh default
cd /tmp/docker-logs
tail -f springboot-docker-demo.log
```
##stop
docker kill
docker rm