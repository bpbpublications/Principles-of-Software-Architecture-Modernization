#!/bin/bash

echo "Calling /profile get user"
curl -i http://localhost:8080/service/profile/user/e4ed601a-f143-42fa-9a23-ca14df5a7399

echo "Calling /profile get users(batch)"
curl -i http://localhost:8080/service/profile/user/batch/e4ed601a-f143-42fa-9a23-ca14df5a7399,e4ed601a-f143-42fa-9a23-ca14df5a7399

echo "Getting Contract metadata - OpenAPI YAML"
curl -i http://localhost:8080/v3/api-docs