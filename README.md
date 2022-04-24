# otus-microservice-architecture

###### Задание№1 (Chapter-5)

<ul>
<li>Создать минимальный сервис, который</li>
<ul>
    <li>Отвечает на порту 8000</li>
    <li>Имеет http-метод</li>
    <ul>
        <li><b>GET</b> <i>/health</i></li>
        <li><b>RESPONSE</b>: {"status": "OK"}</li>
    </ul>
</ul>
<li>Cобрать локально образ приложения в докер</li>
<li>Запушить образ в dockerhub</li>
<li>Написать манифесты для деплоя в k8s для этого сервиса</li>
<ul>
    <li>Манифесты должны описывать сущности Deployment, Service, Ingress</li>
    <li>В Deployment могут быть указаны Liveness, Readiness пробы.</li>
    <li>Количество реплик должно быть не меньше 2</li>
    <li>Image контейнера должен быть указан с Dockerhub</li>
    <li>Хост в ингрессе должен быть arch.homework</li>
    <li>В итоге после применения манифестов GET запрос на http://arch.homework/health должен отдавать {“status”: “OK”}</li>
    <li>На выходе предоставить ссылку на github c манифестами</li>
    <li>Манифесты должны лежать в одной директории, так чтобы можно было их все применить одной командой kubectl apply -f </li>
</ul>
    <li>URL, по которому можно будет получить ответ от сервиса (либо тест в postmanе)</li>
    <li>Задание со звездой* (+5 баллов): В Ingress-е должно быть правило, которое форвардит все запросы с /otusapp/{student name}/* на сервис с rewrite-ом пути. Где {student name} - это имя студента.</li>
</ul>

```cmd
helm template otus application -f application\values-minikube.yaml
```

###### Packaged Manifest: [Kubernetes Manifest](chapter5/homework/deployment/resource.yaml)
###### Helm package: [Helm package](/chapter5/homework/deployment/application)