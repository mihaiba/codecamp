export FNSERVER_IP=$(docker inspect --type container -f '{{.NetworkSettings.IPAddress}}' fnserver)

echo "FNSERVER_IP" $FNSERVER_IP

#start the flow server

docker run --rm -d \
     -p 8081:8081 \
     -e API_URL="http://$FNSERVER_IP:8080/invoke" \
     -e no_proxy=$FNSERVER_IP \
     --name flowserver \
     fnproject/flow:latest

export FLOWSERVER_IP=$(docker inspect --type container -f '{{.NetworkSettings.IPAddress}}' flowserver)

echo "FLOWSERVER_IP" $FLOWSERVER_IP

#start flow UI

docker run --rm -d \
      -p 3002:3000 \
      --name flowui \
      -e API_URL=http://$FNSERVER_IP:8080 \
      -e COMPLETER_BASE_URL=http://$FLOWSERVER_IP:8081 \
      fnproject/flow:ui