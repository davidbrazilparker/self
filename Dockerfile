FROM amazoncorretto:17
WORKDIR /self
CMD ./gradlew run --watch-fs