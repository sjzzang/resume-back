# 1️⃣ Java 21 JDK 기반 이미지
FROM eclipse-temurin:21-jdk

# 2️⃣ 앱 실행 위치 설정
WORKDIR /app
# 3️⃣ 빌드된 jar 파일을 컨테이너로 복사
COPY build/libs/resume-backend-0.0.1-SNAPSHOT.jar app.jar
# 4️⃣ 컨테이너에서 열 포트
EXPOSE 8080
# 5️⃣ 앱 실행 명령
ENTRYPOINT ["java", "-jar", "app.jar"]