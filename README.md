Kubernetes Playground
=====================

```
minikube start

kubectl create namespace dev

kubectl --namespace=dev create secret docker-registry gcr --docker-server=https://gcr.io --docker-username=oauth2accesstoken --docker-password="$(gcloud auth print-access-token)" --docker-email=dainslie@gmail.com

kubectl --namespace=dev patch serviceaccount default -p '{"imagePullSecrets": [{"name": "gcr"}]}'

kubectl --namespace=dev create -f deployment.yaml

kubectl --namespace=dev create -f service.yaml

kubectl --namespace=dev get pods

minikube addons enable ingress

minikube addons enable dashboard

minikube dashboard

minikube service kubernetes-demo-app-service --url
http://192.168.99.107:32222
```# kubernetes-playground
