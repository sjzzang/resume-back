#!/bin/bash

# ❗️ 사용자 설정
DOCKER_USERNAME="sjzzang"
IMAGE_NAME="resume-backend"
IMAGE_TAG="1.0"

# 1. JAR 빌드
#echo "🔧 빌드 중..."
#./gradlew clean build || { echo "❌ Gradle 빌드 실패"; exit 1; }

# 2. Docker 이미지 빌드
echo "🐳 Docker 이미지 빌드 중..."
docker build -t ${DOCKER_USERNAME}/${IMAGE_NAME}:${IMAGE_TAG} .

# 3. Docker 로그인 (이미 로그인한 경우 생략 가능)
echo "🔐 Docker Hub 로그인"
docker login || { echo "❌ 로그인 실패"; exit 1; }

# 4. Docker Hub로 푸시
echo "🚀 Docker Hub로 푸시 중..."
docker push ${DOCKER_USERNAME}/${IMAGE_NAME}:${IMAGE_TAG}

# 5. (선택) latest 태그도 푸시
echo "🏷 latest 태그 추가 및 푸시"
docker tag ${DOCKER_USERNAME}/${IMAGE_NAME}:${IMAGE_TAG} ${DOCKER_USERNAME}/${IMAGE_NAME}:latest
docker push ${DOCKER_USERNAME}/${IMAGE_NAME}:latest

echo "✅ 완료! ${DOCKER_USERNAME}/${IMAGE_NAME}:${IMAGE_TAG} 이미지가 Docker Hub에 업로드되었습니다."